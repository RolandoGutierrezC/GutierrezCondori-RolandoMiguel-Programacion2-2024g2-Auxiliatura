package tcp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketTcp implements Runnable {
    private Integer port;
    private String ip;
    private Boolean connected;
    private Socket socket;
    private Thread thread;
    private ObjectOutputStream outData;
    private ObjectInputStream inData;
    private OnMessageRecive listener;

    public SocketTcp(String ip, Integer port) {
        this.port = port;
        this.ip = ip;
        this.connected = false;
    }

    public void emmit(PackageData data, OnMessageRecive listener) {
        this.listener = listener;
        try {
            if (outData != null) {
                outData.writeObject(data);
            } else {
                System.out.println("Error: No hay conexión establecida");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connected() {
        try {
            System.out.println("CONEXIÓN AL SOCKET");
            socket = new Socket(this.ip, this.port);
            outData = new ObjectOutputStream(socket.getOutputStream());
            inData = new ObjectInputStream(socket.getInputStream());
            this.connected = true;
            thread = new Thread(this);
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: No se pudo conectar al servidor. Asegúrese de que el servidor esté ejecutándose.");
        }
    }

    @Override
    public void run() {
        while (this.connected) {
            try {
                PackageData data = (PackageData) inData.readObject();
                if (data != null) {
                    if (data.getMsn().equals(":quit")) {
                        this.connected = false;
                    }
                    this.listener.OnMessage(data);
                }
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
        }
        dissConnect();
    }

    public void dissConnect() {
        try {
            if (this.socket != null) {
                this.socket.close();
            }
            this.connected = false;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


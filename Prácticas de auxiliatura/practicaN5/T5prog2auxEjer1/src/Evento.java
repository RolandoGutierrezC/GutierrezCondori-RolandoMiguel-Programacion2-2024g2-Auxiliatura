import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private List<EventoNotificacion> notificaciones;

    public Evento(String nombre) {
        this.nombre = nombre;
        this.notificaciones = new ArrayList<>();
    }

    public void registrarNotificacion(EventoNotificacion notificacion) {
        notificaciones.add(notificacion);
    }

    public void activar() {
        String mensaje = "Evento activado: " + nombre;
        for (EventoNotificacion notificacion : notificaciones) {
            notificacion.notificar(mensaje);
        }
    }
    public String getNombre() {
        return nombre;
    }
    
}

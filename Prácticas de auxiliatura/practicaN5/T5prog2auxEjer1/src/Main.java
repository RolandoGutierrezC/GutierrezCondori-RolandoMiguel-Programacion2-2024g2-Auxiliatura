import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Evento> eventos = new ArrayList<>();
        eventos.add(new Evento("Enemigo detectado"));
        eventos.add(new Evento("Aparece un jefe"));
        eventos.add(new Evento("Se encontro un botin"));
        eventos.add(new Evento("npc raro encontrado"));
        eventos.add(new Evento("maldecido"));

        for (Evento evento : eventos) {
            evento.registrarNotificacion(mensaje -> System.out.println("Notificacion: " + mensaje));
            evento.registrarNotificacion(mensaje -> System.out.println("Recibida en el correo: " + mensaje));
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(eventos.size());
        Evento eventoAleatorio = eventos.get(indiceAleatorio);

        System.out.println("Activando el evento aleatorio: " + eventoAleatorio.getNombre());
        eventoAleatorio.activar();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Sienna", 100);
        Jugador jugador2 = new Jugador("Arron", 200);

        List<CalculadoraBonificacion> bonificaciones = new ArrayList<>();
        bonificaciones.add(puntosBase -> puntosBase * 10 / 100);
        bonificaciones.add(puntosBase -> puntosBase + 50);
        bonificaciones.add(puntosBase -> puntosBase * 20 / 100);
        bonificaciones.add(puntosBase -> puntosBase * 2); 
        bonificaciones.add(puntosBase -> puntosBase - 30);

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            CalculadoraBonificacion bonificacionAleatoria1 = bonificaciones.get(random.nextInt(bonificaciones.size()));
            jugador1.aplicarBonificacion(bonificacionAleatoria1);

            CalculadoraBonificacion bonificacionAleatoria2 = bonificaciones.get(random.nextInt(bonificaciones.size()));
            jugador2.aplicarBonificacion(bonificacionAleatoria2);
        }
    }
}

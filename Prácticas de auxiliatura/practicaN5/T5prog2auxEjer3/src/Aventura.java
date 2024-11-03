import java.util.ArrayList;
import java.util.List;

public class Aventura {
    private List<Tarea> tareas;

    public Aventura() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void iniciar() {
        System.out.println("Iniciando la aventura. Ejecutando tareas: ");
        for (Tarea tarea : tareas) {
            tarea.ejecutar();
        }
    }
}

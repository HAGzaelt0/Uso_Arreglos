package gestio_de_tareas;

import java.util.ArrayList;
import java.util.List;

public class GestionTareas {
    private List<Tarea> tareas;

    // Constructor
    public GestionTareas() {
        this.tareas = new ArrayList<>();
    }

    // Método para agregar una tarea
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea.getDescripcion());
    }

    // Método para marcar una tarea como completada
    public void marcarTareaCompletada(int index) {
        if (index >= 0 && index < tareas.size()) {
            tareas.get(index).marcarCompletada();
            System.out.println("Tarea completada: " + tareas.get(index).getDescripcion());
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Método para eliminar tareas completadas
    public void eliminarTareasCompletadas() {
        tareas.removeIf(Tarea::isCompletada);
        System.out.println("Tareas completadas eliminadas.");
    }

    // Método para mostrar las tareas por prioridad
    public void mostrarTareasPorPrioridad() {
        tareas.stream()
                .sorted((t1, t2) -> Integer.compare(t1.getPrioridad(), t2.getPrioridad()))
                .forEach(System.out::println);
    }

    // Método para mostrar todas las tareas
    public void mostrarTodasLasTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            tareas.forEach(System.out::println);
        }
    }
}

package gestio_de_tareas;

public class Main {
    public static void main(String[] args) {
        GestionTareas gestion = new GestionTareas();

        // Crear algunas tareas
        Tarea tarea1 = new Tarea("Estudiar para el examen", 3);
        Tarea tarea2 = new Tarea("Lavar la ropa", 2);
        Tarea tarea3 = new Tarea("Comprar víveres", 1);

        // Agregar tareas
        gestion.agregarTarea(tarea1);
        gestion.agregarTarea(tarea2);
        gestion.agregarTarea(tarea3);

        // Mostrar todas las tareas
        System.out.println("\nTodas las tareas:");
        gestion.mostrarTodasLasTareas();

        // Marcar la segunda tarea como completada
        gestion.marcarTareaCompletada(1);

        // Mostrar tareas por prioridad
        System.out.println("\nTareas ordenadas por prioridad:");
        gestion.mostrarTareasPorPrioridad();

        // Eliminar tareas completadas
        gestion.eliminarTareasCompletadas();

        // Mostrar todas las tareas después de eliminar las completadas
        System.out.println("\nTodas las tareas después de eliminar las completadas:");
        gestion.mostrarTodasLasTareas();
    }
}


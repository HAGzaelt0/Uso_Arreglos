package gestio_de_tareas;

public class Tarea {
    private String descripcion;
    private int prioridad;  // Rango de 1 a 5
    private boolean completada;

    // Constructor
    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        setPrioridad(prioridad);
        this.completada = false;  // Por defecto, la tarea no está completada
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        if (prioridad >= 1 && prioridad <= 5) {
            this.prioridad = prioridad;
        } else {
            throw new IllegalArgumentException("La prioridad debe estar entre 1 y 5.");
        }
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                ", completada=" + (completada ? "Sí" : "No") +
                '}';
    }
}


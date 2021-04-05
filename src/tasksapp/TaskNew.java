package tasksapp; //carpeta 

import java.time.LocalDate;

public class TaskNew {
    //Defecto publicos???

    private String description; //Nombre de la tarea
    private LocalDate expirationDate; //Fecha de vencimiento
    private Boolean done; //true si la tarea está hecha.

    public TaskNew(String description) {
        this.description = description;
    }

    public TaskNew(String description, LocalDate expirationDate) {
        this.description = description;
        this.expirationDate = expirationDate;
    }
    
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}

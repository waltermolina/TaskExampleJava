/** JAVADOC
 * Esta clase define una tarea con su descripción, su estado y su fecha de vencimiento.
 * @author: waltermolina
 * @version: 20210405.1
 * @see <a href = "http://github.com/" /> Repositorio en Github </a>
 * asdasdasdasdasd asdas dasd asd
 asdasdasdasdasdasdasdas
 das
 das
 da
Hola profe,Soy Lucas Gualda
 asd
 */
package tasksapp; //carpeta 

/**Importamos LocalDate para hacer uso de las Fechas. 
 * @see <a href = "https://replit.com/@waltermolina/EjemploLocalDate" /> Ejemplo de uso en Replit </a>
 */
import java.time.LocalDate;

public class Task {
    private String description; //Nombre de la tarea
    private LocalDate expirationDate; //Fecha de vencimiento
    private Boolean done; //true si la tarea está hecha.
    
    /**
     * Constructor que recibe todos los atributos
     * @param description Descripción
     * @param expirationDate Fecha de vencimiento
     * @param done Estado de la tarea: true si está terminada.
     */
    public Task(String description, LocalDate expirationDate, Boolean done) {
        this.description = description;
        this.expirationDate = expirationDate;
        this.done = done;
    }
    
    /**
     * Constructor que recibe sólo la descripción.
     * El resto de los parámetros se inician en valores por defecto.
     * @param description Descripción
     */
    public Task(String description) {
        this.description = description;
        this.expirationDate = null; //No expira
        this.done = false; //No terminada
    }
    
    /**
     * Constructor que recibe descripción y fecha de vencimiento
     * @param description Descripción
     * @param expirationDate Fecha de vencimiento
     */
    public Task(String description, LocalDate expirationDate) {
        this.description = description;
        this.expirationDate = expirationDate;
        this.done = false; //No terminada
    }
    
    /**
     * Constructor que recibe descripción y estado
     * @param description Descripción
     * @param done Estado de la tarea: true si está terminada.
     */
    public Task(String description, Boolean done) {
        this.description = description;
        this.done = done;
        this.expirationDate = null; // No expira
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

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Obtiene un String con los valores actuales del objeto
     * @return El objeto en formato String
     */
    @Override //?
    public String toString() {
        return "Tarea>>>> {" + "description=" + description + ", expirationDate=" + expirationDate + ", done=" + done + '}';
    }

}

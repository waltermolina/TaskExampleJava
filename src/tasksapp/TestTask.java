/**
 * Esta clase está creada con el fin de probar la clase Task.
 *
 * @author: waltermolina
 * @version: 20210405.1
 * @see <a href = "http://github.com/" /> Repositorio en Github </a>
 */
package tasksapp;

/**
 * Importamos Scanner para leer entradas desde el teclado.
 *
 * @see <a href = "https://javadesdecero.es/io/clase-scanner-ejemplos/" />
 * Ejemplo de uso en JavaDesdeCero.es </a>
 */
import java.time.LocalDate;
import java.util.Scanner;


public class TestTask {

    /**
     * Método principal para probar tareas
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Nuestro programa puede almacenar hasta 3 tareas, cada una de ellas en
         * 3 variables: task1, task2 y task3. Al inicio, no hay tareas, por lo
         * que nuestras variables serán nulas.
         */
        Task task1 = null;
        Task task2 = null;
        Task task3 = null;

        /**
         * Usamos un contador para saber cuántas tareas hemos creado.
         */
        int taskCounter = 0;

        //input de tipo Scanner nos permitirá leer desde el teclado.
        Scanner input = new Scanner(System.in);

        /**
         * Usamos selectedOption para recordar la elección la persona usuaria
         */
        int selectedOption;

        /**
         * Bucle de Menú con opciones numéricas.
         */
        do {
            System.out.println("================================================================================");
            System.out.println("LISTA DE TAREAS");
            System.out.println("================================================================================");
            System.out.println("! Este ejemplo sólo funciona con 1 tarea.");
            System.out.println("  Primero debe crearla para poder usar las otras opciones)");
            System.out.println();
            System.out.println("  1. Crear una tarea.");
            System.out.println("  2. Marcar una tarea como hecha.");
            System.out.println("  3. Eliminar una tarea.");
            System.out.println("  4. Mostrar una tarea.");
            System.out.println("  0. Salir.");
            System.out.println();
            System.out.print("> ");

            //Leemos la opción ingresada desde el teclado
            selectedOption = input.nextInt();

            System.out.println();

            //Limpiar buffer de Scanner (para evitar lecturas incorrectas)
            input.nextLine();

            switch (selectedOption) {
                case 0: //Salir

                    break;
                case 1: //Crear una tarea
                    System.out.print("Descripción > ");
                    String description = input.nextLine();
                    System.out.println();
                    
                    System.out.print("Vencimiento (aaaa/mm/dd)> ");
                    String expiration = input.nextLine();
                    System.out.println();
                    
                    //Rompo el string en partes
                    
                    
                    String yearSplit[] = expiration.split("/"); // ["2021","04","05"]
                    
                    String yearString =  yearSplit[0]; // "2021"
                    
                    int year = Integer.parseInt(yearString); // 2021
                    
                    int month = Integer.parseInt(expiration.split("/")[1]); //4
                    int day = Integer.parseInt(expiration.split("/")[2]); //5

                    task1 = new Task(description, LocalDate.of(year, month, day));

                    break;

                case 2: //Marcar una tarea como hecha
                    if (task1 != null) {
                        task1.setDone(true);
                        System.out.println("================================================================================");
                        System.out.println("Tarea HECHA");
                        System.out.println("================================================================================");
                        break;
                    }

                case 3: //Eliminar una tarea
                    if (task1 != null) {
                        task1 = null;
                        //No hay que hacer delete como en C.
                        //La magia del Garbage collector!
                        System.out.println("================================================================================");
                        System.out.println("Tarea ELIMINADA");
                        System.out.println("================================================================================");
                    }
                    break;

                case 4: //Mostrar una tarea
                    if (task1 != null) {
                        System.out.println(task1.toString());
                    }
                    break;
                default: //Opción no válida
                    break;
            }

        } while (selectedOption != 0);

    }

}

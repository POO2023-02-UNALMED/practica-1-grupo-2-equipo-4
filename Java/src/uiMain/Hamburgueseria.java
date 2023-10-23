package uiMain;

import java.util.Scanner;

public class Hamburgueseria {
    static Scanner scan = new Scanner(System.in);

    static long readLong() {

        return scan.nextLong();
    }

    static String readln() {
        scan.nextLine();
        return scan.nextLine();
    }

    static String bienvenida = """
                █████   ███   █████     ████                                             █████               ███
               ░░███   ░███  ░░███     ░░███                                            ░░███               ░███
                ░███   ░███   ░█████████░███  ██████  ██████ █████████████   ██████     ███████   ██████    ░███
                ░███   ░███   ░█████░░██░███ ███░░██████░░██░░███░░███░░███ ███░░███   ░░░███░   ███░░███   ░███
                ░░███  █████  ██░███████░███░███ ░░░░███ ░███░███ ░███ ░███░███████      ░███   ░███ ░███   ░███
                 ░░░█████░█████░░███░░░ ░███░███  ██░███ ░███░███ ░███ ░███░███░░░       ░███ ██░███ ░███   ░░░
                   ░░███ ░░███  ░░██████████░░██████░░██████ █████░███ ████░░██████      ░░█████░░██████     ███
                    ░░░   ░░░    ░░░░░░░░░░░ ░░░░░░  ░░░░░░ ░░░░░ ░░░ ░░░░░ ░░░░░░        ░░░░░  ░░░░░░     ░░░



             █████       █████████   █████████       █████████  █████████ █████    █████   ██████████████   █████████
            ░░███       ███░░░░░███ ███░░░░░███     ███░░░░░██████░░░░░██░░███    ░░███   ░░██████░░░░░███ ███░░░░░███
             ░███      ░███    ░███░███    ░░░     ███     ░░░░███    ░███░███     ░███    ░██░███    ░███░███    ░░░
             ░███      ░███████████░░█████████    ░███        ░███████████░███     ░███    ░██░███████████░░█████████
             ░███      ░███░░░░░███ ░░░░░░░░███   ░███        ░███░░░░░███░███     ░░███   ███░███░░░░░███ ░░░░░░░░███
             ░███      ░███    ░███ ███    ░███   ░░███     ██░███    ░███░███      ░░░█████░ ░███    ░███ ███    ░███
             ███████████████   ████░░█████████     ░░██████████████   ███████████████ ░░███   █████   ████░░█████████
            ░░░░░░░░░░░░░░░   ░░░░░ ░░░░░░░░░       ░░░░░░░░░░░░░░   ░░░░░░░░░░░░░░░   ░░░   ░░░░░   ░░░░░ ░░░░░░░░░



                      ███████████ █████  ███████████████   █████████ █████████████████████   █████████     ███
                     ░░███░░░░░██░░███  ░░██░░███░░░░░███ ███░░░░░██░░███░░░░░░░███░░░░░███ ███░░░░░███   ░███
                      ░███    ░███░███   ░███░███    ░██████     ░░░ ░███  █ ░ ░███    ░███░███    ░░░    ░███
                      ░██████████ ░███   ░███░██████████░███         ░██████   ░██████████ ░░█████████    ░███
                      ░███░░░░░███░███   ░███░███░░░░░██░███    █████░███░░█   ░███░░░░░███ ░░░░░░░░███   ░███
                      ░███    ░███░███   ░███░███    ░██░░███  ░░███ ░███ ░   █░███    ░███ ███    ░███   ░░░
                      ███████████ ░░████████ █████   ████░░█████████ ███████████████   ████░░█████████     ███
                     ░░░░░░░░░░░   ░░░░░░░░ ░░░░░   ░░░░░ ░░░░░░░░░ ░░░░░░░░░░░░░░░   ░░░░░ ░░░░░░░░░     ░░░
                         """;
    static String queHacer = """
            ┌─┐ ┬ ┬┌─┐  ┌─┐ ┬ ┬┬┌─┐┬─┐┌─┐┌─┐  ┬ ┬┌─┐┌─┐┌─┐┬─┐┌─┐
            │─┼┐│ │├┤   │─┼┐│ ││├┤ ├┬┘├┤ └─┐  ├─┤├─┤│  ├┤ ├┬┘ ┌┘
            └─┘└└─┘└─┘  └─┘└└─┘┴└─┘┴└─└─┘└─┘  ┴ ┴┴ ┴└─┘└─┘┴└─ o\s""";
    static String burger = """
                                                       ████████████████████       \s
                                                     ██░░░░░░░░░░░░░░░░░░░░██     \s
                                                   ██░░░░  ██░░░░░░░░  ██░░░░██   \s
                                                 ██░░░░░░████░░░░░░░░████░░░░░░██ \s
                                                 ██░░░░▒▒▒▒░░░░████░░░░▒▒▒▒░░░░██ \s
                                                 ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░██ \s
                                               ████████████████████████████████████
                                               ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
                                                 ████████████████████████████████ \s
                                               ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██
                                                 ████▒▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒████ \s
                                                 ██░░██████░░████████░░██████░░██ \s
                                                 ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░██ \s
                                                   ████████████████████████████   \s
            """;
    static String salirsistematxt = """
            ██╗   ██╗██╗   ██╗███████╗██╗    ██╗   ██╗ █████╗     ██████╗ ██████╗  ██████╗ ███╗   ██╗████████╗ ██████╗                           
            ██║   ██║██║   ██║██╔════╝██║    ██║   ██║██╔══██╗    ██╔══██╗██╔══██╗██╔═══██╗████╗  ██║╚══██╔══╝██╔═══██╗                          
            ██║   ██║██║   ██║█████╗  ██║    ██║   ██║███████║    ██████╔╝██████╔╝██║   ██║██╔██╗ ██║   ██║   ██║   ██║                          
            ╚██╗ ██╔╝██║   ██║██╔══╝  ██║    ╚██╗ ██╔╝██╔══██║    ██╔═══╝ ██╔══██╗██║   ██║██║╚██╗██║   ██║   ██║   ██║                          
             ╚████╔╝ ╚██████╔╝███████╗███████╗╚████╔╝ ██║  ██║    ██║     ██║  ██║╚██████╔╝██║ ╚████║   ██║   ╚██████╔╝▄█╗                       
              ╚═══╝   ╚═════╝ ╚══════╝╚══════╝ ╚═══╝  ╚═╝  ╚═╝    ╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝    ╚═════╝ ╚═╝                       
                                                                                                                                                 
██████╗ ███████╗██████╗  ██████╗     ██╗      █████╗     ██████╗ ██████╗  ██████╗ ██╗  ██╗██╗███╗   ███╗ █████╗     ██╗   ██╗███████╗███████╗    
██╔══██╗██╔════╝██╔══██╗██╔═══██╗    ██║     ██╔══██╗    ██╔══██╗██╔══██╗██╔═══██╗╚██╗██╔╝██║████╗ ████║██╔══██╗    ██║   ██║██╔════╝╚══███╔╝    
██████╔╝█████╗  ██████╔╝██║   ██║    ██║     ███████║    ██████╔╝██████╔╝██║   ██║ ╚███╔╝ ██║██╔████╔██║███████║    ██║   ██║█████╗    ███╔╝     
██╔═══╝ ██╔══╝  ██╔══██╗██║   ██║    ██║     ██╔══██║    ██╔═══╝ ██╔══██╗██║   ██║ ██╔██╗ ██║██║╚██╔╝██║██╔══██║    ╚██╗ ██╔╝██╔══╝   ███╔╝      
██║     ███████╗██║  ██║╚██████╔╝    ███████╗██║  ██║    ██║     ██║  ██║╚██████╔╝██╔╝ ██╗██║██║ ╚═╝ ██║██║  ██║     ╚████╔╝ ███████╗███████╗    
╚═╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝     ╚══════╝╚═╝  ╚═╝    ╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝     ╚═╝╚═╝  ╚═╝      ╚═══╝  ╚══════╝╚══════╝    
                                                                                                                                                 
                                                 ██████╗      ██╗ █████╗ ██╗      █████╗                                                         
                                                ██╔═══██╗     ██║██╔══██╗██║     ██╔══██╗                                                        
                                                ██║   ██║     ██║███████║██║     ███████║                                                        
                                                ██║   ██║██   ██║██╔══██║██║     ██╔══██║                                                        
                                                ╚██████╔╝╚█████╔╝██║  ██║███████╗██║  ██║                                                        
                                                 ╚═════╝  ╚════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝                                                        
                                                                                                                                                 
██╗   ██╗███╗   ██╗    ██████╗  ██████╗  ██████╗ ██████╗     ███╗   ███╗ █████╗ ███████╗     ██████╗ █████╗ ██╗    ██╗   ██╗ ██████╗        ██╗  
██║   ██║████╗  ██║    ██╔══██╗██╔═══██╗██╔════╝██╔═══██╗    ████╗ ████║██╔══██╗██╔════╝    ██╔════╝██╔══██╗██║    ██║   ██║██╔═══██╗    ██╗╚██╗ 
██║   ██║██╔██╗ ██║    ██████╔╝██║   ██║██║     ██║   ██║    ██╔████╔██║███████║███████╗    ██║     ███████║██║    ██║   ██║██║   ██║    ╚═╝ ██║ 
██║   ██║██║╚██╗██║    ██╔═══╝ ██║   ██║██║     ██║   ██║    ██║╚██╔╝██║██╔══██║╚════██║    ██║     ██╔══██║██║    ╚██╗ ██╔╝██║   ██║    ██╗ ██║ 
╚██████╔╝██║ ╚████║    ██║     ╚██████╔╝╚██████╗╚██████╔╝    ██║ ╚═╝ ██║██║  ██║███████║    ╚██████╗██║  ██║███████╗╚████╔╝ ╚██████╔╝    ╚═╝██╔╝ 
 ╚═════╝ ╚═╝  ╚═══╝    ╚═╝      ╚═════╝  ╚═════╝ ╚═════╝     ╚═╝     ╚═╝╚═╝  ╚═╝╚══════╝     ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═══╝   ╚═════╝                                                                                                                  
                
            """;
    private static void salirDelSistema() {
        //Serializador.serializarHamburgueseria(ArrayList < Hamburgueseria > lista);
        System.exit(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, opcion2;
        do {
            System.out.println("");
            System.out.println(bienvenida);
            System.out.println(burger);
            System.out.println("");
            System.out.println(queHacer);
            System.out.println("");
            System.out.println("1. Ingresar al apartado de Contabilidad 📈📈‍🦲");
            System.out.println("2. Ingresar a gestion de Empleados 👨‍🍳👩‍🍳‍🦲");
            System.out.println("3. Ingresar a gestion de Reservas 🕓🕒‍🦲");
            System.out.println("4. Ingresar al apartado de toma de Pedidos 🍔🍟‍🦲");
            System.out.println("5. Ingresar a nuestro Inventario 💻🖥️‍🦲");
            System.out.println("6. Finalizar ❌❌👩‍🦲");
            System.out.println("");
            System.out.print("Ingresa el número de la opción que requieras: ");
            opcion2 = (int) readLong();

            switch (opcion2) {
                case 1:
                    do { // Opciones de Funcionalidad Contabilidad
                        System.out.println(queHacer);
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("6. Volver al menú de funcionalidades");
                        System.out.println("7. Salir del sistema");
                        System.out.print("Escribe el número de la opción que necesitas: ");
                        opcion = (int) readLong();
                        switch (opcion) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                System.out.println(salirsistematxt);
                                salirDelSistema();
                                break;
                        }
                    } while (opcion2 != 1);
                    break;
                case 2:
                    do { // Funcionalidad Gestion Empleados
                        System.out.println(queHacer);
                        System.out.println("1. Ver Empleados");
                        System.out.println("2. Agregar Empleado");
                        System.out.println("3. Eliminar empleado");
                        System.out.println("4. Volver al menú de las calvas");
                        System.out.println("5. Salir del sistema");
                        System.out.print("Escribe el número de la opción que necesitas: ");

                        opcion = (int) readLong();

                        switch (opcion) {

                            case 1://Ver empleado

                            case 2://AgregarEmpleado

                            case 3://Eliminar empleado

                            case 4: // Volver al menú principal

                            case 5:
                                System.out.println(salirsistematxt);
                                salirDelSistema();
                                break;
                        }
                    } while (opcion != 4);
                    break;
                case 3:
                    do { //Gestion reserva
                        System.out.println(queHacer);
                        System.out.println("1. Efectuar Reserva");
                        System.out.println("2. Hacer Recerva");
                        System.out.println("3. Cancelar Recerva");
                        System.out.println("4. Volver al menú de las calvas");
                        System.out.println("5. Salir del sistema");
                        System.out.print("Escribe el número de la opción que necesitas: ");

                        opcion2 = (int) readLong();

                        switch (opcion2) {

                            case 1://Efectuar Reserva
                                System.out.println("reserva efectuada");


                            case 2://Hacer Recerva

                            case 3://Cancelar Recerva

                            case 4: // Volver al menú principal

                            case 5:
                                System.out.println(salirsistematxt);
                                salirDelSistema();
                                break;
                        }
                    } while (opcion2 != 4);
                    break;
                case 4:
                    do {// Funcionalidad Tomar Pedidos
                        System.out.println(queHacer);
                        System.out.println("1. Consultar Reserva");
                        System.out.println("2. Volver al menú de las calvas");
                        System.out.println("3. Salir del sistema");
                        System.out.print("Escribe el número de la opción que necesitas: ");
                        opcion = (int) readLong();

                        switch (opcion) {

                            case 1:// Muestra si tiene recerva o no, en caso de que si tenga recerva mostrar Menu.
                            case 2://Hacer Recerva
                            case 3:
                                System.out.println(salirsistematxt);
                                salirDelSistema();
                                break;
                        }
                    } while (opcion != 2);
                    break;
                case 5:
                    do {// Funcionalidad Gestion Inventario
                        System.out.println("¿Que deseas hacer?");
                        System.out.println("1. Consultar Inventario");
                        System.out.println("2. Volver al menú de las calvas");
                        System.out.println("3. Salir del sistema");
                        System.out.print("Escribe el número de la opción que necesitas: ");
                        opcion2 = (int) readLong();

                        switch (opcion2) {

                            case 1:// Mostrar inventario
                            case 2: // Volver al menú principal
                            case 3:
                                System.out.println(salirsistematxt);
                                salirDelSistema();
                                break;
                        }
                    } while (opcion2 != 2);
                case 6:
                    System.out.println(salirsistematxt);
                    salirDelSistema();
                    break;
            }
        } while (opcion2 != 6);
    }
}


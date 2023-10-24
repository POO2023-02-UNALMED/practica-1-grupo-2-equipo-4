package uiMain;

import gestorAplicacion.administracion.Empleado;
import gestorAplicacion.administracion.Mesero;
import gestorAplicacion.restaurante.MenuMethods;
import gestorAplicacion.restaurante.Mesas;
import gestorAplicacion.restaurante.Pedido;

import java.util.ArrayList;
import java.util.Scanner;

public class HamburgueseriaTest {
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
            └─┘└└─┘└─┘  └─┘└└─┘┴└─┘┴└─└─┘└─┘  ┴ ┴┴ ┴└─┘└─┘┴└─ o\s
            (Escribe un numero entero entre las opciones dadas)""";
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
        int opcion = 0;
        do {
            System.out.println("");
            System.out.println(bienvenida);
            System.out.println(burger);
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
            int opcion2 = scanner.nextInt();
            switch (opcion2) {
                case 1:
                    int opcion3;
                    do { // Opciones de Funcionalidad Contabilidad
                        System.out.println(queHacer);
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("6. Volver al menú de funcionalidades");
                        System.out.print("Escribe el número de la opción que necesitas: ");
                        opcion3 = scanner.nextInt();
                        switch (opcion3) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            default:
                                System.out.println("DEBES ESCRIBIR UN NUMERO ENTERO ENTRE LAS OPCIONES DADAS");
                        }
                    } while (opcion3 < 1 || opcion3 > 6);
                    break;
                case 2:
                    do { // Funcionalidad Gestion Empleados
                        System.out.println(queHacer);
                        System.out.println("1. Ver Empleados");
                        System.out.println("2. Agregar Empleado");
                        System.out.println("3. Eliminar empleado");
                        System.out.println("4. Volver al menú de las calvas");
                        System.out.print("Escribe el número de la opción que necesitas: ");


                        opcion = (int) readLong();

                        switch (opcion) {

                            case 1://Ver empleado
                                System.out.println("Ingrese el nombre del empleado que quiere ver: ");
                                String verNombre = readln();
                                for (Empleado empleado: Empleado.empleados){
                                    if (verNombre == empleado.getNombre()){
                                        System.out.println(empleado.toString());
                                    }
                                }

                            case 2://AgregarEmpleado

                            case 3://Eliminar empleado

                            case 4: // Volver al menú principal
                                break;
                            default:
                                System.out.println("DEBES ESCRIBIR UN NUMERO ENTERO ENTRE LAS OPCIONES DADAS");
                        }
                    } while (opcion < 1 || opcion > 4);
                    break;
                case 3:
                    do { //Gestion reserva
                        System.out.println(queHacer);
                        System.out.println("1. Efectuar Reserva");
                        System.out.println("2. Hacer Recerva");
                        System.out.println("3. Cancelar Recerva");
                        System.out.println("4. Volver al menú de las calvas");
                        System.out.print("Escribe el número de la opción que necesitas: ");

                        opcion2 = (int) readLong();

                        switch (opcion2) {

                            case 1://Efectuar Reserva
                                System.out.println("Ingresaste a Efectuar Reserva");
                                System.out.println("Ingrese el id del cliente que hizo la reserva: ");
                                int clienteEfectuar = scanner.nextInt();
                                System.out.println("Ingrese la fecha para la que se reservo con el formato dado a continuación \"DIA-MES-AÑO HORA:MINUTOS:00\": ");
                                String fechaEfectuar = readln();
                                Mesas.efectuarReserva(clienteEfectuar, fechaEfectuar);
                                System.out.println("Reserva efectuada");
                                System.out.println(" ");
                                break;

                            case 2://Hacer Reserva
                                System.out.println("Ingresaste a Hacer Reserva");
                                System.out.println("Ingrese el numero de la mesa en la cual desea hacer la reserva: ");
                                int reservaMesa = scanner.nextInt();
                                System.out.println("Ingrese el id del cliente al que le corresponde la reserva: ");
                                int clienteReserva = scanner.nextInt();
                                System.out.println("Ingrese la fecha para la que desea reservar con el formato dado a continuación \"DIA-MES-AÑO HORA:MINUTOS:00\": ");
                                String fechaReserva =  readln();
                                Mesas.crearReserva(clienteReserva,reservaMesa,fechaReserva);
                                System.out.println("Su reserva ha sido creada ");
                                System.out.println(" ");
                                break;
                            //hacer metodo que muestre la reserva


                            case 3://Cancelar Reserva
                                System.out.println("Ingresaste a Cancelar Reserva");
                                System.out.println("Ingrese el numero de la mesa en la cual desea cancelar la reserva: ");
                                int cancelarMesa = scanner.nextInt();
                                System.out.println("Ingrese el id del cliente que hizo la reserva: ");
                                int clienteCancelar = scanner.nextInt();
                                System.out.println("Ingrese la fecha para la que se reservo con el formato dado a continuación \"DIA-MES-AÑO HORA:MINUTOS:00\": ");
                                String fechaCancelar = readln();
                                Mesas.cancelarReserva(clienteCancelar, fechaCancelar);
                                System.out.println("Reserva cancelada");
                                System.out.println(" ");
                                break;

                            case 4: // Volver al menú principal
                                break;
                            default:
                                System.out.println("DEBES ESCRIBIR UN NUMERO ENTERO ENTRE LAS OPCIONES DADAS");

                        }
                    } while (opcion2 < 1 || opcion2 > 4);
                    break;
                case 4:
                    do {// Funcionalidad Tomar Pedidos
                        System.out.println(queHacer);
                        System.out.println("1. Hacer pedido");
                        System.out.println("");
                        System.out.println("2. Volver al menú de las calvas");
                        System.out.print("Escribe el número de la opción que necesitas: ");
                        opcion = (int) readLong();

                        switch (opcion) {

                            case 1:// Muestra si tiene reserva o no, en caso de que si tenga reserva mostrar Menu.
                                System.out.println("Ingresaste a hacer pedido");
                                System.out.println("El cliente tiene una reserva? (responda 'si' o 'no')");
                                String tieneReserva = readln();
                                if (tieneReserva.equals("si")) {
                                    System.out.println("Ingrese el id del cliente que hizo la reserva: ");
                                    int idCliente = scanner.nextInt();
                                    System.out.println("Ingrese la fecha para la se reservó la mesa con el formato dado a continuación \"DIA-MES-AÑO HORA:MINUTOS:00\": ");
                                    String fecha = readln();
                                    System.out.println("Ingrese el nombre del mesero que va a atender el pedido:  ");
                                    String nombreEmpleado = readln();
                                    Empleado mesero1 = null;
                                    for(Empleado mesero: Empleado.empleados){
                                        if(mesero.getNombre().equals(nombreEmpleado)){
                                            mesero1 = mesero;
                                            break;
                                        }
                                    }
                                    Mesas mesaDeReserva = null;
                                    for(Mesas mesa : Mesas.mesas){
                                        if (mesa.getReservaPorCliente().containsKey(idCliente) && mesa.getOcupadoEnFecha().containsKey(fecha)){
                                            mesaDeReserva = mesa;
                                            break;
                                        }
                                    }
                                    MenuMethods.mostrarMenuComidas();
                                    MenuMethods.mostrarMenuGaseosas();
                                    Pedido pedido = new Pedido(mesaDeReserva, fecha, idCliente, mesero1);
                                    System.out.println("Ingrese el pedido de comidas: ");
                                    ArrayList<String> pedidoComidas = readln();
                                    break;
                                }
                                else {

                                }


                                break;

                            case 2://Hacer Reserva
                                break;
                            default:
                                System.out.println("DEBES ESCRIBIR UN NUMERO ENTERO ENTRE LAS OPCIONES DADAS");
                        }
                    } while (opcion < 1 || opcion > 2);
                    break;
                case 5:
                    do {// Funcionalidad Gestion Inventario
                        System.out.println(queHacer);
                        System.out.println("1. Consultar Inventario");
                        System.out.println("2. Volver al menú de las calvas");
                        System.out.print("Escribe el número de la opción que necesitas: ");
                        opcion = (int) readLong();

                        switch (opcion) {

                            case 1:// Mostrar inventario
                            case 2:// Volver al menú principal
                                break;
                            default:
                                System.out.println("DEBES ESCRIBIR UN NUMERO ENTERO ENTRE LAS OPCIONES DADAS");
                        }
                    } while (opcion < 1 || opcion > 2);
                    break;

                case 6:
                    do {
                        System.out.println(salirsistematxt);
                        salirDelSistema();
                        break;
                    } while (opcion != 6);

            }

        } while (opcion != 6);
    }

    ;

}
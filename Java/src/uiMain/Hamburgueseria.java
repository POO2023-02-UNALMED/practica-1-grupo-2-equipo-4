package uiMain;

import gestorAplicacion.administracion.Contabilidad;
import gestorAplicacion.administracion.Empleado;
import gestorAplicacion.restaurante.*;

import java.util.*;
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
                    int opcionF, opcionF1, opcionF2;
                    ;
                    do { // Opciones de Funcionalidad Contabilidad
                        System.out.println(queHacer);
                        System.out.println("1. Pagar Servicios");
                        System.out.println("2. Calcular Utilidades");
                        System.out.println("3. Pagar los Sueldos de los Empleados");
                        System.out.println("4. Calcular Gastos");
                        System.out.println("6. Volver al menú de funcionalidades");
                        System.out.print("Escribe el número de la opción que necesitas: ");
                        opcionF = scanner.nextInt();
                        switch (opcionF) {
                            case 1:
                                float servicios = Contabilidad.pagarServicios();


                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            default:
                                System.out.println("DEBES ESCRIBIR UN NUMERO ENTERO ENTRE LAS OPCIONES DADAS");
                        }
                    } while (opcionF < 1 || opcionF > 6);
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
                                for (Empleado empleado : Empleado.empleados) {
                                    if (verNombre == empleado.getNombre()) {
                                        System.out.println(empleado.toString());
                                    }
                                }

                            case 2://AgregarEmpleado
                                System.out.println("Ingrese la ocupacion del empleado (1 en caso de ser mesero, 2 en caso de ser Cocinero): ");
                                int ocup = (int) readLong();
                                if (ocup == 1) {
                                    System.out.println("Ingrese el nombre del empleado: ");
                                    System.out.println("Ingrese el id del empleado: ");
                                    System.out.println("Ingrese el salario del empleado: ");
                                } else if (ocup == 2) {
                                    System.out.println("Ingrese el nombre del empleado: ");
                                    System.out.println("Ingrese el id del empleado: ");
                                    System.out.println("Ingrese el salario del empleado: ");
                                    System.out.println("Ingrese la especialidad del empleado: ");

                                }
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
                                String fechaReserva = readln();
                                Mesas.crearReserva(clienteReserva, reservaMesa, fechaReserva);
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
                                    for (Empleado mesero : Empleado.empleados) {
                                        if (mesero.getNombre().equals(nombreEmpleado)) {
                                            mesero1 = mesero;
                                            break;
                                        }
                                    }
                                    Mesas mesaDeReserva = null;
                                    for (Mesas mesa : Mesas.mesas) {
                                        if (mesa.getReservaPorCliente().containsKey(idCliente) && mesa.getOcupadoEnFecha().containsKey(fecha)) {
                                            mesaDeReserva = mesa;
                                            break;
                                        }
                                    }
                                    System.out.println(MenuMethods.mostrarMenuComidas());
                                    System.out.println(MenuMethods.mostrarMenuGaseosas());
                                    Pedido pedido = new Pedido(mesaDeReserva, fecha, idCliente, mesero1);
                                    System.out.println("Ingrese el pedido de comidas:(termine el pedido con" + " SALIR ");
                                    Scanner entrada = new Scanner(System.in);

                                    List<String> pedidoComidas = new ArrayList<>();
                                    Map<String, Comida> mapComida = new HashMap<>();
                                    while (true) {
                                        String input = entrada.nextLine();
                                        if (input.equalsIgnoreCase("salir")) {
                                            break;
                                        }
                                        pedidoComidas.add(input);

                                    }
                                    for (String nombreComida : pedidoComidas) {
                                        for (Comida comida : Comida.listaComida) {
                                            if (comida.getNombre().equals(nombreComida)) {
                                                mapComida.put(nombreComida, comida);
                                                pedido.agregarComidaAlPedido(mapComida.get(nombreComida));
                                                break;
                                            }
                                        }
                                    }

                                    System.out.println("Ingrese el pedido de gaseosas:(termine el pedido con" + " SALIR ");
                                    Scanner entrada2 = new Scanner(System.in);
                                    List<String> pedidoGaseosas = new ArrayList<>();
                                    Map<String, Gaseosas> mapGaseosa = new HashMap<>();
                                    while (true) {
                                        String input = entrada.nextLine();
                                        if (input.equalsIgnoreCase("salir")) {
                                            break;
                                        }
                                        pedidoGaseosas.add(input);
                                    }

                                    for (String nombreGaseosa : pedidoGaseosas) {
                                        for (Gaseosas gaseosa : Gaseosas.listaGaseosas) {
                                            if (gaseosa.getNombre().equals(nombreGaseosa)) {
                                                mapGaseosa.put(nombreGaseosa, gaseosa);
                                                break;
                                            }
                                        }
                                    }
                                    Collection<Gaseosas> gaseosasCollection = mapGaseosa.values();
                                    Gaseosas[] gaseosasArray = gaseosasCollection.toArray(new Gaseosas[0]);
                                    pedido.agregarGaseosaAlPedido(gaseosasArray);

                                    Collection<Comida> comidasCollection = mapComida.values();
                                    Comida[] comidasArray = comidasCollection.toArray(new Comida[0]);
                                    pedido.agregarComidaAlPedido(comidasArray);


                                    System.out.println("Los pedidos de comidas son: ");
                                    System.out.println(pedido.imprimirComidas());
                                    System.out.println("Los pedidos de gaseosas son: ");
                                    System.out.println(pedido.imprimirGaseosas());



                                } else {
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
                                System.out.println("Entraste a consultar inventario");
                                System.out.println("¿Qué quieres hacer?");
                                System.out.println("1. Comprar ingredientes");
                                System.out.println("2. Ver ingrediente");
                                System.out.println("3. volver al menu");
                                int consultar;
                                consultar = (int) readLong();
                                do {
                                    switch (consultar) {
                                        case 1:
                                            System.out.println("Ingrese el ingrediente que desea comprar");
                                            String ingredienteNombre = readln();
                                            System.out.println("Ingrese la cantidad que quiere comprar");
                                            int cantidad = scan.nextInt();
                                            for (Ingredientes ingrediente : Ingredientes.listaIngredientes) {
                                                if (ingrediente.getNombre() == ingredienteNombre) {
                                                    ingrediente.comprar(cantidad, ingrediente);
                                                    System.out.println("Te costo: $" + ingrediente.getPrecio() * cantidad);
                                                }
                                            }
                                            System.out.println("Compraste " + cantidad + " de " + ingredienteNombre);
                                            break;
                                        case 2:
                                            System.out.println("Ingresa el ingrediente que quieres ver: ");
                                            String ingredienteVer = readln();
                                            for (Ingredientes ingrediente : Ingredientes.listaIngredientes) {
                                                if (ingrediente.getNombre() == ingredienteVer) {
                                                    System.out.println(ingrediente.toString());
                                                }
                                            }
                                            break;
                                        case 3:
                                            break;
                                    }
                                    break;
                                } while (consultar != 3);
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
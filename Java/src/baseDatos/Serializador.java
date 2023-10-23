/*package baseDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import uiMain.Hamburgueseria;
import gestorAplicacion.administracion.*;
import gestorAplicacion.restaurante.*; */

/*public class Serializador {
    static File archivo = new File("");

    public static void serializarCalificaicon(ArrayList<Calificacion> lista) {
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }

    }

    public static void serializarContabilidad(ArrayList<Contabilidad> lista) {
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }

    }

    public static void serializarEmpleado(ArrayList<Empleado> lista) {
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }

    }
    public static void serializarFactura(ArrayList<Factura> lista){
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }
    }
    public static void serializarGaseosa(ArrayList<Gaseosas> lista){
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\restaurante.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }
    }
    public static void serializarIngredientes(ArrayList<Ingredientes> lista){
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\restaurante.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }
    }

    public static void serializarInventario(ArrayList<Inventario> lista) {
        try {
            String rutaArchivo = "src/baseDatos/temp/restaurante.txt";
            FileOutputStream f = new FileOutputStream(new File(rutaArchivo));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");


        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de flujo de inicializacion: " + e.getMessage());
        }
    }

    public static void serializarMenu(ArrayList<Hamburgueseria> lista) {
        try {
            String rutaArchivo = "src/baseDatos/temp/restaurante.txt";
            FileOutputStream f = new FileOutputStream(new File(rutaArchivo));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");


        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de flujo de inicializacion: " + e.getMessage());
        }
    }
    public static void serializarMesas(ArrayList<Mesas> lista){
        try{
            String rutaArchivo = "src/baseDatos/temp/restaurante.txt";
            FileOutputStream f = new FileOutputStream(new File(rutaArchivo));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de flujo de inicializacion: " + e.getMessage());
        }

        }

    public static void serializarPedido(ArrayList<Pedido> lista) {
        try {
            String rutaArchivo = "src/baseDatos/temp/restaurante.txt";
            FileOutputStream f = new FileOutputStream(new File(rutaArchivo));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();

            System.out.println("La serialización se ha completado correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de flujo de inicializacion: " + e.getMessage());
        }
    }

    public static void serializarHamburgueseria(ArrayList<Hamburgueseria> lista) {
        try {
            String rutaArchivo = "src/baseDatos/temp/interface.txt";
            FileOutputStream f = new FileOutputStream(new File(rutaArchivo));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();

            System.out.println("La serialización se ha completado correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de flujo de inicializacion: " + e.getMessage());
        }
    }
     public static void serializarMesero(ArrayList<Mesero> lista) {
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }

    }
     public static void serializarCocinero(ArrayList<Cocinero> lista) {
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }

    }
}*/
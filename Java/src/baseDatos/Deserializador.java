/*package baseDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

import uiMain.Hamburgueseria;
import gestorAplicacion.administracion.*;
import gestorAplicacion.restaurante.*; //

public class Deserializador {
    static File archivo = new File("");

    public static ArrayList<Hamburgueseria> deserializarHamburgueseria() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\interface.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Hamburgueseria> lista_Hamburgueseria = (ArrayList<Hamburgueseria>) o.readObject();

            file.close();
            o.close();
            return lista_Hamburgueseria;

        } catch (FileNotFoundException e) {
            return new ArrayList<Hamburgueseria>();
        } catch (IOException e) {
            return new ArrayList<Hamburgueseria>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Hamburgueseria>();
        }
    }

    public static ArrayList<Calificacion> deserializarCalificacion() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Calificacion> lista_Calificacion = (ArrayList<Calificacion>) o.readObject();

            file.close();
            o.close();
            return lista_Calificacion;

        } catch (FileNotFoundException e) {
            return new ArrayList<Calificacion>();
        } catch (IOException e) {
            return new ArrayList<Calificacion>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Calificacion>();
        }
    }

    public static ArrayList<Contabilidad> deserializarContabilidad() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Contabilidad> lista_Contablidad = (ArrayList<Contabilidad>) o.readObject();

            file.close();
            o.close();
            return lista_Contablidad;

        } catch (FileNotFoundException e) {
            return new ArrayList<Contabilidad>();
        } catch (IOException e) {
            return new ArrayList<Contabilidad>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Contabilidad>();
        }
    }

    public static ArrayList<Empleado> deserializarEmpleado() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Empleado> lista_Empleados = (ArrayList<Empleado>) o.readObject();

            file.close();
            o.close();
            return lista_Empleados;

        } catch (FileNotFoundException e) {
            return new ArrayList<Empleado>();
        } catch (IOException e) {
            return new ArrayList<Empleado>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Empleado>();
        }
    }


    public static ArrayList<Factura> deserializarnoFactura() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\administracion.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Factura> lista_Facturas = (ArrayList<Factura>) o.readObject();

            file.close();
            o.close();
            return lista_Facturas;

        } catch (FileNotFoundException e) {
            return new ArrayList<Factura>();
        } catch (IOException e) {
            return new ArrayList<Factura>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Factura>();
        }
    }

    public static ArrayList<Gaseosas> deserializarGaseosas() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\restaurante.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Gaseosas> lista_Gaseosas = (ArrayList<Gaseosas>) o.readObject();

            file.close();
            o.close();
            return lista_Gaseosas;

        } catch (FileNotFoundException e) {
            return new ArrayList<Gaseosas>();
        } catch (IOException e) {
            return new ArrayList<Gaseosas>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Gaseosas>();
        }

    }

    public static ArrayList<Ingredientes> deserializarIngredientes() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\restaurante.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Ingredientes> lista_Ingredientes = (ArrayList<Ingredientes>) o.readObject();

            file.close();
            o.close();
            return lista_Ingredientes;

        } catch (FileNotFoundException e) {
            return new ArrayList<Ingredientes>();
        } catch (IOException e) {
            return new ArrayList<Ingredientes>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Ingredientes>();
        }

    }

    public static ArrayList<Inventario> deserializarInventario() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\restaurante.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Inventario> lista_Inventario = (ArrayList<Inventario>) o.readObject();

            file.close();
            o.close();
            return lista_Inventario;

        } catch (FileNotFoundException e) {
            return new ArrayList<Inventario>();
        } catch (IOException e) {
            return new ArrayList<Inventario>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Inventario>();
        }

    }

    public static ArrayList<Menu> deserializarMenu() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\restaurante.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Menu> lista_Menu = (ArrayList<Menu>) o.readObject();

            file.close();
            o.close();
            return lista_Menu;

        } catch (FileNotFoundException e) {
            return new ArrayList<Menu>();
        } catch (IOException e) {
            return new ArrayList<Menu>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Menu>();
        }
    }
        public static ArrayList<Mesas> deserializarMesas () {
            try {
                FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                        "\\src\\baseDatos\\temp\\restaurante.txt"));
                ObjectInputStream o = new ObjectInputStream(file);

                ArrayList<Mesas> lista_Mesas = (ArrayList<Mesas>) o.readObject();

                file.close();
                o.close();
                return lista_Mesas;

            } catch (FileNotFoundException e) {
                return new ArrayList<Mesas>();
            } catch (IOException e) {
                return new ArrayList<Mesas>();
            } catch (ClassNotFoundException e) {
                return new ArrayList<Mesas>();
            }
        }
        public static ArrayList<Pedido> deserializarPedido() {
            try {
                FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                        "\\src\\baseDatos\\temp\\restaurante.txt"));
                ObjectInputStream o = new ObjectInputStream(file);

                ArrayList<Pedido> lista_Pedido = (ArrayList<Pedido>) o.readObject();

                file.close();
                o.close();
                return lista_Pedido;

            } catch (FileNotFoundException e) {
                return new ArrayList<Pedido>();
            } catch (IOException e) {
                return new ArrayList<Pedido>();
            } catch (ClassNotFoundException e) {
                return new ArrayList< Pedido>();
            }

        }
    } */

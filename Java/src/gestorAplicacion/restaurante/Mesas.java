
 package gestorAplicacion.restaurante ;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.io.Serializable;
 import java.util.Date;

 public class Mesas implements Serializable {
     public static java.util.ArrayList<Mesas> mesas;
     private int idMesa = 0;
     private int numeroDeSillas;
     private boolean ocupado = false;
     private int idCliente;
     private Date fechaReserva;

     public Mesas( int numeroDeSillas) {
         this.idMesa ++ ;
         this.numeroDeSillas = numeroDeSillas;
         mesas.add(this);
     }

     public static void crearReserva(int idCliente, int numeroDeSillas, Date fecha) {
         boolean mesaDisponible = false;
         Mesas mesaCercana = null;
         int diferenciaMinima = Integer.MAX_VALUE;

         for (Mesas mesa : mesas) {
             if (mesa.getNumeroDeSillas() == numeroDeSillas && mesa.isOcupado()  && mesa.getFechaReserva() == null) {
                 mesaDisponible = true;
                 mesa.setIdCliente(idCliente);
                 mesa.setOcupado(true);
                 mesa.setFechaReserva(fecha);
                 break;
             } else {
                 int diferencia = Math.abs(numeroDeSillas - mesa.getNumeroDeSillas());
                 if (diferencia < diferenciaMinima) {
                     diferenciaMinima = diferencia;
                     mesaCercana = mesa;
                 }
             }
         }

         if (!mesaDisponible) {
             System.out.println("No hay mesas disponibles con " + numeroDeSillas + " sillas en la fecha especificada.");
             if (mesaCercana != null) {
                 System.out.println("Te recomendamos la mesa con " + mesaCercana.getNumeroDeSillas() + " sillas más cercana.");
             } else {
                 System.out.println("No se encontraron mesas cercanas en número de sillas.");
             }
         }

         return mesaDisponible;
     }

     public void cancelarReserva() { // Este método libera la mesa dejandola sin ningún cliente
         this.idCliente = 0;
         this.ocupado = true;

     }


     public static ArrayList<Mesas> getMesas() {
         return mesas;
     }

     public void setIdMesa(int idMesa) {
         this.idMesa = idMesa;
     }

     public int getNumeroDeSillas() {
         return numeroDeSillas;
     }

     public void setNumeroDeSillas(int numeroDeSillas) {
         this.numeroDeSillas = numeroDeSillas;
     }

     public boolean isOcupado() {
         return ocupado;
     }

     public void setOcupado(boolean estadoMesa) {
         this.ocupado = estadoMesa;
     }

     public int getIdCliente() {
         return idCliente;
     }

     public void setIdCliente(int idCliente) {
         this.idCliente = idCliente;
     }

     public void setFechaReserva(Date fechaReserva){
         this.fechaReserva = fechaReserva;
     }
     public Date getFechaReserva(){
         return this.fechaReserva;
     }

 }



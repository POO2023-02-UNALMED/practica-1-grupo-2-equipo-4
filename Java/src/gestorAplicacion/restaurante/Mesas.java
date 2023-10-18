
 package gestorAplicacion.restaurante ;
 import java.util.ArrayList;
 import java.io.Serializable;
 import java.util.Date;
 import java.util.Objects;

 public class Mesas implements Serializable {
     public static java.util.ArrayList<Mesas> mesas;
     private int idMesa = 0;
     private int numeroDeSillas;
     private boolean ocupado = false;
     private int idCliente;
     private String fechaReserva;

     public Mesas( int numeroDeSillas) {
         this.idMesa ++ ;
         this.numeroDeSillas = numeroDeSillas;
         mesas.add(this);
     }

     public static boolean crearReserva(int idCliente, int numeroDeSillas, String fecha) {
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

     public static void efectuarReserva(int idCliente, int idMesa,String fechaReserva ){
            for(Mesas mesa : mesas){
                if(mesa.getIdCliente() == idCliente && mesa.getIdMesa()==idMesa && Objects.equals(mesa.fechaReserva, fechaReserva)){
                    mesa.setOcupado(true);
                }
            }
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

     public void setFechaReserva(String fechaReserva){
         this.fechaReserva = fechaReserva;
     }
     public String getFechaReserva(){
         return this.fechaReserva;
     }

     public int getIdMesa() {
         return idMesa;
     }
 }



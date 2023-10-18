
 package gestorAplicacion.restaurante ;
 import java.util.*;
 import java.io.Serializable;

 public class Mesas implements Serializable {
     public static java.util.ArrayList<Mesas> mesas = new ArrayList<>();
     private int idMesa;
     private int numeroDeSillas;
     private boolean ocupado = false;
     private HashMap<Integer, String>  reservaPorCliente = new HashMap<>();

     public Mesas( int idMesa, int numeroDeSillas) {
         this.idMesa = idMesa ;
         this.numeroDeSillas = numeroDeSillas;
         mesas.add(this);
     }

     public boolean crearReserva(int idCliente, int numeroDeSillas, String fecha) {
         if (reservaPorCliente.containsValue(fecha) ){

         }

     }

     public void efectuarReserva(int idCliente, int idMesa,String fechaReserva ){
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

     public void agregarFechaReserva(String fechaReserva){
         this.fechaReserva.add(fechaReserva);
     }
     public String getFechaReserva() {}

     public int getIdMesa() {
         return idMesa;
     }

     public String toString(){
         return  "mesa número:" + idMesa + "con número de sillas: " + numeroDeSillas + " está ocupada: " + ocupado + "en la fecha: "+ fechaReserva + "por el cliente : " + idCliente;
     }
 }



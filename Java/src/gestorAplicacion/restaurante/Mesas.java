
 package gestorAplicacion.restaurante ;
 import java.util.*;
 import java.io.Serializable;
 import java.util.stream.Stream;

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

     public void crearReserva(int idCliente, int idMesa, String fecha) {
         for (Mesas mesa:mesas){
             if (mesa.getIdMesa()== idMesa && !mesa.reservaPorCliente.containsValue(fecha)){
                 mesa.reservaPorCliente.put(idCliente,fecha);
                 mesa.setOcupado(true);
             }
         }

     }
     public String stringMesasDisponibles (int numeroDeSillas, String fecha){
         java.util.ArrayList<Mesas> mesasDisponibles = new ArrayList<>();
         for (Mesas mesa: mesas) {
             if (!mesa.reservaPorCliente.containsValue(fecha) && mesa.numeroDeSillas == numeroDeSillas ) {
                 mesasDisponibles.add(mesa);
                 if (mesasDisponibles.isEmpty()) {
                     return "No hay mesas con "+numeroDeSillas+" en la fecha "+fecha;
                 }
             }
         }
         StringBuilder cadena = null;
         for (Mesas mesa: mesasDisponibles){
             cadena.append("La mesa ");
             cadena.append(mesa.getIdMesa());
             cadena.append(" esta disponible\n");
         }
         return "Mesas Disponibles:\n" + cadena;
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



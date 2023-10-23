
 package gestorAplicacion.restaurante ;
 import java.util.*;
 import java.io.Serializable;
 import java.util.stream.Stream;

 public class Mesas implements Serializable {
     public static java.util.ArrayList<Mesas> mesas = new ArrayList<>();
     private int idMesa;
     private int numeroDeSillas;
     private HashMap<Integer, String>  reservaPorCliente = new HashMap<>();
     private HashMap<String, Boolean> ocupadoEnFecha = new HashMap<>();


     public Mesas( int idMesa, int numeroDeSillas) {
         this.idMesa = idMesa ;
         this.numeroDeSillas = numeroDeSillas;
         mesas.add(this);
     }

     public void crearReserva(int idCliente, int idMesa, String fecha) {
         for (Mesas mesa:mesas){
             if (mesa.getIdMesa()== idMesa && !mesa.reservaPorCliente.containsValue(fecha)){
                 mesa.reservaPorCliente.put(idCliente,fecha);
                 mesa.setOcupadoEnFecha(true, fecha);
             }
         }
     }

    public void efectuarReserva(int idCliente,int idMesa,String fecha ){ // efectua una reserva, lo que hace que la reserva se borre, pero el estado de la mesa siga ocupada
            for(Mesas mesa : mesas ){
                if(mesa.reservaPorCliente.containsKey(idCliente) && mesa.ocupadoEnFecha.containsKey(fecha)){
                    mesa.reservaPorCliente.remove(idCliente, fecha);
                    mesa.setOcupadoEnFecha(true, fecha);
                }
            }
     }

     public void cancelarReserva(int idCliente, int idMesa, String fecha) {// Este método libera la mesa dejandola sin ningún cliente
        for (Mesas mesa : mesas){
            if (mesa.reservaPorCliente.containsKey(idCliente) && mesa.ocupadoEnFecha.containsKey(fecha)){
                mesa.reservaPorCliente.remove(idCliente, fecha);
                mesa.setOcupadoEnFecha(false, fecha);
            }
        }

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

     public boolean isOcupadoEnFecha(String fecha) {
         return ocupadoEnFecha.getOrDefault(fecha, false);
     }
     public void setOcupadoEnFecha(boolean estadoMesa, String fecha) {
         ocupadoEnFecha.put(fecha, estadoMesa);
     }

     public void set(Integer key, String value) {
         reservaPorCliente.put(key, value);
     }
     public int getIdMesa() {
         return idMesa;
     }

     public String toString() {
         StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append("Mesa número: ").append(idMesa).append("\n");
         stringBuilder.append("Número de sillas: ").append(numeroDeSillas).append("\n");
         stringBuilder.append("Fechas ocupadas: ").append(ocupadoEnFecha.keySet()).append("\n");
         stringBuilder.append("Reservas:\n");
         for (Map.Entry<Integer, String> entry : reservaPorCliente.entrySet()) {
             Integer idCliente = entry.getKey();
             String fecha = entry.getValue();
             stringBuilder.append("ID de cliente: ").append(idCliente).append(", Fecha de reserva: ").append(fecha).append("\n");
         }
         return stringBuilder.toString();
     }
   /* public String verificarDisponibilidad (int numeroDeSillas, String fecha){
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
     }*/
 }



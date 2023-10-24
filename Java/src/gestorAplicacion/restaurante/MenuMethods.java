package gestorAplicacion.restaurante;

public interface MenuMethods {
    static String mostrarMenuComidas(){
        StringBuilder menuComidas = new StringBuilder();
        for (Comida comida : Comida.listaComida) {
            menuComidas.append(comida.getNombre()).append(" - Precio: $").append(comida.calcularPrecio());
        }
        return menuComidas.toString();
    }

        // la unica para que salga algo en el Case, es que estos metodos retornen algo. asi que en Hamburgueseria se debe printear el metodo.
        // Aunque intentte hacer esto
        static String mostrarMenuGaseosas() {
                StringBuilder menuGaseosas = new StringBuilder();
                for (Gaseosas gaseosa : Gaseosas.listaGaseosas) {
                    menuGaseosas.append(gaseosa.getNombre()).append(" - Precio: $").append(gaseosa.getPrecio()).append("\n");
                }
                return menuGaseosas.toString();
            }

    }


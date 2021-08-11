
package Polimorfismo;


public class ClasePrincipal {
    public static void main(String[] args) {
            Operaciones mensajero_Suma = new Suma();
            mensajero_Suma.PedirDatos();
            mensajero_Suma.Operacion();
            mensajero_Suma.MostrarResultado();
            
            Operaciones mensajero_Resta = new Resta();
            mensajero_Resta.PedirDatos();
            mensajero_Resta.Operacion();
            mensajero_Resta.MostrarResultado();
            
    }
}

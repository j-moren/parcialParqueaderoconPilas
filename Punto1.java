
import java.util.Stack;

public class Punto1 {

    public void P1(int d) {
        Metodo m = new Metodo();        
        Stack<Vehiculo> pilas = m.llenarPilas(d); // Llenamos las pilas con los vehículos

        System.out.println("Celdas Disponibles: ");
        m.mostrarDisponibles(pilas, d);  // Mostrar las celdas disponibles

        System.out.println("Celdas Ocupadas: ");
        m.mostrarOcupados(pilas);  // Mostrar las celdas ocupadas

        double celdasOcupadas = m.calcularCeldasOcupadas(pilas);
        System.out.println("Número de Celdas Ocupadas: " + celdasOcupadas);
    }
}

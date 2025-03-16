import java.util.Stack;
import java.util.Scanner;

public class Metodo {
    Scanner sc = new Scanner(System.in);

    
    public Stack<Vehiculo> llenarPilas(int dimension) {
        Stack<Vehiculo> pilas = new Stack<>();
        for (int i = 0; i < dimension; i++) {
            Vehiculo v = new Vehiculo();
            System.out.println("Ingrese la Placa del Vehículo para la celda " + (i + 1) + ":");
            v.setPlaca(sc.next());
            System.out.println("Ingrese el Nombre del Propietario:");
            v.setNombre(sc.next());
            System.out.println("Ingrese el Cilindraje del Vehículo:");
            v.setCilindraje(sc.nextInt());
            System.out.println("Ingrese el Modelo del vehículo:");
            v.setModelo(sc.nextInt());
            System.out.println("Ingrese 1 si el vehículo está estacionado (ocupado) o 0 si la celda está libre (disponible):");
            v.setDisponibilidad(sc.nextInt());

            
            if (v.getDisponibilidad() == 1) {
                pilas.push(v);
            }
        }
        return pilas;
    }

    
    public void mostrarDisponibles(Stack<Vehiculo> pilas, int dimension) {
        System.out.println("\nCeldas Disponibles:");
        if (pilas.size() < dimension) {
            for (int i = 0; i < dimension; i++) {
                if (pilas.size() <= i) {
                    System.out.println("Celda " + (i + 1) + " está libre.");
                }
            }
        } else {
            System.out.println("No hay celdas disponibles.");
        }
    }

    
    public void mostrarOcupados(Stack<Vehiculo> pilas) {
        System.out.println("\nCeldas Ocupadas:");
        if (pilas.isEmpty()) {
            System.out.println("No hay vehículos estacionados.");
        } else {
            for (Vehiculo v : pilas) {
                System.out.println("Placa: " + v.getPlaca());
                System.out.println("Nombre Propietario: " + v.getNombre());
                System.out.println("Cilindraje: " + v.getCilindraje());
                System.out.println("Modelo: " + v.getModelo());
                System.out.println("Disponibilidad: " + v.getDisponibilidad());
                System.out.println();
            }
        }
    }

    
    public double calcularCeldasOcupadas(Stack<Vehiculo> pilas) {
        return pilas.size();
    }
}

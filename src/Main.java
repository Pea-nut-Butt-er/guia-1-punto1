import model.Empleado;
import service.EmpleadoService;

public class Main {
    public static void main(String[] args) {
        EmpleadoService empleadoService = new EmpleadoService();

        Empleado empleado1 = new Empleado(2345634, "Carlos", "Gutiérrez", 25000.00);
        Empleado empleado2 = new Empleado(3423412, "Ana", "Sánchez", 27500.00);

        empleadoService.mostrarEmpleado(empleado1);
        empleadoService.mostrarEmpleado(empleado2);

        empleadoService.aumentarSalarioPorPorcentaje(empleado1, 15.00);
        System.out.println("El salario anual del empleado es: " + empleadoService.calcularSalarioAnual(empleado1.getSalario()));

    }
}
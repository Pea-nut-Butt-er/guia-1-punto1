package service;

import model.Empleado;

public class EmpleadoService {
    public Double calcularSalarioAnual(Double salario){
        return salario * 12;
    }
    public void aumentarSalarioPorPorcentaje(Empleado empleado, Double porcentaje){
        empleado.setSalario(empleado.getSalario() + (empleado.getSalario() * porcentaje / 100));
    }
    public void mostrarEmpleado(Empleado empleado){
        System.out.println("Empleado: -Dni: " + empleado.getDni() + " -Nombre: " + empleado.getNombre() + " -Apellido: " + empleado.getApellido() + " -Salario: " + empleado.getSalario());
    }
}

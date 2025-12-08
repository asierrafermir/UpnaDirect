/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;
import java.time.Year;

/**
 *
 * @author alumno
 */
public class Cliente {
    private int fechaNacimiento;
    private int SalarioAnual;

    public Cliente(int fechaNacimiento, int SalarioAnual) {
        this.fechaNacimiento = fechaNacimiento;
        this.SalarioAnual = SalarioAnual;
    }

    public int getEdad() {
        if (fechaNacimiento < 1900 || fechaNacimiento > Year.now().getValue()) {
            System.out.println("Año de nacimiento inválido.");
            return -1;
        } else {
            return Year.now().getValue()-fechaNacimiento;
        }
    }

    public int getSalarioAnual() {
        if (SalarioAnual < 0) {
            System.out.println("Salario anual inválido.");
            return -1;
        } else {
            return SalarioAnual;
        }
    }
}

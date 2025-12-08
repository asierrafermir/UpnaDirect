/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class VistaConsola implements IVistaConsola{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Integer solicitarFechaNacimiento() {
        System.out.print("Ingrese su año de nacimiento: ");
        return scanner.nextInt();
    }

    @Override
    public Integer solicitarSalarioAnual() {
        System.out.print("Ingrese su salario anual: ");
        return scanner.nextInt();
    }  
    
    @Override
    public String solicitarTipoBien() {
        System.out.print("Ingrese el tipo de bien (Vehiculo/Vivienda): ");
        return scanner.next();
    }

    @Override
    public Integer solicitarValorBien() {
        System.out.print("Ingrese el valor del bien: ");
        return scanner.nextInt();
    }

    @Override
    public void mostrarOfertaMasVentajosa(Oferta oferta) {
        if (oferta != null) {
            Double importe = oferta.calcularImporte(); 
            Double comision = oferta.calcularComision();
            System.out.println("La oferta más ventajosa es: " + oferta.getAseguradora().getNombre() + "|" + importe + "|" + comision);
        } else {
            System.out.println("No se pudo determinar una oferta ventajosa.");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class Adasles extends Aseguradora{
    public Adasles() {
        super("Adasles");
    }

    public Double getPorcentajeImporte(Cliente cliente, Bien bien) {
        if ((cliente.getEdad() > 60 || cliente.getEdad() < 20) && bien.getTipo().equalsIgnoreCase("Vehiculo")) {
            return 0.06;
        } else {
            return 0.02;
        }
    }

    public Double getPorcentajeComision(Oferta oferta) {
        if (oferta.calcularImporte() > 1000){
            return 0.05;
        } else {
            return super.getPorcentajeComision(oferta);
        }
    }
}

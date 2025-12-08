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
public class Mafro extends Aseguradora{
    public Mafro() {
        super("Mafro");
    }

    public Double getPorcentajeImporte(Cliente cliente, Bien bien) {
        if (cliente.getEdad() < 20 && (bien.getTipo().equalsIgnoreCase("Vehiculo"))) {
            return 0.05;
        } else if (cliente.getSalarioAnual() < 20000 && bien.getValor() > 200000 && (bien.getTipo().equalsIgnoreCase("Vivienda"))) {
            return 0.04;
        } else {
            return super.getPorcentajeImporte(cliente, bien);
        }
    }

    public Double getPorcentajeComision(Oferta oferta) {
        if (oferta.calcularImporte() > 1000){
            return 0.03;
        } else {
            return super.getPorcentajeComision(oferta);
        }
    }
}

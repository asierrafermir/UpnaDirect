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
public class LineaIndirecta extends Aseguradora{
    public LineaIndirecta() {
        super("Linea Indirecta");
    }

    public Double getPorcentajeImporte(Cliente cliente, Bien bien) {
        if ((bien.getTipo().equalsIgnoreCase("Vivienda") && bien.getValor() < 150000) || ((bien.getTipo().equalsIgnoreCase("Vehiculo")) && bien.getValor() < 20000)) {
            return 0.04;
        } else if (cliente.getEdad() > 60 && bien.getValor() >= 20000 && (bien.getTipo().equalsIgnoreCase("Vehiculo"))) {
            return 0.06;
        } else {
            return super.getPorcentajeImporte(cliente, bien);
        }
    }

    public Double getPorcentajeComision(Oferta oferta) {
        if (oferta.calcularImporte() > 1000){
            return 0.04;
        } else {
            return super.getPorcentajeComision(oferta);
        }
    }
}

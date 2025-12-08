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
public class Oferta {
    private Cliente cliente;
    private Bien bien;
    private Aseguradora aseguradora;

    public Oferta(Cliente cliente, Bien bien, Aseguradora aseguradora){
        this.cliente = cliente;
        this.bien = bien;
        this.aseguradora = aseguradora;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public Double calcularImporte(){
        return bien.getValor() * aseguradora.getPorcentajeImporte(cliente, bien);
    }

    public Double calcularComision(){
        double comision = calcularImporte() * aseguradora.getPorcentajeComision(this);
        return Math.floor(comision);
    }
}

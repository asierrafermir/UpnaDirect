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
public class PresentadorOferta {
    private IVistaConsola vista;
    private OfertaVentajosa ofertaVentajosa;
    private Cliente cliente;
    private Bien bien;

    public PresentadorOferta(IVistaConsola vista, OfertaVentajosa ofertaVentajosa) {
        this.vista = vista;
        this.ofertaVentajosa = ofertaVentajosa;
        this.cliente = null;
        this.bien = null;
    }

    public void registrarClienteYBien() {
        Integer fechaNacimiento = vista.solicitarFechaNacimiento();
        Integer salarioAnual = vista.solicitarSalarioAnual();
        this.cliente = new Cliente(fechaNacimiento, salarioAnual);

        String tipoBien = vista.solicitarTipoBien();
        Integer valorBien = vista.solicitarValorBien();
        this.bien = new Bien(tipoBien, valorBien);
    }

    public void mostrarOferta() {
        Oferta oferta = ofertaVentajosa.calcularOfertaMasVentajosa(cliente, bien); 
        vista.mostrarOfertaMasVentajosa(oferta);
    }
}

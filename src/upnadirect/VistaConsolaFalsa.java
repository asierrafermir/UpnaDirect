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
public class VistaConsolaFalsa implements IVistaConsola{
    private Integer fechaNacimientoFake;
    private Integer salarioAnualFake;
    private String tipoBienFake;
    private Integer valorBienFake;
    private Oferta ofertaRecibida;

    public void setInputData(Integer fechaNacimiento, Integer salarioAnual, String tipoBien, Integer valorBien) {
        this.fechaNacimientoFake = fechaNacimiento;
        this.salarioAnualFake = salarioAnual;
        this.tipoBienFake = tipoBien;
        this.valorBienFake = valorBien;
    }

    @Override
    public Integer solicitarFechaNacimiento() {
        return fechaNacimientoFake;
    }

    @Override
    public Integer solicitarSalarioAnual() {
        return salarioAnualFake;
    }

    @Override
    public String solicitarTipoBien() {
        return tipoBienFake;
    }

    @Override
    public Integer solicitarValorBien() {
        return valorBienFake;
    }

    @Override
    public void mostrarOfertaMasVentajosa(Oferta oferta) {
        this.ofertaRecibida = oferta;
    }
    
    public Oferta getOfertaRecibida() {
        return ofertaRecibida;
    }
}

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
public interface IVistaConsola {
    Integer solicitarFechaNacimiento();
    Integer solicitarSalarioAnual();
    String solicitarTipoBien();
    Integer solicitarValorBien();
    void mostrarOfertaMasVentajosa(Oferta oferta);
}

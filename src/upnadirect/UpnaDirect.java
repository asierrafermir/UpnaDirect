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
public class UpnaDirect {

    public static void main(String[] args) {
        IVistaConsola vista = new VistaConsola();
        OfertaVentajosa modelo = new OfertaVentajosa();
        PresentadorOferta presentador = new PresentadorOferta(vista, modelo);
        presentador.registrarClienteYBien();
        presentador.mostrarOferta(); 
    }
    
}

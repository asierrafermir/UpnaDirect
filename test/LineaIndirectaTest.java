/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import upnadirect.Cliente;
import upnadirect.Bien;
import upnadirect.Aseguradora;
import upnadirect.Oferta;
import upnadirect.IVistaConsola;
import upnadirect.VistaConsolaFalsa;
import upnadirect.OfertaVentajosa;
import upnadirect.PresentadorOferta;

/**
 *
 * @author alumno
 */
public class LineaIndirectaTest {
    
    @Test
    public void testMejorOferta() {

        VistaConsolaFalsa vistaFalsa = new VistaConsolaFalsa();
        vistaFalsa.setInputData(2006, 15000, "Vehiculo", 30000);
        
        OfertaVentajosa ofertaVentajosa = new OfertaVentajosa();
        PresentadorOferta presentador = new PresentadorOferta(vistaFalsa, ofertaVentajosa);
        
        presentador.registrarClienteYBien();
        presentador.mostrarOferta(); 

        Oferta ofertaFinal = vistaFalsa.getOfertaRecibida();

        assertEquals("Linea Indirecta", ofertaFinal.getAseguradora().getNombre());
        assertEquals(900.0, ofertaFinal.calcularImporte(), 0.001); 
        assertEquals(9.0, ofertaFinal.calcularComision(), 0.001);
    }
}

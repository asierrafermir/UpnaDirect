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

/**
 *
 * @author alumno
 */
public class AseguradoraTest {
    
    private final Cliente cliente = new Cliente(2000, 50000);
    private final Bien bien = new Bien("Vehiculo", 40000);
    private final Oferta oferta = null;
    
    @Test
    public void testMafroPorcentajeImporte() {
        Aseguradora aseguradora = new Aseguradora("Mafro");
        Double actual = aseguradora.getPorcentajeImporte(cliente, bien);
        assertEquals("El porcentaje de importe para Mafro debe ser 0.03", 0.03, actual, 0.0001);
    }
    
    @Test
    public void testMafroPorcentajeComision() {
        Aseguradora aseguradora = new Aseguradora("Mafro");
        Double actual = aseguradora.getPorcentajeComision(oferta);
        assertEquals("El porcentaje de comisión para Mafro debe ser 0.01", 0.01, actual, 0.0001);
    }
}

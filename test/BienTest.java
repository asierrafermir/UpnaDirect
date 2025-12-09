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
import upnadirect.Bien;

/**
 *
 * @author alumno
 */
public class BienTest {
    
    //Caso de prueba 1: Validación exitosa
    @Test
    public void testBienValido(){
        Bien bienValido = new Bien ("Vehiculo", 40000);
        int valorBien = bienValido.getValor();
        assertEquals("El metodo devuelve el valor del bien si es valido", 40000, valorBien);
    }
    
    //Caso de prueba 2: Validacion fallida
    @Test
    public void testBienInvalido(){
        Bien bienInValido = new Bien ("Vehiculo", 100000);
        int valorBien = bienInValido.getValor();
        assertEquals("El metodo devuelve -1 si el valor del bien es invalido", -1, valorBien);
    }
}

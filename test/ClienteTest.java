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
import java.time.Year;
import upnadirect.Cliente;

/**
 *
 * @author alumno
 */
public class ClienteTest {
    
    //Caso de prueba 1: validación exitosa
    @Test
    public void testClientelValido() {
        Cliente clienteValido = new Cliente (1990, 50000);
        int salarioObtenido = clienteValido.getSalarioAnual();
        assertEquals("El método debe devolver el salario original si es válido.", 50000, salarioObtenido);
    }

    //Caso de prueba 2: validación fallida
    @Test
    public void testSalarioAnualInvalido() {
        Cliente clienteInvalido = new Cliente(2000, -10000); 
        int salarioObtenido = clienteInvalido.getSalarioAnual();
        assertEquals("El método debe devolver -1 cuando el salario es inválido.", -1, salarioObtenido);
    }
}

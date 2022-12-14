/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista14;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class PacienteTest {
    
    public PacienteTest() {
    }
    
    private double p;
    
    /**
     * Test of calcularImc method, of class Paciente.
     */
    @Test
    public void testCalcularImc() {
        System.out.println("calcularImc");
        Paciente instance = new Paciente();
        double expResult = 0.0;
        double result = instance.calcularImc();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPesoIdeal method, of class Paciente.
     */
    @Test
    public void testCalcularPesoIdeal() {
        System.out.println("calcularPesoIdeal");
        Paciente instance = new Paciente();
        double expResult = 0.0;
        double result = instance.calcularPesoIdeal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ferraa
 */
public class UnitarioTest {
    
    public UnitarioTest() {
    }

    @Test
    public void testTriplo() {
        //Teste do método Triplo
        Unitario teste = new Unitario();
        double esperado = 6.0;
        double valor = teste.triplo(2.0);
        assertEquals(esperado, valor, 0.0);
    }
    
    @Test
    public void testPar() {
        //Teste do método Par
        Unitario teste = new Unitario();
        boolean esperado = false;
        boolean valor = teste.par(3);
        assertEquals(esperado, valor);
    }
}

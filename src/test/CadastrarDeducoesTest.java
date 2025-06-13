package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import app.IRPF;

class CadastrarDeducoesTest {

	private IRPF irpf;

    @Before
    public void setup() {
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarPrevidenciaOficial() {
        irpf.cadastrarPrevidenciaOficial(700f); 
        assertEquals(700f, irpf.getPrevidenciaOficial(), 0);
    }
    
    @Test
    public void testCadastrarPrevidenciaOficial2() {
        irpf.cadastrarPrevidenciaOficial(800f); 
        assertEquals(800f, irpf.getPrevidenciaOficial(), 0);
    }
    
    @Test
    public void testCadastrarPrevidenciaOficial3() {
        irpf.cadastrarPrevidenciaOficial(900f); 
        assertEquals(900f, irpf.getPrevidenciaOficial(), 0);
    }

}

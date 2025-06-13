package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import app.IRPF;

class CadastrarDependentes {
	
	private IRPF irpf;

    @Before
    public void setup() {
        irpf = new IRPF();
    }
    
    @Test
    public void testCadastrarUmDependente() {
        irpf.cadastrarDependente("Maria"); 
        assertEquals(185.59f, irpf.getDeducaoDependentes(), 0);
    }
    
    @Test
    public void testCadastrarDoisDependentes() {
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("João");
        assertEquals(2*85.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarTresDependentes() {
        irpf.cadastrarDependente("João");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("José");
        assertEquals(3*85.59f, irpf.getDeducaoDependentes(), 0);
    }
}

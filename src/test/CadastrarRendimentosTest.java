package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import app.IRPF;

class CadastrarRendimentosTest {
	
	private IRPF irpf;
	
	@Before
	public void setup() {
		irpf = new IRPF();
	}

	@Test
    public void testCadastrarSalario() {
        irpf.cadastrarSalario(5000f);
        assertEquals(5000f, irpf.getTotalSalario(), 0);
    }

    @Test
    public void testCadastrarSalario2() {
        irpf.cadastrarSalario(6000f);
        assertEquals(6000f, irpf.getTotalSalario(), 0);
    }

    @Test
    public void testCadastrarSalario3() {
        irpf.cadastrarSalario(5000f);
        irpf.cadastrarSalario(6000f);
        assertEquals(11000f, irpf.getTotalSalario(), 0);
    }

}

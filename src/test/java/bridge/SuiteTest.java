package bridge;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest {

	@Test
	public void deveRetornarValorDeSuiteComPacoteGold() {
        Pacote gold = new PacoteGold();
        Suite suite = new Suite(300.00f);
        suite.setPacote(gold);
        assertEquals(300.00f, suite.calcularValor(), 100.00f);
    }
	
	@Test
	public void deveRetornarValorDeSuiteComPacotePlatinum() {
        Pacote platinum = new PacotePlatinum();
        Suite suite = new Suite(300.00f);
        suite.setPacote(platinum);
        assertEquals(300.00f, suite.calcularValor(), 150.00f);
    }

}

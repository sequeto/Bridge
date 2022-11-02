package bridge;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuartoComumTest {

	@Test
	public void deveRetornarValorDeQuartoComPacoteGold() {
        Pacote gold = new PacoteGold();
        QuartoComum quarto = new QuartoComum(200.00f);
        quarto.setPacote(gold);
        assertEquals(200.00f, quarto.calcularValor(), 100.00f);
    }
	
	@Test
	public void deveRetornarValorDeQuartoComPacotePlatinum() {
        Pacote platinum = new PacotePlatinum();
        QuartoComum quarto = new QuartoComum(200.00f);
        quarto.setPacote(platinum);
        assertEquals(200.00f, quarto.calcularValor(), 150.00f);
    }

}

package bridge;

public class QuartoComum extends Acomodacao{
	public QuartoComum(float valorBase) {
        super(valorBase);
    }
	
	public float calcularValor() {
        return this.valorBase + this.pacote.valorDoPacote();
    }
}

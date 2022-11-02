package bridge;

public class Suite extends Acomodacao{
	public Suite(float valorBase) {
        super(valorBase);
    }
	
	public float calcularValor() {
        return this.valorBase + this.pacote.valorDoPacote();
    }
}

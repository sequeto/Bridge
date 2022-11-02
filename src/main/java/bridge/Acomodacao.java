package bridge;

public abstract class Acomodacao {
	protected Pacote pacote;

    protected float valorBase;

    public Acomodacao(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();
}

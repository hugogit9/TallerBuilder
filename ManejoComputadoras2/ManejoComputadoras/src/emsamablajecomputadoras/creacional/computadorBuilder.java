package emsamablajecomputadoras.creacional;

public abstract class computadorBuilder {
	protected Computador c;
	
	public Computador getComputador() {
		return c;
	}
	
	
	public abstract void DefinirComputador();
	public abstract void ConstruirMainboard();
	public abstract void ConstruirSO();
	public abstract void añadirExtras();
}

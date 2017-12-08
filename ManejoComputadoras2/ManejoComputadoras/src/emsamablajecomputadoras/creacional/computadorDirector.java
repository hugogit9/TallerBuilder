package emsamablajecomputadoras.creacional;

public class computadorDirector {
	private computadorBuilder builder;
	
	public computadorDirector(computadorBuilder builder) {
		this.builder = builder;
	}
	
	public void ensamblarComputador() {
		builder.DefinirComputador();
		builder.ConstruirMainboard();
		builder.ConstruirSO();
		builder.añadirExtras();
		
		/*if((builder.getComputador().getOs().getVersion()== "Pro") &&(builder.getComputador().isCoolerExterno()== true))
				throw new Exception ("Error en el ensamblado: una  Pro no tiene cooler externo")*/
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
	
}

package emsamablajecomputadoras.creacional;

public class AsusROGEBuilder extends computadorBuilder{

	@Override
	public void DefinirComputador() {
		// TODO Auto-generated method stub
		c = new Computador();
		c.setRam(32);
		c.setAlmacenamiento(1000);
		c.setMarca("Asus");
		c.setModelo("ROGE");
	}

	@Override
	public void ConstruirMainboard() {
		// TODO Auto-generated method stub
		c.setPlaca(new Mainboard("Strix x99","001"));
		
		//c.getPlaca().setModelo("Strix x99");
		//c.getPlaca().setNumeracion("001");
		
		
	}

	@Override
	public void ConstruirSO() {
		// TODO Auto-generated method stub
		c.setOs(new SistemaOperativo("Windows 10",64, "Pro"));
	}

	@Override
	public void añadirExtras() {
		// TODO Auto-generated method stub
		c.setCoolerExterno(false);
		
	}

}

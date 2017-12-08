package emsamablajecomputadoras.creacional;

public class AsusZenbookBuilder extends computadorBuilder{

	@Override
	public void DefinirComputador() {
		// TODO Auto-generated method stub
		c = new Computador();
		c.setRam(16);
		c.setAlmacenamiento(500);
		c.setMarca("Asus");
		c.setModelo("zenbook");
	}

	@Override
	public void ConstruirMainboard() {
		// TODO Auto-generated method stub
		c.setPlaca(new Mainboard("Prime Z370","002"));
	}

	@Override
	public void ConstruirSO() {
		// TODO Auto-generated method stub
		c.setOs(new SistemaOperativo("Windows 10",64, "Home"));
	}

	@Override
	public void añadirExtras() {
		// TODO Auto-generated method stub
		c.setCoolerExterno(true);
	}

}

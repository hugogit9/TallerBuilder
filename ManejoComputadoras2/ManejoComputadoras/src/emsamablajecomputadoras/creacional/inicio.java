package emsamablajecomputadoras.creacional;

public class inicio {
	public static void mostrarInfo() {
		computadorDirector directorROGE = new computadorDirector(new AsusROGEBuilder());
		directorROGE.ensamblarComputador();
		Computador ROGE =directorROGE.getComputador();
		
		computadorDirector directorZENBOOK = new computadorDirector(new AsusZenbookBuilder());
		directorZENBOOK.ensamblarComputador();
		Computador ZENBOOK = directorZENBOOK.getComputador();
		
		
		//Console.Writeline("primer computador: "+ Environment.NewLine);
		
		System.out.println("       ---primer computador--- \n" +ROGE.especificacionesTecnicas());
		System.out.println("       ---segundo computador--- \n" + ZENBOOK.especificacionesTecnicas());
	}
}

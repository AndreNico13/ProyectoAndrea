import java.util.Scanner;

class Camion extends Vehiculo{
	private int ejes;
	private int llantas;
	
	public Camion(){
		ejes = 0;
		llantas = 0;
	}
	
	@Override
	public void lee(Scanner arch){
		super.lee(arch);
		ejes = arch.nextInt();
		llantas = arch.nextInt();
	}
	@Override
	public void imprime(){
		System.out.println("");
		System.out.println("Camion:");
		super.imprime();
		System.out.println(ejes+" "+llantas);		
	}
	
}
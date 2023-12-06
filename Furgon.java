import java.util.Scanner;

class Furgon extends Vehiculo{
	private int filas;
	private int puertas;
	
	public Furgon(){
		filas = 0;
		puertas = 0;
	}
	@Override
	public void lee(Scanner arch){
		super.lee(arch);
		filas = arch.nextInt();
		puertas = arch.nextInt();
	}
	@Override
	public void imprime(){
		System.out.println("");
		System.out.println("Furgon:");
		super.imprime();
		System.out.println(filas+" "+puertas);		
	}
	
	
} 
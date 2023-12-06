import java.util.Scanner;

class Vehiculo{
	private int cliente;
	private String placa;
	private double maxcarga;
	private double actcarga;
	
	public Vehiculo(){
		cliente = 0;
		maxcarga = 0;
		actcarga = 0;
	}
	public void lee(Scanner arch){
		cliente = arch.nextInt();
		placa = arch.next();
		maxcarga = arch.nextDouble();
	}
	public void imprime(){
		System.out.print(cliente+" "+placa+" "+maxcarga+" ");		
	}
}
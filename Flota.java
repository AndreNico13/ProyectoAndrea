import java.util.ArrayList;
import java.util.Scanner;

class Flota{
	private ArrayList <Vehiculo> aflota;
	
	public void cargaflota(){
		aflota = new ArrayList<>();
		Scanner arch = new Scanner(System.in);
		
		while(arch.hasNext()){
			String cad;
			Vehiculo vaux;
			
			cad = arch.next();
			if(cad.charAt(0)=='F')
				vaux = new Furgon();
			else
				vaux = new Camion();
			vaux.lee(arch);
			aflota.add(vaux);
		}
	}
	
	public void muestracarga(){
		for(Vehiculo veh: aflota)
			veh.imprime();	
	}
		
}
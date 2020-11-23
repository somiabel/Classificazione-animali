package animali;

import java.util.Scanner;

public class Tartaruga implements Rettile, AgeCluster {
	private String verso;
	private int eta;

	public Tartaruga() {
		this.verso="Click";
		this.eta=eta;

	}

	public String getVerso() {
		return this.verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void correre(){
		System.out.println("Anf! Anf! Vado a 0.2 km/h");
	}
	public boolean getSanguefreddo(){
		return true;
	}
	public void getCibo() {
		for (int i = 0; i < 3; i++)
			System.out.println(getVerso());
		if ((this.eta > 0) && (this.eta <= PUPPY))
			System.out.println("Ho fame!! Dammi cibo per cuccioli di tartaruga!");
		if ((this.eta > PUPPY) && (this.eta <= ADULT))
			System.out.println("Ho fame!! Dammi cibo per le tartarughe adulte!");
		else if ((this.eta > ADULT) && (this.eta <= SENIOR))
			System.out.println("Ho fame!! Dammi cibo per le tartarughe anziane!");
		else if ((this.eta > SENIOR) && (this.eta <= EXTRASENIOR))
			System.out.println("Ho fame!! Dammi cibo per le tartarughe extra anziane!");
		else

			System.out.println("Ho fame! Ma non so cosa mangiare!");
		System.out.println(getVerso());
	}

	@Override
	public void getCorrere() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getSangueFreddo() {
		// TODO Auto-generated method stub
		return false;
	}

}

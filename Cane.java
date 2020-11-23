package animali;


public class Cane implements Mammifer, AgeCluster {
	private String verso;
	private int eta;

	public Cane() {
		this.setVerso("Bau");
		this.setEta(0);

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

	public void correre() {
		System.out.println("Anf! Anf! Vado a 40 km/h");
	}

	public boolean getSangueCaldo() {
		return true;
	}

	public void getCibo() {
		for (int i = 0; i < 3; i++)
			System.out.println(getVerso());
		if ((this.eta > 0) && (this.eta <= PUPPY))
			System.out.println("Ho fame!! Dammi cibo per cuccioli di cane!");
		if ((this.eta > PUPPY) && (this.eta <= ADULT))
			System.out.println("Ho fame!! Dammi cibo per cani adulti!");
		else if ((this.eta > ADULT) && (this.eta <= SENIOR))
			System.out.println("Ho fame!! Dammi cibo per cani anziani!");
		else if ((this.eta > SENIOR) && (this.eta <= EXTRASENIOR))
			System.out.println("Ho fame!! Dammi cibo per cani extra anziani!");
		else

			System.out.println("Ho fame! Ma non so cosa mangiare!");
		System.out.println(getVerso());
	}

	@Override
	public void getCorrere() {
		// TODO Auto-generated method stub
		
	}
	
}

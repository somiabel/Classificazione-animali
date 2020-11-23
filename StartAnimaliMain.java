package animali;


public class StartAnimaliMain {

	public static void main(String[] args) {
		System.out.println("***Animali generati da interfacce ***");
		Cane lillo =new Cane();
		lillo.setEta(3);
		System.out.println(lillo.getVerso());
		lillo.correre();
		lillo.getCibo();;
		
		System.out.println("----------------------------");
		
		Gatto Ben =new Gatto();
		Ben.setEta(1);
		System.out.println(Ben.getVerso());
		Ben.correre();
		Ben.getCibo();
		
		System.out.println("----------------------------");
		
		Tartaruga kami =new Tartaruga();
		kami.setEta(3);
		System.out.println(kami.getVerso());
		kami.correre();
		kami.getCibo();;
		
		
		
		

	}
	/*
	public void getMenu() {
		System.out.println("\n\n********** Scegli un animale********");
		System.out.println(" ==> 1. Cane");
		System.out.println(" ==> 2. Gatto");
		System.out.println(" ==> 3. Tartaruga");
		System.out.println(" ==> 4. Esci");
	}
	public void getMenu2() {
		
		System.out.println(" ==> 1. Fallo fare il verso");
		System.out.println(" ==> 2. Fallo correre");
		System.out.println(" ==> 3. vedi se ha fame");
		System.out.println(" ==> 4. ha il sangue caldo o freddo");
		System.out.println(" ==> 0. Scegli un'altro animale");
	}
	public void setChoice(){
		this.choice= input.nextInt();
	}
	public int getChoice(){
		return this.choice;
	}
	public void stampaChoice(){
		switch(this.choice){
		case 0: 
			System.out.println("Arrivederci!!");
			break;
		case 1: 
			System.out.println("Hai scelto il cane");
			break;
		case 2: 
			System.out.println("Hai scelto il gatto");
			break;
		case 3: 
			System.out.println("Hai scelto la tartaruga");
			break;
			default: 
				System.out.println("Riprova di nuovo!!");
				
			
	}
}*/
}

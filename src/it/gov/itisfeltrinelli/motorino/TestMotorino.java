package it.gov.itisfeltrinelli.motorino;

public class TestMotorino {

	public static void main(String[] args) {
		Motorino m=new Motorino("rosso",0,"ciao","ef543kk",150);
		m.inserisciAntifurto();
		m.accelera(50);
		System.out.println("Velocità del motorino: "+m.getVelocita());
		m.disinserisciAntifurto();
		m.accelera(70);
		System.out.println("Velocità del motorino: "+m.getVelocita());
        m.frena(45);
        System.out.println("Velocità del motorino: "+m.getVelocita());
        m.frena(45);
        System.out.println("Velocità del motorino: "+m.getVelocita());
        m.accelera(250);
        System.out.println("Velocità del motorino: "+m.getVelocita());
        m.inserisciAntifurto();
        System.out.println("Velocità del motorino: "+m.getVelocita());
        System.out.println("Stato antifurto: "+m.getStatoantifurto());
        m.frena(200);
        m.inserisciAntifurto();
        System.out.println("Velocità del motorino: "+m.getVelocita());
        System.out.println("Stato antifurto: "+m.getStatoantifurto());

	}

}

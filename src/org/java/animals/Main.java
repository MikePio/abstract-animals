// Parte 1
// Creata una classe astratta, dichiarati i metodi astratti, personalizzati i metodi astratti per ogni classe e richiamati i metodi astratti nel main

// Parte 2
// Creata un'interfaccia, dichiarati i metodi dell'interfaccia, personalizzati i metodi dell'interfaccia per ogni classe e richiamati i metodi dell'interfaccia nel main

package org.java.animals;

public class Main {
	public static void main(String[] args) {
		// System.out.println("Hello world");

		Aquila aquila1 = new Aquila("Oreste", 2);
		//* richiamati metodi astratti
		// aquila1.dorme();
		// aquila1.verso();
		// aquila1.mangia();
		//* richiamato metodo dell'interfaccia
		// aquila1.vola();

		Cane cane1 = new Cane("Billy", 4);
		//* richiamati metodi astratti
		// cane1.dorme();
		// cane1.verso();
		// cane1.mangia();

		Delfino delfino1 = new Delfino("Curioso", 0);
		//* richiamati metodi astratti
		// delfino1.dorme();
		// delfino1.verso();
		// delfino1.mangia();
		//* richiamato metodo dell'interfaccia
		// delfino1.nuota();

		Passerotto passerotto1 = new Passerotto("Wisky", 2);
		//* richiamati metodi astratti
		// passerotto1.dorme();
		// passerotto1.verso();
		// passerotto1.mangia();
		//* richiamato metodo dell'interfaccia
		// passerotto1.vola();

		System.out.println("\n--------------------\n");
		System.out.println(aquila1);
		aquila1.vola();
		System.out.println("\n--------------------\n");
		System.out.println(cane1);
		System.out.println("\n--------------------\n");
		System.out.println(delfino1);
		delfino1.nuota();
		System.out.println("\n--------------------\n");
		System.out.println(passerotto1);
		passerotto1.vola();
		System.out.println("\n--------------------\n");


	}
}

// Parte 1
// Creata una classe astratta, dichiarati i metodi astratti, personalizzati i metodi astratti per ogni classe e richiamati i metodi astratti nelle classi
package org.java.animals;

public class Main {
	public static void main(String[] args) {
		// System.out.println("Hello world");

		Aquila aquila1 = new Aquila("Oreste", 2);
		//* richiamati metodi astratti
		// aquila1.dorme();
		// aquila1.verso();
		// aquila1.mangia();

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

		Passerotto passerotto1 = new Passerotto("Wisky", 2);
		//* richiamati metodi astratti
		// passerotto1.dorme();
		// passerotto1.verso();
		// passerotto1.mangia();

		System.out.println("\n--------------------\n");
		System.out.println(aquila1);
		System.out.println("\n--------------------\n");
		System.out.println(cane1);
		System.out.println("\n--------------------\n");
		System.out.println(delfino1);
		System.out.println("\n--------------------\n");
		System.out.println(passerotto1);
		System.out.println("\n--------------------\n");


	}
}

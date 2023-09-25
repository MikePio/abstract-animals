// Parte 1
// Creata una classe astratta, dichiarati i metodi astratti, personalizzati i metodi astratti per ogni classe e richiamati i metodi astratti nel main

// Parte 2
// Creata un'interfaccia, dichiarati i metodi dell'interfaccia, personalizzati i metodi dell'interfaccia per ogni classe e richiamati i metodi dell'interfaccia nel main

package org.java.animals;

import org.java.animals.interfaces.INuotante;
import org.java.animals.interfaces.IVolante;

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

		// senza ciclo for
		// System.out.println("\n--------------------\n");
		// System.out.println(aquila1);
		// aquila1.vola();
		// System.out.println("\n--------------------\n");
		// System.out.println(cane1);
		// System.out.println("\n--------------------\n");
		// System.out.println(delfino1);
		// delfino1.nuota();
		// System.out.println("\n--------------------\n");
		// System.out.println(passerotto1);
		// passerotto1.vola();
		// System.out.println("\n--------------------\n");

		// con ciclo for ed array
		Animale[] animali = new Animale[4];
		animali[0] = aquila1;
		animali[1] = cane1;
		animali[2] = delfino1;
		animali[3] = passerotto1;

		for(int i = 0; i < animali.length; i++){
		
			Animale animale = animali[i];

			System.out.println("\n--------------------\n");
			System.out.println(animale.getClass().getSimpleName() + "\n");
			animale.dorme();
			animale.verso();
			animale.mangia();
			
			//se è presente l'interfaccia INuotante nella classe stampa questo
			if (animale instanceof INuotante){
				INuotante aNuotante = (INuotante) animale;
				
				faiNuotare(aNuotante);
			}
			
			//se è presente l'interfaccia IVolante nella classe stampa questo
			if (animale instanceof IVolante){
				IVolante aVolante = (IVolante) animale;

				faiVolare(aVolante);
			}	
		
		}
		
	}

	static void faiVolare(IVolante animaleVolante){
		animaleVolante.vola();
	}

	static void faiNuotare(INuotante animaleNuotante){
		animaleNuotante.nuota();
	}
}

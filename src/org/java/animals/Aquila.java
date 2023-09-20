package org.java.animals;

import org.java.animals.interfaces.IVolante;

public class Aquila extends Animale implements IVolante{

  public Aquila(String nome, int numZampe){
    super(nome, numZampe);

  }

  //* personalizzato metodo astratto
  @Override
  public void dorme(){
    System.out.println("L'aquila sta dormendo");
  }
  
  //* personalizzato metodo astratto
  @Override
  public void verso(){
    System.out.println("L'aquila sta urlando");
  }
  
  //* personalizzato metodo astratto
  @Override
  public void mangia(){
    System.out.println("L'aquila sta magiando");
  }

  //* personalizzato metodo dell'interfaccia
  @Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}

}

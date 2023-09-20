package org.java.animals;

public class Aquila extends Animale{

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

}

package org.java.animals;

public class Delfino extends Animale{

  public Delfino(String nome, int numZampe){
    super(nome, numZampe);
  }
  
  //* personalizzato metodo astratto
  @Override
  public void dorme(){
    System.out.println("Il delfino sta dormendo");
  }
  
  //* personalizzato metodo astratto
  @Override
  public void verso(){
    System.out.println("Il delfino sta fischiettando");
  }
  
  //* personalizzato metodo astratto
  @Override
  public void mangia(){
    System.out.println("Il delfino sta magiando");
  } 
}



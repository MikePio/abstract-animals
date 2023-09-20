package org.java.animals;

public class Passerotto extends Animale{

  public Passerotto(String nome, int numZampe){
    super(nome, numZampe);
  }
  
  //* personalizzato metodo astratto
  @Override
  public void dorme(){
    System.out.println("Il passerotto sta dormendo");
  }
  
  //* personalizzato metodo astratto
  @Override
  public void verso(){
    System.out.println("Il passerotto sta cinguettando");
  }
  
  //* personalizzato metodo astratto
  @Override
  public void mangia(){
    System.out.println("Il passerotto sta magiando");
  }

}

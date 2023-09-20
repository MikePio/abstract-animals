package org.java.animals;

public class Cane extends Animale{

  public Cane(String nome, int numZampe){
    super(nome, numZampe);
  } 

  //* personalizzato metodo astratto
  @Override
  public void dorme(){
    System.out.println("Il cane sta dormendo");
  }

  //* personalizzato metodo astratto
  @Override
  public void verso(){
    System.out.println("Il cane sta abbaiando");
  }

  //* personalizzato metodo astratto
  @Override
  public void mangia(){
    System.out.println("Il cane sta magiando");
  }

}

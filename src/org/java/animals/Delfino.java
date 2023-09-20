package org.java.animals;

import org.java.animals.interfaces.INuotante;

public class Delfino extends Animale implements INuotante {

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

    //* personalizzato metodo dell'interfaccia
    @Override
    public void nuota() {
      System.out.println("Sto nuotando!!!");
    }
}



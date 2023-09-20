package org.java.animals;

//* dichiarazione (super)classe astratta
public abstract class Animale {

  //* dichiarazione metodi astratti
  public abstract void dorme();
  public abstract void verso();
  public abstract void mangia();

  private String nome;
  private int numZampe;

  public Animale(String nome, int numZampe){
    setNome(nome);
    setNumZampe(numZampe);

  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getNumZampe() {
    return numZampe;
  }
  public void setNumZampe(int numZampe) {
    this.numZampe = numZampe;
  }

  @Override
  public String toString() {
    // return "Nome:" + nome + "\nNumero zampe:" + numZampe;
    // oppure
    return "Nome: " + getNome() + "\nNumero zampe: " + getNumZampe();
  }
  
}

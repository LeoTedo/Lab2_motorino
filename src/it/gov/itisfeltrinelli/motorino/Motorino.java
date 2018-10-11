package it.gov.itisfeltrinelli.motorino;

class Motorino {
  String colore; 
  float velocita;
  String tipo;
  boolean antifurto=false;
  
  public Motorino (String c, String t, float x) {
	  colore=c;
	  velocita=x;
	  tipo=t;
  }
  public float  getVelocita(){
	  return velocita;
  }
  public void accelera(float x){
	  if(antifurto==false) {
		  velocita+=x;
	  }
  }
  void inserisciAntifurto(){
	  antifurto=true;
  }
}

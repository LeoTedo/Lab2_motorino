package it.gov.itisfeltrinelli.motorino;

class Motorino {
  private String colore; 
  private float velocita;
  private String tipo;
  private boolean antifurto=false;
  private String targa;
  private float maxVel;
  
  
 
  public Motorino(String colore, float velocita, String tipo, String targa, float maxVel) {
	this.colore = colore;
	this.velocita = velocita;
	this.tipo = tipo;
	this.targa = targa;
	this.maxVel = maxVel;
}
  
public float  getVelocita(){
	  return velocita;
  }
  public void accelera(float x){
	  if(antifurto==false) {
		  velocita+=x;
		  if (velocita>maxVel) velocita=maxVel;  
	  }
  }
  void disinserisciAntifurto() {	  
		  antifurto=false;
  }
  void inserisciAntifurto() {
	  if (velocita==0) {
		  antifurto=true;
	  }	
  }
  public String getStatoantifurto() {
	  if (antifurto==true) {
		  return "Attivo";
	  }
	  else {
		  return "Disattivato";
	  }
  }
  public void frena(float x) {
	  velocita-=x;
	  if (velocita<0) velocita=0;
  }
}

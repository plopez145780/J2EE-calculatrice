package fr.plopez.beans;

public class Calcul {
	//Variables d'instance
	private double nombre1 = 0;
	private double nombre2 = 0;
	private String formule = "";
	private double resultat = 0;
	
	//Constructeur
	public Calcul(double nb1, double nb2, String formule){
		try{
			this.nombre1 = nb1;
			this.nombre2 = nb2;
			this.formule = formule;
			choixCalcul(this.formule);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	//Getter - Setter
	public double getNombre1() {
		return nombre1;
	}
	public void setNombre1(double nombre1) {
		this.nombre1 = nombre1;
	}
	
	public double getNombre2() {
		return nombre2;
	}
	public void setNombre2(double nombre2) {
		this.nombre2 = nombre2;
	}
	
	public double getResultat() {
		return resultat;
	}
	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	public String getFormule() {
		return formule;
	}
	public void setFormule(String formule) {
		this.formule = formule;
	}

	//Méthodes
	private void choixCalcul(String choix) throws Exception{
		switch (choix) {
		case "+":
			additionner();
			break;
		case "-":
			soustraire();
			break;
		case "*":
			multiplier();
			break;
		case "/":
			diviser();
			break;
		default:
			throw new Exception();
		}
	}
	public void additionner(){
		resultat = nombre1 + nombre2;
	}
	
	public void soustraire(){
		resultat = nombre1 - nombre2;
	}
	
	public void multiplier(){
		resultat = nombre1 * nombre2;
	}
	
	public void diviser(){
		try{
			resultat = nombre1 / nombre2;
		}catch(java.lang.ArithmeticException e){
			e.printStackTrace();
		}	
	}
}

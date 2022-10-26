package personnages;

public class Humain {
	private String nom;
	private String boissonprefere;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boissonprefere = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return this.nom;
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public void parler(String texte) {
		System.out.println( "(" + nom + ")" +"- "+texte);
	}
	
	public void direBonjour() {
		String texte = "Bonjour je m'appelle " + this.nom + " et j'aime boire du " + this.boissonprefere;
		parler(texte);
	}
	
	public void boire() {
		String texte = "Mmmm, un bon verre de " + boissonprefere + " ! GLOUPS !";
		parler(texte);
	}
	
	public void acheter(String bien, int prix) {
		String texte = "";
		if (argent >= prix) {
			texte += "J'ai " + this.argent + " sous en poche. Je vais pouvir m'offrir une boisson à " + prix + " sous";
			perdreArgent(prix);
		}
		else {
			texte += "Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir un "
			+ bien + " à " + prix + " sous";
		}
		parler(texte);
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	public void perdreArgent(int gain) {
		this.argent -= gain;
	}
}


public class Equipe {
	
//ATTRIBUT
	private int nbJoueurs=0;
	private int nbRemplacants=0;
	private static int nbEquipe;

	
	
//CONSTRUCTEUR
	public Equipe(int nbJoueurs) {
		// TODO Auto-generated constructor stub
		this.nbJoueurs = nbJoueurs;
		nbEquipe++;
	}
	public Equipe(int nbJoueurs, int nbRemplacants){
		this.nbJoueurs = nbJoueurs;
		this.nbRemplacants = nbRemplacants;
		nbEquipe++;
	}

//METHODE
	
	
//GETTERS-SETTERS
	public int getNbJoueurs() {
		return nbJoueurs;
	}
	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	public int getNbRemplacants() {
		return nbRemplacants;
	}
	public void setNbRemplacants(int nbRemplacants) {
		this.nbRemplacants = nbRemplacants;
	}

}

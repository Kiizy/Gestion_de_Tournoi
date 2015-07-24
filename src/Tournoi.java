import javax.swing.JList;


public class Tournoi {

	private JList<Equipe> equipes = new JList<Equipe>();
	private Equipe[] tabequipe;

	public Tournoi(int nbEquipes, int nbJoueurs, int nbRemplacants) {
		// TODO Auto-generated constructor stub
		
		//creation des equipes
		tabequipe = new Equipe[nbEquipes];
		for (int i = 0 ; i < nbEquipes ; i++ ) {
			Equipe equ= new Equipe(nbJoueurs, nbRemplacants);
			tabequipe[i]= equ;
			//System.out.println(i + " " + equ.getNbJoueurs() + " " + equ.getNbRemplacants());
		}
		//definition des matches
		equipes = new JList(tabequipe);
		
		
		//equipes.addMouseListener(this);
		
	}

}

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FenetreMenu extends JFrame implements ActionListener{


	private JButton boutCommencer, boutAjout, boutTournois, boutEquipes;
	private JPanel panFen, panAccueil;
	private JLabel labAccueil;
	private JTextField nbEquipe, nbJoueurs, nbRemplacents;
	private ArrayList<Tournoi> tournois = new ArrayList<Tournoi>();
	
	public FenetreMenu()
	{
		this.setTitle("Gestion de Tournoi");
		this.setSize(900, 700);
		
		panFen = new JPanel();
		panFen.setBackground(Color.DARK_GRAY);
		
		panAccueil = new JPanel();
		panAccueil.setBackground(Color.lightGray);
		panAccueil.setPreferredSize(new Dimension(800, 600));
//		panAccueil.setLayout(new BoxLayout());
		
		labAccueil = new JLabel();
		labAccueil.setText("Bienvenue dans l'application de gestion de tournois Maison des Ligues.");
		labAccueil.setText("Vous trouverez ici les differentes rurbriques qui vous premettrons de visionner, modifier, ajouter ou supprimer des tournois");

		boutCommencer = new JButton("Commencer");
		boutCommencer.addActionListener(this);

		boutTournois  = new JButton("Tournois");
		boutTournois.addActionListener(this);
		
		boutAjout  = new JButton("Ajout");
		boutAjout.addActionListener(this);
		
		panFen.add(panAccueil);
		panAccueil.add(labAccueil);
		panAccueil.add(boutCommencer);
		
		
		this.getContentPane().add(panFen);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == boutCommencer){
			panAccueil.add(boutAjout);
			validate();
		}else if (e.getSource() == boutTournois){
			
		}else if (e.getSource() == boutAjout){
			//demander a lutilisateur le nombre dequipe, de joueurs et de remplacant
			Tournoi tour = new Tournoi(7/*int nbEquipe*/, 10/*int nbJoueurs*/, 3/*int nbRemplacant*/);
			tournois.add(tour);
			System.out.println(tournois);
		}
	}
			
		
}



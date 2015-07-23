import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FenetreMenu extends JFrame implements ActionListener{


	private JButton boutCommencer, boutAjout, boutTournois, boutEquipes;
	private JPanel panFen, panAccueil;
	private JLabel labAccueil;
	private JTextField nbEquipe, nbJoueurs, nbRemplacents;
	
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

		boutEquipes  = new JButton("Equipes");
		
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
		panAccueil.add(boutEquipes);
		}
		
	}

}

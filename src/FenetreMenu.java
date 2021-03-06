import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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


	private JButton boutCommencer, boutAjout, boutTournois, boutEquipes, boutMenu;
	private JPanel panFen, panAccueil, panMenu, panAffichageTournois;
	private JLabel labAccueilT, labAccueil,labMenuT, labMenu, labFonctio, labAffichageTournois;
	private JTextField nbEquipe, nbJoueurs, nbRemplacents;
	private String text;
	//private ArrayList<Tournoi> tournois = new ArrayList<Tournoi>();
	
	public FenetreMenu()
	{
		this.setTitle("Gestion de Tournoi");
		this.setSize(1100, 700);
		
		//PRINCIPAL PANEL, RESTE LE MEME TOUT LE TEMPS
		
		panFen = new JPanel();
		panFen.setBackground(Color.RED);
		
		
		//PANEL ACCUEIL
		panAccueil = new JPanel();
		panAccueil.setBackground(Color.WHITE);
		panAccueil.setPreferredSize(new Dimension(900, 600));
//		panAccueil.setLayout(new BoxLayout());
		
		//PANEL MENU
		panMenu = new JPanel();
		panMenu.setBackground(Color.white);
		panMenu.setPreferredSize(new Dimension(900, 600));
		
		//PANEL AFFICHAGE
		panAffichageTournois = new JPanel();
		panAffichageTournois.setBackground(Color.WHITE);
		panAffichageTournois.setPreferredSize(new Dimension(900, 600));

		//TEST DE FONT
		Font policeHuge = new Font("Fipps",Font.ITALIC,20);
		
		Font police = new Font("Built titling rg",Font.BOLD,30);
		
		/**On va utiliser le langage html pour ce qui est des text car ce sera beaucoup simple a gerer*/
		
		text = "Bienvenue dans l application de gestion de tournois Maison des Ligues.";
		
		labAccueilT = new JLabel();
		labAccueilT.setFont(police);
		labAccueilT.setText(text);
		
		labAccueil = new JLabel();
	//	labAccueil.setFont(police);
		labAccueil.setText("<html><br><br><br><p>Vous trouverez ici les differentes rurbriques qui vous premettrons de visionner, modifier, ajouter ou supprimer des tournois</p>"
				+ "<br><br><center><p>Cliquez sur le bouton pour commencer.</p></center><br><br></html>");

		
		labMenuT = new JLabel();
		labMenuT.setFont(police);
		labMenuT.setText("Veuilliez � present choisir l'action � �x�cuter");
		
		labMenu = new JLabel();
//		labMenu.setFont();
		labMenu.setText("<html><br><br><h2>Vous pouvez consulter les tournois "
				+ "en cours ou bien en creer en cliquant sur les boutons ci-dessous :</h2><br /><br /><br /></html>");
		
	/*	labFonctio = new JLabel();
		labFonctio.setText("<html><p>Faire un paragraphe explicatif</p></html>");*/
		
		labAffichageTournois = new JLabel();
		labAffichageTournois.setFont(police);
		labAffichageTournois.setText("Le bouton qui suit, ne fonctionne pas... :,( ==> ");
		
		//BOUTONS//

		boutCommencer = new JButton("Commencer");
		boutCommencer.setFont(policeHuge);
		boutCommencer.addActionListener(this);

		boutTournois  = new JButton("Tournois");
		boutTournois.setFont(policeHuge);
		boutTournois.addActionListener(this);
		
		boutAjout  = new JButton("Ajout");
		boutAjout.setFont(policeHuge);
		boutAjout.addActionListener(this);
		
		boutMenu = new JButton("Menu");
		boutMenu.setFont(policeHuge);
		boutMenu.addActionListener(this);
		
		//AJOUT DES COMPOSANTS//
		
		//1er affichage
		panFen.add(panAccueil);
		panAccueil.add(labAccueilT);
		panAccueil.add(labAccueil);
		panAccueil.add(boutCommencer);
	//	panAccueil.add(labFonctio);
		
		//2nd affichage
		panMenu.add(labMenuT);
		panMenu.add(labMenu);
		panMenu.add(boutAjout);
		panMenu.add(boutTournois);
		
		//affichage tournois
		panAffichageTournois.add(labAffichageTournois);
		panAffichageTournois.add(boutMenu);
		
		
		this.getContentPane().add(panFen);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	


	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == boutCommencer || e.getSource() == boutMenu){
			
			panFen.removeAll();
			panFen.add(panMenu);
			validate();
		}
		
		if (e.getSource() == boutAjout){
			
			
			FenetreTournoi fenTournoi = new FenetreTournoi();
			
		}
		
		if (e.getSource() == boutTournois){
	
			panFen.removeAll();
			panFen.add(panAffichageTournois);
			validate();
			

			}
		

	}
			
		
}



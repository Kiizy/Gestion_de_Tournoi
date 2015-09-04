import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;


public class FenetreTournoi extends JFrame implements ActionListener {

	private JPanel pan;
	private JLabel labAccueil;
	private JTextField txtNbEquipe, txtNbJoueurs, txtNbRemplacant;
	private JButton boutQuit, boutOk;	
	
	public FenetreTournoi()
	{
		this.setTitle("Ajouter un Tournoi");
		this.setSize(900, 500);

		pan = new JPanel();
		pan.setBackground(Color.LIGHT_GRAY);
		
		//FONT
		Font policeHuge = new Font("Fipps",Font.ITALIC, 20);
		Font police = new Font("Built titling rg",Font.BOLD,30);
		
		labAccueil = new JLabel();
		labAccueil.setFont(police);
		labAccueil.setText("Bienvenu sur le panel d'ajout d'un tournoi");
		
		boutQuit = new JButton("Revenir au menu");
		boutQuit.addActionListener(this);
		boutQuit.setFont(policeHuge);
		
		boutOk = new JButton("Valider");
		boutOk.addActionListener(this);
		boutOk.setFont(policeHuge);
		
		
		
		//Formulaire d'ajout
		txtNbEquipe = new JTextField("nbequipe/ERASE");
		txtNbEquipe.setPreferredSize(new Dimension(200, 30));
		
		txtNbJoueurs = new JTextField("nbjoueurs/ERASE");
		txtNbJoueurs.setPreferredSize(new Dimension(200, 30));
		
		txtNbRemplacant = new JTextField("nbremplaçant/ERASE");
		txtNbRemplacant.setPreferredSize(new Dimension(200, 30));
		
		
		pan.add(labAccueil);
		pan.add(boutQuit);
		pan.add(txtNbEquipe);
		pan.add(txtNbJoueurs);
		pan.add(txtNbRemplacant);
		pan.add(boutOk);
		
		this.getContentPane().add(pan);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
	
	
	public void actionPerformed(ActionEvent f) {
		if ( f.getSource() == boutQuit){
			
			this.setVisible(false);
			
		}
		
		if ( f.getSource() == boutOk){
			
			JOptionPane.showMessageDialog(null, "Ajout effectué !");
			
			this.setVisible(false);
		}
	}
	//	demander a l'utilisateur le nombre d'equipe, de joueurs et de remplacant
	//	Tournoi tour = new Tournoi(7/*int nbEquipe*/, 10/*int nbJoueurs*/, 3/*int nbRemplacant*/);
	//	tournois.add(tour);
	//	System.out.println(tournois);
		
}

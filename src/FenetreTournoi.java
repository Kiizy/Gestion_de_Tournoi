import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;


public class FenetreTournoi extends JFrame implements ActionListener {

	private JPanel pan;
	private JLabel lab;
	private JTextField text;
	private JButton boutQuit;	
	
	public FenetreTournoi()
	{
		this.setTitle("Ajouter un Tournoi");
		this.setSize(900, 500);

		pan = new JPanel();
		pan.setBackground(Color.darkGray);
		
		boutQuit = new JButton("Quit");
		boutQuit.addActionListener(this);

		
		pan.add(boutQuit, BorderLayout.SOUTH);
		
		
		this.getContentPane().add(pan);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
	
	
	public void actionPerformed(ActionEvent f) {
		if ( f.getSource() == boutQuit){
			
			this.setVisible(false);
			
		}
		
	}

}

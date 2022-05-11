package tela;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import classes.Operacoes;

public class Tela extends JFrame implements ActionListener {

	JButton botao1;

	public Tela() {

		/*
		 * //label para imagem ou texto JLabel label = new JLabel("TEXTO TESTE");
		 * label.setForeground(new Color(142, 152, 102)); // font color
		 * label.setFont(new Font("MV Boli", Font.PLAIN, 12));
		 * label.setBackground(Color.black); label.setOpaque(true); //displays the
		 * bckgrnd color label.setVerticalAlignment(JLabel.TOP); // coloca texto em cima
		 * label.setHorizontalAlignment(JLabel.CENTER); // coloca texto no centro
		 * 
		 * 
		 * 
		 * 
		 * //Criar JPanel
		 * 
		 * JPanel redPanel = new JPanel(); redPanel.setBackground(Color.red);
		 * redPanel.setBounds(0, 0, 100, 100); this.add(redPanel); //adciona ao frame
		 * 
		 * 
		 * JPanel bluePanel = new JPanel(); bluePanel.setBackground(Color.blue);
		 * bluePanel.setBounds(150, 0, 100, 100); this.add(bluePanel); //adciona ao
		 * frame
		 * 
		 * 
		 */

		// Criar Frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Calculadora");
		this.setSize(420, 550);
		this.setLayout(null);
		this.setVisible(true);

		// Criar um button

		botao1 = new JButton();
		botao1.setText("1");
		botao1.setBounds(0, 320, 80, 50);
		this.add(botao1);
		botao1.addActionListener(this);

		// Configurar ícone
		ImageIcon icon = new ImageIcon("src\\imagens\\imgicon.png");
		this.setIconImage(icon.getImage());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Operacoes op = new Operacoes();

	}

}

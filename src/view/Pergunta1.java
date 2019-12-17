package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

import controller.Controlador;
import javax.swing.SwingConstants;

public class Pergunta1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta1 frame = new Pergunta1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public Pergunta1() {
		Controlador controlador = new Controlador();
		
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(getBackground().decode("#fff200"));
		
		JLabel Template1 = new JLabel("");
		Template1.setIcon(new ImageIcon(Pergunta1.class.getResource("/imagens/TOMELEPOG.png")));
		Template1.setBounds(24, 85, 472, 90);
		contentPane.add(Template1);
		//Label usada pra definir uma imagem de fundo POG
		JLabel TemplateCima = new JLabel("");
		TemplateCima.setIcon(new ImageIcon(Pergunta1.class.getResource("/imagens/Template parte de cima.png")));
		TemplateCima.setBounds(0, 0, 538, 26);
		contentPane.add(TemplateCima);
		
		//Cria a barra de progresso relativa a vida social, define que será pintada, o valor inicial e a cor.
		JProgressBar VidaSocial = new JProgressBar();
		VidaSocial.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		VidaSocial.setBounds(0, 25, 85, 31);
		VidaSocial.setStringPainted(true);
		VidaSocial.setValue(50);
		VidaSocial.setForeground(Color.green);
		
		contentPane.add(VidaSocial);
		//Cria a barra de progresso relativa a skill de programação, define que será pintada, o valor inicial e a cor.
		JProgressBar SkillProgramador = new JProgressBar();
		SkillProgramador.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		SkillProgramador.setBounds(130, 25, 85, 31);
		SkillProgramador.setStringPainted(true);
		SkillProgramador.setValue(25);
		SkillProgramador.setForeground(Color.green);
		contentPane.add(SkillProgramador);
		//Cria a barra de progresso relativa ao dinheiro, define que será pintada, o valor inicial e a cor.
		JProgressBar Dinheiro = new JProgressBar();
		Dinheiro.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		Dinheiro.setBounds(276, 25, 85, 31);
		Dinheiro.setStringPainted(true);
		Dinheiro.setValue(50);
		Dinheiro.setForeground(Color.GREEN);
		contentPane.add(Dinheiro);
		//Cria a barra de progresso relativa a sanidade mental, define que será pintada, o valor inicial e a cor.
		JProgressBar SanidadeMental = new JProgressBar();
		SanidadeMental.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		SanidadeMental.setBounds(411, 25, 85, 31);
		SanidadeMental.setStringPainted(true);
		SanidadeMental.setValue(50);
		SanidadeMental.setForeground(Color.GREEN);
		contentPane.add(SanidadeMental);
		
		
		JButton Resposta1 = new JButton();
		Resposta1.setIcon(new ImageIcon(Pergunta1.class.getResource("/imagens/p1r1.png")));
		Resposta1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		Resposta1.setBackground(getBackground().decode("#fff200"));
		Resposta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VidaSocial.setValue(VidaSocial.getValue()-10);
				SkillProgramador.setValue(SkillProgramador.getValue()+5);
				new Pergunta2(VidaSocial.getValue(), SkillProgramador.getValue(), Dinheiro.getValue(), SanidadeMental.getValue()).setVisible(true);
				Pergunta1.this.dispose();
			}
		});
		Resposta1.setBounds(24, 211, 211, 100);
		contentPane.add(Resposta1);
		
		JButton Resposta2 = new JButton();
		Resposta2.setIcon(new ImageIcon(Pergunta1.class.getResource("/imagens/p1r2.png")));
		Resposta2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		Resposta2.setBackground(getBackground().decode("#fff200"));
		Resposta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VidaSocial.setValue(VidaSocial.getValue()+10);
				SkillProgramador.setValue(SkillProgramador.getValue()-10);
				new Pergunta2(VidaSocial.getValue(), SkillProgramador.getValue(), Dinheiro.getValue(), SanidadeMental.getValue()).setVisible(true);
				Pergunta1.this.dispose();
			}
		});
		Resposta2.setBounds(296, 211, 211, 100);
		contentPane.add(Resposta2);
		
	}
}

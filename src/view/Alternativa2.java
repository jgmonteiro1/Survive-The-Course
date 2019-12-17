package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alternativa2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alternativa2 frame = new Alternativa2(0,0,0,0);
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
	public Alternativa2(int vidaSocial, int skill, int dinheiro, int sanidade) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(getBackground().decode("#fff200"));
		JProgressBar VidaSocial = new JProgressBar();
		VidaSocial.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		VidaSocial.setStringPainted(true);
		VidaSocial.setForeground(Color.green);
		VidaSocial.setValue(vidaSocial);
		VidaSocial.setBounds(0, 23, 85, 31);
		contentPane.add(VidaSocial);
		
		
		
		JLabel TemplateCima = new JLabel("");
		TemplateCima.setIcon(new ImageIcon(Pergunta2.class.getResource("/imagens/Template parte de cima.png")));
		TemplateCima.setBounds(0, 0, 517, 25);
		contentPane.add(TemplateCima);
		
		JProgressBar skillProgramador = new JProgressBar();
		skillProgramador.setBounds(131, 23, 85, 31);
		skillProgramador.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		skillProgramador.setStringPainted(true);
		skillProgramador.setForeground(Color.green);
		skillProgramador.setValue(skill);
		
		
		contentPane.add(skillProgramador);
		
		JProgressBar dinheiro2 = new JProgressBar();
		dinheiro2.setBounds(269, 23, 85, 31);
		dinheiro2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		dinheiro2.setStringPainted(true);
		dinheiro2.setForeground(Color.green);
		dinheiro2.setValue(dinheiro);
		contentPane.add(dinheiro2);
		
		JProgressBar sanidade2 = new JProgressBar();
		sanidade2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		sanidade2.setStringPainted(true);
		sanidade2.setForeground(Color.green);
		sanidade2.setValue(sanidade);
		sanidade2.setBounds(411, 23, 85, 31);
		contentPane.add(sanidade2);
		
		JLabel Layout = new JLabel("");
		Layout.setIcon(new ImageIcon(Alternativa2.class.getResource("/imagens/LayoutALternativa2.png")));
		Layout.setBounds(26, 77, 470, 79);
		contentPane.add(Layout);
		
		JButton Resposta1 = new JButton();
		Resposta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Colocar foto dos órfãos aqui
				new Maluco(VidaSocial.getValue(), skillProgramador.getValue(), dinheiro2.getValue(), sanidade2.getValue()).setVisible(true);
				Alternativa2.this.dispose();
			}
		});
		Resposta1.setIcon(new ImageIcon(Alternativa2.class.getResource("/imagens/pA2r1.png")));
		Resposta1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		Resposta1.setBackground(getBackground().decode("#fff200"));
		Resposta1.setBounds(24, 211, 211, 100);
		contentPane.add(Resposta1);
		
		JButton Resposta2 = new JButton();
		Resposta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Lembrar que voce eh brabo
				new Amassou(VidaSocial.getValue(), skillProgramador.getValue(), dinheiro2.getValue(), sanidade2.getValue()).setVisible(true);
				Alternativa2.this.dispose();
			}
		});
		Resposta2.setIcon(new ImageIcon(Alternativa2.class.getResource("/imagens/pA2r2.png")));
		Resposta2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		Resposta2.setBackground(getBackground().decode("#fff200"));
		Resposta2.setBounds(296, 211, 211, 100);
		contentPane.add(Resposta2);
	}

}

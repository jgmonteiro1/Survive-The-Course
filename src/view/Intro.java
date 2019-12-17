package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Controlador;

public class Intro extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Intro dialog = new Intro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Intro() {
		
		
		setBounds(100, 100, 554, 400);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				textField = new JTextField();
				buttonPane.add(textField);
				textField.setColumns(10);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Pega o que foi adicionado no input e armazena numa String.
						
						String nomeJogador = textField.getText();
						System.out.println(nomeJogador);
						if(nomeJogador.isEmpty()) {
							 JOptionPane.showMessageDialog(null, "Põe seu nome né lek", "User fazendo merda", JOptionPane.ERROR_MESSAGE);
							 System.out.println("Passou");
						}
						new Pergunta1().setVisible(true);
						Intro.this.dispose();	
						Controlador controlador = new Controlador(nomeJogador);
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Fecha a tela =]
						Intro.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Intro.class.getResource("/imagens/TextoDeApresenta\u00E7ao.png")));
			getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		}
	}

}

package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Amassou extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Amassou dialog = new Amassou(0,0,0,0);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Amassou(int vidaSocial, int skill, int dinheiro, int sanidade) {
		setBounds(100, 100, 955, 355);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JProgressBar VidaSocial = new JProgressBar();
		VidaSocial.setValue(vidaSocial);
		JProgressBar sanidade2 = new JProgressBar();
		sanidade2.setValue(sanidade);
		JProgressBar skillProgramador = new JProgressBar();
		skillProgramador.setValue(skill);
		JProgressBar dinheiro2 = new JProgressBar();
		dinheiro2.setValue(dinheiro);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(Amassou.class.getResource("/imagens/amassou.jpg")));
			contentPanel.add(label);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel lblVocAmassouTodos = new JLabel("VOC\u00CA AMASSOU TODOS ELES E FEZ COM QUE TODOS SE CALASSEM DIANTE DE UMA GAMEPLAY BRILHANTE");
				lblVocAmassouTodos.setFont(new Font("Times New Roman", Font.BOLD, 10));
				buttonPane.add(lblVocAmassouTodos);
			}
			{
				JButton okButton = new JButton("Respeita o Fizz");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					new Pergunta6(VidaSocial.getValue(), skillProgramador.getValue(), dinheiro2.getValue(), sanidade2.getValue()).setVisible(true);
					Amassou.this.dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}

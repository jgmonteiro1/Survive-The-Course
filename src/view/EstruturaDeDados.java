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

public class EstruturaDeDados extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EstruturaDeDados dialog = new EstruturaDeDados(0,0,0,0);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EstruturaDeDados(int vidaSocial, int skill, int dinheiro, int sanidade) {
		setBounds(100, 100, 800, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		

		JProgressBar VidaSocial = new JProgressBar();
		VidaSocial.setValue(vidaSocial);
		JProgressBar sanidade2 = new JProgressBar();
		sanidade2.setValue(sanidade);
		JProgressBar skillProgramador = new JProgressBar();
		skillProgramador.setValue(skill);
		JProgressBar dinheiro2 = new JProgressBar();
		dinheiro2.setValue(dinheiro);
		{
			JLabel LayoutEstrutura = new JLabel("");
			LayoutEstrutura.setIcon(new ImageIcon(EstruturaDeDados.class.getResource("/imagens/Eu vs estrutura de dados.png")));
			LayoutEstrutura.setBounds(0,0,800,400);
			contentPanel.add(LayoutEstrutura);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel lblCaraVocAcabou = new JLabel("Cara, voc\u00EA acabou de entrar numa sinuca de bico");
				lblCaraVocAcabou.setFont(new Font("Times New Roman", Font.BOLD, 18));
				buttonPane.add(lblCaraVocAcabou);
			}
			{
				JButton okButton = new JButton("Aceitar que deu ruim");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						new Pergunta4(VidaSocial.getValue(), skillProgramador.getValue(), dinheiro2.getValue(), sanidade2.getValue()).setVisible(true);
						EstruturaDeDados.this.dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Chorar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new Pergunta4(VidaSocial.getValue(), skillProgramador.getValue(), dinheiro2.getValue(), sanidade2.getValue()).setVisible(true);
						EstruturaDeDados.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}

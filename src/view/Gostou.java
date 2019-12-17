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

public class Gostou extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Gostou dialog = new Gostou(0,0,0,0);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Gostou(int vidaSocial, int skill, int dinheiro, int sanidade) {
		setBounds(100, 100, 627, 434);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(Gostou.class.getResource("/imagens/Paciencia.jpg")));
			contentPanel.add(label);
		}
		JProgressBar VidaSocial = new JProgressBar();
		VidaSocial.setValue(vidaSocial);
		JProgressBar sanidade2 = new JProgressBar();
		sanidade2.setValue(sanidade);
		JProgressBar skillProgramador = new JProgressBar();
		skillProgramador.setValue(skill);
		JProgressBar dinheiro2 = new JProgressBar();
		dinheiro2.setValue(dinheiro);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel lblVotaAquiDo = new JLabel("Vota aqui do lado o que achou do jogo ->");
				buttonPane.add(lblVotaAquiDo);
			}
			{
				JButton okButton = new JButton("Gostei e aprovei");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("sou corno");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}

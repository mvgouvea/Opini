package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.ImageIcon;

public class TelaSatisfacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void exibirTelaSatisfacao() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSatisfacao frame = new TelaSatisfacao();
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
	public TelaSatisfacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel
				.setIcon(new ImageIcon(
						"C:\\Users\\Isael\\workspace\\Laboratorioo\\Opini\\imagens\\TelaSatisfacao.jpg"));
		contentPane.add(lblNewLabel, "name_202647349049074");
	}

}

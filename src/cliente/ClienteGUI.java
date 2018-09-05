package cliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class ClienteGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtR;
	private JTextField txtR_1;
	private JTextField txtR_2;
	private JTextField txtCpf_1;
	private JPasswordField passwordField;
	private JTextField txtNome;
	private JPasswordField passwordField_1;
	private JTextField txtCpf;
	private JTextField txtEndereo;
	private JTextField txtDataDeNascimento;
	private JTextField txtTelefone;
	private JTextField txtValor;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteGUI window = new ClienteGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClienteGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPrincipal = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelPrincipal, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelPrincipal, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panelMenu = new JPanel();
		
		JButton btnCriarConta = new JButton("Criar conta");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSaldo = new JButton("Saldo");
		
		JButton btnDepsito = new JButton("Depósito");
		
		JButton btnSaque = new JButton("Saque");
		
		JButton btnTransferencia = new JButton("Transferencia");
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnPoupanca = new JButton("Poupança");
		
		JButton btnRendaFixa = new JButton("Renda Fixa");
		
		JLabel lblSimulaes = new JLabel("Simulações");
		lblSimulaes.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panelMenu = new GroupLayout(panelMenu);
		gl_panelMenu.setHorizontalGroup(
			gl_panelMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSaldo, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnDepsito, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSaque, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnTransferencia, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addGap(5)
					.addComponent(btnCriarConta, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnEntrar, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnPoupanca, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnRendaFixa, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(lblSimulaes, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
		);
		gl_panelMenu.setVerticalGroup(
			gl_panelMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSaldo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDepsito)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSaque)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnTransferencia)
					.addGap(18)
					.addComponent(lblSimulaes)
					.addGap(8)
					.addComponent(btnPoupanca)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRendaFixa)
					.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
					.addComponent(btnEntrar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCriarConta)
					.addContainerGap())
		);
		panelMenu.setLayout(gl_panelMenu);
		
		JPanel panelTela = new JPanel();
		GroupLayout gl_panelPrincipal = new GroupLayout(panelPrincipal);
		gl_panelPrincipal.setHorizontalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelMenu, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelTela, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelPrincipal.setVerticalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelPrincipal.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelTela, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
						.addComponent(panelMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		panelTela.setLayout(new CardLayout(0, 0));
		
		JPanel panelSaldo = new JPanel();
		panelTela.add(panelSaldo, "name_139587362017820");
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setText("Nome");
		textField.setColumns(10);
		
		txtR = new JTextField();
		txtR.setText("R$");
		txtR.setColumns(10);
		
		txtR_1 = new JTextField();
		txtR_1.setText("R$");
		txtR_1.setColumns(10);
		
		txtR_2 = new JTextField();
		txtR_2.setText("R$");
		txtR_2.setColumns(10);
		
		JLabel lblSaldo_1 = new JLabel("Conta Corrente");
		
		JLabel lblContaPoupana = new JLabel("Conta Poupança");
		
		JLabel lblRendaFixa = new JLabel("Renda fixa");
		GroupLayout gl_panelSaldo = new GroupLayout(panelSaldo);
		gl_panelSaldo.setHorizontalGroup(
			gl_panelSaldo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelSaldo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelSaldo.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSaldo, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
						.addGroup(gl_panelSaldo.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_panelSaldo.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addGroup(gl_panelSaldo.createSequentialGroup()
									.addGroup(gl_panelSaldo.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSaldo_1)
										.addComponent(lblContaPoupana)
										.addComponent(lblRendaFixa))
									.addGap(18)
									.addGroup(gl_panelSaldo.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtR, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
										.addComponent(txtR_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
										.addComponent(txtR_2, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))))
					.addContainerGap())
		);
		gl_panelSaldo.setVerticalGroup(
			gl_panelSaldo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSaldo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSaldo, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelSaldo.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSaldo_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelSaldo.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtR_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblContaPoupana))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelSaldo.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtR_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRendaFixa))
					.addContainerGap(195, Short.MAX_VALUE))
		);
		panelSaldo.setLayout(gl_panelSaldo);
		
		JPanel panelEntrar = new JPanel();
		panelTela.add(panelEntrar, "name_140003310699236");
		
		JLabel lblEntrar = new JLabel("Entrar");
		lblEntrar.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtCpf_1 = new JTextField();
		txtCpf_1.setText("Numero da Conta");
		txtCpf_1.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JLabel label_1 = new JLabel("Senha");
		
		JButton btnEntrar_1 = new JButton("Entrar");
		btnEntrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panelEntrar = new GroupLayout(panelEntrar);
		gl_panelEntrar.setHorizontalGroup(
			gl_panelEntrar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEntrar.createSequentialGroup()
					.addGroup(gl_panelEntrar.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEntrar.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelEntrar.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEntrar, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
								.addGroup(gl_panelEntrar.createSequentialGroup()
									.addGap(6)
									.addComponent(txtCpf_1, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))))
						.addGroup(Alignment.TRAILING, gl_panelEntrar.createSequentialGroup()
							.addGap(12)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
						.addGroup(gl_panelEntrar.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnEntrar_1, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panelEntrar.setVerticalGroup(
			gl_panelEntrar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEntrar.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEntrar, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtCpf_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelEntrar.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addGap(18)
					.addComponent(btnEntrar_1)
					.addContainerGap(228, Short.MAX_VALUE))
		);
		panelEntrar.setLayout(gl_panelEntrar);
		
		JPanel panelCriarConta = new JPanel();
		panelTela.add(panelCriarConta, "name_140495560549846");
		
		JLabel lblCriarConta = new JLabel("Criar Conta");
		lblCriarConta.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtNome = new JTextField();
		txtNome.setText("Nome");
		txtNome.setColumns(10);
		
		JLabel label_2 = new JLabel("Senha");
		
		passwordField_1 = new JPasswordField();
		
		JButton btnCriarConta_1 = new JButton("Criar conta");
		
		txtCpf = new JTextField();
		txtCpf.setText("CPF");
		txtCpf.setColumns(10);
		
		txtEndereo = new JTextField();
		txtEndereo.setText("Endereço");
		txtEndereo.setColumns(10);
		
		txtDataDeNascimento = new JTextField();
		txtDataDeNascimento.setText("Data de Nascimento");
		txtDataDeNascimento.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setText("Telefone");
		txtTelefone.setColumns(10);
		GroupLayout gl_panelCriarConta = new GroupLayout(panelCriarConta);
		gl_panelCriarConta.setHorizontalGroup(
			gl_panelCriarConta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCriarConta.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCriarConta.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCriarConta, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
						.addGroup(gl_panelCriarConta.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_panelCriarConta.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addComponent(txtDataDeNascimento, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addComponent(txtEndereo, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addComponent(txtCpf, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addComponent(txtTelefone, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, gl_panelCriarConta.createSequentialGroup()
							.addGap(6)
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passwordField_1, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
						.addComponent(btnCriarConta_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelCriarConta.setVerticalGroup(
			gl_panelCriarConta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCriarConta.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCriarConta, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtEndereo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtDataDeNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelCriarConta.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addGap(18)
					.addComponent(btnCriarConta_1)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		panelCriarConta.setLayout(gl_panelCriarConta);
		
		JPanel panelSaque = new JPanel();
		panelTela.add(panelSaque, "name_140795562991688");
		
		txtValor = new JTextField();
		txtValor.setText("Valor");
		txtValor.setColumns(10);
		
		JLabel lblSaque = new JLabel("Saque");
		lblSaque.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnSacar = new JButton("Sacar");
		
		JCheckBox chckbxCorrente = new JCheckBox("Corrente");
		
		JCheckBox chckbxPoupana = new JCheckBox("Poupança");
		
		JCheckBox chckbxRendaFixa = new JCheckBox("Renda fixa");
		GroupLayout gl_panelSaque = new GroupLayout(panelSaque);
		gl_panelSaque.setHorizontalGroup(
			gl_panelSaque.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSaque.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelSaque.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSaque, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
						.addComponent(btnSacar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
						.addGroup(gl_panelSaque.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_panelSaque.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxCorrente)
								.addComponent(txtValor, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addComponent(chckbxPoupana)
								.addComponent(chckbxRendaFixa))))
					.addContainerGap())
		);
		gl_panelSaque.setVerticalGroup(
			gl_panelSaque.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSaque.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSaque, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(80)
					.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxCorrente)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxPoupana)
					.addGap(9)
					.addComponent(chckbxRendaFixa)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSacar)
					.addContainerGap(104, Short.MAX_VALUE))
		);
		panelSaque.setLayout(gl_panelSaque);
		
		JPanel panelDeposito = new JPanel();
		panelTela.add(panelDeposito, "name_141148139450426");
		
		JCheckBox checkBox = new JCheckBox("Corrente");
		
		JCheckBox checkBox_1 = new JCheckBox("Poupança");
		
		JCheckBox checkBox_2 = new JCheckBox("Renda fixa");
		
		JLabel lblDepsito = new JLabel("Depósito");
		lblDepsito.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_1 = new JTextField();
		textField_1.setText("Valor");
		textField_1.setColumns(10);
		
		JButton btnDepositar = new JButton("Depositar");
		GroupLayout gl_panelDeposito = new GroupLayout(panelDeposito);
		gl_panelDeposito.setHorizontalGroup(
			gl_panelDeposito.createParallelGroup(Alignment.LEADING)
				.addGap(0, 259, Short.MAX_VALUE)
				.addGroup(gl_panelDeposito.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDeposito.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDepsito, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
						.addComponent(btnDepositar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
						.addGroup(gl_panelDeposito.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_panelDeposito.createParallelGroup(Alignment.LEADING)
								.addComponent(checkBox)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addComponent(checkBox_1)
								.addComponent(checkBox_2))))
					.addContainerGap())
		);
		gl_panelDeposito.setVerticalGroup(
			gl_panelDeposito.createParallelGroup(Alignment.LEADING)
				.addGap(0, 410, Short.MAX_VALUE)
				.addGroup(gl_panelDeposito.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDepsito, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(80)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkBox)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(checkBox_1)
					.addGap(9)
					.addComponent(checkBox_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDepositar)
					.addContainerGap(104, Short.MAX_VALUE))
		);
		panelDeposito.setLayout(gl_panelDeposito);
		panelPrincipal.setLayout(gl_panelPrincipal);
		frame.getContentPane().setLayout(groupLayout);
	}
}

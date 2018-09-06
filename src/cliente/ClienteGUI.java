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
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import servidor.BancoRemoto;
import cliente.Cliente;

// importados do git
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteGUI extends javax.swing.JFrame {

	

	/**
	 * Launch the application.
	 * 
	 * 
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
        
        try {
            
            cli = new Cliente(this);
            
            Registry nameServiceRef = LocateRegistry.getRegistry("localhost", 1088);
            this.bank = (BancoRemoto) nameServiceRef.lookup("Bank");
            
            nameServiceRef.rebind("Cliente", cli);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initialize();
    }
	
	
	/*
	public ClienteGUI() {
		initialize();
	}
	*/
	
	/*
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 456);
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
		panelMenu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel panelTela = new JPanel();
		panelTela.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
		
		JPanel panelSaldo = new JPanel();
		panelTela.add(panelSaldo, "name_139587362017820");
		
		JPanel panelEntrar = new JPanel();
		panelTela.add(panelEntrar, "name_140003310699236");
		
		JPanel panelCriarConta = new JPanel();		
		JPanel panelSaque = new JPanel();
		JPanel panelDeposito = new JPanel();
		JPanel panelTransferencia = new JPanel();
		JPanel panelPoupanca = new JPanel();
		JPanel panelRendaFixa = new JPanel();
		
		
		JButton btnCriarConta = new JButton("Criar conta");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelTela.removeAll();
				panelTela.add(panelCriarConta);
		        panelTela.revalidate();
			}
		});
		
		JButton btnSaldo = new JButton("Saldo");
		btnSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panelTela.removeAll();
				panelTela.add(panelSaldo);
		        panelTela.revalidate();
			}
		});
		
		JButton btnDepsito = new JButton("Depósito");
		btnDepsito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelTela.removeAll();
				panelTela.add(panelDeposito);
		        panelTela.revalidate();
			}
		});
		
		JButton btnSaque = new JButton("Saque");
		btnSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelTela.removeAll();
				panelTela.add(panelSaque);
		        panelTela.revalidate();
			}
		});
		
		JButton btnTransferencia = new JButton("Transferencia");
		btnTransferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelTela.removeAll();
				panelTela.add(panelTransferencia);
		        panelTela.revalidate();
			}
		});
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				panelTela.removeAll();
				panelTela.add(panelEntrar);
		        panelTela.revalidate();
		        
				
			}
		});
		
		JButton btnPoupanca = new JButton("Poupança");
		btnPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelTela.removeAll();
				panelTela.add(panelPoupanca);
		        panelTela.revalidate();
			}
		});
		
		JButton btnRendaFixa = new JButton("Renda Fixa");
		btnRendaFixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelTela.removeAll();
				panelTela.add(panelRendaFixa);
		        panelTela.revalidate();
			}
		});
		
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
						.addComponent(lblSaque, GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
						.addComponent(btnSacar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
						.addGroup(gl_panelSaque.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_panelSaque.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxCorrente)
								.addComponent(txtValor, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxRendaFixa)
					.addGap(16)
					.addComponent(btnSacar)
					.addContainerGap(88, Short.MAX_VALUE))
		);
		panelSaque.setLayout(gl_panelSaque);
		
		
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
		
		
		panelTela.add(panelTransferencia, "name_141669587370145");
		
		JLabel lblTransferencia = new JLabel("Transferencia");
		lblTransferencia.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_2 = new JTextField();
		textField_2.setText("Valor");
		textField_2.setColumns(10);
		
		JButton btnTransferir = new JButton("Transferir");
		
		JLabel lblSaldo_2 = new JLabel("Saldo");
		
		JLabel lblDestinatrio = new JLabel("Destinatário");
		
		txtNmeroDaConta = new JTextField();
		txtNmeroDaConta.setText("Número da Conta");
		txtNmeroDaConta.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		GroupLayout gl_panelTransferencia = new GroupLayout(panelTransferencia);
		gl_panelTransferencia.setHorizontalGroup(
			gl_panelTransferencia.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTransferencia.createSequentialGroup()
					.addGroup(gl_panelTransferencia.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelTransferencia.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelTransferencia.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTransferencia, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
								.addComponent(btnTransferir, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
								.addGroup(gl_panelTransferencia.createSequentialGroup()
									.addGap(6)
									.addComponent(lblSaldo_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
									.addComponent(btnConsultar))))
						.addGroup(Alignment.TRAILING, gl_panelTransferencia.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_panelTransferencia.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addGroup(gl_panelTransferencia.createSequentialGroup()
									.addComponent(lblDestinatrio)
									.addGap(18)
									.addComponent(txtNmeroDaConta, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))))
					.addContainerGap())
		);
		gl_panelTransferencia.setVerticalGroup(
			gl_panelTransferencia.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTransferencia.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTransferencia, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addGroup(gl_panelTransferencia.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSaldo_2)
						.addComponent(btnConsultar))
					.addGap(18)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelTransferencia.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNmeroDaConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDestinatrio))
					.addGap(62)
					.addComponent(btnTransferir)
					.addContainerGap(104, Short.MAX_VALUE))
		);
		panelTransferencia.setLayout(gl_panelTransferencia);
		
		
		panelTela.add(panelPoupanca, "name_142432910411605");
		
		JLabel lblSimulaoDeInvestimento = new JLabel("Investimento na poupança");
		lblSimulaoDeInvestimento.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblSaldoAtual = new JLabel("Investimento");
		
		JLabel lblApsMeses = new JLabel("Após 3 meses");
		
		JLabel lblMes = new JLabel("Após 6 meses");
		
		textField_5 = new JTextField();
		textField_5.setText("R$");
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setText("R$");
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("R$");
		textField_7.setColumns(10);
		
		txtR_3 = new JTextField();
		txtR_3.setText("R$");
		txtR_3.setColumns(10);
		
		JLabel lblApsMeses_1 = new JLabel("Após 12 meses");
		
		JButton btnNewButton = new JButton("Calcular");
		GroupLayout gl_panelPoupanca = new GroupLayout(panelPoupanca);
		gl_panelPoupanca.setHorizontalGroup(
			gl_panelPoupanca.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelPoupanca.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelPoupanca.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPoupanca.createSequentialGroup()
							.addGroup(gl_panelPoupanca.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSimulaoDeInvestimento, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
								.addGroup(gl_panelPoupanca.createSequentialGroup()
									.addGap(4)
									.addComponent(lblSaldoAtual)
									.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addGroup(gl_panelPoupanca.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panelPoupanca.createSequentialGroup()
							.addGroup(gl_panelPoupanca.createParallelGroup(Alignment.LEADING)
								.addComponent(lblApsMeses_1)
								.addComponent(lblMes)
								.addComponent(lblApsMeses))
							.addGap(17)
							.addGroup(gl_panelPoupanca.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
								.addComponent(textField_7, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
								.addComponent(txtR_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
							.addGap(10))))
		);
		gl_panelPoupanca.setVerticalGroup(
			gl_panelPoupanca.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPoupanca.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSimulaoDeInvestimento, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addGroup(gl_panelPoupanca.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSaldoAtual))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addGap(18)
					.addGroup(gl_panelPoupanca.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPoupanca.createSequentialGroup()
							.addGroup(gl_panelPoupanca.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblApsMeses))
							.addGap(40)
							.addGroup(gl_panelPoupanca.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtR_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblApsMeses_1)))
						.addGroup(gl_panelPoupanca.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_panelPoupanca.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMes))))
					.addContainerGap(120, Short.MAX_VALUE))
		);
		panelPoupanca.setLayout(gl_panelPoupanca);
		
		
		panelTela.add(panelRendaFixa, "name_143002121008904");
		
		textField_4 = new JTextField();
		textField_4.setText("R$");
		textField_4.setColumns(10);
		
		JLabel label = new JLabel("Após 12 meses");
		
		JLabel lblInvestimentoNaRenda = new JLabel("Investimento na Renda Fixa");
		lblInvestimentoNaRenda.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_4 = new JLabel("Saldo atual");
		
		JLabel lblApsMeses_2 = new JLabel("Ap\u00F3s 3 meses");
		
		textField_8 = new JTextField();
		textField_8.setText("R$");
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setText("R$");
		textField_9.setColumns(10);
		
		JLabel label_6 = new JLabel("Após 6 meses");
		
		textField_10 = new JTextField();
		textField_10.setText("R$");
		textField_10.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panelRendaFixa = new GroupLayout(panelRendaFixa);
		gl_panelRendaFixa.setHorizontalGroup(
			gl_panelRendaFixa.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelRendaFixa.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelRendaFixa.createParallelGroup(Alignment.LEADING)
						.addComponent(lblInvestimentoNaRenda, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
						.addGroup(gl_panelRendaFixa.createSequentialGroup()
							.addGap(4)
							.addComponent(label_4)
							.addGap(44)
							.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_panelRendaFixa.createSequentialGroup()
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_panelRendaFixa.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelRendaFixa.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(label_6)
						.addComponent(lblApsMeses_2))
					.addGap(17)
					.addGroup(gl_panelRendaFixa.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_9, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
						.addComponent(textField_10, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
						.addComponent(textField_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
					.addGap(10))
		);
		gl_panelRendaFixa.setVerticalGroup(
			gl_panelRendaFixa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRendaFixa.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInvestimentoNaRenda, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addGroup(gl_panelRendaFixa.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_1)
					.addGap(18)
					.addGroup(gl_panelRendaFixa.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelRendaFixa.createSequentialGroup()
							.addGroup(gl_panelRendaFixa.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblApsMeses_2))
							.addGap(40)
							.addGroup(gl_panelRendaFixa.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label)))
						.addGroup(gl_panelRendaFixa.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_panelRendaFixa.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6))))
					.addContainerGap(120, Short.MAX_VALUE))
		);
		panelRendaFixa.setLayout(gl_panelRendaFixa);
		panelPrincipal.setLayout(gl_panelPrincipal);
		frame.getContentPane().setLayout(groupLayout);
	}
	
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }
    
    private BancoRemoto bank;
    private Cliente cli;
    
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
	private JTextField textField_2;
	private JTextField txtNmeroDaConta;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtR_3;
	private JTextField textField_4;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
}

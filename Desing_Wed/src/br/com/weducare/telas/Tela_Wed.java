package br.com.weducare.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Tela_Wed {

	private JFrame Cadastro;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtCurso;
	private JTextField txtSenha;
	private JTextField txtIntituicao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Wed window = new Tela_Wed();
					window.Cadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Wed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Cadastro = new JFrame();
		Cadastro.setResizable(false);
		Cadastro.setTitle("Cadastro");
		Cadastro.setBounds(100, 100, 526, 367);
		Cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Cadastro.getContentPane().setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(53, 51, 27, 20);
		Cadastro.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(53, 82, 257, 20);
		Cadastro.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(53, 158, 271, 20);
		Cadastro.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(32, 53, 48, 17);
		Cadastro.getContentPane().add(lblId);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(13, 85, 48, 14);
		Cadastro.getContentPane().add(lblNome);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(13, 161, 48, 14);
		Cadastro.getContentPane().add(lblEmail);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(13, 110, 48, 14);
		Cadastro.getContentPane().add(lblCurso);
		
		txtCurso = new JTextField();
		txtCurso.setBounds(53, 107, 177, 20);
		Cadastro.getContentPane().add(txtCurso);
		txtCurso.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(53, 186, 177, 20);
		Cadastro.getContentPane().add(txtSenha);
		txtSenha.setColumns(10);
		
		txtIntituicao = new JTextField();
		txtIntituicao.setBounds(75, 133, 235, 20);
		Cadastro.getContentPane().add(txtIntituicao);
		txtIntituicao.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(13, 189, 48, 14);
		Cadastro.getContentPane().add(lblSenha);
		
		JLabel lblInstituicao = new JLabel("Institui\u00E7\u00E3o");
		lblInstituicao.setBounds(13, 135, 60, 17);
		Cadastro.getContentPane().add(lblInstituicao);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Tela_Wed.class.getResource("/br/com/weducare/icones/adicionar.12.png")));
		btnNewButton.setBounds(13, 217, 90, 90);
		Cadastro.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(134, 278, 89, 23);
		Cadastro.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(252, 278, 89, 23);
		Cadastro.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(387, 278, 89, 23);
		Cadastro.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Tela_Wed.class.getResource("/br/com/weducare/icones/logo.png")));
		lblNewLabel_3.setBounds(334, 51, 200, 150);
		Cadastro.getContentPane().add(lblNewLabel_3);
	}
}

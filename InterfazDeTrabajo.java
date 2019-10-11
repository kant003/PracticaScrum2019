package PracticasScrum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class InterfazDeTrabajo {

	private JFrame frame;
	private JTextField txtFrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazDeTrabajo window = new InterfazDeTrabajo();
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
	public InterfazDeTrabajo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnCalcular = new JButton("Calcular");
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.insets = new Insets(0, 0, 5, 0);
		gbc_btnCalcular.gridx = 0;
		gbc_btnCalcular.gridy = 2;
		panel.add(btnCalcular, gbc_btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 0);
		gbc_btnLimpiar.gridx = 0;
		gbc_btnLimpiar.gridy = 4;
		panel.add(btnLimpiar, gbc_btnLimpiar);
		
		JButton btnBorrarHistorial = new JButton("Borrar Historial");
		GridBagConstraints gbc_btnBorrarHistorial = new GridBagConstraints();
		gbc_btnBorrarHistorial.gridx = 0;
		gbc_btnBorrarHistorial.gridy = 8;
		panel.add(btnBorrarHistorial, gbc_btnBorrarHistorial);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 348, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		txtFrase = new JTextField();
		txtFrase.setText("Introducir frase");
		GridBagConstraints gbc_txtFrase = new GridBagConstraints();
		gbc_txtFrase.insets = new Insets(0, 0, 5, 5);
		gbc_txtFrase.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFrase.gridx = 1;
		gbc_txtFrase.gridy = 0;
		panel_1.add(txtFrase, gbc_txtFrase);
		txtFrase.setColumns(10);
		
		JLabel lblUltiLetra = new JLabel("Mostrar \u00FAltima letra");
		GridBagConstraints gbc_lblUltiLetra = new GridBagConstraints();
		gbc_lblUltiLetra.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltiLetra.gridx = 1;
		gbc_lblUltiLetra.gridy = 1;
		panel_1.add(lblUltiLetra, gbc_lblUltiLetra);
		
		JLabel lblBorrarEspacios = new JLabel("Borrar espacios");
		GridBagConstraints gbc_lblBorrarEspacios = new GridBagConstraints();
		gbc_lblBorrarEspacios.insets = new Insets(0, 0, 5, 5);
		gbc_lblBorrarEspacios.gridx = 1;
		gbc_lblBorrarEspacios.gridy = 2;
		panel_1.add(lblBorrarEspacios, gbc_lblBorrarEspacios);
		
		JLabel lblPorcenLetraA = new JLabel("Porcentaje de letras a");
		GridBagConstraints gbc_lblPorcenLetraA = new GridBagConstraints();
		gbc_lblPorcenLetraA.insets = new Insets(0, 0, 5, 5);
		gbc_lblPorcenLetraA.gridx = 1;
		gbc_lblPorcenLetraA.gridy = 3;
		panel_1.add(lblPorcenLetraA, gbc_lblPorcenLetraA);
		
		JLabel lblValiDni = new JLabel("Validar DNI");
		GridBagConstraints gbc_lblValiDni = new GridBagConstraints();
		gbc_lblValiDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblValiDni.gridx = 1;
		gbc_lblValiDni.gridy = 4;
		panel_1.add(lblValiDni, gbc_lblValiDni);
		
		JLabel lblExtensionCarac = new JLabel("Extensi\u00F3n de caracteres");
		GridBagConstraints gbc_lblExtensionCarac = new GridBagConstraints();
		gbc_lblExtensionCarac.insets = new Insets(0, 0, 5, 5);
		gbc_lblExtensionCarac.gridx = 1;
		gbc_lblExtensionCarac.gridy = 5;
		panel_1.add(lblExtensionCarac, gbc_lblExtensionCarac);
		
		JLabel lblContarLetraA = new JLabel("Contar letras a");
		GridBagConstraints gbc_lblContarLetraA = new GridBagConstraints();
		gbc_lblContarLetraA.insets = new Insets(0, 0, 5, 5);
		gbc_lblContarLetraA.gridx = 1;
		gbc_lblContarLetraA.gridy = 6;
		panel_1.add(lblContarLetraA, gbc_lblContarLetraA);
		
		JLabel lblMostrarPriLetra = new JLabel("Mostrar primera letra");
		GridBagConstraints gbc_lblMostrarPriLetra = new GridBagConstraints();
		gbc_lblMostrarPriLetra.insets = new Insets(0, 0, 5, 5);
		gbc_lblMostrarPriLetra.gridx = 1;
		gbc_lblMostrarPriLetra.gridy = 7;
		panel_1.add(lblMostrarPriLetra, gbc_lblMostrarPriLetra);
		
		JLabel lblCaracParesImpares = new JLabel("Caracteres pares o impares");
		GridBagConstraints gbc_lblCaracParesImpares = new GridBagConstraints();
		gbc_lblCaracParesImpares.insets = new Insets(0, 0, 5, 5);
		gbc_lblCaracParesImpares.gridx = 1;
		gbc_lblCaracParesImpares.gridy = 8;
		panel_1.add(lblCaracParesImpares, gbc_lblCaracParesImpares);
		
		JLabel lblTransMinus = new JLabel("Transformar a minusculas");
		GridBagConstraints gbc_lblTransMinus = new GridBagConstraints();
		gbc_lblTransMinus.insets = new Insets(0, 0, 5, 5);
		gbc_lblTransMinus.gridx = 1;
		gbc_lblTransMinus.gridy = 9;
		panel_1.add(lblTransMinus, gbc_lblTransMinus);
		
		JLabel lblClasifCarac = new JLabel("Clasificar tipo de caracter");
		GridBagConstraints gbc_lblClasifCarac = new GridBagConstraints();
		gbc_lblClasifCarac.insets = new Insets(0, 0, 5, 5);
		gbc_lblClasifCarac.gridx = 1;
		gbc_lblClasifCarac.gridy = 10;
		panel_1.add(lblClasifCarac, gbc_lblClasifCarac);
		
		JLabel lblTextSinVocales = new JLabel("Mostrar texto sin vocales");
		GridBagConstraints gbc_lblTextSinVocales = new GridBagConstraints();
		gbc_lblTextSinVocales.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextSinVocales.gridx = 1;
		gbc_lblTextSinVocales.gridy = 11;
		panel_1.add(lblTextSinVocales, gbc_lblTextSinVocales);
		
		JLabel lblContVocales = new JLabel("contador de vocales");
		GridBagConstraints gbc_lblContVocales = new GridBagConstraints();
		gbc_lblContVocales.insets = new Insets(0, 0, 5, 5);
		gbc_lblContVocales.gridx = 1;
		gbc_lblContVocales.gridy = 12;
		panel_1.add(lblContVocales, gbc_lblContVocales);
		
		JLabel lblWebGatitos = new JLabel("Web de Gatitos");
		GridBagConstraints gbc_lblWebGatitos = new GridBagConstraints();
		gbc_lblWebGatitos.insets = new Insets(0, 0, 5, 5);
		gbc_lblWebGatitos.gridx = 1;
		gbc_lblWebGatitos.gridy = 14;
		panel_1.add(lblWebGatitos, gbc_lblWebGatitos);
		
		JButton btnAddBd = new JButton("A\u00F1adir a BD");
		GridBagConstraints gbc_btnAddBd = new GridBagConstraints();
		gbc_btnAddBd.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddBd.gridx = 1;
		gbc_btnAddBd.gridy = 15;
		panel_1.add(btnAddBd, gbc_btnAddBd);
	}

}

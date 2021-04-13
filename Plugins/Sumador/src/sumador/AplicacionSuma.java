package sumador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AplicacionSuma {
	
	int x;
	private JFrame frame;
	private JTextField txtSumador;
	private JLabel lblNumero;
	private JTextField NumeroA;
	private JLabel lblNumero_1;
	private JTextField NumeroB;
	private JLabel lblResultado;
	private JTextField ResultadoTotal;
	private JPanel panel_1;
	private JButton btnSumar;
	private JButton btnSalir;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionSuma window = new AplicacionSuma();
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
	public AplicacionSuma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		txtSumador = new JTextField();
		txtSumador.setText("     SUMADOR");
		GridBagConstraints gbc_txtSumador = new GridBagConstraints();
		gbc_txtSumador.insets = new Insets(0, 0, 5, 0);
		gbc_txtSumador.gridx = 1;
		gbc_txtSumador.gridy = 0;
		frame.getContentPane().add(txtSumador, gbc_txtSumador);
		txtSumador.setColumns(10);
		
		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 1;
		frame.getContentPane().add(panel_2, gbc_panel_2);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNumero = new JLabel("Numero 1:");
		GridBagConstraints gbc_lblNumero = new GridBagConstraints();
		gbc_lblNumero.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero.gridx = 0;
		gbc_lblNumero.gridy = 0;
		panel.add(lblNumero, gbc_lblNumero);
		
		NumeroA = new JTextField();
		GridBagConstraints gbc_NumeroA = new GridBagConstraints();
		gbc_NumeroA.anchor = GridBagConstraints.WEST;
		gbc_NumeroA.insets = new Insets(0, 0, 5, 0);
		gbc_NumeroA.gridx = 2;
		gbc_NumeroA.gridy = 0;
		panel.add(NumeroA, gbc_NumeroA);
		NumeroA.setColumns(10);
		
		lblNumero_1 = new JLabel("Numero 2:");
		GridBagConstraints gbc_lblNumero_1 = new GridBagConstraints();
		gbc_lblNumero_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero_1.gridx = 0;
		gbc_lblNumero_1.gridy = 2;
		panel.add(lblNumero_1, gbc_lblNumero_1);
		
		NumeroB = new JTextField();
		GridBagConstraints gbc_NumeroB = new GridBagConstraints();
		gbc_NumeroB.anchor = GridBagConstraints.WEST;
		gbc_NumeroB.insets = new Insets(0, 0, 5, 0);
		gbc_NumeroB.gridx = 2;
		gbc_NumeroB.gridy = 2;
		panel.add(NumeroB, gbc_NumeroB);
		NumeroB.setColumns(10);
	
		lblResultado = new JLabel("Resultado:");
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblResultado.gridx = 0;
		gbc_lblResultado.gridy = 4;
		panel.add(lblResultado, gbc_lblResultado);
		
		ResultadoTotal = new JTextField();
		ResultadoTotal.setEnabled(false);
		GridBagConstraints gbc_ResultadoTotal = new GridBagConstraints();
		gbc_ResultadoTotal.anchor = GridBagConstraints.WEST;
		gbc_ResultadoTotal.insets = new Insets(0, 0, 5, 0);
		gbc_ResultadoTotal.gridx = 2;
		gbc_ResultadoTotal.gridy = 4;
		panel.add(ResultadoTotal, gbc_ResultadoTotal);
		ResultadoTotal.setColumns(10);
		
		panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 5;
		panel.add(panel_3, gbc_panel_3);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 6;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Suma ();
			}
		});
		btnSumar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel_1.add(btnSumar);
		panel_1.setBorder(new EtchedBorder(40)); 
		
		panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		btnSalir = new JButton("Salir");
		panel_1.add(btnSalir);
		panel_1.setBorder(new EtchedBorder(40));
	}
	
	private void Suma() {
		// TODO Auto-generated method stub
		   String numero1=NumeroA.getText();
		   String numero2=NumeroB.getText();
		   int a=Integer.parseInt(numero1);
		   int b=Integer.parseInt(numero2);
		   int suma=a+b;
		   String solucion=String.valueOf(suma);
		   ResultadoTotal.setText(solucion);
		   return;
		}
}
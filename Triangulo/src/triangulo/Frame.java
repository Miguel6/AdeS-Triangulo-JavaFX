package triangulo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField sideA;
	private JTextField sideB;
	private JTextField sideC;
	private JLabel lblPrintResult;
	private JLabel lblResultado;
	private JLabel lblTriangle;
	MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			onMouseClicked();

		}
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLado = new JLabel("Lado A");
		lblLado.setBounds(10, 11, 46, 14);
		contentPane.add(lblLado);

		JLabel lblLado_1 = new JLabel("Lado B");
		lblLado_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblLado_1);

		JLabel lblLado_2 = new JLabel("Lado C");
		lblLado_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblLado_2);

		sideA = new JTextField();
		sideA.setBounds(66, 8, 86, 20);
		contentPane.add(sideA);
		sideA.setColumns(10);
		System.out.println("ASDASDAS");

		sideB = new JTextField();
		sideB.setBounds(66, 33, 86, 20);
		contentPane.add(sideB);
		sideB.setColumns(10);

		sideC = new JTextField();
		sideC.setBounds(66, 58, 86, 20);
		contentPane.add(sideC);
		sideC.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(195, 32, 89, 23);
		btnCalcular.addMouseListener(mouseListener);
		contentPane.add(btnCalcular);

		this.lblResultado = new JLabel("Resultado:");
		this.lblResultado.setBounds(10, 85, 61, 14);
		contentPane.add(lblResultado);
		
		this.lblTriangle = new JLabel("");
		this.lblTriangle.setBounds(81, 85, 287, 14);
		contentPane.add(lblTriangle);

	}

	private void onMouseClicked() {
		try {
			Triangulo triangulo = new Triangulo(
					Double.parseDouble(sideA.getText()),
					Double.parseDouble(sideB.getText()),
					Double.parseDouble(sideC.getText())
					);
			this.lblTriangle.setText( triangulo.getTriangleTypeBySide());
		} catch (NumberFormatException e) {
			this.lblTriangle.setText("Por favor ingrese numeros");
		} catch(Exception e) { 
			this.lblTriangle.setText(e.getMessage());
		}
	}
}

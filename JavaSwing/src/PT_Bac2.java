import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PT_Bac2 extends JFrame {

    float a, b, c;
    
	private static final long serialVersionUID = 1L;
	private JPanel PTbac2;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField txtDelta;
	private JTextField txtX1;
	private JTextField txtX2;
	
	private boolean check() {
		if(txta.getText().isEmpty() || txtb.getText().isEmpty() || txtc.getText().isEmpty()) {
			return false;
		}
		return true;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PT_Bac2 frame = new PT_Bac2();
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
	public PT_Bac2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 362);
		PTbac2 = new JPanel();
		PTbac2.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PTbac2);
		PTbac2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Giải Phương Trình Bậc 2");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(125, 10, 261, 22);
		PTbac2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập a:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(52, 64, 73, 32);
		PTbac2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nhập b:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(52, 99, 73, 32);
		PTbac2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nhập c:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(52, 136, 73, 32);
		PTbac2.add(lblNewLabel_3);
		
		txta = new JTextField();

		txta.setFont(new Font("Dialog", Font.PLAIN, 18));
		txta.setBounds(125, 73, 165, 19);
		PTbac2.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtb.setBounds(125, 108, 165, 19);
		PTbac2.add(txtb);
		txtb.setColumns(10);
		
		txtc = new JTextField();
		txtc.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtc.setBounds(125, 142, 165, 19);
		PTbac2.add(txtc);
		txtc.setColumns(10);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check() == false) {
					JOptionPane.showMessageDialog(PTbac2, "Nhập thiếu giá trị. Vui lòng nhập lại.");
				}else {
					double a = Double.parseDouble(txta.getText());
					double b = Double.parseDouble(txtb.getText());
					double c = Double.parseDouble(txtc.getText());
					
					double delta = b*b - 4*a*c;
					
					if(delta < 0) {
						txtDelta.setText("" + delta + " <0 => Phương trình vô nghiệm");
						txtX1.setText("Vô nghiệm");
						txtX2.setText("Vô nghiệm");
					}else if (delta == 0) {
						txtDelta.setText("" + delta + " =0 => Phương trình có nghiệm kép X1=X2");
						double x1 = -b / (2*a);
						txtX1.setText("" + x1);
						txtX2.setText("" + x1);
					} else {
						txtDelta.setText("" + delta + " >0 => Phương trình có nghiệm kép X1=X2");
						double x1 = (-b + Math.sqrt(delta)) / (2*a);
						double x2 = (-b - Math.sqrt(delta)) / (2*a);
						txtX1.setText("" + x1);
						txtX2.setText("" + x2);
					}
				}
				
			}
		});
		btnGiai.setBounds(382, 73, 98, 32);
		PTbac2.add(btnGiai);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txta.setText("");
				txtb.setText("");
				txtc.setText("");
				txtDelta.setText("");
				txtX1.setText("");
				txtX2.setText("");
			}
		});
		btnClear.setBounds(382, 129, 98, 32);
		PTbac2.add(btnClear);
		
		JLabel lblDelta = new JLabel("Delta:");
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDelta.setBounds(52, 211, 60, 23);
		PTbac2.add(lblDelta);
		
		JLabel lblx1 = new JLabel("X1:");
		lblx1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblx1.setBounds(52, 244, 44, 13);
		PTbac2.add(lblx1);
		
		JLabel lblX2 = new JLabel("X2:");
		lblX2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX2.setBounds(52, 274, 44, 13);
		PTbac2.add(lblX2);
		
		txtDelta = new JTextField();
		txtDelta.setEnabled(false);
		txtDelta.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtDelta.setColumns(10);
		txtDelta.setBounds(106, 212, 374, 19);
		PTbac2.add(txtDelta);
		
		txtX1 = new JTextField();
		txtX1.setEnabled(false);
		txtX1.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtX1.setColumns(10);
		txtX1.setBounds(106, 244, 374, 19);
		PTbac2.add(txtX1);
		
		txtX2 = new JTextField();
		txtX2.setEnabled(false);
		txtX2.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtX2.setColumns(10);
		txtX2.setBounds(106, 270, 374, 19);
		PTbac2.add(txtX2);
	}
}

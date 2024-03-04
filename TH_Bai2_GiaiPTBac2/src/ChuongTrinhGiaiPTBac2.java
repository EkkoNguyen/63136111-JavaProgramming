import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChuongTrinhGiaiPTBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtDelta;
	private JTextField txtX1;
	private JTextField txtX2;

	public ChuongTrinhGiaiPTBac2() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(60, 75, 64, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Giải Phương Trình Bậc 2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(203, 20, 308, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(60, 130, 64, 30);
		contentPane.add(lblNhpB);
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpC.setBounds(60, 190, 64, 30);
		contentPane.add(lblNhpC);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(134, 73, 338, 39);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(134, 130, 338, 39);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(134, 188, 338, 39);
		contentPane.add(txtC);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtA.getText().isEmpty() || txtB.getText().isEmpty() || txtC.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Nhập thiếu giá trị. Vui lòng nhập lại.");
				}else if(txtC.getText().matches("\\d+") || txtA.getText().matches("\\d+") || txtB.getText().matches("\\d+")) {
					JOptionPane.showMessageDialog(contentPane, "Vui lòng nhập số cho các toán hạng.");
				}else {
					double a = Double.parseDouble(txtA.getText());
					double b = Double.parseDouble(txtB.getText());
					double c = Double.parseDouble(txtC.getText());
					
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
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGiai.setBounds(530, 130, 119, 64);
		contentPane.add(btnGiai);
		
		JLabel lblDelta = new JLabel("Delta:");
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDelta.setBounds(60, 276, 64, 30);
		contentPane.add(lblDelta);
		
		JLabel lblX = new JLabel("X1:");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX.setBounds(60, 327, 64, 30);
		contentPane.add(lblX);
		
		JLabel lblX_1 = new JLabel("X2:");
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX_1.setBounds(60, 377, 64, 30);
		contentPane.add(lblX_1);
		
		txtDelta = new JTextField();
		txtDelta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDelta.setColumns(10);
		txtDelta.setBounds(134, 276, 338, 39);
		contentPane.add(txtDelta);
		
		txtX1 = new JTextField();
		txtX1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtX1.setColumns(10);
		txtX1.setBounds(134, 327, 338, 39);
		contentPane.add(txtX1);
		
		txtX2 = new JTextField();
		txtX2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtX2.setColumns(10);
		txtX2.setBounds(134, 375, 338, 39);
		contentPane.add(txtX2);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả tính toán:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(60, 230, 168, 36);
		contentPane.add(lblNewLabel_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				txtDelta.setText("");
				txtX1.setText("");
				txtX2.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClear.setBounds(530, 293, 119, 64);
		contentPane.add(btnClear);
	}
	
}

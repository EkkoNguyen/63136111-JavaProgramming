import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;

	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(38, 58, 167, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b):");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(38, 133, 167, 31);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(204, 58, 219, 33);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(204, 133, 219, 33);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG ");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(83, 208, 85, 31);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(192, 208, 85, 31);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(293, 208, 85, 31);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(404, 208, 85, 31);
		contentPane.add(btnChia);
		
		JLabel KQ = new JLabel("Kết quả tính toán");
		KQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		KQ.setBounds(38, 266, 167, 31);
		contentPane.add(KQ);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setColumns(10);
		txtKQ.setBounds(204, 264, 219, 33);
		contentPane.add(txtKQ);
	}
		void hamXuLyCong() {
			//Lấy dữ liệu từ điều khiển
			double a = Double.parseDouble(txtA.getText());
			double b = Double.parseDouble(txtB.getText());
			//Tính toán
			double tong = a + b;
			//Đưa ra hiển thị lên điều khiển
			txtKQ.setText(String.valueOf(tong));
		}
		void hamXuLyTru() {
			//Lấy dữ liệu từ điều khiển
			double a = Double.parseDouble(txtA.getText());
			double b = Double.parseDouble(txtB.getText());
			//Tính toán
			double tong = a - b;
			//Đưa ra hiển thị lên điều khiển
			txtKQ.setText(String.valueOf(tong));
		}
		void hamXuLyNhan() {
			//Lấy dữ liệu từ điều khiển
			double a = Double.parseDouble(txtA.getText());
			double b = Double.parseDouble(txtB.getText());
			//Tính toán
			double tong = a * b;
			//Đưa ra hiển thị lên điều khiển
			txtKQ.setText(String.valueOf(tong));
		}
		void hamXuLyChia() {
			//Lấy dữ liệu từ điều khiển
			double a = Double.parseDouble(txtA.getText());
			double b = Double.parseDouble(txtB.getText());
			if(b == 0)
				JOptionPane.showMessageDialog(contentPane, "Nhập số b khác 0");
			//Tính toán
			double tong = a * b;
			//Đưa ra hiển thị lên điều khiển
			txtKQ.setText(String.valueOf(tong));
		}
}

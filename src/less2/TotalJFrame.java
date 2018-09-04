package less2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TotalJFrame extends JFrame {

	private JPanel panel = new JPanel();
	private JButton up = new JButton("UP");
	private String way = new String("D:\\");
	private File file = new File(way);
	private File[] files = file.listFiles();
	private JButton[] jb = new JButton[files.length];
	private JTextArea text;

	TotalJFrame() {
		addPanel();
		initListeners1();
		initListeners2();
	}

	private void initListeners1() {
		for (int i = 0; i < files.length; i++) {
			int j = i;
			jb[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (files[j].isDirectory() && files[j].isHidden() != true) {
						way = files[j].getAbsolutePath();
						file = new File(way);
						files = file.listFiles();
						jb = new JButton[files.length];
						panel.removeAll();
						addPanel();
						initListeners1();

					} else if (files[j].getName().endsWith(".txt")) {
						text=new JTextArea(files[j].getAbsolutePath());
						panel.removeAll();
						text.setLocation(352, 0);
						text.setSize(540, 700);
						panel.add(text);
						addPanel();
						initListeners1();

					}
				}
			});
		}
	}

	private void initListeners2() {
		up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (file.getParent() != null) {
					way = file.getParent();
					file = new File(way);
					files = file.listFiles();
					jb = new JButton[files.length];
					panel.removeAll();
					addPanel();
					initListeners1();
				}
			}
		});
	}

	private void addPanel() {
		addButton();
		addUpButton();
		panel.setLayout(null);
		add(panel);
		setSize(900, 700);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void addButton() {
		for (int i = 0; i < files.length; i++) {
			jb[i] = new JButton(files[i].getName());
			jb[i].setVisible(true);
			jb[i].setSize(350, 30);
			jb[i].setLocation(0, i * 30 + 60);
			panel.add(jb[i]);
		}
	}

	private void addUpButton() {
		up.setVisible(true);
		up.setSize(350, 30);
		up.setLocation(0, 0);
		panel.add(up);
	}
}

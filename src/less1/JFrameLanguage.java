package less1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JFrameLanguage extends JFrame {

	private JLabel label = new JLabel("Pudge say:");
	private JPanel panel = new JPanel();
	private JLabel us = new JLabel(new ImageIcon("flags/usa.jpg"));
	private JLabel ru = new JLabel(new ImageIcon("flags/ru.jpg"));
	private JLabel de = new JLabel(new ImageIcon("flags/de.jpg"));
	ButtonGroup group = new ButtonGroup();
	JRadioButton b1 = new JRadioButton("USA");
	JRadioButton b2 = new JRadioButton("RU");
	JRadioButton b3 = new JRadioButton("DE");
	String language;
	String country;
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JLabel label4 = new JLabel();

	JFrameLanguage() {
		addPudge();
		addFlags();
		addGroupButton();
		addPanel();
		initListeners();
	}

	private void initListeners() {
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label2.setVisible(false);
				label3.setVisible(false);
				label4.setVisible(false);
				language = "en";
				country = "US";
				Locale currentLocale = new Locale(language, country);
				ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
				label2 = new JLabel(messages.getString("say1"));
				label3 = new JLabel(messages.getString("say2"));
				label4 = new JLabel(messages.getString("say3"));
				addMessage();
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label2.setVisible(false);
				label3.setVisible(false);
				label4.setVisible(false);
				language = "ru";
				country = "RU";
				Locale currentLocale = new Locale(language, country);
				ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
				label2 = new JLabel(messages.getString("say1"));
				label3 = new JLabel(messages.getString("say2"));
				label4 = new JLabel(messages.getString("say3"));
				addMessage();
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label2.setVisible(false);
				label3.setVisible(false);
				label4.setVisible(false);
				language = "de";
				country = "DE";
				Locale currentLocale = new Locale(language, country);
				ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
				label2 = new JLabel(messages.getString("say1"));
				label3 = new JLabel(messages.getString("say2"));
				label4 = new JLabel(messages.getString("say3"));
				addMessage();
			}
		});
	}

	private void addMessage() {
		label2.setSize(300, 100);
		label2.setLocation(100, 100);
		panel.add(label2);
		label3.setSize(300, 100);
		label3.setLocation(100, 150);
		panel.add(label3);
		label4.setSize(300, 100);
		label4.setLocation(100, 200);
		panel.add(label4);
		addPanel();

	}

	private void addPanel() {
		panel.setLayout(null);
		add(panel);
		setSize(400, 400);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void addPudge() {
		label.setSize(200, 200);
		label.setLocation(10, 50);
		panel.add(label);
	}

	private void addFlags() {
		us.setSize(120, 68);
		us.setLocation(20, 0);
		panel.add(us);
		ru.setSize(120, 68);
		ru.setLocation(130, 0);
		panel.add(ru);
		de.setSize(120, 68);
		de.setLocation(250, 0);
		panel.add(de);
	}

	private void addGroupButton() {
		group.add(b1);
		group.add(b2);
		group.add(b3);
		b1.setSize(50, 50);
		b1.setLocation(70, 80);
		b2.setSize(50, 50);
		b2.setLocation(170, 80);
		b3.setSize(50, 50);
		b3.setLocation(280, 80);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
	}

}

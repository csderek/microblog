package blog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class BlogGUI extends JFrame implements ActionListener{
	private JFrame mainFrame;
	private JTextArea postTextArea;
	private JTextField postContent;
	private JButton refresh;
	private JButton post;
	private JPanel frame;
	private JPanel button;
	private JLabel label;

	public BlogGUI() {
	}

	public void setWindow() {
		JFrame mainFrame = new JFrame("Micro Blog");
		mainFrame.setSize(600, 600);
		mainFrame.setVisible(true);
		mainFrame.setLayout(new GridLayout(2,1));
		frame = new JPanel();
		frame.setLayout(new BorderLayout());
		postTextArea = new JTextArea("What's on my own mind?");
		postTextArea.setLayout(new BorderLayout());
		frame.add(postTextArea, "Center");
		refresh = new JButton("Refresh");
		post = new JButton("Post");
		button = new JPanel();
		button.setLayout(new GridLayout(1, 2));
		button.add(refresh);
		button.add(post);
		post.addActionListener(this);
		refresh.addActionListener(this);
		label = new JLabel("You can still input 140 Characters");
		frame.add(label,"North");
		frame.add(button,"South");
		Border frameBorder = new TitledBorder(null, "Hi");
		frame.setBorder(frameBorder);
		postContent = new JTextField("Here is my Post.");
		postContent.setBackground(Color.LIGHT_GRAY);
		postContent.setBorder(frameBorder);
		mainFrame.add(frame);
		mainFrame.add(postContent);

		mainFrame.setVisible(true);

	}

	public static void main(String[] args) {
		BlogGUI blogGUi = new BlogGUI();
		blogGUi.setWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == post){
			postContent.setText(postTextArea.getText());
		}else if(e.getSource() == refresh){
			postContent.setText("You click REFRESH!!!");
		}
	}

}

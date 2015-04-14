package blog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import base.Post;
import base.User;

public class BlogGUI extends JFrame implements ActionListener{
	private JFrame mainFrame;
	private JTextArea postTextArea;
	private JTextArea postContent;
	private JButton refresh;
	private JButton post;
	private JPanel frame;
	private JPanel button;
	private JLabel label;
	private Blog myblog;
	private User user;
	
	
	public BlogGUI() {
		user = new User(0, "test", "title");
		myblog = new Blog(user);
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
		postTextArea.addKeyListener(new lengthListener());
		frame.add(postTextArea, "Center");
		refresh = new JButton("Refresh");
		post = new JButton("Post");
		button = new JPanel();
		button.setLayout(new GridLayout(1, 2));
		button.add(refresh);
		button.add(post);
		post.addActionListener(this);
		refresh.addActionListener(this);
		int length = postTextArea.getText().length();
		label = new JLabel("You can still input " + Integer.toString(140 - length) + " Characters");
		frame.add(label,"North");
		frame.add(button,"South");
		Border frameBorder = new TitledBorder(null, "Hi");
		frame.setBorder(frameBorder);
		postContent = new JTextArea("Here is my Post.");
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
			Post postcontent = new Post(new Date(), postTextArea.getText());
			myblog.post(postcontent);
			myblog.save("guipost.blog");
		}else if(e.getSource() == refresh){
			myblog.load("guipost.blog");
			postContent.setText("");
			for (Post p : myblog.getAllPosts()){
				postContent.append(p.toString());
			}
		}
	}
	class lengthListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			int length = postTextArea.getText().length();
			if(length < 140){
				String l = Integer.toString(140-length);
				label.setText("You can still input " + l + " Characters");
			}else{
				label.setText("Your post length has exceed 140");
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}

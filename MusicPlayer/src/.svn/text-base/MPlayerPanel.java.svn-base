import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Testing javafx with swing
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//import javafx.application.Platform;
//import javafx.embed.swing.JFXPanel;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;


//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.embed.swing.JFXPanel;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.effect.Reflection;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;



@SuppressWarnings("serial")
public class MPlayerPanel extends JPanel 

{
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Contruct variables
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private boolean mainTable=true; 
	
	private boolean callTable=true;
	
	private JPanel nowPlayingPanel;
	
	private JTextField findBox;
	

	
	private JTable qTable = null;
	
	private Manager mFunc = new Manager();
	

	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Button variables
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private JButton playButton, sButton, closeB, lSbutton, saveButton; 
	
	
	private JButton oButton, findButton, clearSearchButton, qButton, clearQueue;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private JScrollPane scrollPane, nowPlayScroll;
	
	private JTable table; 
	
	
	MPlayerPanel() 
	
	{
	
		this.setLayout(new BorderLayout());
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Top buttons and search
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JPanel buttonPanelTop = new JPanel();
		buttonPanelTop.setLayout(new GridLayout(1,5));
		
		findButton = new JButton("Find");
		findBox = new JTextField();
		clearSearchButton = new JButton("Clear");
		lSbutton = new JButton("Load");
		saveButton = new JButton("Save");
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Add to panel
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

		lSbutton.addActionListener(new MyButtonListener());
		saveButton.addActionListener(new MyButtonListener());
		
		findButton.addActionListener(new MyButtonListener());
		clearSearchButton.addActionListener(new MyButtonListener());
		
		buttonPanelTop.add(findButton);
		buttonPanelTop.add(findBox);
		
		buttonPanelTop.add(clearSearchButton);
		buttonPanelTop.add(lSbutton);
		buttonPanelTop.add(saveButton);
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Set playing panel and layout
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		
		this.add(buttonPanelTop, BorderLayout.NORTH);
		
		nowPlayingPanel = new JPanel();
		nowPlayingPanel.setLayout(new BoxLayout(nowPlayingPanel, BoxLayout.PAGE_AXIS));
		nowPlayingPanel.setPreferredSize(new Dimension(600, 200));
		
		
		JLabel nowPlay = new JLabel("Current Queue");
		nowPlay.setFont(new Font("Calibri Light", Font.PLAIN, 16));
		
		nowPlay.setForeground(Color.white);
		nowPlay.setAlignmentX(CENTER_ALIGNMENT);
		
		
		nowPlayingPanel.add(nowPlay);

		JPanel buttonPanelBottom = new JPanel();
		buttonPanelBottom.setLayout(new GridLayout(1,5));
		
		playButton = new JButton("Play");
		playButton.setOpaque(true);
		
		
		qButton = new JButton("Queue Song");
		clearQueue = new JButton("Clear Queue");
		sButton = new JButton("Pause");
		closeB = new JButton("Exit");

		playButton.addActionListener(new MyButtonListener());
		qButton.addActionListener(new MyButtonListener());
		
		
		clearQueue.addActionListener(new MyButtonListener());
		sButton.addActionListener(new MyButtonListener());
		closeB.addActionListener(new MyButtonListener());

		buttonPanelBottom.add(playButton);
		buttonPanelBottom.add(qButton);
		
		
		buttonPanelBottom.add(clearQueue);
		buttonPanelBottom.add(sButton);
		buttonPanelBottom.add(closeB);
		
		JPanel bottomPanels = new JPanel();
		bottomPanels.setLayout(new BoxLayout(bottomPanels, BoxLayout.PAGE_AXIS));
		
		
		bottomPanels.add(nowPlayingPanel);
		bottomPanels.add(buttonPanelBottom);
		
		playButton.setBorderPainted(false);
		playButton.setFocusPainted(false);
		playButton.setContentAreaFilled(false);
		playButton.setForeground(Color.WHITE);
		playButton.setBackground(new Color(46, 204, 113));
		playButton.setOpaque(true);
		playButton.setFont(new Font("Calibri Light", Font.ITALIC, 36));
		//Helvetica Neue,name=HelveticaNeue-UltraLight
		//playButton.setFont
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Style ui
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		findButton.setBorderPainted(false);
		findButton.setFocusPainted(false);
		findButton.setContentAreaFilled(false);
		findButton.setBackground(new Color(46, 204, 113));
		findButton.setForeground(Color.WHITE);
		findButton.setOpaque(true);
		findButton.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		
		clearSearchButton.setBorderPainted(false);
		clearSearchButton.setFocusPainted(false);
		clearSearchButton.setContentAreaFilled(false);
		clearSearchButton.setBackground(new Color(46, 204, 113));
		clearSearchButton.setForeground(Color.WHITE);
		clearSearchButton.setOpaque(true);
		clearSearchButton.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		
		lSbutton.setBorderPainted(false);
		lSbutton.setFocusPainted(false);
		lSbutton.setContentAreaFilled(false);
		lSbutton.setOpaque(true);
		lSbutton.setForeground(Color.WHITE);
		lSbutton.setBackground(new Color(46, 204, 113));
		lSbutton.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		
		
			
		saveButton.setBorderPainted(false);
		saveButton.setFocusPainted(false);
		saveButton.setContentAreaFilled(false);
		saveButton.setForeground(Color.WHITE);
		saveButton.setBackground(new Color(46, 204, 113));
		saveButton.setOpaque(true);
		saveButton.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		
		qButton .setBorderPainted(false);
		qButton .setFocusPainted(false);
		
		qButton .setContentAreaFilled(false);
		qButton.setBackground(new Color(46, 204, 113));
		qButton.setForeground(Color.WHITE);
		qButton.setOpaque(true);
		qButton.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		
		clearQueue.setBorderPainted(false);
		clearQueue.setFocusPainted(false);
		clearQueue.setContentAreaFilled(false);
		clearQueue.setBackground(new Color(46, 204, 113));
		
		clearQueue.setForeground(Color.WHITE);
		clearQueue.setOpaque(true);
		clearQueue.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		
		
		sButton .setBorderPainted(false);
		sButton .setFocusPainted(false);
		sButton .setContentAreaFilled(false);
		
		sButton.setBackground(new Color(46, 204, 113));
		sButton.setForeground(Color.WHITE);
		sButton.setOpaque(true);
		sButton.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		
		
		
		closeB.setBorderPainted(false);
		closeB.setFocusPainted(false);
		closeB.setContentAreaFilled(false);
		
		closeB.setBackground(new Color(46, 204, 113));
		closeB.setForeground(Color.WHITE);
		closeB.setOpaque(true);
		closeB.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		
		
//		button.setBorderPainted(false);
//		button.setFocusPainted(false);
//		button.setContentAreaFilled(false);
		
		
		buttonPanelTop.setBackground(new Color(52,73,94));
		nowPlayingPanel.setBackground(new Color(52,73,94));
		buttonPanelBottom.setBackground(new Color(52,73,94));
		bottomPanels.setBackground(new Color(52,73,94));
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Queue
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		
		updateUI();
		
		this.add(bottomPanels, BorderLayout.SOUTH);
	
		File songFile = new File ("songs.txt");
		if (songFile.exists())
		{
			mFunc.loadLibrary(songFile);
			mFunc.sortSongs();
			loadTable();
		}
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Load lib
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void loadTable()
	{
		if(!mainTable)
		{
			this.remove(scrollPane);
		}
		mainTable=false;
		
		int size = mFunc.librarySize();
		
		String[][] tableElems = new String[size][4];
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//	Load lib
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		
		String[] columnNames = {"Title", "Artist", "Album", "Genre"};
		
		for (int i=0; i<size; i++)
		{
			tableElems[i][0] = mFunc.getSong(i).songTitle;
			
			tableElems[i][1] = mFunc.getSong(i).artist;			
			
			tableElems[i][2] = mFunc.getSong(i).albumName;
			
			tableElems[i][3] = mFunc.getSong(i).genre;
		}
	
		
		table = new JTable(tableElems, columnNames);
		table.setBackground(new Color(52,73,94));
		table.setForeground(Color.WHITE);
		table.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		
		scrollPane = new JScrollPane(table);
		
		add(scrollPane, BorderLayout.CENTER );
		//update ui
		updateUI();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void loadTable(ArrayList<Song> searchSongs)
	{
		if (!mainTable)
		
		
		{
			this.remove(scrollPane);
		}
		
		
		mainTable = false;
		
		int size = searchSongs.size();
		
		String[][] tableElems = new String[size][4];
		
		String[] columnNames = {"Title", "Artist", "Album", "Genre"};
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//	Search table update
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		for (int i=0; i<size; i++)
		
		{
			tableElems[i][0] = searchSongs.get(i).songTitle;
			tableElems[i][1] = searchSongs.get(i).artist;
			tableElems[i][2] = searchSongs.get(i).albumName;
			tableElems[i][3] = searchSongs.get(i).genre;
		}
	
		
		JTable searchTable = new JTable(tableElems, columnNames);
		
		scrollPane = new JScrollPane(searchTable);
		
		add(scrollPane, BorderLayout.CENTER );
		
		updateUI();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Update
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void loadNowPlayingTable()
	{
		if (!callTable)
		{
			nowPlayingPanel.remove(nowPlayScroll);
			
		}
		
		callTable = false;
		
		
		
		ArrayList<Song> nowPlayingSongs = mFunc.getPlay();
		int size = nowPlayingSongs.size();
		String[][] tableElems = new String[size][2];
		String[] columnNames = {"Title", "Artist"};
		
		for (int i=0; i<size; i++)
		{
			tableElems[i][0] = nowPlayingSongs.get(i).songTitle;
			tableElems[i][1] = nowPlayingSongs.get(i).artist;
			
			
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Queue
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		qTable = new JTable(tableElems, columnNames);
		nowPlayScroll = new JScrollPane(qTable);
		nowPlayingPanel.add(nowPlayScroll);
		
		
		
		updateUI();
	}
	
	class MyButtonListener implements ActionListener 
	
	{

		public void actionPerformed(ActionEvent e) 
		
		{
			//Load Songs and file popup
			if (e.getSource() == lSbutton) 
			
			{
				JFileChooser chooser = new JFileChooser();
				
				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				
				int returnVal = chooser.showOpenDialog(getParent());
				
				if (returnVal==JFileChooser.APPROVE_OPTION)
				
				{
					File file = chooser.getSelectedFile();
					if (file.isDirectory())
					
					{
						mFunc.loadAllMP3(file);
					}
					if (file.isFile())
					
					{
						mFunc.loadSingleMP3(file);
					}
				}
				mFunc.sortSongs();
				loadTable();
			}
			
			
			
			//save text script
			else if (e.getSource() == saveButton)
			
			{
				JFileChooser chooser = new JFileChooser();
				int returnVal = chooser.showSaveDialog(getParent());
				if (returnVal==JFileChooser.APPROVE_OPTION)
				
				
				{
					File file = chooser.getSelectedFile();
					mFunc.saveLibrary(file);
				}
				
			}
			
			
			
			//load
			else if (e.getSource() == oButton) 
			
			{
				JFileChooser chooser = new JFileChooser();
				int returnVal = chooser.showOpenDialog(getParent());
				if (returnVal==JFileChooser.APPROVE_OPTION)
				
				
				{
					File file = chooser.getSelectedFile();
					mFunc.loadLibrary(file);
					mFunc.sortSongs();
					loadTable();
				}
			}
			
			
			//find
			else if (e.getSource() == findButton)
			
			{
				ArrayList<Song> foundSongs = mFunc.search(findBox.getText());
				loadTable(foundSongs);

			}
			
			
			//clear
			else if (e.getSource() == clearSearchButton)
			
			{
				findBox.setText(null);
				loadTable();
			}
			
			
			else if (e.getSource() == playButton)
			
			{
				int selectedSong = table.getSelectedRow();
				mFunc.playSong(selectedSong);
				loadNowPlayingTable();
				qTable.setBackground(new Color(52,73,94));
				qTable.setForeground(new Color(252,252,252));
			}
			
			
			else if(e.getSource() == qButton)
			
			{
				int selectedSong = table.getSelectedRow();
				mFunc.addToQueue(selectedSong);
				
				loadNowPlayingTable();
				qTable.setBackground(new Color(52,73,94));
				qTable.setForeground(new Color(252,252,252));
			}
			
			
			else if(e.getSource()==clearQueue)
			
			{
				mFunc.clearNowPlaying();
				loadNowPlayingTable();
				qTable.setBackground(new Color(52,73,94));
				qTable.setForeground(new Color(252,252,252));
			}
			
			//pause
			else if (e.getSource() == sButton)
			
			{
				mFunc.stopSong();
			}
			
			//close
			else if (e.getSource() == closeB) 
			
			{
				
				System.exit(0);
			}
		}
	}
	
	//MAIN
	public static void main(String[] args)
	
	{
		JFrame frame = new JFrame ("MPM Project 4.0 ");
	      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	      MPlayerPanel panel  = new MPlayerPanel();
	   
	      panel.setPreferredSize(new Dimension(900,420));
	      frame.getContentPane().add (panel);
	     
	      
	      frame.pack();
	      frame.setVisible(true);
	}	
}
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;







import java.util.ArrayList;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Arrange methonds for UI
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Manager 

{
	
	private SongLibrary songLib = new SongLibrary();
	private ArrayList<Song> nowPlaying = new ArrayList<Song>();
	private PlayerThread currThread;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Seclected song meth
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@SuppressWarnings("deprecation")
	public void playSong(int selectedSong)
	
	{
		if (currThread != null)
		
		{
			currThread.stopPlaying();
			currThread.stop();
		}
		nowPlaying.add(0, getSong(selectedSong));
		currThread = new PlayerThread(nowPlaying.get(0).songPath);
		currThread.start();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Queue ot array
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void addToQueue(int selectedSong)
	
	{
		nowPlaying.add(getSong(selectedSong));
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Pause thread
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void clearNowPlaying()
	
	{
		nowPlaying = new ArrayList<Song>();
		
		if (currThread !=null)
		
		{
			currThread.stopPlaying();
		}
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Pause
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("deprecation")
	public void stopSong()
	
	{
		currThread.stopPlaying();
		
		
		
		currThread.stop();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Switch thread/new
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void playNextSong(int nextSong)
	
	{
		currThread = new PlayerThread(nowPlaying.get(nextSong).songPath);
		
		
		currThread.start();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Load lib .mp3's
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void loadAllMP3(File f)
	
	{
		if (f.isFile())
		{
			String extension = ".mp3";
			String testFile = f.getPath().substring(f.getPath().length()-4, f.getPath().length());
			if (testFile.equals(extension))
			{
				loadSingleMP3(f);
			}
		}
		else
		
		{
			File[] files = f.listFiles();
			
			for(File currFile: files)
			{
				loadAllMP3(currFile);
			}
		}
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Load ***tag
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void loadSingleMP3(File f)
	{
		boolean contains = false;
		
		
		for (int i=0; i<songLib.librarySize(); i++)
		{
			if (songLib.getSong(i).songPath.equals(f.getPath()))
			{
				contains=true;
				break;
			}
		}
		if (contains == false)
		{
			AudioFile mFile1 = null;
			try 
			{
				mFile1 = AudioFileIO.read(f);
			} 
			catch (CannotReadException | IOException | TagException | ReadOnlyFileException | InvalidAudioFrameException e) 
			
			{
				e.printStackTrace();
			}
			Tag tag = mFile1.getTag();
			
			
			String title = tag.getFirst(FieldKey.TITLE);
			
			String artist = tag.getFirst(FieldKey.ARTIST);
			
			
			String album = tag.getFirst(FieldKey.ALBUM);
			
			String genre = tag.getFirst(FieldKey.GENRE);
		
			Song currSong = new Song (title, artist, album, genre, f.getPath());

			songLib.addSong(currSong);
		}
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Index get txt
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int librarySize()
	{
		return songLib.librarySize();
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Song get
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Song getSong(int i)
	{
		return songLib.getSong(i);
	}
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Alpha meth call
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void sortSongs()
	{
		songLib.sortSongLibrary();
	}
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Search lib
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public ArrayList<Song> search(String charz)
	{
		ArrayList<Song> songCheck = new ArrayList<Song>();
		for (int i=0; i<songLib.librarySize(); i++)
		
		{
			if (songLib.getSong(i).songTitle.contains(charz))
			
			{
				songCheck.add(songLib.getSong(i));
			}
			
			if (songLib.getSong(i).artist.contains(charz))
			
			{
				if (!songCheck.contains(songLib.getSong(i)))
				{
					songCheck.add(songLib.getSong(i));
				}
			}
		}
		return songCheck;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//2nd arrray 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	public ArrayList<Song> getPlay()
	{
		ArrayList<Song> playQQsong = new ArrayList<Song>();
		
		for(int i=0; i<nowPlaying.size(); i++)
		{
			playQQsong.add(nowPlaying.get(i));
		}
		
		return playQQsong;
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//save
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public void saveLibrary(File f)
	{
		songLib.saveLibrary(f);
	}
	
	
	
	
	public void loadLibrary(File f)
	{
		songLib.loadLibrary(f);
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Thread C for i/o Q play
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	class PlayerThread extends Thread
	
	{
		Player songPlayer;
		
		int currPlaying;
		
		PlayerThread(String filename)
		{
			FileInputStream file;
			
				try 
				{		
					file = new FileInputStream(filename);
					
					songPlayer = new Player(file);
					
					
					currPlaying = 0;
				} 
				
				catch (FileNotFoundException | JavaLayerException e) 
				
				{
					e.printStackTrace();
				}
			
		}
	//P
		public void run()
		
		{
			try
			
			{
				songPlayer.play();
			}
			
			catch(Exception e)
			
			{
				e.getMessage();
			}
			
			if (currPlaying < nowPlaying.size())
			{
				playNextSong(currPlaying+1);
			}
		}
		//S
		public void stopPlaying()
		
		{
			try
			
			{
				songPlayer.close();
			}
			
			catch(Exception e)
			
			
			{
				e.getMessage();
			}
		}
		///Q
		public void playNext(int nextSong)
		
		{
			FileInputStream nextSongFile = null;
			
			
			try 
			{
				nextSongFile = new FileInputStream (nowPlaying.get(nextSong).songPath);
				songPlayer = new Player(nextSongFile);
			} 
			catch (FileNotFoundException | JavaLayerException e) 
			
			{
				e.printStackTrace();
			}
		}
	}
}

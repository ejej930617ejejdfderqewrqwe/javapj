package d0321;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{
	private Player player;
	private boolean isloof;
	private File file;
	private FileInputStream fis;    
	private BufferedInputStream bis;
	
	public Music(String name, boolean isloof) {
		try {
			this.isloof = isloof;
			file = new File(Gui.class.getResource("../Music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int gettime() {
		if(player == null)
			return 0;
		return  player.getPosition();
	}
	
	public void close() {
		isloof = false;
		player.close();
		this.interrupt();
	}

	@Override
	public void run() {
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			}while(isloof);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	
	}
	

}

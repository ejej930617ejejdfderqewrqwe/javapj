package d0321;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Schedule extends JFrame {
	
	
	
private	JButton school, job, outdoor, indoor,study,club,gym,pc,cafe,conv,game,sleep,homework,
	        	health,date,ampark,alcohol,trip,shop;	
	
ImageIcon schoolbt,schoolbt2,jobbt,jobbt2,outbt,outbt2,inbt,inbt2,store1,store2;

static   JLabel schedule;
	
	

	
	
	

	
	
 public Schedule() {
		
	 	
	 	
	 	Gui.background = new ImageIcon(GameMain.class.getResource("../images/char.png" ))
				.getImage();
		


		Gui.p.setVisible(false);
		Gui.p2.setVisible(false);
		Gui.p3.setVisible(false);
		Gui.p4.setVisible(false);
		Gui.p5.setVisible(false);
		Gui.p6.setVisible(true);
		Gui.p8.setVisible(false);
		Gui.p9.setVisible(false);
		Gui.p10.setVisible(false);
	
		

					
		schedule = new JLabel();
		schedule.setBounds(30, 20, 400, 23);
		schedule.setVisible(true);
		schedule.setFont(new Font("맑은 고딕", Font.BOLD,20));
		schedule.setText("스케쥴을 선택하세요");
		Gui.p6.add(schedule);
		
		
		
		
		schoolbt = new ImageIcon("src/images/schoolbt.png");
		schoolbt2 = new ImageIcon("src/images/schoolbt2.png");
		jobbt = new ImageIcon("src/images/jobbt.png");
		jobbt2 = new ImageIcon("src/images/jobbt2.png");
		outbt = new ImageIcon("src/images/outbt.png");
		outbt2 = new ImageIcon("src/images/outbt2.png");
		inbt = new ImageIcon("src/images/inbt.png");
		inbt2 = new ImageIcon("src/images/inbt2.png");
		store1 = new ImageIcon("src/images/store1.png");
		store2 = new ImageIcon("src/images/store2.png");
		
		
		
		
		school = new JButton(schoolbt);
		job = new JButton(jobbt);
		outdoor = new JButton(outbt);
		indoor = new JButton(inbt);
		shop = new JButton(store1);
		shop.setBounds(900,150,200,80);
		shop.setFont(new Font("맑은고딕", Font.BOLD,20));
		
		shop.setBorderPainted(false);
		shop.setContentAreaFilled(false);
		shop.setFocusPainted(false);
		
		
		school.setBorderPainted(false);
		school.setContentAreaFilled(false);
		school.setFocusPainted(false);
		
		job.setBorderPainted(false);
		job.setContentAreaFilled(false);
		job.setFocusPainted(false);
		
		outdoor.setBorderPainted(false);
		outdoor.setContentAreaFilled(false);
		outdoor.setFocusPainted(false);
		
		
		indoor.setBorderPainted(false);
		indoor.setContentAreaFilled(false);
		indoor.setFocusPainted(false);
		
		school.setBounds(30,70,200,80);
		job.setBounds(230,70,200,80);
		outdoor.setBounds(30,150,200,80);
		indoor.setBounds(230,150,200,80);
		
		school.setFont(new Font("맑은 고딕", Font.BOLD,20));
		job.setFont(new Font("맑은 고딕", Font.BOLD,20));
		indoor.setFont(new Font("맑은 고딕", Font.BOLD,20));
		outdoor.setFont(new Font("맑은 고딕", Font.BOLD,20));
		

		
		shop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				shop.setIcon(store2);
				shop.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				shop.setIcon(store1);
				shop.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				school.setVisible(false);
				job.setVisible(false);
				indoor.setVisible(false);
				outdoor.setVisible(false);
				shop.setVisible(false);
				schedule.setVisible(false);
				
				Item i = new Item();
				
			}
		});
		
		Gui.p6.add(school);
		Gui.p6.add(job);
		Gui.p6.add(outdoor);
		Gui.p6.add(indoor);
		Gui.p6.add(shop);
		
		//------------------------알바 선택------------------------------------
		
		pc = new JButton("PC방");
		cafe = new JButton("카페");
		conv = new JButton("편의점");
		
		
		pc.setBounds(30,70,200,80);
		cafe.setBounds(230,70,200,80);
		conv.setBounds(430,70,200,80);
		
		
		pc.setFont(new Font("맑은 고딕", Font.BOLD,20));
		cafe.setFont(new Font("맑은 고딕", Font.BOLD,20));
		conv.setFont(new Font("맑은 고딕", Font.BOLD,20));
		
		pc.setVisible(false);
		cafe.setVisible(false);
		conv.setVisible(false);
		
		
		Gui.p6.add(pc);
		Gui.p6.add(cafe);
		Gui.p6.add(conv);
		
		job.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				job.setIcon(jobbt2);
				job.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				job.setIcon(jobbt);
				job.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				Gui.scdcount++;
				school.setVisible(false);
				job.setVisible(false);
				indoor.setVisible(false);
				outdoor.setVisible(false);
				
				Job job = new Job();
				job.J();
				
				
				
				
				
				/*
				schedule.setText("어떤 아르바이트를 하시겠습니까?");
				
				pc.setVisible(true);
				cafe.setVisible(true);
				conv.setVisible(true);
			*/	
			}
		});
		
		
		
	
		
		//----------------------------학교 선택 -------------------------------
		
		
		study = new JButton("study");
		club = new JButton("club");
		gym = new JButton("gym");
		
		
		study.setBounds(30,70,200,80);
		club.setBounds(230,70,200,80);
		gym.setBounds(430,70,200,80);
		
		
		study.setFont(new Font("맑은 고딕", Font.BOLD,20));
		club.setFont(new Font("맑은 고딕", Font.BOLD,20));
		gym.setFont(new Font("맑은 고딕", Font.BOLD,20));
		
		study.setVisible(false);
		club.setVisible(false);
		gym.setVisible(false);
		
		
		Gui.p6.add(study);
		Gui.p6.add(club);
		Gui.p6.add(gym);
		
		school.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseEntered(MouseEvent e) {
				school.setIcon(schoolbt2);
				school.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				school.setIcon(schoolbt);
				school.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				Gui.scdcount++;
				schedule.setVisible(false);
				school.setVisible(false);
				job.setVisible(false);
				indoor.setVisible(false);
				outdoor.setVisible(false);
				
				School school = new School();
				
				/*study.setVisible(true);
				club.setVisible(true);
				gym.setVisible(true);*/
				
			}
		});
		
		
		
		//----------------------------내부활동 선택--------------------------
		
		
		game = new JButton("game");
		sleep = new JButton("sleep");
		homework = new JButton("homework");
		
		
		game.setBounds(30,70,200,80);
		sleep.setBounds(230,70,200,80);
		homework.setBounds(430,70,200,80);
		
		
		game.setFont(new Font("맑은 고딕", Font.BOLD,20));
		sleep.setFont(new Font("맑은 고딕", Font.BOLD,20));
		homework.setFont(new Font("맑은 고딕", Font.BOLD,20));
		
		game.setVisible(false);
		sleep.setVisible(false);
		homework.setVisible(false);
		
		
		Gui.p6.add(game);
		Gui.p6.add(sleep);
		Gui.p6.add(homework);
		

		indoor.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				indoor.setIcon(inbt2);
				indoor.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				indoor.setIcon(inbt);
				indoor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				Gui.scdcount++;
				schedule.setVisible(false);
				school.setVisible(false);
				job.setVisible(false);
				indoor.setVisible(false);
				outdoor.setVisible(false);
				
		
				GuiIndoor gi = new GuiIndoor();
				
				
				
				
			}
		}); 
		
		
		health = new JButton("health");
		date = new JButton("date");
		alcohol = new JButton("alcohol");
		trip = new JButton("trip");
		ampark = new JButton("ampark");
		
		
		health.setBounds(30,70,200,80);
		trip.setBounds(230,70,200,80);
		alcohol.setBounds(30,150,200,80);
		ampark.setBounds(230,150,200,80);
		date.setBounds(430,110,200,80);
		
		
		health.setFont(new Font("맑은 고딕", Font.BOLD,20));
		date.setFont(new Font("맑은 고딕", Font.BOLD,20));
		alcohol.setFont(new Font("맑은 고딕", Font.BOLD,20));
		trip.setFont(new Font("맑은 고딕", Font.BOLD,20));
		ampark.setFont(new Font("맑은 고딕", Font.BOLD,20));
		
		health.setVisible(false);
		date.setVisible(false);
		alcohol.setVisible(false);
		trip.setVisible(false);
		ampark.setVisible(false);
		
		
	
		Gui.p6.add(health);
		Gui.p6.add(date);
		Gui.p6.add(alcohol);
		Gui.p6.add(trip);
		Gui.p6.add(ampark);
		
		
		outdoor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				outdoor.setIcon(outbt2);
				outdoor.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				outdoor.setIcon(outbt);
				outdoor.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Gui.scdcount++;
				
				
				schedule.setVisible(false);
				school.setVisible(false);
				job.setVisible(false);
				indoor.setVisible(false);
				outdoor.setVisible(false);
				
				OutDoor od = new OutDoor();
				
			}
		});
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	/*
	
	Scanner sc = new Scanner(System.in);
	
	int morning, afternoon,evening,night;
	
	
	
	//스케쥴 선택하는 메소드 
	public void select() {
	System.out.println("스케쥴 선택(press 1: 학교 , press 2: 아르바이트)");
	System.out.println("아침:");
	this.morning = sc.nextInt();
	
	
	
	System.out.println("점심:");
	this.afternoon = sc.nextInt();
	
	
	System.out.println("저녁:");
	this.evening = sc.nextInt();
	
	
	System.out.println("밤: ");
	this.night = sc.nextInt();
	
	

	
	}*/

	
	

}

package d0321;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Random;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import d0321.Music;

public class OutDoor extends JFrame{
	
	
	Random r = new Random(); 
	static int eventCount1 =0; 
	static int eventCount2 =0;
	
	private static JButton next = new JButton("next");
	private static JButton next2 = new JButton("next");

	
	private static JLabel sel = new JLabel("무엇을 하시겠습니까?");
	private static JLabel warning = new JLabel();
	
	private static JButton health = new JButton("health");
	private static JButton amusepark = new JButton("amusepark");
	private static JButton alcohol = new JButton("alcohol");
	private static JButton trip = new JButton("trip");
	
	
	//헬스장
	
	private static JLabel exer = new JLabel();
	private static JLabel exer1 = new JLabel();
	private static JLabel exer2 = new JLabel();
	private static JLabel exer3 = new JLabel();
	private static JLabel exer4 = new JLabel();
	
	private static JButton hbut = new JButton("BBM"); // 맨몸운동
	 // 맨몸운동
	private static JButton hbut1 = new JButton("Machine"); // 기계운동
	
    // 놀이동산 
	
	private static JLabel amp = new JLabel();
	private static JLabel amp1 = new JLabel();
	private static JLabel amp2 = new JLabel();
	private static JLabel amp3 = new JLabel();
	private static JLabel amp4 = new JLabel();
	
	private static JButton ambut = new JButton("Zairoad"); // 자이로드롭
	private static JButton ambut1 = new JButton("Viking"); // 바이킹
	private static JButton ambut2 = new JButton("RoomBreak"); // 

	// 여행
	
	private static JLabel tri = new JLabel();
	private static JLabel tri1 = new JLabel();
	private static JLabel tri2 = new JLabel();
	private static JLabel tri3 = new JLabel();
	private static JLabel tri4 = new JLabel();
	
	private static JButton tribut = new JButton("Beach"); // 바다
	private static JButton tribut1 = new JButton("Mountain"); // 산
	private static JButton tribut2 = new JButton("Celebration"); // 축제
	
	//음주
	
	private static JLabel alc = new JLabel();
	private static JLabel alc1 = new JLabel();
	private static JLabel alc2 = new JLabel();
	private static JLabel alc3 = new JLabel();
	private static JLabel alc4 = new JLabel();
	private static JLabel alc5 = new JLabel();
	
	private static JButton alcbut = new JButton("Cart bar"); // 포장마차
	private static JButton alcbut1 = new JButton("HOF"); // 기계운동
	private static JButton alcbut2 = new JButton("BAR"); // 바
	

	private static JButton alcsel = new JButton("1");
	private static JButton alcsel2 = new JButton("2");
	
	private static JButton alcbsel = new JButton("1");
	private static JButton alcbsel2 = new JButton("2");
	
	private static JButton alcqtrue = new JButton("O");
	private static JButton alcqfalse = new JButton("X");

	private static JButton alcqtrue1 = new JButton("X");
	private static JButton alcqfalse1 = new JButton("O");

	private static JButton alcqtrue2 = new JButton("O");
	
	//min max수치를 넘어가게 하지 않는 메세지 출력 라벨
	private static JLabel mmwar = new JLabel();
	private static JLabel mmwar1 = new JLabel();
	private static JLabel mmwar2 = new JLabel();
	private static JLabel mmwar3 = new JLabel();
	private static JLabel mmwar4 = new JLabel();

	
	
	
	public OutDoor() {
		
				Gui.p5.removeAll();
				
				Gui.p.setVisible(false);
				Gui.p2.setVisible(false);
				Gui.p3.setVisible(false);
				Gui.p4.setVisible(false);
				Gui.p5.setVisible(true);
				Gui.p6.setVisible(false);
		
		
				sel.setVisible(true);
				sel.setBounds(100, 10, 800, 100);
				sel.setFont(new Font("맑은고딕", Font.BOLD, 30));
				
				warning.setVisible(true);
				warning.setBounds(100, 10, 800, 100);
				warning.setFont(new Font("맑은고딕", Font.BOLD, 30));
				
				health.setBounds(800,170,80,50);
				amusepark.setBounds(900,170,80,50);
				alcohol.setBounds(1000,170,80,50);
				trip.setBounds(1100,170,80,50);
				
		        health.setFont(new Font("맑은고딕", Font.BOLD, 15));
		        amusepark.setFont(new Font("맑은고딕", Font.BOLD, 15));
		        alcohol.setFont(new Font("맑은고딕", Font.BOLD, 15));
		        trip.setFont(new Font("맑은고딕", Font.BOLD, 15));

				
		        mmwar.setVisible(false);
				mmwar.setBounds(100, 10, 800, 100);
				mmwar.setFont(new Font("맑은고딕", Font.BOLD,30));
				
				mmwar1.setVisible(false);
				mmwar1.setBounds(100, 45, 800, 100);
				mmwar1.setFont(new Font("맑은고딕", Font.BOLD,30));
				
				mmwar2.setVisible(false);
				mmwar2.setBounds(100, 80, 800, 100);
				mmwar2.setFont(new Font("맑은고딕", Font.BOLD,30));
				
				mmwar3.setVisible(false);
				mmwar3.setBounds(100, 115, 800, 100);
				mmwar3.setFont(new Font("맑은고딕", Font.BOLD,30));
				
				mmwar4.setVisible(false);
				mmwar4.setBounds(100, 150, 800, 100);
				mmwar4.setFont(new Font("맑은고딕", Font.BOLD,30));
				
				
				
		        exer.setVisible(false);
			    exer.setLayout(null);
		        exer.setBounds(100, 45, 700, 100);
		        exer.setFont(new Font("맑은고딕", Font.BOLD, 30));
			        
		    	
				exer1.setVisible(false);
				exer1.setLayout(null);
				exer1.setBounds(100, 10, 800, 100);
		        exer1.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
				
				exer2.setVisible(false);
				exer2.setLayout(null);
				exer2.setBounds(100, 80, 700, 100);
		        exer2.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
			
				exer3.setVisible(false);
				exer3.setLayout(null);
				exer3.setBounds(100, 115, 700, 100);
		        exer3.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
		        exer4.setVisible(false);
				exer4.setLayout(null);
				exer4.setBounds(100, 150, 700, 100);
		        exer4.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
		        

				hbut.setVisible(false);
				hbut.setBounds(100, 10, 800, 100);
				hbut.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				hbut1.setVisible(false);
				hbut1.setBounds(100, 45, 700, 100);
				hbut1.setFont(new Font("맑은고딕", Font.BOLD,15));
		              
		        
				next.setVisible(true);
				next.setBounds(300, 150, 700, 100);
				next.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				amp.setVisible(false);
				amp.setLayout(null);
				amp.setBounds(100, 10, 800, 100);
		        amp.setFont(new Font("맑은고딕", Font.BOLD, 30));
				
				
				amp1.setVisible(false);
				amp1.setLayout(null);
				amp1.setBounds(100, 45, 700, 100);
		        amp1.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
				
				amp2.setVisible(false);
				amp2.setLayout(null);
				amp2.setBounds(100, 80, 700, 100);
		        amp2.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
			
		    	amp3.setVisible(false);
				amp3.setLayout(null);
				amp3.setBounds(100, 115, 700, 100);
		        amp3.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
		    	amp4.setVisible(false);
				amp4.setLayout(null);
				amp4.setBounds(100, 150, 700, 100);
		        amp4.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
			
				ambut.setVisible(false);
				ambut.setBounds(850, 100, 80, 50);
				ambut.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				ambut1.setVisible(false);
				ambut1.setBounds(950, 100, 80, 50);
				ambut1.setFont(new Font("맑은고딕", Font.BOLD,15));
		        
				ambut2.setVisible(false);
				ambut2.setBounds(1050, 100, 120, 50);
				ambut2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				
				tri.setVisible(false);
				tri.setLayout(null);
				tri.setBounds(100, 10, 800, 100);
		        tri.setFont(new Font("맑은고딕", Font.BOLD, 30));
				
				
				tri1.setVisible(false);
				tri1.setLayout(null);
				tri1.setBounds(100, 45, 700, 100);
		        tri1.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
				
				tri2.setVisible(false);
				tri2.setLayout(null);
				tri2.setBounds(100, 80, 700, 100);
		        tri2.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
			
				tri3.setVisible(false);
				tri3.setLayout(null);
				tri3.setBounds(100, 115, 700, 100);
		        tri3.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
		        tri4.setVisible(false);
		        tri4.setLayout(null);
		        tri4.setBounds(100, 150, 700, 100);
		        tri4.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
		        
				tribut.setVisible(false);
				tribut.setBounds(800,170,80,50);
				tribut.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				tribut1.setVisible(false);
				tribut1.setBounds(900,170,80,50);
				tribut1.setFont(new Font("맑은고딕", Font.BOLD,15));
		        
				tribut2.setVisible(false);
				tribut2.setBounds(1000,170,80,50);
				tribut2.setFont(new Font("맑은고딕", Font.BOLD,15));
		         
		        
				alc.setVisible(false);
				alc.setLayout(null);
				alc.setBounds(100, 10, 800, 100);
		        alc.setFont(new Font("맑은고딕", Font.BOLD, 30));
				
				
				alc1.setVisible(false);
				alc1.setLayout(null);
				alc1.setBounds(100, 45, 700, 100);
		        alc1.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
				
				alc2.setVisible(false);
				alc2.setLayout(null);
				alc2.setBounds(100, 80, 700, 100);
		        alc2.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
			
				alc3.setVisible(false);
				alc3.setLayout(null);
				alc3.setBounds(100, 115, 700, 100);
		        alc3.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
		        alc4.setVisible(false);
				alc4.setLayout(null);
				alc4.setBounds(100, 150, 700, 100);
		        alc4.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
		        alc5.setVisible(false);
		        alc5.setLayout(null);
		        alc5.setBounds(100, 185, 700, 100);
		        alc5.setFont(new Font("맑은고딕", Font.BOLD, 30));
		        
		        
				alcbut.setVisible(false);
				alcbut.setBounds(800,170,80,50);
				alcbut.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				alcbut1.setVisible(false);
				alcbut1.setBounds(900,170,80,50);
				alcbut1.setFont(new Font("맑은고딕", Font.BOLD,15));
		        
				alcbut2.setVisible(false);
				alcbut2.setBounds(1000,170,80,50);
				alcbut2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				
				alcsel.setVisible(false);
				alcsel.setBounds(800,170,80,50);
				alcsel.setFont(new Font("맑은고딕", Font.BOLD,15));
		        
				alcsel2.setVisible(false);
				alcsel2.setBounds(900,170,80,50);
				alcsel2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				alcbsel.setVisible(false);
				alcbsel.setBounds(800,170,80,50);
				alcbsel.setFont(new Font("맑은고딕", Font.BOLD,15));
		        
				alcbsel2.setVisible(false);
				alcbsel2.setBounds(900,170,80,50);
				alcbsel2.setFont(new Font("맑은고딕", Font.BOLD,15));
		        
				alcqtrue.setVisible(false);
				alcqtrue.setBounds(800,170,80,50);
				alcqtrue.setFont(new Font("맑은고딕", Font.BOLD,15));
		        
				alcqfalse.setVisible(false);
				alcqfalse.setBounds(900,170,80,50);
				alcqfalse.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				alcqtrue1.setVisible(false);
				alcqtrue1.setBounds(800,170,80,50);
				alcqtrue1.setFont(new Font("맑은고딕", Font.BOLD,15));
		        
				alcqfalse1.setVisible(false);
				alcqfalse1.setBounds(900,170,80,50);
				alcqfalse1.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				alcqtrue2.setVisible(false);
				alcqtrue2.setBounds(800,170,80,50);
				alcqtrue2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				
				Gui.p5.add(exer);
				Gui.p5.add(exer1);
				Gui.p5.add(exer2);
				Gui.p5.add(exer3);
				Gui.p5.add(hbut);
				Gui.p5.add(hbut1);
			
				
				Gui.p5.add(amp);
				Gui.p5.add(amp1);
				Gui.p5.add(amp2);
				Gui.p5.add(amp3);
				Gui.p5.add(ambut);
				Gui.p5.add(ambut1);
				Gui.p5.add(ambut2);
				
				
				Gui.p5.add(tri);
				Gui.p5.add(tri1);
				Gui.p5.add(tri2);
				Gui.p5.add(tri3);
				Gui.p5.add(tribut);
				Gui.p5.add(tribut1);
				Gui.p5.add(tribut2);
				
				
				Gui.p5.add(alc);
				Gui.p5.add(alc1);
				Gui.p5.add(alc2);
				Gui.p5.add(alc3);
				Gui.p5.add(alc4);
				
				Gui.p5.add(alcbut);
				Gui.p5.add(alcbut1);
				Gui.p5.add(alcbut2);
				
				Gui.p5.add(alcsel);
				Gui.p5.add(alcsel2);
				
				Gui.p5.add(alcbsel);
				Gui.p5.add(alcbsel2);

				Gui.p5.add(alcqtrue);
				Gui.p5.add(alcqfalse);
				
				Gui.p5.add(alcqtrue1);
				Gui.p5.add(alcqfalse1);
				
				Gui.p5.add(alcqtrue2);
				
				Gui.p5.add(health);
				Gui.p5.add(amusepark);
				Gui.p5.add(alcohol);
				Gui.p5.add(trip);
				Gui.p5.add(sel);
				Gui.p5.add(warning);
				
				Gui.p5.add(mmwar);
				Gui.p5.add(mmwar1);
				Gui.p5.add(mmwar2);
				Gui.p5.add(mmwar3);
				Gui.p5.add(mmwar4);
				
							
						Gui.background = new ImageIcon(GameMain.class.getResource("../Images/store.jpg"))
								.getImage();
				
			
					health.setVisible(true);
					amusepark.setVisible(true);
					alcohol.setVisible(true);
					trip.setVisible(true);


			health.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music m = new Music("but1.mp3", false);
					m.start();
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/gym2.jpg"))
							.getImage();
					if(Person.money<5000) {
						warning.setVisible(true);
						warning.setText("소지금이 부족하여 실행할 수 없습니다.");
						Job.next();
						sel.setVisible(false);
						next.setVisible(false);
						exer1.setVisible(false);
						exer2.setVisible(false);
						exer3.setVisible(false);
						exer4.setVisible(false);
					}
					
					else {	
					health.setVisible(false);
					amusepark.setVisible(false);
					alcohol.setVisible(false);
					trip.setVisible(false);
					sel.setVisible(false);

			exer.setVisible(false);
			next.setVisible(true);
			exer1.setVisible(true);
			exer2.setVisible(true);
			exer3.setVisible(true);
			exer4.setVisible(true);
			
			hbut.setVisible(false);
			hbut1.setVisible(false);
			if(Person.stress<5) {
				mmwar.setVisible(true);
				 exer1.setVisible(false);
				mmwar.setText("스트레스 수치가 최저(0) 입니다.");
			 Person.stress =0;
			
			}else {
				Person.stress -=5;
			}
			if(Person.hp<10) {
				mmwar1.setVisible(true);
				mmwar1.setText("HP 수치가 최저(0) 입니다.");
				Person.hp=0;
			}else {
				Person.hp -=10;
			}
		/*	if(Person.mental>=97) {
				mmwar4.setVisible(true);
				mmwar4.setText("맨탈 수치가 최대 입니다.");
				Person.mental=100;
			}else {
								
			}*/
			
			    Person.mental+=3;
				Person.money -=5000;
				
			
			
			exer1.setText("스트레스가 5 만큼 감소했습니다");
			exer2.setText("자금이 5000 만큼 감소했습니다.");
			exer3.setText("체력이 10 떨어졌습니다.");
			exer4.setText("맨탈이 3 증가했습니다.");
			
			
			Job.next();
					}
				}
		});	//리스너 end
								
				amusepark.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						Gui.background = new ImageIcon(GameMain.class.getResource("../Images/amuse.jpg"))
								.getImage();
						sel.setVisible(false);
						if(Person.money<5000) {
							
							warning.setVisible(true);
							warning.setText("소지금이 부족하여 실행할 수 없습니다.");
							Job.next();
							
							next.setVisible(false);
							Gui.p5.setVisible(true);
							amp.setVisible(false);
							ambut.setVisible(false);
							ambut1.setVisible(false);
							ambut2.setVisible(false);						
							
						}
						else {
						warning.setVisible(false);
						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
			
						next.setVisible(false);
						Gui.p5.setVisible(true);
						amp.setVisible(true);
						ambut.setVisible(true);
						ambut1.setVisible(true);
						ambut2.setVisible(true);
				  
						amp.setText("어느 기구를 이용하시겠습니까.");
						Gui.p5.add(next);
					
						}				
					}
			});	//리스너 end

				
				//자이로드롭
				ambut.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ZAI.jpg"))
								.getImage();
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
						
						
				amp.setVisible(false);
				ambut.setVisible(false);
				ambut1.setVisible(false);
				ambut2.setVisible(false);
				amp.setVisible(false);
				amp1.setVisible(true);
				amp2.setVisible(true);
				amp3.setVisible(true);
				
				if(Person.stress<=15) {
					mmwar1.setVisible(true);
					 amp1.setVisible(false);
					mmwar1.setText("스트레스 수치가 최저(0) 입니다.");
				 Person.stress =0;
				
				}else {
					Person.stress -=15;
				}
				if(Person.hp<=5) {
					mmwar2.setVisible(true);
					mmwar2.setText("HP 수치가 최저(0) 입니다.");
					 amp2.setVisible(false);
					Person.hp=0;
				}else {
					Person.hp -=5;
				}
				
				
				
				
					Person.money -=5000;
					
					
				
				amp1.setText("스트레스가 15 만큼 감소했습니다");
				amp2.setText("자금이 5000 만큼 감소했습니다.");
				amp3.setText("체력이 5 떨어졌습니다.");
				Job.next();
				
				int rd = r.nextInt(10);
				
				if(rd < 9 && eventCount2 ==0 ) {
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ZAI.jpg"))
							.getImage();
					sel.setVisible(false);
					health.setVisible(false);
					amusepark.setVisible(false);
					alcohol.setVisible(false);
					trip.setVisible(false);
					amp.setVisible(true);
					//amp1.setVisible(true);
					amp2.setVisible(true);
					amp3.setVisible(true);
					amp4.setVisible(true);
					mmwar.setVisible(false);
					mmwar1.setVisible(false);
					if(Person.hp<=15) {
						mmwar1.setVisible(true);
						mmwar1.setText("HP 수치가 최저(0) 입니다.");
						 amp2.setVisible(false);
						 amp3.setVisible(true);
						 amp4.setVisible(true);
					}else{
						Person.hp -=15;	
					}if(Person.attract<=10) {
						mmwar2.setVisible(true);
						mmwar2.setText("매력 수치가 최저(0) 입니다.");
						 amp4.setVisible(true);
						 amp3.setVisible(false);
					}else {
						Person.attract -=10;
					}
					 
						
						Person.money -=5000;
						
					amp.setText(" (자이로드롭을 견딜수 없어 구토를 시작합니다.)");
					amp2.setText(" 체력이 -15 만큼 감소했습니다.");
					amp3.setText(" 매력이 -10 만큼 감소했습니다.");
					amp4.setText(" 자금이 -5000 만큼 감소했습니다.");
				} 
				eventCount2++;
			
				
					}
			});	//리스너 end
				
				//

				ambut1.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
			
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
						
						exer.setVisible(false);
						
						amp.setVisible(false);
						amp1.setVisible(true);
						amp2.setVisible(true);
						//amp3.setVisible(true);
						
						ambut.setVisible(false);
						ambut1.setVisible(false);
						ambut2.setVisible(false);
				
						if(Person.stress<=15) {
							Person.stress=0;
						}else {
							 Person.stress -=15;
						}if(Person.hp<=5) {				
							Person.hp=0;
						}else {
							Person.hp -=5;
						}
						
							Person.money -=5000;
							
				
				amp1.setText("스트레스가 15 만큼 감소했습니다");
				amp2.setText("자금이 5000 만큼 감소했습니다.");
				amp3.setText("체력이 5 떨어졌습니다.");
				//amp4.setText("맨탈이 3 증가했습니다.");
				Job.next();
				
				
				
			int rd = r.nextInt(10);
				
				if(rd > 4 && eventCount2 ==0) {
					sel.setVisible(false);
					health.setVisible(false);
					amusepark.setVisible(false);
					alcohol.setVisible(false);
					trip.setVisible(false);
					amp1.setVisible(true);
					amp2.setVisible(true);
					amp3.setVisible(true);
					
					if(Person.stress<=97) {
						Person.stress=100;
					}else {
						 Person.stress +=3;
					}if(Person.hp<=15) {				
						Person.hp=0;
					}else {
						Person.hp -=15;
					}
					
					
						Person.stress +=3;
						//Person.money -=5000;
						
					amp1.setText(" 바이킹 고장 이벤트 발생 ");
					amp2.setText(" 30분간 바이킹에 고정됐습니다.");
					amp3.setText(" 스트레스가 3 만큼 증가했습니다.");
					amp4.setText(" 체력이 -15 만큼 감소했습니다.");
				} 
				eventCount2++;
				
							}
			});
				
				//방탈출 카페		
						
				ambut2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						
						
						Gui.background = new ImageIcon(GameMain.class.getResource("../Images/RoomEscape.jpg"))
								.getImage();
						if(Person.money<25000) {
							
							warning.setVisible(true);
							warning.setText("소지금이 부족하여 실행할 수 없습니다.");
							Job.next();
							
							next.setVisible(false);
							Gui.p5.setVisible(true);
							amp.setVisible(false);
							ambut.setVisible(true);
							ambut1.setVisible(true);
							ambut2.setVisible(false);	
							
							amp1.setVisible(false);
							amp2.setVisible(false);
							amp3.setVisible(false);
							
							alcqtrue.setVisible(false);
							alcqfalse.setVisible(false);
							
						}
						
					
						else {
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
			
						exer.setVisible(false);
					
						
						amp1.setVisible(true);
						amp2.setVisible(true);
						amp3.setVisible(true);
						//amp4.setVisible(true);
						amp.setVisible(false);
						ambut.setVisible(false);
						ambut1.setVisible(false);
						ambut2.setVisible(false);
				
						alcqtrue.setVisible(true);
						alcqfalse.setVisible(true);
						
				//정답 O			
				amp1.setText("탈출을 위해 퀴즈를 풀어주세요");
				amp2.setText("달팽이도 이빨이 있는가?");
				amp3.setText("1. O, 2. X");
						}
					}
			});	
				
				alcqtrue.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						
						Music m = new Music("but1.mp3", false);
						m.start();
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
					
						exer.setVisible(false);
			
						amp1.setVisible(false);
						amp2.setVisible(false);
						amp3.setVisible(false);
						//정답 x	
						amp1.setText("탈출을 위해 퀴즈를 풀어주세요");
						amp2.setText("세계 최초의 올림픽은 에리조나 올림픽이다.");
						amp3.setText("1. O, 2. X");
						
					
							//Person.money -=5000;
						
						
						amp1.setVisible(true);
						amp2.setVisible(true);
						amp3.setVisible(true);
						//amp4.setVisible(true);
						amp.setVisible(false);
						ambut.setVisible(false);
						ambut1.setVisible(false);
						ambut2.setVisible(false);
				
						alcqtrue.setVisible(false);
						alcqfalse.setVisible(false);
						
						alcqfalse1.setVisible(true);
						alcqtrue1.setVisible(true);
						
					}
			});		
				
				alcqtrue1.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
					
						exer.setVisible(false);
			
						amp1.setVisible(false);
						amp2.setVisible(false);
						amp3.setVisible(false);
						//정답 x	
						amp1.setText("탈출을 위해 퀴즈를 풀어주세요");
						amp2.setText("물고기는 기침을 한다.");
						amp3.setText("1. O, 2. X");
							
									
						amp1.setVisible(true);
						amp2.setVisible(true);
						amp3.setVisible(true);
						//amp4.setVisible(true);
						amp.setVisible(false);
						ambut.setVisible(false);
						ambut1.setVisible(false);
						ambut2.setVisible(false);
				
						alcqfalse1.setVisible(false);
						alcqtrue1.setVisible(false);
						
						alcqfalse.setVisible(true);
						alcqtrue2.setVisible(true);
						
						Job.next();
					}
			});		
				
				
				
				alcqtrue2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
					
						exer.setVisible(false);
			
						amp1.setVisible(false);
						amp2.setVisible(false);
						amp3.setVisible(false);
						//정답 x	
						
						amp1.setText("모든 문제를 맞추고 탈출에 성공하셨습니다.");
						amp2.setText("스트레스가 20만큼 감소했습니다.");
						amp3.setText("지능이 10만큼 증가했습니다.");
						amp4.setText("자금이 25000만큼 감소했습니다.");	
						
						if(Person.stress<=20) {
							Person.stress=0;
						}else {
							 Person.stress -=20;
						}if(Person.iq<=90) {				
							Person.iq=100;
						}else {
							Person.iq +=10;
						}
						
					
						
						Person.money -=25000;
						
									
						amp1.setVisible(true);
						amp2.setVisible(true);
						amp3.setVisible(true);
						amp4.setVisible(true);
						amp.setVisible(false);
						ambut.setVisible(false);
						ambut1.setVisible(false);
						ambut2.setVisible(false);
				
						alcqfalse.setVisible(false);
						alcqtrue2.setVisible(false);
		
					}
			});		
					
				
				
				alcqfalse.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						sel.setVisible(false);
						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
						exer.setVisible(false);
						amp1.setVisible(false);
						amp2.setVisible(false);
						amp3.setVisible(false);
						
						 if(Person.stress>=97) {
								Person.stress=100;
							}else {
								Person.stress +=3;
							}						
													
							 Person.money -=25000;
						amp1.setVisible(true);
						amp2.setVisible(true);
						amp3.setVisible(true);
						amp.setVisible(false);
						ambut.setVisible(false);
						ambut1.setVisible(false);
						ambut2.setVisible(false);
				
						alcqtrue1.setVisible(true);
						alcqfalse1.setVisible(true);
						
						amp1.setText("오답!!! 방 탈출에 실패하셨습니다.");
						amp2.setText("자금이 25000 만큼 감소했습니다.");
						amp3.setText("스트레스가 3만큼 증가했습니다");
									
						Job.next();
					}
			});				
				
				
				alcqfalse1.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						
						sel.setVisible(false);
						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
						exer.setVisible(false);
						amp1.setVisible(false);
						amp2.setVisible(false);
						amp3.setVisible(false);
						
						if(Person.stress>=97) {
							Person.stress=100;
						}else {
							Person.stress +=3;
						}
						
						 Person.money -=25000;
							
					
						amp1.setVisible(true);
						amp2.setVisible(true);
						amp3.setVisible(true);
						amp.setVisible(false);
						ambut.setVisible(false);
						ambut1.setVisible(false);
						ambut2.setVisible(false);
				
						alcqtrue1.setVisible(true);
						alcqfalse1.setVisible(true);
						
						amp1.setText("오답!!! 방 탈출에 실패하셨습니다.");
						amp2.setText("자금이 25000 만큼 감소했 습니다.");
						amp3.setText("스트레스가 3만큼 증가했습니다");
									
						Job.next();
					}
			});		
				
				
				
				
				
				
				
				
				
				

				alcohol.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						sel.setVisible(true);
						
						Gui.background = new ImageIcon(GameMain.class.getResource("../Images/alcol.jpg"))
								.getImage();
						if(Person.money<15000) {
							warning.setVisible(true);
							warning.setText("소지금이 부족하여 실행할 수 없습니다.");
							Job.next();
							sel.setVisible(false);
							next.setVisible(false);
							
							alc.setVisible(false);
							alcbut.setVisible(false);
							alcbut1.setVisible(false);
							alcbut2.setVisible(false);
						
							
						}
						else {
					
						sel.setVisible(false);
						warning.setVisible(false);
						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
						
						next.setVisible(false);
						Gui.p5.setVisible(true);
						alc.setVisible(true);
						alcbut.setVisible(true);
						alcbut1.setVisible(true);
						alcbut2.setVisible(true);
				  
						alc.setText("어디서 술을 먹겠습니까.");
						Gui.p5.add(next);

						}
					}
				});
			

				alcbut.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						
						
				
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
			
				alc.setVisible(false);
				alcbut.setVisible(false);
				alcbut1.setVisible(false);
				alcbut2.setVisible(false);
				alc.setVisible(false);
				alc1.setVisible(true);
				alc2.setVisible(true);
				alc3.setVisible(true);
				alc4.setVisible(true);
				alcsel.setVisible(false);
				alcsel2.setVisible(false);
			
				
				if(Person.stress<=7) {
					Person.stress=0;
				}else {
					 Person.stress -=7;
				}if(Person.hp<=5) {
					Person.hp =0;
				}else {
					Person.hp -=5;
				}if(Person.alc>=85) {
					Person.alc=100;
				}else {
					Person.alc +=15;
				}
				
				
				
					Person.money -=15000;
					
					Person.alc +=15;
				
				
				alc1.setText("스트레스가 15 만큼 감소했습니다");
				alc2.setText("자금이 15000 만큼 감소했습니다.");
				alc3.setText("체력이 5 떨어졌습니다.");
				alc4.setText("혈중알콜이 15 증가했습니다.");
				
				Job.next();
				
				int rd = r.nextInt(10);
				
				if(rd > 0 && eventCount2 ==0) {
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/yNBznGn1_400x400.jpg"))
							.getImage();
					sel.setVisible(false);
					health.setVisible(false);
					amusepark.setVisible(false);
					alcohol.setVisible(false);
					trip.setVisible(false);
					alc1.setVisible(true);
					alc2.setVisible(true);
					alc3.setVisible(true);
					alc4.setVisible(true);
					alcsel.setVisible(true);
					alcsel2.setVisible(true);
					
										
					alc1.setText(" 취객 이벤트 발생(나를 쳐다본다)");
					alc2.setText(" 뭐라고 하시겠습니까?");
					alc3.setText(" 1. 뭘보냐고 중지 손가락을 펴준다");
					alc4.setText(" 2. 그냥 무시한다.");
				} 
				eventCount2++;
			
					}
			});	//리스너 end
				
				alcsel.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						
				if(Person.hp < 20) {	
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ambulance.jpg"))
							.getImage();
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
			
				alc.setVisible(false);
				alcbut.setVisible(false);
				alcbut1.setVisible(false);
				alcbut2.setVisible(false);
				alc.setVisible(false);
				alc1.setVisible(true);
				alc2.setVisible(true);
				alc3.setVisible(true);
				alc4.setVisible(true);
				alcsel.setVisible(false);
				alcsel2.setVisible(false);
			
				if(Person.stress<=7) {
					Person.stress=0;
				}else {
					 Person.stress -=7;
				}if(Person.hp<=5) {
					Person.hp =0;
				}else {
					Person.hp -=5;
				}if(Person.alc>=85) {
					Person.alc=100;
				}else {
					Person.alc +=15;
				}
				
				
				

					Person.money -=15000;

				
				
				alc1.setText("한대 맞고 기절했습니다.");
				alc2.setText("체력이 5 감소했습니다.");
				alc3.setText("자금이 15000 감소했습니다.");
				alc4.setText("혈중알콜이 15 증가했습니다.");
				Job.next();
				eventCount2++;
				
				}else if(Person.hp>22){
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/yNBznGn1_400x400.jpg"))
							.getImage();
					
					sel.setVisible(false);

					health.setVisible(false);
					amusepark.setVisible(false);
					alcohol.setVisible(false);
					trip.setVisible(false);
					
					if(Person.money<=75000) {
						
					}
		
			alc.setVisible(false);
			alcbut.setVisible(false);
			alcbut1.setVisible(false);
			alcbut2.setVisible(false);
			alc.setVisible(false);
			alc1.setVisible(true);
			alc2.setVisible(true);
			alc3.setVisible(true);
			alc4.setVisible(true);
			alcsel.setVisible(false);
			alcsel2.setVisible(false);
		
			if(Person.stress<=7) {
				Person.stress=0;
			}else {
				 Person.stress -=7;
			}if(Person.alc>=85) {
				Person.alc=100;
			}else {
				Person.alc +=15;
			}
			

				Person.money -=75000;

			
			
			alc1.setText("취객에게 승리! 주인이 기물파손비를 요구합니다.");
			alc2.setText("스트레스가 7만큼 감소했습니다");
			alc3.setText("자금이 75000 감소했습니다.");
			alc4.setText("혈중알콜이 15 증가했습니다.");
			Job.next();
			eventCount2++;	
					
				}

					}
			});		
				
				
				alcsel2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
			
						
			
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/run.jpg"))
							.getImage();
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
			
				alc.setVisible(false);
				alcbut.setVisible(false);
				alcbut1.setVisible(false);
				alcbut2.setVisible(false);
				alc.setVisible(false);
				alc1.setVisible(true);
				alc2.setVisible(true);
				alc3.setVisible(true);
				alc4.setVisible(true);
				alcsel.setVisible(false);
				alcsel2.setVisible(false);
			
				if(Person.stress<=7) {
					Person.stress=0;
				}else {
					 Person.stress -=7;
				}if(Person.hp<=5) {
					Person.hp =0;
				}else {
					Person.hp -=5;
				}if(Person.alc>=85) {
					Person.alc=100;
				}else {
					Person.alc +=15;
				}
				
			
					Person.money -=15000;
				
				
				
				alc1.setText("술자리에서 황급히 도망갑니다");
				alc2.setText("체력이 20 감소했습니다.");
				alc3.setText("자금이 15000 감소했습니다.");
				alc4.setText("혈중알콜이 15 증가했습니다.");
				Job.next();
				eventCount2++;
				
				
			
				
				
				
				
					}
			});		
					
	
				alcbut1.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						
						if(Person.money<20000) {
							warning.setVisible(true);
							warning.setText("소지금이 부족하여 실행할 수 없습니다.");
							Job.next();
							
							next.setVisible(false);
							Gui.p5.setVisible(true);
							alc.setVisible(false);
							alcbut.setVisible(true);
							alcbut1.setVisible(true);
							alcbut2.setVisible(true);				
							
						}
						
						else {
							
							sel.setVisible(false);

							health.setVisible(false);
							amusepark.setVisible(false);
							alcohol.setVisible(false);
							trip.setVisible(false);
				
							exer.setVisible(false);
							
							alc.setVisible(false);
							alc1.setVisible(true);
							alc2.setVisible(true);
							alc3.setVisible(true);
							alc4.setVisible(true);
							
							alcbut.setVisible(false);
							alcbut1.setVisible(false);
							alcbut2.setVisible(false);
					
							if(Person.stress<=10) {
								Person.stress=0;
							}else {
								 Person.stress -=7;
							}if(Person.hp<=5) {
								Person.hp =0;
							}else {
								Person.hp -=5;
							}if(Person.alc>=90) {
								Person.alc=100;
							}else {
								Person.alc +=10;
							}
							
						
								Person.money -=20000;
							
							
					alc1.setText("스트레스가 10 만큼 감소했습니다");
					alc2.setText("자금이 20000 만큼 감소했습니다.");
					alc3.setText("체력이 5 떨어졌습니다.");
					alc4.setText("혈중알콜 이 10 증가했습니다.");
					Job.next();
					
						}
				
					}
			});
				
				
				
				alcbut2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						sel.setVisible(false);
						Gui.background = new ImageIcon(GameMain.class.getResource("../Images/bargirl.jpg"))
								.getImage();
						if(Person.money<25000) {
							
							warning.setVisible(true);
							warning.setText("소지금이 부족하여 실행할 수 없습니다.");
							Job.next();
							
							next.setVisible(false);
							Gui.p5.setVisible(true);
							alc.setVisible(false);
							alcbut.setVisible(true);
							alcbut1.setVisible(true);
							alcbut2.setVisible(true);	
							
						}
						
						else {
							
							health.setVisible(false);
							amusepark.setVisible(false);
							alcohol.setVisible(false);
							trip.setVisible(false);
				
							exer.setVisible(false);
							alc.setVisible(false);
							alc1.setVisible(true);
							alc2.setVisible(true);
							alc3.setVisible(true);
							alc4.setVisible(true);
							
							alcbut.setVisible(false);
							alcbut1.setVisible(false);
							alcbut2.setVisible(false);
					
							if(Person.stress<=15) {
								Person.stress=0;
							}else {
								 Person.stress -=15;
							}if(Person.hp<=5) {
								Person.hp =0;
							}else {
								Person.hp -=5;
							}if(Person.alc>=93) {
								Person.alc=100;
							}else {
								Person.alc +=7;
							}
																		
								Person.money -=25000;
					
					
								alc1.setText("스트레스가 15 만큼 감소했습니다");
								alc2.setText("자금이 25000 만큼 감소했습니다.");
								alc3.setText("체력이 5 떨어졌습니다.");
								alc4.setText("혈중알콜 이 7 증가했습니다.");
								Job.next();
					
								
								int rd = r.nextInt(10);
								if(rd > 0 && eventCount2 ==0) {
									Gui.background = new ImageIcon(GameMain.class.getResource("../Images/bargirl.jpg"))
											.getImage();
									sel.setVisible(false);
									health.setVisible(false);
									amusepark.setVisible(false);
									alcohol.setVisible(false);
									trip.setVisible(false);
									alc1.setVisible(true);
									alc2.setVisible(true);
									alc3.setVisible(true);
									alc4.setVisible(true);
									alcbsel.setVisible(true);
									alcbsel2.setVisible(true);
									alc.setVisible(false);
						
										
									alc1.setText(" 눈앞에 내가 그리던 이상형이 보인다!!");
									alc2.setText(" 말을 걸어 보시겠습니까?");
									alc3.setText(" 1. 예");
									alc4.setText(" 2. 아니오"); //이벤트 추가 할 것
								} 
								eventCount2++;
							
							
						}
					
							
							
					}
			});
				
				alcbsel.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
			
	              if(Person.money<60000) {
							
							warning.setVisible(true);
							warning.setText("소지금이 부족하여 대시불가 합니다.");
							
							Job.next();
							
							next.setVisible(false);
							Gui.p5.setVisible(true);
							alc.setVisible(false);
							alcbut.setVisible(false);
							alcbut1.setVisible(false);
							alcbut2.setVisible(false);
							alc1.setVisible(true);
							alc2.setVisible(true);
							alc3.setVisible(true);
							alc4.setVisible(true);
							alcbsel.setVisible(false);
							alcbsel2.setVisible(false);
							if(Person.stress<=5) {
								Person.stress=0;
							}else {
								 Person.stress -=5;
							}if(Person.hp<=5) {
								Person.hp =0;
							}else {
								Person.hp -=5;
							}if(Person.alc>=93) {
								Person.alc=100;
							}else {
								Person.alc +=7;
							}
							
						
								Person.money -=25000;
								
								Person.alc +=7;
					
					
								alc1.setText("조용히 먹고 집으로 갑니다.");
								alc2.setText("스트레스가 5 만큼 감소했습니다");
								alc3.setText("자금이 25000 만큼 감소했습니다.");
								alc4.setText("체력이 5 떨어졌습니다.");
								alc5.setText("혈중알콜 이 7 증가했습니다.");
								
								Job.next();			
							
							
						}		
						
						
				if(Person.attract > 0) {	
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/OTL.jpg"))
							.getImage();
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
			
				alc.setVisible(false);
				alcbut.setVisible(false);
				alcbut1.setVisible(false);
				alcbut2.setVisible(false);
				alc.setVisible(false);
				alc1.setVisible(true);
				alc2.setVisible(true);
				alc3.setVisible(true);
				alc4.setVisible(true);
				alcsel.setVisible(false);
				alcsel2.setVisible(false);
				alcbsel.setVisible(false);
				alcbsel2.setVisible(false);
				
				 
					Person.money -=35000;
				
					if(Person.stress<=30) {
						Person.stress=0;
					}else {
						 Person.stress -=30;
					}if(Person.hp<=5) {
						Person.hp =0;
					}else {
						Person.hp -=5;
					}if(Person.alc>=90) {
						Person.alc=100;
					}else {
						Person.alc +=10;
					}
				
				alc1.setText("이상형이 호감을 보입니다.");
				alc2.setText("즐거운 시간 후 번호를 받았습니다!");
				alc3.setText("자금이 60000 감소했습니다.");
				alc4.setText("혈중알콜이 10 증가했습니다.");
				alc5.setText("스트레스가 30 감소했습니다.");
				Job.next();
				eventCount2++;
				
				}else if(Person.attract<0){
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/yNBznGn1_400x400.jpg"))
							.getImage();
					
					sel.setVisible(false);

					health.setVisible(false);
					amusepark.setVisible(false);
					alcohol.setVisible(false);
					trip.setVisible(false);
		
					alc.setVisible(false);
					alcbut.setVisible(false);
					alcbut1.setVisible(false);
					alcbut2.setVisible(false);
					alc.setVisible(false);
					alc1.setVisible(true);
					alc2.setVisible(true);
					alc3.setVisible(true);
					alc4.setVisible(true);
					alc5.setVisible(true);
					alcsel.setVisible(false);
					alcsel2.setVisible(false);
					alcbsel.setVisible(false);
					alcbsel2.setVisible(false);
					
					if(Person.stress>=90) {
						Person.stress=100;
					}else {
						 Person.stress +=10;
					}if(Person.mental<=20) {
						Person.mental =0;
					}else {
						Person.mental -=20;
					}if(Person.alc>=85) {
						Person.alc=100;
					}else {
						Person.alc +=15;
					}
					
					
		
				Person.money -=35000;
				Person.alc +=15;
				Person.mental -=20;
			
			alc1.setText("매몰차게 거절 당했습니다.");
			alc2.setText("스트레스가 10 증가 했습니다.");
			alc3.setText("자금이 35000 감소 했습니다.");
			alc4.setText("혈중알콜이 15 증가 했습니다.");
			alc5.setText("맨탈이 20 감소 했습니다.");
			Job.next();
			eventCount2++;	
					
				}
				
					}
			});				
				
				
				alcbsel2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
			
	              if(Person.money<60000) {
							
							warning.setVisible(true);
							warning.setText("소지금이 부족하여 대시불가 합니다.");
							
							Job.next();
							
							next.setVisible(false);
							Gui.p5.setVisible(true);
							alc.setVisible(false);
							alcbut.setVisible(false);
							alcbut1.setVisible(false);
							alcbut2.setVisible(false);
							alc1.setVisible(true);
							alc2.setVisible(true);
							alc3.setVisible(true);
							alc4.setVisible(true);
							alcbsel.setVisible(false);
							alcbsel2.setVisible(false);
							if(Person.stress<=5) {
								Person.stress=0;
							}else {
								 Person.stress -=5;
							}if(Person.hp<=5) {
								Person.hp =0;
							}else {
								Person.hp -=5;
							}if(Person.alc>=93) {
								Person.alc=100;
							}else {
								Person.alc +=7;
							}
							
						
								Person.money -=25000;
								
								Person.alc +=7;
					
					
								alc1.setText("조용히 먹고 집으로 갑니다.");
								alc2.setText("스트레스가 5 만큼 감소했습니다");
								alc3.setText("자금이 25000 만큼 감소했습니다.");
								alc4.setText("체력이 5 떨어졌습니다.");
								alc5.setText("혈중알콜 이 7 증가했습니다.");
								
								Job.next();			
							
							
						}
	              
					}
				});				
					
				
				
				
				
				
				
				trip.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						Gui.background = new ImageIcon(GameMain.class.getResource("../Images/trip.jpg"))
								.getImage();
						sel.setVisible(false);
						if(Person.money<20000) {
							warning.setVisible(true);
							warning.setText("소지금이 부족하여 실행할 수 없습니다.");
							Job.next();
							
							next.setVisible(false);
							Gui.p5.setVisible(true);
							tri.setVisible(false);
							tribut.setVisible(false);
							tribut1.setVisible(false);
							tribut2.setVisible(false);
							
						}
						else {
						sel.setVisible(false);

						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
						
						next.setVisible(false);
						Gui.p5.setVisible(true);
						tri.setVisible(true);
						tribut.setVisible(true);
						tribut1.setVisible(true);
						tribut2.setVisible(true);

						tri.setText("어디로 가시겠습니까.");
						Gui.p5.add(next);
						}
						
					}
				});

			
			tribut.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music m = new Music("but1.mp3", false);
					m.start();
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/beach.jpg"))
				.getImage();
					sel.setVisible(false);
					if(Person.money<30000) {
						warning.setVisible(true);
						warning.setText("소지금이 부족하여 실행할 수 없습니다.");
						Job.next();
						
						next.setVisible(false);
						Gui.p5.setVisible(true);
						tri.setVisible(false);
						tribut.setVisible(false);
						tribut1.setVisible(true);
						tribut2.setVisible(true);
						
					}
					
					else {
						tri.setVisible(false);
						tribut.setVisible(false);
						tribut1.setVisible(false);
						tribut2.setVisible(false);
						tri.setVisible(false);
						tri1.setVisible(true);
						tri2.setVisible(true);
						tri3.setVisible(true);
						tri4.setVisible(true);
						
						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);
						
						if(Person.stress<=30) {
							Person.stress=0;
						}else {
							 Person.stress -=30;
						}if(Person.mental>=90) {
							Person.mental =100;
						}else {
							Person.mental +=10;
						}if(Person.hp<=10) {
							Person.hp=0;
						}else {
							Person.hp -=10;
						}
						
						
						Person.money -=30000;
							
						
						
						
						
						tri1.setText("스트레스가 30 만큼 감소했습니다");
						tri2.setText("자금이 30000 만큼 감소했습니다.");
						tri3.setText("체력이 10 떨어졌습니다.");
						tri4.setText("맨탈이 10 증가했습니다.");
						Job.next();
						
					}
			
				}
		});	//리스너 end

			tribut1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music m = new Music("but1.mp3", false);
					m.start();
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/mountain.jpg"))
							.getImage();
					
					sel.setVisible(false);
					if(Person.money<50000) {
						warning.setVisible(true);
						warning.setText("소지금이 부족하여 실행할 수 없습니다.");
						Job.next();
						
						next.setVisible(false);
						Gui.p5.setVisible(true);
						tri.setVisible(false);
						tribut.setVisible(true);
						tribut1.setVisible(true);
						tribut2.setVisible(true);
					
					}else {
						
						health.setVisible(false);
						amusepark.setVisible(false);
						alcohol.setVisible(false);
						trip.setVisible(false);


						tri.setVisible(false);
						tribut.setVisible(false);
						tribut1.setVisible(false);
						tribut2.setVisible(false);
						tri.setVisible(false);
						tri1.setVisible(true);
						tri2.setVisible(true);
						tri3.setVisible(true);
						tri4.setVisible(true);
						Person.money -=20000;
						if(Person.stress<=20) {
							Person.stress=0;
						}else {
							 Person.stress -=20;
						}if(Person.mental>=85) {
							Person.mental =100;
						}else {
							Person.mental +=15;
						}if(Person.hp<=15) {
							Person.hp=0;
						}else {
							Person.hp -=15;
						}
					}
					
					
		
					

					
					
					tri1.setText("스트레스가 20 만큼 감소했습니다");
					tri2.setText("자금이 20000 만큼 감소했습니다.");
					tri3.setText("체력이 15 떨어졌습니다.");
					tri4.setText("맨탈이 15 증가했습니다.");
					Job.next();
						}
				});
			
			tribut2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music m = new Music("but1.mp3", false);
					m.start();
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/celebra.jpg"))
							.getImage();
					sel.setVisible(false);
					
					if(Person.money<50000) {
						warning.setVisible(true);
						warning.setText("소지금이 부족하여 실행할 수 없습니다.");
						Job.next();
						
						next.setVisible(false);
						Gui.p5.setVisible(true);
						tri.setVisible(false);
						tribut.setVisible(true);
						tribut1.setVisible(true);
						tribut2.setVisible(true);
					
					}
					else {
						Person.money -=50000;
					health.setVisible(false);
					amusepark.setVisible(false);
					alcohol.setVisible(false);
					trip.setVisible(false);

					tri.setVisible(false);
					tribut.setVisible(false);
					tribut1.setVisible(false);
					tribut2.setVisible(false);
					tri.setVisible(false);
					tri1.setVisible(true);
					tri2.setVisible(true);
					tri3.setVisible(true);
					tri4.setVisible(true);
					
					if(Person.stress<=40) {
						Person.stress=0;
					}else {
						 Person.stress -=40;
					}if(Person.mental>=80) {
						Person.mental =100;
					}else {
						Person.mental +=20;
					}if(Person.hp<=10) {
						Person.hp=0;
					}else {
						Person.hp -=10;
					}
					
					
					
						
					
					
					
					tri1.setText("스트레스가 40 만큼 감소했습니다");
					tri2.setText("자금이 50000 만큼 감소했습니다.");
					tri3.setText("체력이 10 떨어졌습니다.");
					tri4.setText("맨탈이 20 증가했습니다.");
					Job.next();
					}
						}
				});

	}
		
	



	
}

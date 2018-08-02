
package d0321;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class GuiIndoor  {

	
	
	Random r = new Random(); 
	static int eventCount1 =0; 
	static int eventCount2 =0;

	//행동버튼
	 JButton gamebnt;
	  JButton sleepbnt;
	  JButton studybnt ;
	  JButton gopcbnt;
	  JLabel doselect  ;

	//다음 버튼
	  JButton gamenext;
	  JButton sleepnext;
	  JButton studynext;
	  JButton gopcnext;
	  JButton gamenext2;
	  JButton sleepnext2;
	  JButton studynext2 ;
	  JButton gopcnext2;
	  JLabel start;
	
	//게임하기 이벤트
	  JButton game1;
	  JButton game2;
	  JButton game3;
	  JLabel gamela1;
	  JLabel gamela2;
	  JLabel gamela3;
	  JLabel eventgamela;
	//pc 방 이벤트
	  JButton pc1;
	  JButton pc2 ;
	
	
	public GuiIndoor() {
		
			Gui.p2.removeAll();
		
			Gui.p.setVisible(false);
			Gui.p2.setVisible(true);
			Gui.p3.setVisible(false);
			Gui.p4.setVisible(false);
			Gui.p5.setVisible(false);
			Gui.p6.setVisible(false);
			
			

		  gamebnt = new JButton("game");
		    sleepbnt = new JButton("sleep");
		    studybnt = new JButton("study");
		    gopcbnt = new JButton("gopc");
		    doselect = new JLabel("어떤 일을 하시겠습니까?");

		//다음 버튼
		    gamenext = new JButton("next");
		    sleepnext = new JButton("next");
		    studynext = new JButton("next");
		    gopcnext = new JButton("next");
		    gamenext2 = new JButton("next");
		    sleepnext2 = new JButton("next");
		    studynext2 = new JButton("next");
		    gopcnext2= new JButton("next");
		    start = new JLabel();
		
		//게임하기 이벤트
		    game1 = new JButton("1");
		    game2 = new JButton("2");
		    game3 = new JButton("3");
		    gamela1 = new JLabel();
		    gamela2 = new JLabel();
		    gamela3 = new JLabel();
		    eventgamela = new JLabel();
		//pc 방 이벤트
		    pc1 = new JButton("1");
		    pc2 = new JButton("2");
		
		
		
		
		
		Gui.background = new ImageIcon(GameMain.class.getResource("../Images/Indoor.png"))
				.getImage();
		
		
				//대화상자
				
			
				
				
				
				//선택 라벨/p
				doselect.setVisible(true);
				doselect.setBounds(100, 65, 500, 100);
				doselect.setFont(new Font("맑은고딕", Font.BOLD, 30));
				//활동 선택버튼
				gamebnt.setVisible(true);
				gamebnt.setBounds(800, 170, 80, 50);
				gamebnt.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				sleepbnt.setVisible(true);
				sleepbnt.setBounds(900, 170, 80, 50);
				sleepbnt.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				studybnt.setVisible(true);
				studybnt.setBounds(1000, 170, 80, 50);
				studybnt.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				gopcbnt.setVisible(true);
				gopcbnt.setBounds(1100, 170, 80, 50);
				gopcbnt.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				// ~~ 하는중 + 다음버튼 / p2
				start.setVisible(true);
				start.setBounds(100, 65, 500, 100);
				start.setFont(new Font("맑은고딕", Font.BOLD, 30));
				
				gamenext2.setVisible(false);
				gamenext2.setBounds(1100, 170, 80, 50);
				gamenext2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				studynext2.setVisible(false);
				studynext2.setBounds(1100, 170, 80, 50);
				studynext2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				sleepnext2.setVisible(false);
				sleepnext2.setBounds(1100, 170, 80, 50);
				sleepnext2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				gopcnext2.setVisible(false);
				gopcnext2.setBounds(1100, 170, 80, 50);
				gopcnext2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				//게임 이벤트 /p3
				
				game1.setVisible(false);
				game1.setBounds(800, 170, 80, 50);
				game1.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				game2.setVisible(false);
				game2.setBounds(900, 170, 80, 50);
				game2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				game3.setVisible(false);
				game3.setBounds(1000, 170, 80, 50);
				game3.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				pc1.setVisible(false);
				pc1.setBounds(800, 170, 80, 50);
				pc1.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				pc2.setVisible(false);
				pc2.setBounds(900, 170, 80, 50);
				pc2.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				gamela3.setVisible(false);
				gamela3.setBounds(100, 115, 700, 100);
				gamela3.setFont(new Font("맑은고딕", Font.BOLD, 30));
				
				gamela1.setVisible(false);
				gamela1.setBounds(100, 45, 700, 100);
				gamela1.setFont(new Font("맑은고딕", Font.BOLD, 30));
				
				gamela2.setVisible(false);
				gamela2.setBounds(100, 80, 700, 100);
				gamela2.setFont(new Font("맑은고딕", Font.BOLD, 30));
				
				eventgamela.setVisible(false);
				eventgamela.setBounds(100, 10, 800, 100);
				eventgamela.setFont(new Font("맑은고딕", Font.BOLD, 30));
				//다음버튼 /p3
				gamenext.setVisible(false);
				gamenext.setBounds(1100, 170, 80, 50);
				gamenext.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				studynext.setVisible(false);
				studynext.setBounds(1100, 170, 80, 50);
				studynext.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				sleepnext.setVisible(false);
				sleepnext.setBounds(1100, 170, 80, 50);
				sleepnext.setFont(new Font("맑은고딕", Font.BOLD,15));
				
				gopcnext.setVisible(false);
				gopcnext.setBounds(1100, 170, 80, 50);
				gopcnext.setFont(new Font("맑은고딕", Font.BOLD,15));
					
				Gui.p2.add(doselect);
				Gui.p2.add(gamebnt);
				Gui.p2.add(sleepbnt);
				Gui.p2.add(studybnt);
				Gui.p2.add(gopcbnt);
		
				
				Gui.p2.add(start);
				Gui.p2.add(gamenext2);
				Gui.p2.add(sleepnext2);
				Gui.p2.add(studynext2);
				Gui.p2.add(gopcnext2);
			
				
				Gui.p2.add(game1);
				Gui.p2.add(game2);
				Gui.p2.add(game3);
				Gui.p2.add(gamela1);
				Gui.p2.add(gamela2);
				Gui.p2.add(gamela3);
				Gui.p2.add(eventgamela);
				Gui.p2.add(pc1);
				Gui.p2.add(pc2);
				Gui.p2.add(gamenext);
				Gui.p2.add(sleepnext);
				Gui.p2.add(studynext);
				Gui.p2.add(gopcnext);
				
			
				
				gamebnt.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						
						Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/Ingame.jpg"))
								.getImage();
						setv(false);
						Gui.p2.setVisible(true);
						start.setVisible(true);
						start.setText("!게임중!");
						gamenext2.setVisible(true);
						int rd = r.nextInt(10);
						
				
	
						// 게임하기 이벤트 시작
						if(rd > 8 && eventCount2 ==0) {
							
							setv(false);
							eventgamela.setVisible(true);
							gamela1.setVisible(true);
							gamela2.setVisible(true);
							gamela3.setVisible(true);
							game1.setVisible(true);
							game2.setVisible(true);
							game3.setVisible(true);
							gamenext.setVisible(false);
							eventgamela.setText("-엄마 : 아이고 이게 뭐야 개밥 썩은내가나네-");
							gamela1.setText(" (1. 알았어 엄마 내가 치울께 아~좀!)");
							gamela2.setText(" (2. 원래 이렇게 사는거야 엄마)");
							gamela3.setText(" (3. 아 엄마알겠어~ 용돈 좀 주고가~)");
							eventCount2++;
							
						} 
						
						
					}
			}); // 게임하기 이벤트 끝
	
				// 게임 랜덤이벤트 1 시작
				game1.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						
						Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/Ingame.jpg"))
								.getImage();
						
						
						setv(false);
						game1.setVisible(false);
						game2.setVisible(false);
						game3.setVisible(false);
						gamela3.setVisible(true);
						gamela2.setVisible(true);
						eventgamela.setVisible(true);
						gamenext.setVisible(false);
						
						Job.next();
						eventgamela.setText("!엄마에게 등짝을 맞았다!");
						Person.stress += 2;
						Person.hp -= 10;
						gamela2.setText("스트레스가 10 증가했습니다. 총:"+Person.stress);
						gamela3.setText("체력이 10 감소했습니다. 총:"+Person.hp);
						
						if (Person.stress < 0) {
							Person.stress =0;
						}
						
						
						
						
					
					}});		
				// 게임 랜덤이벤트 1 끝
				
				// 게임 랜덤이벤트 2 시작
				game2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/Ingame.jpg"))
								.getImage();
						setv(false);
						game1.setVisible(false);
						game2.setVisible(false);
						game3.setVisible(false);
						eventgamela.setVisible(true);
						gamela1.setVisible(false);
						gamela2.setVisible(true);
						gamela3.setVisible(true);
						gamenext.setVisible(true);
						eventgamela.setText("!엄마에게 등짝을 맞았다!");
						Person.hp -= 10;
						Person.stress += 10;
						gamela2.setText("스트레스가 10 증가했습니다. 총:"+Person.stress);
						gamela3.setText("체력이 10 감소했습니다. 총:"+Person.hp);
						if (Person.stress < 0) {
							Person.stress =0;
						}
						
					}});		
				// 게임 랜덤이벤트 2 끝
				
				// 게임 랜덤이벤트 3 시작
				game3.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						
						Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/Ingame.jpg"))
								.getImage();
						setv(false);
						game1.setVisible(false);
						game2.setVisible(false);
						game3.setVisible(false);
						eventgamela.setVisible(true);
						gamela1.setVisible(true);
						gamela2.setVisible(true);
						gamela3.setVisible(true);
						gamenext.setVisible(true);
						eventgamela.setText("!엄마에게 등짝을 맞았다!");
						Person.money += 30000;
						Person.hp -= 15;
						Person.stress += 5;
						gamela1.setText("자금이 30000원 증가했습니다. 총:"+Person.money);
						gamela2.setText("체력이 15 감소했습니다. 총:"+Person.hp);
						gamela3.setText("스트레스가 5 증가했습니다. 총:"+Person.stress);
						if (Person.stress < 0) {
							Person.stress =0;
						}
						
						
					
					}});	
				// 게임 랜덤이벤트 3 끝

				// 게임-p3다음 버튼
				gamenext.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						setv(false);
						eventgamela.setVisible(true);
						gamela2.setVisible(true);
						gamela1.setVisible(false);
						gamela3.setVisible(false);
						gamenext.setVisible(false);
						
						
						Person.stress -=20;
						gamela2.setText("스트레스가 20 감소했습니다. 총: " +Person.stress);
						eventgamela.setText("!게임끝!");
						if (Person.stress < 0) {
							Person.stress =0;
						}
						Job.next();
					}});	
				// 게임-p2다음 버튼
				gamenext2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						
						setv(false);
						eventgamela.setVisible(true);
						gamela2.setVisible(true);
						gamela1.setVisible(false);
						gamela3.setVisible(false);
						gamenext.setVisible(false);
						Person.stress -=20;
						gamela2.setText("스트레스가 20 감소했습니다. 총: " +Person.stress);
						if (Person.stress < 0) {
							Person.stress =0;
						}
						eventgamela.setText("!게임끝!");
						Job.next();
					}});	 // gamebtn end
				
				// 슬립버튼 시작
				sleepbnt.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();	
							Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/Insleep.jpg"))
									.getImage();
							setv(false);
							start.setVisible(true);
							start.setText("Zz자는중zZ");
							sleepnext2.setVisible(true);
						
					}});			
			// 슬립-p2다음 버튼
			sleepnext2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Music m = new Music("but1.mp3", false);
					m.start();
					
					setv(false);
					eventgamela.setVisible(true);
					gamela1.setVisible(true); 
					gamela2.setVisible(true);
					gamela3.setVisible(true);
					Person.stress -=20;
					Person.hp +=30;
					Person.mental +=20;
					eventgamela.setText("!!잘잤당!!");
					gamela1.setText("스트레스가 20감소했습니다. 총: " +Person.stress);
					gamela2.setText("체력이 30증가했습니다. 총: " +Person.hp);
					gamela3.setText("정신력이 20증가했습니다. 총: " +Person.mental);
					if (Person.stress < 0) {
						Person.stress =0;
					}
					Job.next();
				}});
			//sleep 버튼 end

			// study 버튼 시작
			studybnt.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music m = new Music("but1.mp3", false);
					m.start();
					if(Person.hp < 5) {
						Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/pi.jpg"))
								.getImage();
						setv(false);
						start.setVisible(true);
						start.setText("피곤해.. 가서 자..");
						
						Job.next();
					}else {
					Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/Instudy.jpg"))
							.getImage();
					setv(false);
					start.setVisible(true);
					start.setText("!!공부중!! ");
					studynext2.setVisible(true);
					}
					}});
			//스터디-p2다음 버튼
			studynext2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Music m = new Music("but1.mp3", false);
					m.start();
					
					setv(false);
					gamela1.setVisible(true); 
					gamela2.setVisible(true);
					gamela3.setVisible(true);
					eventgamela.setVisible(true);
					Person.stress +=10;
					Person.hp -=5;
					Person.grade +=10;
					eventgamela.setText("!!공부끝!!");	
					gamela1.setText("스트레스가 10 증가했습니다. 총: " +Person.stress);	
					gamela2.setText("체력이 5감소했습니다. 총: " +Person.hp);
					gamela3.setText("학점이 10증가했습니다. 총: " +Person.grade);
					if (Person.stress < 0) {
						Person.stress =0;
					}
					Job.next();
				}
			});	 // study 버튼 끝
			
			// pc방 가기 시작
			//=-------------------------------------------------------------------수정시작 0405/4:33
			gopcbnt.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music m = new Music("but1.mp3", false);
					m.start();
					
					if(Person.money < 5000) {
					Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/jung.jpg"))
							.getImage();
					setv(false);
					start.setVisible(true);
					start.setText("돈없어.. 집에가..");
					Job.next();
					}else {
					Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/Ingopc.png"))
							.getImage();
					setv(false);
					start.setVisible(true);
					start.setText("!피방가는길 ㅎ!");
					gopcnext2.setVisible(true);
					int rd = r.nextInt(10);
					
					// pc방 이벤트 시작
					if(rd < 2 && eventCount1 == 0) {
						
						setv(false);
						eventgamela.setVisible(true);
						gamela1.setVisible(true);
						gamela2.setVisible(true);
						gamela3.setVisible(true);
						game1.setVisible(false);
						game2.setVisible(false);
						game3.setVisible(false);
						eventgamela.setText("※※능력치 두배 이벤트 발생※※");
						Person.stress -= 15;
						gopcnext.setVisible(true);
						gamela2.setText("스트레스가 15감소했습니다"+ Person.stress);
						if (Person.stress < 0) {
							Person.stress =0;
						}
						eventCount1 ++;
					} // 이벤트 1 끝
					
					if(rd > 8 && eventCount2 ==0) {
						setv(false);
						eventgamela.setVisible(true);
						gamela1.setVisible(true);
						gamela2.setVisible(true);
						gamela3.setVisible(true);
						game1.setVisible(false);
						game2.setVisible(false);
						game3.setVisible(false);
						gopcnext.setVisible(false);
						pc1.setVisible(true);
						pc2.setVisible(true);
						eventgamela.setText("※유니크 아이템 획득!※");
						gamela1.setText("-유니크 아이템을 획득하였습니다-");
						gamela2.setText(" (1. 가진다)");
						gamela3.setText(" (2. 갖다 팔아버린다)");

						eventCount2++;
					}
						
					} // 이벤트 2 끝
				}
		}); // pc방 이벤트 끝
	//---------------------------------------------------------------------------수정끝		
			// pc 방 이벤트1 시작
			pc2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music m = new Music("but1.mp3", false);
					m.start();
					
					Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/Ingopc.png"))
							.getImage();
					setv(false);
					pc1.setVisible(false);
					pc2.setVisible(false);
					gopcnext.setVisible(true);
					gamela1.setVisible(false);
					eventgamela.setVisible(true);
					eventgamela.setText("-아이템을 팔았습니다-");
					Person.mental += 30000;
					Person.stress -= 10;
					gamela2.setText("스트레스가 10 감소했습니다. 총: "+Person.stress);
					gamela3.setText("자금이 30000원 증가했습니다. 총: "+Person.money);
					if (Person.stress < 0) {
						Person.stress =0;
					}
					
				}});	
			// pc 방 이벤트1 끝

			// pc 방 이벤트 2 시작
			pc1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music m = new Music("but1.mp3", false);
					m.start();
					
					Gui.background = new ImageIcon(GuiIndoor.class.getResource("../Images/Ingopc.png"))
							.getImage();
					setv(false);
					pc1.setVisible(false);
					pc2.setVisible(false);
					gopcnext.setVisible(true);
					gamela1.setVisible(false);
					eventgamela.setVisible(true);
					gamela3.setVisible(false);
					eventgamela.setText("-아이템을 가졌습니다-");
					Person.stress -= 15;
					gamela2.setText("스트레스가 15 감소했습니다. 총:"+Person.stress);
					if (Person.stress < 0) {
						Person.stress =0;
					}
			
				}});		
			// pc방 이벤트 2 끝
			
		// 게임-p3다음 버튼
		gopcnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
			
				setv(false);
				Gui.p2.setVisible(true);
				gopcnext.setVisible(false);
				gamela1.setVisible(true);
				eventgamela.setVisible(true);
				gamela2.setVisible(true);
				gamela3.setVisible(true);
				Person.stress -=15;
				Person.money -=3000;
				Person.grade -=5;
				//eventgamela.setVisible(true);
				eventgamela.setText("!게임끝!");
				gamela1.setText("스트레스가 15 감소했습니다. 총: " +Person.stress);	
				gamela2.setText("자금이 3000 감소했습니다. 총: " +Person.money);
				gamela3.setText("학점이 5 감소했습니다. 총: " +Person.grade);
				if (Person.stress < 0) {
					Person.stress =0;
				}
				if (Person.grade < 0) {
					Person.grade =0;
				}
				Job.next();
			}});	
		
		// 게임-p2다음 버튼
		gopcnext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				Gui.p2.setVisible(true);
				setv(false);
				gopcnext2.setVisible(false);
				gamela3.setVisible(true);
				gamela1.setVisible(true);
				eventgamela.setVisible(true);
				gamela2.setVisible(true);
				Person.stress -=15;
				Person.money -=5000;
				Person.grade -=5;
				//eventgamela.setVisible(true);
				eventgamela.setText("!게임끝!");
				gamela1.setText("스트레스가 15 감소했습니다. 총: " +Person.stress);	
				gamela2.setText("자금이 5000 감소했습니다. 총: " +Person.money);
				gamela3.setText("학점이 5 감소했습니다. 총: " +Person.grade);
				if (Person.stress < 0) {
					Person.stress =0;
				}
				if (Person.grade < 0) {
					Person.grade =0;
				}
				Job.next();
			}});							
		// pc방 가기 버튼 끝
	};// 생성자 끝	


	
	
	
	


	public void setv(boolean f) {

		doselect.setVisible(f);
		gamebnt.setVisible(f);
		sleepbnt.setVisible(f);
		studybnt.setVisible(f);
		gopcbnt.setVisible(f);

		game2.setVisible(f);
		game3.setVisible(f);
		pc1.setVisible(f);
		pc2.setVisible(f);
		gamela3.setVisible(f);
		gamela1.setVisible(f);
		eventgamela.setVisible(f);
		gamela2.setVisible(f);
		Gui.nextButton.setVisible(f);
		
		
		start.setVisible(f);
		gamenext2.setVisible(f);
		studynext2.setVisible(f);
		sleepnext2.setVisible(f);
		sleepnext2.setVisible(f);
		gopcnext2.setVisible(f);
		gamenext.setVisible(f);
		studynext.setVisible(f);

		sleepnext.setVisible(f);

		gopcnext.setVisible(f);


		
		
		}
	
	







	

	
	
}
	
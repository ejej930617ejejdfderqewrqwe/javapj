package d0321;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Job extends JFrame implements MouseListener{
	
	private JButton pcButton,cafeButton,conbiButton;
	private JButton conA, conB;
	private JButton b1,b2,b3,b4,b5,b6;
	private JLabel t0,t1,t2,t3,t4;
	Random r = new Random(); 
	static int eventCount1 =0; 
	static int eventCount2 =0;
	
	
	public void J() {
		
		
		Gui.p4.removeAll();

		
		t1 = new JLabel();
		t2 = new JLabel();
		t3 = new JLabel();
		t4 = new JLabel();
		
		Gui.p2.removeAll();

		Gui.p.setVisible(false);
		Gui.p2.setVisible(false);
		Gui.p3.setVisible(false);
		Gui.p4.setVisible(true);
		Gui.p5.setVisible(false);
		Gui.p6.setVisible(false);

	
		pcButton = new JButton("pc");
		pcButton.setBounds(800, 170, 80, 50);
			
		cafeButton = new JButton("카페");
		cafeButton.setBounds(900, 170, 80, 50);
		
		conbiButton = new JButton("편의점");
		conbiButton.setBounds(1000, 170, 80, 50);
		
		pcButton.setFont(new Font("맑은고딕", Font.BOLD,15));
		cafeButton.setFont(new Font("맑은고딕", Font.BOLD,15));
		conbiButton.setFont(new Font("맑은고딕", Font.BOLD,15));
		
		conA = new JButton("추궁");
		conA.setBounds(800, 170, 80, 50);
		conA.setFont(new Font("맑은고딕", Font.BOLD,15));
		
		conB = new JButton("제압");
		conB.setBounds(900, 170, 80, 50);
		conB.setFont(new Font("맑은고딕", Font.BOLD,15));
		
		b1 = new JButton("next");
		b1.setBounds(1100, 170, 80, 50);
		b1.setFont(new Font("맑은고딕", Font.BOLD,15));
			
		b2 = new JButton("next");
		b2.setBounds(1100, 170, 80, 50);
		b2.setFont(new Font("맑은고딕", Font.BOLD,15));
		
		b3 = new JButton("next");
		b3.setBounds(1100, 170, 80, 50);
		b3.setFont(new Font("맑은고딕", Font.BOLD,15));
		
		b4 = new JButton("next");
		b4.setBounds(1100, 170, 80, 50);
		b4.setFont(new Font("맑은고딕", Font.BOLD,15));
		// 편의점 다음버튼
		
		b5 = new JButton("next");
		b5.setBounds(1100, 170, 80, 50);
		b5.setFont(new Font("맑은고딕", Font.BOLD,15));
		// 편의점 이벤트 1 다음
		
		b6 = new JButton("next");
		b6.setBounds(1100, 170, 80, 50);
		b6.setFont(new Font("맑은고딕", Font.BOLD,15));
		// 편의점 이벤트 2 다음
		
		Gui.p4.add(pcButton);
		Gui.p4.add(cafeButton);
		Gui.p4.add(conbiButton);
		Gui.p4.add(b1);
		Gui.p4.add(b2);
		Gui.p4.add(b3);
		Gui.p4.add(b4);
		Gui.p4.add(b5);
		Gui.p4.add(b6);
		Gui.p4.add(conA);
		Gui.p4.add(conB);
		
		pcButton.addMouseListener(this);
		cafeButton.addMouseListener(this);
		conbiButton.addMouseListener(this);
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		b5.addMouseListener(this);
		b6.addMouseListener(this);
		conA.addMouseListener(this);
		conB.addMouseListener(this);
		
		pcButton.setVisible(true);
		cafeButton.setVisible(true);
		conbiButton.setVisible(true);
		b1.setVisible(false);
		b2.setVisible(false);
		b3.setVisible(false);
		b4.setVisible(false);
		b5.setVisible(false);
		b6.setVisible(false);
		conA.setVisible(false);
		conB.setVisible(false);
		
		// 버튼 생성 끝
		
		
		t0 = new JLabel("어떤 알바를 하시겠습니까?");
		t0.setBounds(100, 65, 500, 100);
		t0.setVisible(true);
		t0.setFont(new Font("맑은고딕", Font.BOLD,30));
		
		t1 = new JLabel();
		t1.setBounds(100, 10, 700, 100);
		t1.setVisible(false);
		t1.setFont(new Font("맑은고딕", Font.BOLD, 30));
		
		t2 = new JLabel();
		t2.setBounds(100, 45, 700, 100);
		t2.setVisible(false);
		t2.setFont(new Font("맑은고딕", Font.BOLD,30));
		
		t3 = new JLabel();
		t3.setBounds(100, 80, 800, 100);
		t3.setVisible(false);
		t3.setFont(new Font("맑은고딕", Font.BOLD,30));
		
		t4 = new JLabel();
		t4.setBounds(100, 115, 800, 100);
		t4.setVisible(false);
		t4.setFont(new Font("맑은고딕", Font.BOLD,30));
		
		
		Gui.p4.add(t0);
		Gui.p4.add(t1);
		Gui.p4.add(t2);
		Gui.p4.add(t3);
		Gui.p4.add(t4);
		// 라벨생성 끝
		
		pcButton.addMouseListener(new MouseAdapter() { // pc버튼 시작
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
	
				Gui.background = new ImageIcon(GameMain.class.getResource("../Images/pc.jpg")).getImage();

				pcButton.setVisible(false);
				cafeButton.setVisible(false);
				conbiButton.setVisible(false);
				t2.setVisible(true);
				t0.setVisible(false);
	
				t2.setText("PC방 알바중");
				b1.setVisible(true);
				if(Person.hp < 10) {
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/pi.jpg")).getImage();
					t2.setVisible(true);
					t0.setVisible(false);
					pcButton.setVisible(false);
					cafeButton.setVisible(false);
					conbiButton.setVisible(false);
					t2.setText("피곤해.. 돌아가..");
					b1.setVisible(false);
					
					
					next();
				}

			}
		}); // pc 끝
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Person.money += 30000;
				Person.hp -= 10;
				Person.stress += 3;
				b1.setVisible(false);
				t4.setVisible(true);
				t1.setVisible(true);
				t2.setVisible(true);
				t3.setVisible(true);
				t1.setText("!PC방 알바끝!");
				t2.setText("자금이 30000원 증가했습니다. 총 : " + Person.money);
				t3.setText("체력이 10 감소했습니다. 총 : "  + Person.hp);
				t4.setText("스트레스가 3 증가했습니다. 총 : " + Person.stress);
			
				next();
			}
		});
		
		cafeButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				// subl.setVisible(false);
				Gui.background = new ImageIcon(GameMain.class.getResource("../Images/cafe.jpg")).getImage();
				t2.setVisible(true);
				pcButton.setVisible(false);
				cafeButton.setVisible(false);
				conbiButton.setVisible(false);
				t0.setVisible(false);
				
				b2.setVisible(true);
				t2.setText("!카페 알바중!");
				if(Person.hp < 10) {
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/pi.jpg")).getImage();
					t2.setVisible(true);
					t0.setVisible(false);
					pcButton.setVisible(false);
					cafeButton.setVisible(false);
					conbiButton.setVisible(false);
					t2.setText("피곤해.. 돌아가..");
					b2.setVisible(false);
					b3.setVisible(false);
					
					next();
				}
				
				
			}
		}); // cafe 들어가는 버튼
		b2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				t2.setText("!카페 알바끝!");
				t2.setVisible(true);
				b2.setVisible(false);
				b3.setVisible(true);
			}
		});
		
		
		b3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Person.money +=25000;
				Person.hp -= 10;
				Person.stress += 3;
				Person.attract += 3;
				b3.setVisible(false);
				t1.setVisible(true);
				t2.setVisible(true);
				t3.setVisible(true);
				t4.setVisible(true);
				t1.setText("자금이 25000원 증가했습니다. 총 : " + Person.money);
				t2.setText("체력이 10 감소했습니다. 총 : "  + Person.hp);
				t3.setText("스트레스가 3 증가했습니다. 총 : " + Person.stress);
				t4.setText("매력이 3 증가했습니다. 총 : " + Person.attract);
				next();
				
			}
		});
		
		conbiButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				if(Person.hp < 20) {
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/pi.jpg")).getImage();
					t2.setVisible(true);
					t0.setVisible(false);
					pcButton.setVisible(false);
					cafeButton.setVisible(false);
					conbiButton.setVisible(false);
					t2.setText("피곤해.. 돌아가..");
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					
					next();
				}else {
					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/combi.jpg")).getImage();
					pcButton.setVisible(false);
					cafeButton.setVisible(false);	
					conbiButton.setVisible(false);
					t0.setVisible(false);
					t2.setVisible(true);
					setLayout(null);
					t2.setText("!편의점 알바중!");
					b4.setVisible(true);
				}
				int rd = r.nextInt(10);
				if (rd > 8 && eventCount1 ==0 && Person.hp >= 35) {
					t2.setText("※※편의점 도둑발생※※");
					t2.setVisible(true);
					conA.setVisible(true);
					conB.setVisible(true);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
				}else {
					//b4.setVisible(true);
				}
			}});
	
				conA.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						t1.setText("편의점 도둑을 추궁한다");
						t2.setText("주머니에 넣은거 빨리 꺼내세요!!!");
						t3.setText("<도둑>: 다른 사람들도 다 하는데 왜 나만");
						t1.setVisible(true);
						t2.setVisible(true);
						t3.setVisible(true);
						b5.setVisible(true);
						conA.setVisible(false);
						conB.setVisible(false);
					}
				});
				
				conB.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						t1.setText("!편의점 도둑을 줘팸한다!");
						t2.setText("!!넌 맞아야 겠다!!");
						t1.setVisible(true);
						t2.setVisible(true);
						b6.setVisible(true);
						conA.setVisible(false);
						conB.setVisible(false);
					}
				});
				
				b4.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						Person.money += 30000;
						Person.hp  -= 20;
						Person.stress += 15;
						
						t1.setText("!편의점 알바끝!");
						t2.setText("자금이 30000원 증가했습니다. 총 : " + Person.money);
						t3.setText("체력이 20 감소했습니다. 총 : "  + Person.hp);
						t4.setText("스트레스가 15 증가했습니다. 총 : " + Person.stress);
						t1.setVisible(true);
						t2.setVisible(true);
						t3.setVisible(true);
						t4.setVisible(true);
						b4.setVisible(false);
						b6.setVisible(false);		
						b5.setVisible(false);
						next();
					}
				});
				
				b5.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
						Person.hp -= 20;
						Person.attract += 5;
						Person.money += 20000;
						
						t1.setText("!도둑을 잡았습니다!");
						t2.setText("자금이 20000원 증가했습니다. 총 : " + Person.money);
						t3.setText("체력이 20 감소했습니다. 총 : "  + Person.hp);
						t4.setText("매력이 5 증가했습니다. 총 : " + Person.attract);
						t1.setVisible(true);
						t2.setVisible(true);
						t3.setVisible(true);
						t4.setVisible(true);
						b4.setVisible(true);
						b6.setVisible(false);		
						b5.setVisible(false);
					}
				});
				
				b6.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						Music m = new Music("but1.mp3", false);
						m.start();
							Person.stress += 15;
							Person.attract += 3;
							Person.money += 30000;
							t1.setText("!도둑을 제압했다!");
							t2.setText("체력이 15 감소했습니다. 총 : "  + Person.hp);
							t3.setText("스트레스가 5 증가했습니다. 총 : " + Person.stress);
							t4.setText("매력이 3 증가했습니다. 총 : " + Person.mental);
							t1.setVisible(true);
							t2.setVisible(true);
							t3.setVisible(true);
							t4.setVisible(true);
							b4.setVisible(true);		
							b6.setVisible(false);		
							b5.setVisible(false);		
								
					}});
				}

static void next() {
		
		Gui.nextButton.setVisible(true);
		Gui.nextButton.setBorderPainted(false);
		Gui.nextButton.setContentAreaFilled(false);
		Gui.nextButton.setFocusPainted(false);		
		Gui.nextButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				Gui.nextButton.setIcon(Gui.nextbt2);
				Gui.nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Gui.nextButton.setIcon(Gui.nextbt);
				Gui.nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Gui.nextButton.setVisible(false);
				if(Gui.scdcount > 7) {
					
					Gui.p.setVisible(false);
					Gui.p2.setVisible(false);
					Gui.p3.setVisible(false);
					Gui.p4.setVisible(false);
					Gui.p5.setVisible(false);
					Gui.p6.setVisible(false);

					Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ef.jpg"))
							.getImage();
					Gui.endingbutton.setVisible(true);
					
				}

				else {
					Gui.setStat();
					Gui.s = new Schedule();
					}
				
			}		
		});
	}

@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

	}	
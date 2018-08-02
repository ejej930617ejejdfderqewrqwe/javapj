package d0321;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;






public class Gui extends JFrame {
	
	
	
	Person person = new Person();
	
	private Image screenImage;
	private Graphics screenGraphic;
	

	private ImageIcon exitButtonEnteredImage = new ImageIcon(GameMain.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(GameMain.class.getResource("../images/exitButtonBasic.png"));

	private ImageIcon startButtonEnteredImage = new ImageIcon(GameMain.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon startButtonBasicImage = new ImageIcon(GameMain.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(GameMain.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon quitButtonBasicImage = new ImageIcon(GameMain.class.getResource("../images/quitButtonBasic.png"));
	private ImageIcon easyButtonEnteredImage = new ImageIcon(GameMain.class.getResource("../images/basic2.png"));
	private ImageIcon easyButtonBasicImage = new ImageIcon(GameMain.class.getResource("../images/basic1.png"));
	private ImageIcon hardButtonEnteredImage = new ImageIcon(GameMain.class.getResource("../images/high2.png"));
	private ImageIcon hardButtonBasicImage = new ImageIcon(GameMain.class.getResource("../images/high1.png"));
	private ImageIcon insertbt = new ImageIcon(GameMain.class.getResource("../images/insertbt.png"));
	private ImageIcon insertbt2 = new ImageIcon(GameMain.class.getResource("../images/insertbt2.png"));
	static ImageIcon nextbt = new ImageIcon(GameMain.class.getResource("../images/nextbt.png"));
	static ImageIcon nextbt2 = new ImageIcon(GameMain.class.getResource("../images/nextbt2.png"));
	static ImageIcon endbt = new ImageIcon(GameMain.class.getResource("../images/endbt.png"));
	static ImageIcon endbt2 = new ImageIcon(GameMain.class.getResource("../images/endbt3.png"));

	private ImageIcon statImage ;
	private ImageIcon pnImage ;
	
	
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	private JButton easyButton = new JButton(easyButtonBasicImage);
	private JButton hardButton = new JButton(hardButtonBasicImage);
	private JButton nameInsert = new JButton(insertbt);
	
	private Image introBackground;

	private JLabel modeSelect = new JLabel("원하는 모드를 선택하세요.");
	private JLabel name = new JLabel();
	private JTextField tf = new JTextField();
	
	static int scdcount = 1;
	
	
	static Image background = new ImageIcon(GameMain.class.getResource("../images/aaaaaa.png"))
			.getImage();
	
	
	
	static JButton nextButton = new JButton(nextbt);
	static JButton endingbutton = new JButton(endbt);

	static JPanel p; 
	static JPanel p2; //indoor
	static JPanel p3 ;//shcool
	static JPanel p4 ;//job
	static JPanel p5;//outdoor
	static JPanel p6;//schedule
	static JPanel p7;//ending
	static JPanel p8 ;//itemshop
	static JPanel p9 = new JPanel(); //투명패널
	static JPanel stat ;//stat
	static JPanel p10 = new JPanel(); //itemshop text
	
	
	
	static JLabel charname = new JLabel();
	static JLabel hp = new JLabel();
	static JLabel stress = new JLabel();
	static JLabel iq = new JLabel();
	static JLabel mental = new JLabel();
	static JLabel money = new JLabel();
	static JLabel attract = new JLabel();
	static JLabel grade = new JLabel();
	static JLabel friend = new JLabel();
	static JLabel day = new JLabel();

	
	

	
	
	static Schedule s ;
	static Ending ending;
	
	private boolean isMainScreen = false;
	private int nowSelected = 0;
	
	
	
	
	public Gui(){
		Music m = new Music("main.mp3", true);
		m.start();
		
		setUndecorated(true);
		setTitle("Game");
		setSize(GameMain.SCREEN_WIDTH, GameMain.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

		
		//나가는 x 버튼
		exitButton.setBounds(0, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				
				System.exit(0);
			}
		});
		add(exitButton);
		
			
		
		//시작하기 버튼 
		startButton.setBounds(40, 200, 400, 100);
		startButton.setBorderPainted(false); //외곽선 없애기
		startButton.setContentAreaFilled(false);//이미지 파일의 투명한 영역에 색을 채우지 않는다
		startButton.setFocusPainted(false);//선택 되었을때 테두리 없애기
		startButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			//스타트 버튼을 누르면 모드 선택하는 화면으로 이동 
			@Override 
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				startButton.setVisible(false);
				quitButton.setVisible(false);
				
				
				background = new ImageIcon(GameMain.class.getResource("../images/asdf.jpg"))
						.getImage();
				
				easyButton.setVisible(true);
				hardButton.setVisible(true);
				modeSelect.setVisible(true);
				
			}
		});
		add(startButton);
		
		
		//종료하기 버튼
		quitButton.setBounds(40, 330, 400, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				System.exit(0);
			}
		});
		
		add(quitButton);
		
		//모드 - 기본모드 버튼 
		easyButton.setVisible(false);
		easyButton.setBounds(375, 580, 250, 67);
		easyButton.setBorderPainted(false);
		easyButton.setContentAreaFilled(false);
		easyButton.setFocusPainted(false);
		easyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				easyButton.setIcon(easyButtonEnteredImage);
				easyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				easyButton.setIcon(easyButtonBasicImage);
				easyButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				gameStart(nowSelected, "easy");
			}
		});
		add(easyButton);
		
		//모드 - 고급모드 버튼 
		hardButton.setVisible(false);
		hardButton.setBounds(655, 580, 250, 67);
		hardButton.setBorderPainted(false);
		hardButton.setContentAreaFilled(false);
		hardButton.setFocusPainted(false);
		hardButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hardButton.setIcon(hardButtonEnteredImage);
				hardButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				hardButton.setIcon(hardButtonBasicImage);
				hardButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
			
				gameStart(nowSelected, "hard");
			}
		});
		add(hardButton);
		
		
		
		
		
		
		//모드선택 lable
		modeSelect.setVisible(false);
		modeSelect.setBounds(540,500,400,100);
		modeSelect.setFont(new Font("맑은 고딕", Font.BOLD,20));
		add(modeSelect);
		
		
	
		
		//패널에 이미지 배경 넣기 
	
		pnImage = new ImageIcon(GameMain.class.getResource("../images/pn.png"));
		
		

		p =new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(pnImage.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
			};
			
			p2 =new JPanel() {
				protected void paintComponent(Graphics g) {
					g.drawImage(pnImage.getImage(), 0, 0, null);
					setOpaque(false);
					super.paintComponent(g);
				}
				};
				
				
				p3 =new JPanel() {
					protected void paintComponent(Graphics g) {
						g.drawImage(pnImage.getImage(), 0, 0, null);
						setOpaque(false);
						super.paintComponent(g);
					}
					};
					
					
					p4 =new JPanel() {
						protected void paintComponent(Graphics g) {
							g.drawImage(pnImage.getImage(), 0, 0, null);
							setOpaque(false);
							super.paintComponent(g);
						}
						};
						
						p5 =new JPanel() {
							protected void paintComponent(Graphics g) {
								g.drawImage(pnImage.getImage(), 0, 0, null);
								setOpaque(false);
								super.paintComponent(g);
							}
							};
							
							p6 =new JPanel() {
								protected void paintComponent(Graphics g) {
									g.drawImage(pnImage.getImage(), 0, 0, null);
									setOpaque(false);
									super.paintComponent(g);
								}
								};
								
								p7 =new JPanel() {
									protected void paintComponent(Graphics g) {
										g.drawImage(pnImage.getImage(), 0, 0, null);
										setOpaque(false);
										super.paintComponent(g);
									}
									};
									
									p8 =new JPanel() {
										protected void paintComponent(Graphics g) {
											g.drawImage(pnImage.getImage(), 0, 0, null);
											setOpaque(false);
											super.paintComponent(g);
										}
										};
		
		
		
		
										
										
		p.setVisible(false);
		p.setLayout(null);
		p.setBounds(40,450 , 1200, 250);
	
		
		
		p2.setVisible(false);
		p2.setLayout(null);
		p2.setBounds(40,450 , 1200, 250);
		
		add(p2);
		
		
		p3.setVisible(false);
		p3.setLayout(null);
		p3.setBounds(40,450 , 1200, 250);
		add(p3);
		

		p4.setVisible(false);
		p4.setLayout(null);
		p4.setBounds(40,450 , 1200, 250);
		add(p4);
		
		

		p5.setVisible(false);
		p5.setLayout(null);
		p5.setBounds(40,450 , 1200, 250);
		add(p5);
		
		
		p6.setVisible(false);
		p6.setLayout(null);
		p6.setBounds(40,450 , 1200, 250);
		add(p6);
		

		p7.setVisible(false);
		p7.setLayout(null);
		p7.setBounds(40,450 , 1200, 250);
		add(p7);
		
		
		p10.setVisible(false);
		p10.setLayout(null);
		p10.setBounds(40,450 , 1200, 250);
		Color q = new Color(231,231,231);
		
		p10.setBackground(q);
		add(p10);
		
		
		
		p8.setVisible(false);
		p8.setLayout(null);
		p8.setBounds(40,450 , 1200, 250);
		add(p8);
		
		
		p9.setVisible(false);
		p9.setLayout(null);
		p9.setBounds(0, 0 , 1280, 720);
		p9.setBackground(new Color(255, 0, 0, 0));    //투명
		add(p9);
		
		
	
		//이름 입력해라 lable
		name.setVisible(false);
		name.setBounds(100, 85, 350, 100);
		name.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		
		
		
		//이름 입력 받는 텍스트 필드
		tf.setVisible(false);
		tf.setBounds(460, 85, 200, 100);
		tf.setOpaque(false);

		tf.setForeground(Color.blue);
		tf.setFont(new Font("맑은 고딕", Font.BOLD,30));

		tf.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		
		//이름 입력하는 버튼 - 스케쥴 선택과 연결 
		nameInsert.setVisible(true);
		nameInsert.setBounds(750, 113, 80, 50);
		nameInsert.setFont(new Font("맑은 고딕", Font.BOLD,15));
		
		nameInsert.setBorderPainted(false);
		nameInsert.setContentAreaFilled(false);
		nameInsert.setFocusPainted(false);
		
		
		

		nameInsert.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				nameInsert.setIcon(insertbt2);
				nameInsert.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nameInsert.setIcon(insertbt);
				nameInsert.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				Person.name = tf.getText();
				JOptionPane.showMessageDialog(null, "캐릭터 이름은 [ "+Person.name+" ] 입니다 ");
				
				name.setVisible(false);
				nameInsert.setVisible(false);
				tf.setVisible(false);
				
				
				
				s = new Schedule(); //스케쥴 선택 시작
	
						
		
				
				

				setStat();
				
				stat.setVisible(true);
			
			}		
		});
		
		
	   
		statImage = new ImageIcon(GameMain.class.getResource("../images/stat.png"));
		
		stat =new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(statImage.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
			};
		
	
		stat.setVisible(false);
		stat.setLayout(null);
		stat.setBounds(1040, 20,200 , 330);
		
		
		//스탯 입력
		
		day.setBounds(100, 13, 190, 17);
		day.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		day.setForeground(Color.white);
		
		
		charname.setBounds(80, 45, 80, 30);
		charname.setFont(new Font("맑은 고딕", Font.BOLD, 20));		
		
		
		hp.setBounds(90, 90, 190, 17 );
		hp.setFont(new Font("맑은 고딕", Font.BOLD, 17));		
			
		stress.setBounds(90, 215, 190, 17);
		stress.setFont(new Font("맑은 고딕", Font.BOLD, 17));		
		
		iq.setBounds(90, 115, 190, 17);
		iq.setFont(new Font("맑은 고딕", Font.BOLD, 17));	
		
		mental.setBounds(90, 190, 190, 17);
		mental.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		
		money.setBounds(90, 290, 190, 17);
		money.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		
		attract.setBounds(90, 165, 190, 17);
		attract.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		
		grade.setBounds(90, 140, 190,17);
		grade.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		
		friend.setBounds(90, 240, 190, 17);
		friend.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		
		
		
		charname.setVisible(true);
		day.setVisible(true);
		hp.setVisible(true);
		stress.setVisible(true);
		iq.setVisible(true);
		mental.setVisible(true);
		money.setVisible(true);
		attract.setVisible(true);
		grade.setVisible(true);
		friend.setVisible(true);
		
		
		
		
		stat.add(charname);  stat.add(hp); stat.add(stress); stat.add(iq);
		stat.add(mental); stat.add(money); stat.add(attract); stat.add(grade);
		stat.add(friend); stat.add(day);
		
		
		add(stat);
	
		
		
		nextButton.setVisible(false);
		nextButton.setBounds(980, 390, 170, 60);
	
		
		add(nextButton);
		
		
		
		p.add(name);
		p.add(tf);
		p.add(nameInsert);
		add(p);
		
	
		
		
		endingbutton.setVisible(false);
		endingbutton.setBounds(485, 200, 300 , 300);
		endingbutton.setFont(new Font("맑은 고딕", Font.BOLD, 20));


		endingbutton.setBorderPainted(false);
		endingbutton.setContentAreaFilled(false);
		endingbutton.setFocusPainted(false);
		
		
		endingbutton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				endingbutton.setIcon(endbt2);
				endingbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				endingbutton.setIcon(endbt);
				endingbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				endingbutton.setVisible(false);
				Gui.ending = new Ending();
				Gui.ending.rnd();
				Gui.ending.ending();
				
				
			}		
		});
		
		add(endingbutton);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void paint(Graphics g) {
		screenImage = createImage(GameMain.SCREEN_WIDTH, GameMain.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
	
	

	       
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	
	
	
	//모드 선택 -> 이름생성으로 
	public void gameStart(int nowSelected, String difficulty) {
		isMainScreen = false;
		easyButton.setVisible(false);
		hardButton.setVisible(false);
		modeSelect.setVisible(false);
		
		
		background = new ImageIcon(GameMain.class.getResource("../images/asdf.jpg" ))
				.getImage();
		
		p.setVisible(true);
		
		
		if(difficulty == "hard") {
			//고급모드 선택 객체생성
			
			/*
			System.out.println("(효과: 체력 50증가, 자금 20000 증가, 지력 30증가)");
			System.out.println("(아이템: 지능물약 추가)");화면에 띄워야됨
			
			*/
		
			Person.hp += 50 ;
			Person.money += 20000;
			Person.iq += 30;
		}
		
		name.setText("캐릭터 이름을 입력하세요:");
		name.setVisible(true);
		tf.setVisible(true);
		tf.requestFocus();
		nameInsert.setVisible(true);
		
	
	}
	
	
	
     static void setStat() {
		
    	 day.setText(scdcount+"");
    	charname.setText(Person.name);
 		hp.setText(Person.hp+"");
 		stress.setText(""+Person.stress);
 		iq.setText(""+Person.iq);
 		mental.setText("" + Person.mental);
 		money.setText("" + Person.money);
 		attract.setText("" + Person.attract);
 		grade.setText("" + Person.grade);
 		friend.setText("" + Person.friend);
	}
		
	
	

}

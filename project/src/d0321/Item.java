package d0321;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Item extends JFrame {	

	private JButton ok1 = new JButton("구매");
	private JButton ok2 = new JButton("구매");
	private JButton ok3 = new JButton("구매");
	private JButton ok4 = new JButton("구매");
	private JButton back = new JButton("이전");
	private JButton next = new JButton("다음");
	private JButton h = new JButton("확인");
	private JButton yes1 = new JButton("알았어");
	private JButton exit = new JButton("다음에다시");
	
	private JLabel text = new JLabel();
	private JLabel text2 = new JLabel();
	

	
	public Item() {
		
		Gui.p8.removeAll();
		Gui.p.setVisible(false);
		Gui.p2.setVisible(false);
		Gui.p3.setVisible(false);
		Gui.p4.setVisible(false);
		Gui.p5.setVisible(false);
		Gui.p6.setVisible(false);
		Gui.p7.setVisible(false);
		Gui.p8.setVisible(true);
		Gui.stat.setVisible(false);
		
		Gui.background = new ImageIcon(GameMain.class.getResource("../images/asp1.png"))
				.getImage();	
		
		text.setText("안녕하신가? 좋은 아이템들이 많다네~ 허허!");
		
		
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Gui.setStat();
				Gui.s = new Schedule();

			}
		});
	
		h.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Gui.p8.setVisible(false);
				h.setVisible(false);
				yes1.setVisible(false);
				text.setVisible(false);
				
				Gui.background = new ImageIcon(GameMain.class.getResource("../images/상점1.png"))
						.getImage();
				
				Gui.stat.setVisible(true);
				Gui.p9.setVisible(true);
				
				back.setVisible(false);
				next.setVisible(true);
				exit.setVisible(true);
				
				ok1.setVisible(true);
				ok2.setVisible(true);
				ok3.setVisible(false);
				ok4.setVisible(false);
			
			}
		});
		
		yes1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Gui.p10.setVisible(false);
				
			}
		});
				
		next.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();

					ok1.setVisible(false);
					ok2.setVisible(false);
					next.setVisible(false);
										
					Gui.background = new ImageIcon(GameMain.class.getResource("../images/상점2.png"))
							.getImage();
					
					ok3.setVisible(true);
					ok4.setVisible(true);
					back.setVisible(true);
					
			}
		});
		
		back.addMouseListener(new MouseAdapter() {			
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				
				ok3.setVisible(false);
				ok4.setVisible(false);
				back.setVisible(false);
				
				Gui.background = new ImageIcon(GameMain.class.getResource("../images/상점1.png"))
						.getImage();
				
				ok1.setVisible(true);
				ok2.setVisible(true);
				next.setVisible(true);
				}
		});
		
		ok1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Gui.p10.setVisible(true);
				text2.setVisible(true);
				yes1.setVisible(true);
				if(Person.money >= 15000 && Person.satiety < 100) {
					text2.setText("선아의 잃어버린 용가리치킨을 먹었습니다.");
					Person.money -= 15000;
			
					if(Person.hp <=180){
						Person.hp +=20;
					}else {
						Person.hp = 200;
					}if(Person.satiety <=99){
						Person.satiety +=1;
					}else {
						Person.satiety = 100;
					}
					Gui.setStat();

				}else if(Person.money < 15000) {
					text2.setText("돈이 부족하여 구매할 수 없습니다.");
				}else if(Person.satiety == 100) {
					text2.setText("너무 배불러서 더 먹을 수 없습니다.");
				}
			}
		});
		
		ok2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Gui.p10.setVisible(true);
				text2.setVisible(true);
				yes1.setVisible(true);
				if(Person.money >= 30000) {
					text2.setText("의문의 설사약을 먹었습니다.");
					Person.money -= 30000;
					if(Person.satiety >=50){
						Person.satiety -=50;
					}else {
						Person.satiety = 0;
					}
					Gui.setStat();

				}else {
						text2.setText("돈이 부족하여 구매할 수 없습니다.");
				}	
			}
	});
		
		ok3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Gui.p10.setVisible(true);
				text2.setVisible(true);
				yes1.setVisible(true);
				if(Person.money >= 5000 && Person.satiety < 100) {
					text2.setText("눅눅한 센드위치를 먹었습니다.");
					Person.money -= 5000;
				
					if(Person.hp <=185){
						Person.hp +=15;
					}else {
						Person.hp = 200;
					}if(Person.mental <= 85) {
						Person.mental += 15;
					}else {
						Person.mental =100;
					}if(Person.satiety <= 90) {
						Person.satiety += 10;
					}else {
						Person.satiety = 100;
					}
					Gui.setStat();

				}else if(Person.money < 5000){
					text2.setText("돈이 부족하여 구매할 수 없습니다.");
				}else if(Person.satiety == 100) {
					text2.setText("너무 배불러서 더 먹을 수 없습니다.");
				}
			}
		});
		
		ok4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", false);
				m.start();
				Gui.p10.setVisible(true);
				text2.setVisible(true);
				yes1.setVisible(true);
				if(Person.money >= 3000 && Person.satiety < 100) {
					text2.setText("밤을 먹었습니다.");
					Person.money -= 3000;
					
					if(Person.hp <=190){
						Person.hp +=10;
					}else {
						Person.hp = 200;
					}if(Person.satiety <= 95) {
						Person.satiety += 5;
					}else {
						Person.satiety = 100;
					}
					Gui.setStat();

				}else if(Person.money < 3000){
					text2.setText("돈이 부족하여 구매할 수 없습니다.");
				}else if(Person.satiety == 100) {
					text2.setText("너무 배불러서 더 먹을 수 없습니다.");
				}
			}
		});
		
		ok1.setVisible(false);
		ok1.setBounds(360, 400, 160, 40);
		ok1.setBorderPainted(true);
		ok1.setContentAreaFilled(true);
		ok1.setFocusPainted(true);
		add(ok1);
		ok2.setVisible(false);
		ok2.setBounds(360, 600, 160, 40);
		ok2.setBorderPainted(true);
		ok2.setContentAreaFilled(true);
		ok2.setFocusPainted(true);
		add(ok2);
		ok3.setVisible(false);
		ok3.setBounds(360, 400, 160, 40);
		ok3.setBorderPainted(true);
		ok3.setContentAreaFilled(true);
		ok3.setFocusPainted(true);
		add(ok3);
		ok4.setVisible(false);
		ok4.setBounds(360, 600, 160, 40);
		ok4.setBorderPainted(true);
		ok4.setContentAreaFilled(true);
		ok4.setFocusPainted(true);
		add(ok4);
	
		back.setVisible(false);
		back.setBounds(800, 600, 80, 50);
		back.setBorderPainted(true);
		back.setContentAreaFilled(true);
		back.setFocusPainted(true);
		add(back);
		
		next.setVisible(false);
		next.setBounds(900, 600, 80, 50);
		next.setBorderPainted(true);
		next.setContentAreaFilled(true);
		next.setFocusPainted(true);
		add(next);
	
		h.setVisible(true);
		h.setBounds(900, 200, 110, 40);
		h.setBorderPainted(true);
		h.setContentAreaFilled(true);
		h.setFocusPainted(true);
		add(h);
		
		yes1.setVisible(false);
		yes1.setBounds(1000, 200, 110, 40);
		yes1.setBorderPainted(true);
		yes1.setContentAreaFilled(true);
		yes1.setFocusPainted(true);
		add(yes1);
		
		exit.setVisible(false);
		exit.setBounds(900, 200, 110, 40);
		exit.setBorderPainted(true);
		exit.setContentAreaFilled(true);
		exit.setFocusPainted(true);
		add(exit);
		
		text.setVisible(true);
		text.setBounds(100, 0, 800, 100);
		text.setFont(new Font("맑은고딕", Font.BOLD, 30));
		add(text);
		
		text2.setVisible(true);
		text2.setBounds(100, 0, 800, 100);
		text2.setFont(new Font("맑은고딕", Font.BOLD, 30));
		add(text2);
		
		Gui.p8.add(h);
		Gui.p8.add(text);
		
		Gui.p9.add(ok1);
		Gui.p9.add(ok2);
		Gui.p9.add(ok3);
		Gui.p9.add(ok4);
		Gui.p9.add(back);
		Gui.p9.add(next);
		Gui.p9.add(exit);
		
		Gui.p10.add(text2);
		Gui.p10.add(yes1);
		
	}
}
	


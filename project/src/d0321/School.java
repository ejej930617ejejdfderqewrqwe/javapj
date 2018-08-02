package d0321;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class School extends JFrame {

	private ImageIcon exitButtonEnteredImage = new ImageIcon(GameMain.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(GameMain.class.getResource("../images/exitButtonBasic.png"));
	
	private JButton start = new JButton("밥먹기");
	
	private JButton a1 = new JButton("버스");
	private JButton a2 = new JButton("지하철");
	private JButton a3 = new JButton("걸어가기");
	private JButton a4 = new JButton("수업");
	private JButton a5 = new JButton("동아리");
	private JButton a6 = new JButton("집에가기");
	private JButton a7 = new JButton("계속듣기");
	private JButton a8 = new JButton("밥먹기");
	private JButton a9 = new JButton("거르기");
	
	private JButton a10 = new JButton("수업듣기");
	private JButton a11 = new JButton("동아리");
	private JButton a12 = new JButton("집에가기");
	private JButton a13 = new JButton("계속듣기");
	private JButton a14 = new JButton("밥먹기");
	private JButton a15 = new JButton("거르기");
	private JButton a16 = new JButton("수업듣기");
	
	private JButton a17 = new JButton("동아리");
	private JButton a18 = new JButton("집에가기");
	private JButton a19 = new JButton();
	private JButton a20 = new JButton();
	private JButton a21 = new JButton();
		
	private JLabel jl1 = new JLabel();
	private JLabel jl2 = new JLabel();
	private JLabel jl3 = new JLabel();
	private JLabel jl4 = new JLabel();
	private JLabel jl5 = new JLabel();
	private JLabel jl6 = new JLabel();
	
public School() {

	Gui.p3.removeAll();
	
	Gui.p.setVisible(false);
	Gui.p2.setVisible(false);
	Gui.p3.setVisible(true);
	Gui.p4.setVisible(false);
	Gui.p5.setVisible(false);
	Gui.p6.setVisible(false);
	Gui.p8.setVisible(false);
	Gui.p9.setVisible(false);
	
		
		
		
		
		
		
		
		
	start.setVisible(true);
	start.addMouseListener(new MouseAdapter() {
					
	@Override
	public void mousePressed(MouseEvent e){
	start.setVisible(false);
	
	Gui.background = new ImageIcon(GameMain.class.getResource("../images/morning.jpg")).getImage();
	Gui.p3.setVisible(true);
	jl1.setText("아침을 먹었습니다... 자금 -4500");			
						
	if(Person.money >= 4500)
		{
			Person.money -= 4500;
			if(Person.hp >= 90){
			Person.hp = 200;
			jl2.setText("현재 체력이 MAX 입니다.");
		}else {
			Person.hp += 10;
			jl2.setText("체력이 10 증가했습니다.");
		}
		if(Person.mental >= 90){
			Person.mental = 100;
			jl3.setText("현재 정신력이 MAX 입니다.");
		}else {
			Person.mental += 10;
			jl3.setText("정신력이 10 증가했습니다.");
		}
	} else {
		jl1.setText("자금이 부족해서 식사를 할 수 없습니다.");
	}
		a1.setVisible(true);
		a2.setVisible(true);
		a3.setVisible(true);
	}
}); 
		
				
	//버스타기
	a1.addMouseListener(new MouseAdapter() {
									
	@Override
	public void mousePressed(MouseEvent e) {
						
	Gui.background = new ImageIcon(GameMain.class.getResource("../images/bus.jpg")).getImage();
	a1.setVisible(false);
	a2.setVisible(false); 
	a3.setVisible(false); 
	if(Person.money >= 3000) {
		jl1.setText("버스를 타고 이동합니다...");
		jl2.setText("버스요금 -3000원");
		Person.money -= 3000;
		if(Person.hp <= 190) {
			jl3.setText("현재 체력이 MAX 입니다.");
			Person.hp = 200;
		}else {
			jl3.setText("체력이 10 증가했습니다.");
			Person.hp += 10;						
		}
		}else {
			jl1.setText("자금이 부족하여 버스를 탈 수 없습니다.");
			jl2.setText("");
			jl3.setText("");
		}	
			a4.setVisible(true);
			a5.setVisible(true);
		}
	});
		
				
	//지하철타기
	a2.addMouseListener(new MouseAdapter() {					
	@Override
	public void mousePressed(MouseEvent e) {
		Gui.background = new ImageIcon(GameMain.class.getResource("../images/subway.jpg")).getImage();
		a1.setVisible(false);
		a2.setVisible(false);
		a3.setVisible(false);
		if(Person.money >= 1500) {
			jl1.setText("지하철를 타고 이동합니다...");
			jl2.setText("지하철요금 -1500원");
			Person.money -= 1500;
			if(Person.hp <= 190) {
				jl3.setText("체력이 10 증가했습니다.");
				Person.hp += 10;
			}else {
				jl3.setText("현재 체력이 MAX 입니다.");
				Person.hp = 200;
			}
			if(Person.mental <= 90) {
			jl3.setText("정신력이 10 증가했습니다.");
			Person.mental += 10;
			}else {
				jl3.setText("현재 정신력이 MAX 입니다.");
				Person.mental = 100;
			}
		}else {
			jl1.setText("자금이 부족하여 지하철을 탈 수 없습니다.");
			jl2.setText("");
			jl3.setText("");
		}	
		a4.setVisible(true);
		a5.setVisible(true);
	}
});
		
				
	//걸어가기
	a3.addMouseListener(new MouseAdapter() {
										
	@Override
	public void mousePressed(MouseEvent e) {
	Gui.background = new ImageIcon(GameMain.class.getResource("../images/iloveimg.jpg")).getImage();

	a1.setVisible(false); 
	a2.setVisible(false); 
	a3.setVisible(false); 
	jl1.setText("학교까지 걸어갑니다...");
	if(Person.hp >= 10) {
		jl2.setText("체력이 10 감소했습니다.");
		Person.hp -= 10;
		}else {
			jl2.setText("현재 체력이 MIN 입니다.");
			Person.hp = 0;
		}
		if(Person.mental >= 10) {
			jl3.setText("정신력이 10 감소했습니다.");
			Person.mental -= 10;
		}else {
			jl3.setText("현재 정신력이 MIN 입니다.");
			Person.mental = 0;
		}
		if(Person.stress <= 95) {
			jl4.setText("스트레스가 5 증가했습니다.");
			Person.stress += 5;
		}else {
			jl4.setText("현재 스트레스가 MAX 입니다.");
			Person.stress = 100;
		}						
			a4.setVisible(true);
			a5.setVisible(true);
		}
	});
				
	//수업듣기
	a4.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../images/lecture1.jpg")).getImage();
			a4.setVisible(false);
			a5.setVisible(false);
			jl1.setText("수업을 듣고 있습니다...");
							
			if(Person.hp >= 10) {
				jl2.setText("체력이 10 감소했습니다.");
				Person.hp -= 10;
			}else {
				jl2.setText("현재 체력이 MIN 입니다.");
				Person.hp = 0;
			}
				if(Person.mental >= 20) {
				jl3.setText("정신력이 20 감소했습니다.");
				Person.mental -= 20;
			}else {
				jl3.setText("현재 정신력이 MIN 입니다.");
				Person.mental = 0;
			}
				if(Person.stress <= 85) {
				jl4.setText("스트레스가 15 증가했습니다.");
				Person.stress += 15;
			}else {
				jl4.setText("현재 스트레스가 MAX 입니다.");
				Person.stress = 100;
			}						
				if(Person.grade <= 95) {
					jl5.setText("!학점이 5 증가했습니다!");
					Person.grade += 5;
				}else {
					jl5.setText("현재 학점이 MAX 입니다.");
					Person.grade = 100;
				}	
					if(Person.friend <= 97) {
					jl6.setText("!인간관계가 3 증가했습니다!");
					Person.friend += 3;
				}else {
					jl6.setText("현재 인간관계가 MAX 입니다.");
					Person.friend = 100;
				}	
					a6.setVisible(true);
					a7.setVisible(true);
				}
			});
				
	// 동아리활동
	a5.addMouseListener(new MouseAdapter() {

	@Override
	public void mousePressed(MouseEvent e) {
		Gui.background = new ImageIcon(GameMain.class.getResource("../images/Circles1.jpg")).getImage();
		a4.setVisible(false);
		a5.setVisible(false);
		jl1.setText("동아리 활동을 하고 있습니다...");
							
		if(Person.hp >= 30) {
			jl2.setText("체력이 30 감소했습니다.");
			Person.hp -= 30;
		}else {
			jl2.setText("현재 체력이 MIN 입니다.");
			Person.hp = 0;
		}
			if(Person.mental >= 15) {
				jl3.setText("정신력이 15 감소했습니다.");
				Person.mental -= 15;
			}else {
				jl3.setText("현재 체력이 MIN 입니다.");
				Person.mental = 0;
			}
				if(Person.stress >= 20) {
				jl4.setText("스트레스가 20 감소했습니다.");
				Person.stress -= 20;
			}else {
				jl4.setText("현재 스트레스가 MIN 입니다.");
				Person.stress = 0;
			}						
				if(Person.grade <= 99) {
				jl5.setText("!학점이 1 증가했습니다!");
				Person.grade += 1;
			}else {
				jl5.setText("현재 학점이 MAX 입니다.");
				Person.grade = 100;
			}	
				if(Person.friend <= 94) {
				jl6.setText("!인간관계가 6 증가했습니다!");
				Person.friend += 6;
			}else {
				jl6.setText("현재 인간관계가 MAX 입니다.");
				Person.friend = 100;
			}									
			a6.setVisible(true);
			a7.setVisible(true);
		}
	});
				
	//집에가기
	a6.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../images/lunchhome.jpg")) .getImage();
				a6.setVisible(false);
				a7.setVisible(false);
				jl1.setText("집으로 돌아가고 있습니다...");
				jl2.setText("");
				jl3.setText("");
				jl4.setText("");
				jl5.setText("");
				jl6.setText("");
				Job.next();
			}
		});
				
	//계속 공부하기 - >  공부하기전 밥먹을지 선택
	a7.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			if(Person.hp > 30 && Person.mental > 30) {
				Gui.background = new ImageIcon(GameMain.class.getResource("../images/df.jpg")) .getImage();
				a6.setVisible(false);
				a7.setVisible(false);
				jl1.setText("점심식사를 하시겠습니까?");
				jl2.setText("");
				jl3.setText("");
				jl4.setText("");
				jl5.setText("");
				jl6.setText("");
				a8.setVisible(true);
				a9.setVisible(true);
			}else {
				Gui.background = new ImageIcon(GameMain.class.getResource("../images/기운.jpg")) .getImage();
				jl1.setText("당신은 기운이 없어서 강제로 집으로 갈 수 밖에 없습니다.");
				jl2.setText("");
				jl3.setText("");
				jl4.setText("");
				jl5.setText("");
				jl6.setText("");
				a6.setVisible(true);
				a7.setVisible(false);	
			}
		}
	});
				
	//점심밥먹기
	a8.addMouseListener(new MouseAdapter() {
		@Override 
		public void mousePressed(MouseEvent e) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../images/Restaurant.jpg")).getImage();
			a8.setVisible(false); 
			a9.setVisible(false); 
			jl1.setText("점심을 먹었습니다... 자금 -5500원");			
											
			if(Person.money >= 5500)
			{ 		
				Person.money -= 5500;
				if(Person.hp >= 160)
				{
				Person.hp = 200;
				jl2.setText("현재 체력이 MAX 입니다.");
			}else {
				Person.hp += 40;
				jl2.setText("체력이 +40 증가했습니다.");
			}
				if(Person.mental >= 60){
				Person.mental = 100;
				jl3.setText("현재 정신력이 MAX 입니다.");
			}else {
				Person.mental += 40;
				jl3.setText("정신력이 +40 증가했습니다.");
			}
		} else {
			jl1.setText("자금이 부족해서 식사를 할 수 없습니다.");
		}
			a10.setVisible(true);
			a11.setVisible(true);
		}
	});
				
	//점심거르기
	a9.addMouseListener(new MouseAdapter() {
					
	@Override
	public void mousePressed(MouseEvent e) {
					
	Gui.background = new ImageIcon(GameMain.class.getResource("../images/hungry1.jpg")).getImage();
	a8.setVisible(false);
	a9.setVisible(false);
	jl1.setText("식사를 거르는 것을 선택했습니다.");
	jl2.setText("");
	jl3.setText("");
	jl4.setText("");
	jl5.setText("");
	jl6.setText("");
					
	a10.setVisible(true);
	a11.setVisible(true);
	}
});
				
	//오후수업듣기
	a10.addMouseListener(new MouseAdapter() {
			
	@Override
	public void mousePressed(MouseEvent e) {
	Gui.background = new ImageIcon(GameMain.class.getResource("../images/lecture2.jpg")) .getImage();
	a10.setVisible(false);
	a11.setVisible(false);
	jl1.setText("수업을 듣고 있습니다...");
						
	if(Person.hp >= 10) {
		jl2.setText("체력이 10 감소했습니다.");
		Person.hp -= 10;
	}else {
		jl2.setText("현재 체력이 MIN 입니다.");
		Person.hp = 0;
	}
		if(Person.mental >= 30) {
			jl3.setText("정신력이 30 감소했습니다.");
			Person.mental -= 30;
		}else {
			jl3.setText("현재 정신력이 MIN 입니다.");
			Person.mental = 0;
		}
			if(Person.stress <= 80) {
			jl4.setText("스트레스가 20 증가했습니다.");
			Person.stress += 20;
		}else {
			jl4.setText("현재 스트레스가 MAX 입니다.");
			Person.stress = 100;
		}						
			if(Person.grade <= 91) {
			jl5.setText("!학점이 9 증가했습니다!");
			Person.grade += 9;
		}else {
			jl5.setText("현재 학점이 MAX 입니다.");
			Person.grade = 100;
		}	
			if(Person.friend <= 98) {
			jl6.setText("!인간관계가 2 증가했습니다!");
			Person.friend += 2;
		}else {
			jl6.setText("현재 인간관계가 MAX 입니다.");
			Person.friend = 100;
		}					
			a12.setVisible(true);
			a13.setVisible(true);										
		}			
	});
				
		//오후 동아리 활동
		a11.addMouseListener(new MouseAdapter() {
		
		@Override
		public void mousePressed(MouseEvent e) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../images/Circles2.jpg")) .getImage();
			a10.setVisible(false);
			a11.setVisible(false);
		
			jl1.setText("동아리 활동을 하고 있습니다...");
			if(Person.hp >= 25) {
				jl2.setText("체력이 25 감소했습니다.");
				Person.hp -= 25;
			}else {
				jl2.setText("현재 체력이 MIN 입니다.");
				Person.hp = 0;
			}
			if(Person.mental >= 25) {
				jl3.setText("정신력이 25 감소했습니다.");
				Person.mental -= 25;
			}else {
				jl3.setText("현재 정신력이 MIN 입니다.");
				Person.mental = 0;
			}
			if(Person.stress >= 25) {
				jl4.setText("스트레스가 25 감소했습니다.");
				Person.stress -= 25;
			}else {
				jl4.setText("현재 스트레스가 MIN 입니다.");
				Person.stress = 0;
			}						
			if(Person.grade <= 98) {
				jl5.setText("!학점이 2 증가했습니다!");
				Person.grade += 2;
			}else {
				jl5.setText("현재 학점이 MAX 입니다.");
				Person.grade = 100;
			}	
			if(Person.friend <= 90) {
				jl6.setText("!인간관계가 10 증가했습니다!");
				Person.friend += 10;
			}else {
				jl6.setText("현재 인간관계가 MAX 입니다.");
				Person.friend = 100;
			}	
			a12.setVisible(true);
			a13.setVisible(true);								
			}
		});
				
	//집에가기
	a12.addMouseListener(new MouseAdapter() {			
	@Override
	public void mousePressed(MouseEvent e) {
		Gui.background = new ImageIcon(GameMain.class.getResource("../images/Eveningglow.jpg")) .getImage();
		a12.setVisible(false);
		a13.setVisible(false);
		jl1.setText("집으로 돌아가고 있습니다...");
		jl2.setText("");
		jl3.setText("");
		jl4.setText("");
		jl5.setText("");
		jl6.setText("");
		Job.next();
	}
});
		
	//계속 공부하기 -> 밥먹을지 선택
	a13.addMouseListener(new MouseAdapter() { 
		@Override
		public void mousePressed(MouseEvent e) {
		if(Person.hp > 30 && Person.mental > 30) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../images/df.jpg")) .getImage();
			a12.setVisible(false);
			a13.setVisible(false);
			jl1.setText("저녁식사를 하시겠습니까?");
			jl2.setText("");
			jl3.setText("");
			jl4.setText("");
			jl5.setText("");
			jl6.setText("");			
			a14.setVisible(true);
			a15.setVisible(true);
		}else {
			Gui.background = new ImageIcon(GameMain.class.getResource("../images/기운.jpg")) .getImage();
			jl1.setText("당신은 기운이 없어서 강제로 집으로 갈 수 밖에 없습니다.");
			jl2.setText("");
			jl3.setText("");
			jl4.setText("");
			jl5.setText("");
			jl6.setText("");
			a12.setVisible(true);
			a15.setVisible(false);
		}
	}
});
	//밥먹기
	a14.addMouseListener(new MouseAdapter() {
	@Override
		public void mousePressed(MouseEvent e) {
		Gui.background = new ImageIcon(GameMain.class.getResource("../images/Restaurant.jpg")).getImage();
		a14.setVisible(false); 
		a15.setVisible(false); 
		jl1.setText("저녁을 먹었습니다... 자금 -7000원");			
		if(Person.money >= 7000)
		{ 
			Person.money -= 7000;
			if(Person.hp >= 160){
			Person.hp = 200;
			jl2.setText("현재 체력이 MAX 입니다.");
		}else {
			Person.hp += 40;
			jl2.setText("체력이 +40 증가했습니다.");
		}
			if(Person.mental >= 60){
			Person.mental = 100;
			jl3.setText("현재 정신력이 MAX 입니다.");
		}else {
			Person.mental += 40;
			jl3.setText("정신력이 +40 증가했습니다.");
		}
	} else {
		jl1.setText("자금이 부족해서 식사를 할 수 없습니다.");
	}			
		a16.setVisible(true);
		a17.setVisible(true);
	}
});
	// 저녁밥 안먹기
	a15.addMouseListener(new MouseAdapter() {
	@Override
		public void mousePressed(MouseEvent e) {
		Gui.background = new ImageIcon(GameMain.class.getResource("../images/hungry1.jpg")).getImage();
		a14.setVisible(false); 
		a15.setVisible(false); 
		jl1.setText("식사를 거르는 것을 선택하셨습니다...");
		
		a16.setVisible(true);
		a17.setVisible(true);
		}
	});
		
	//저녁수업
	a16.addMouseListener(new MouseAdapter() {
	@Override
	public void mousePressed(MouseEvent e) {
		Gui.background = new ImageIcon(GameMain.class.getResource("../images/lecture3.jpg")).getImage();
		a16.setVisible(false);
		a17.setVisible(false);
		jl2.setVisible(true);
		jl3.setVisible(true);
		jl4.setVisible(true);
		jl5.setVisible(true);
		jl6.setVisible(true);
		jl1.setText("!수업을 듣고 있습니다...!");
				
		if(Person.hp >= 20) {
			jl2.setText("체력이 20 감소했습니다.");
			Person.hp -= 20;
		}else {
			jl2.setText("현재 체력이 MIN 입니다.");
			Person.hp = 0;
		}
			if(Person.mental >= 10) {
			jl3.setText("정신력이 10 감소했습니다.");
			Person.mental -= 10;
		}else {
			jl3.setText("현재 정신력이 MIN 입니다.");
			Person.mental = 0;
		}
			if(Person.stress <= 75) {
			jl4.setText("스트레스가 25 증가했습니다.");
			Person.stress += 25;
		}else {
			jl4.setText("현재 스트레스가 MAX 입니다.");
			Person.stress = 100;
		}						
			if(Person.grade <= 82) {
			jl5.setText("!학점이 18 증가했습니다!");
			Person.grade += 18;
		}else {
			jl5.setText("현재 학점이 MAX 입니다.");
			Person.grade = 100;
		}	
			if(Person.friend <= 97) {
			jl6.setText("!인간관계가 3 증가했습니다!");
			Person.friend += 3;
		}else {
			jl6.setText("현재 인간관계가 MAX 입니다.");
			Person.friend = 100;
		}	
		a18.setVisible(true);
		}				
	});
				
	//저녁 동아리
	a17.addMouseListener(new MouseAdapter() {	
		@Override
		public void mousePressed(MouseEvent e) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../images/Circles3.jpg")).getImage();
			a16.setVisible(false);
			a17.setVisible(false);
			jl1.setText("동아리 활동을 하고 있습니다...");
						
			if(Person.hp >= 35) {
				jl2.setText("체력이 35 감소했습니다.");
				Person.hp -= 35;
			}else {
				jl2.setText("현재 체력이 MIN 입니다.");
				Person.hp = 0;
			}
			if(Person.mental >= 30) {
				jl3.setText("정신력이 30 감소했습니다.");
				Person.mental -= 30;
			}else {
				jl3.setText("현재 정신력이 MIN 입니다.");
				Person.mental = 0;
			}
				if(Person.stress >= 35) {
					jl4.setText("스트레스가 35 감소했습니다.");
					Person.stress -= 35;
			}else {
				jl4.setText("현재 스트레스가 MIN 입니다.");
				Person.stress = 0;
			}						
				if(Person.grade <= 97) {
				jl5.setText("!학점이 3 증가했습니다!");
				Person.grade += 3;
			}else {
				jl5.setText("현재 학점이 MAX 입니다.");
				Person.grade = 100;
			}	
				if(Person.friend <= 82) {
				jl6.setText("!인간관계가 18 증가했습니다!");
				Person.friend += 18;
			}else {
				jl6.setText("현재 인간관계가 MAX 입니다.");
				Person.friend = 100;
			}	
			a18.setVisible(true);
		}
	});
		//집에가기
		a18.addMouseListener(new MouseAdapter() {	 
		@Override
			public void mousePressed(MouseEvent e) {
				Gui.background = new ImageIcon(GameMain.class.getResource("../images/end.jpg")).getImage();
				a18.setVisible(false);
				a19.setVisible(false);
				jl1.setText("집으로 돌아가고 있습니다...");
				Job.next();
			}
		});
	
				start.setBounds(900,170, 80, 50);
				start.setBorderPainted(true);
				start.setContentAreaFilled(true);
				start.setFocusPainted(false);
	
				a1.setVisible(false);
				a1.setBounds(900, 170, 80, 50);
				a1.setBorderPainted(true);
				a1.setContentAreaFilled(true);
				a1.setFocusPainted(false);
				
				a2.setVisible(false);
				a2.setBounds(1000, 170, 80, 50);
				a2.setBorderPainted(true);
				a2.setContentAreaFilled(true);
				a2.setFocusPainted(false);
				
				a3.setVisible(false);
				a3.setBounds(1100, 170, 80, 50);
				a3.setBorderPainted(true);
				a3.setContentAreaFilled(true);
				a3.setFocusPainted(false);
				
				a4.setVisible(false);
				a4.setBounds(900, 170, 80, 50);
				a4.setBorderPainted(true);
				a4.setContentAreaFilled(true);
				a4.setFocusPainted(false);
				
				a5.setVisible(false);
				a5.setBounds(1000, 170, 80, 50);
				a5.setBorderPainted(true);
				a5.setContentAreaFilled(true);
				a5.setFocusPainted(false);
				
				a6.setVisible(false);
				a6.setBounds(900, 170, 80, 50);
				a6.setBorderPainted(true);
				a6.setContentAreaFilled(true);
				a6.setFocusPainted(false);
				
				a7.setVisible(false);
				a7.setBounds(1000, 170, 80, 50);
				a7.setBorderPainted(true);
				a7.setContentAreaFilled(true);
				a7.setFocusPainted(false);
				
				a8.setVisible(false);
				a8.setBounds(900, 170, 80, 50);
				a8.setBorderPainted(true);
				a8.setContentAreaFilled(true);
				a8.setFocusPainted(false);
				
				a9.setVisible(false);
				a9.setBounds(1000, 170, 80, 50);
				a9.setBorderPainted(true);
				a9.setContentAreaFilled(true);
				a9.setFocusPainted(false);
				
				a10.setVisible(false);
				a10.setBounds(900, 170, 80, 50);
				a10.setBorderPainted(true);
				a10.setContentAreaFilled(true);
				a10.setFocusPainted(false);
				
				a11.setVisible(false);
				a11.setBounds(1000, 170, 80, 50);
				a11.setBorderPainted(true);
				a11.setContentAreaFilled(true);
				a11.setFocusPainted(false);
				
				a12.setVisible(false);
				a12.setBounds(900, 170, 80, 50);
				a12.setBorderPainted(true);
				a12.setContentAreaFilled(true);
				a12.setFocusPainted(false);
				
				a13.setVisible(false);
				a13.setBounds(1000, 170, 80, 50);
				a13.setBorderPainted(true);
				a13.setContentAreaFilled(true);
				a13.setFocusPainted(false);
				
				a14.setVisible(false);
				a14.setBounds(900, 170, 80, 50);
				a14.setBorderPainted(true);
				a14.setContentAreaFilled(true);
				a14.setFocusPainted(false);
				
				a15.setVisible(false);
				a15.setBounds(1000, 170, 80, 50);
				a15.setBorderPainted(true);
				a15.setContentAreaFilled(true);
				a15.setFocusPainted(false);
				
				a16.setVisible(false);
				a16.setBounds(900, 170, 80, 50);
				a16.setBorderPainted(true);
				a16.setContentAreaFilled(true);
				a16.setFocusPainted(false);
				
				a17.setVisible(false);
				a17.setBounds(1000, 170, 80, 50);
				a17.setBorderPainted(true);
				a17.setContentAreaFilled(true);
				a17.setFocusPainted(false);
				
				a18.setVisible(false);
				a18.setBounds(900, 170, 80, 50);
				a18.setBorderPainted(true);
				a18.setContentAreaFilled(true);
				a18.setFocusPainted(false);
				
				a19.setVisible(false);
				a19.setBounds(1000, 170, 80, 50);
				a19.setBorderPainted(true);
				a19.setContentAreaFilled(true);
				a19.setFocusPainted(false);
				
				a20.setVisible(false);
				a20.setBounds(900, 170, 80, 50);
				a20.setBorderPainted(true);
				a20.setContentAreaFilled(true);
				a20.setFocusPainted(false);
				
				a21.setVisible(false);
				a21.setBounds(1000, 170, 80, 50);
				a21.setBorderPainted(true);
				a21.setContentAreaFilled(true);
				a21.setFocusPainted(false);
				
				jl1.setVisible(true);
				jl1.setLayout(null);
				jl1.setBounds(60, 5, 600, 60);
				jl1.setFont(new Font("맑은 고딕", Font.ITALIC, 20));

				jl2.setVisible(true);
				jl2.setLayout(null);
				jl2.setBounds(60, 30, 1200, 60);
				jl2.setFont(new Font("맑은 고딕", Font.ITALIC, 20));
				
				jl3.setVisible(true);
				jl3.setLayout(null);
				jl3.setBounds(60, 45, 1200, 60);
				jl3.setFont(new Font("맑은 고딕", Font.ITALIC, 20));
				
				jl4.setVisible(true);
				jl4.setLayout(null);
				jl4.setBounds(60, 60, 1200, 60);
				jl4.setFont(new Font("맑은 고딕", Font.ITALIC, 20));
				
				jl5.setVisible(true);
				jl5.setLayout(null);
				jl5.setBounds(60, 75, 1200, 60);
				jl5.setFont(new Font("맑은 고딕", Font.ITALIC, 20));
				
				jl6.setVisible(true);
				jl6.setLayout(null);
				jl6.setBounds(60, 90, 1200, 60);
				jl6.setFont(new Font("맑은 고딕", Font.ITALIC, 20));
					
				Gui.p3.add(start);
				Gui.p3.add(jl1);
				Gui.p3.add(jl2);
				Gui.p3.add(jl3);
				Gui.p3.add(jl4);
				Gui.p3.add(jl5);
				Gui.p3.add(jl6);
	
				Gui.p3.add(a1);
				Gui.p3.add(a2);
				Gui.p3.add(a3);
				Gui.p3.add(a4);
				Gui.p3.add(a5);
				Gui.p3.add(a6);
				Gui.p3.add(a7);
				Gui.p3.add(a8);
				Gui.p3.add(a9);
				Gui.p3.add(a10);
				Gui.p3.add(a11);
				Gui.p3.add(a12);
				Gui.p3.add(a13);
				Gui.p3.add(a14);
				Gui.p3.add(a15);
				Gui.p3.add(a16);
				Gui.p3.add(a17);
				Gui.p3.add(a18);
				Gui.p3.add(a19);
				Gui.p3.add(a20);
				Gui.p3.add(a21);
	}
}

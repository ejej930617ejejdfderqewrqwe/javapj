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
import javax.swing.JPanel;

 public class Ending extends JFrame {
	
	
	
	Random r = new Random(); 
	static int eventCount1 =0; 
	static int eventCount2 =0;
	
	
	private JButton jbtn = new JButton("next");
	private JButton jbtn2 = new JButton("next");
	private JLabel endingla1 = new JLabel();
	private JLabel endingla2 = new JLabel();
	private JLabel endingla3 = new JLabel();
	private JLabel endingla4 = new JLabel();
	
	
	public Ending() {
		
		Gui.p.setVisible(false);
		Gui.p2.setVisible(false);
		Gui.p3.setVisible(false);
		Gui.p4.setVisible(false);
		Gui.p5.setVisible(false);
		Gui.p6.setVisible(false);
		Gui.p7.setVisible(true);
		
		
		
		
		Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ef.jpg"))
				.getImage();
		
		
		
		
		endingla1.setVisible(false);
		endingla1.setBounds(100, 10, 800, 100);
		endingla1.setFont(new Font("맑은고딕", Font.BOLD, 30));
		
		endingla2.setVisible(false);
		endingla2.setBounds(100, 45, 700, 100);
		endingla2.setFont(new Font("맑은고딕", Font.BOLD, 30));
		
		endingla3.setVisible(false);
		endingla3.setBounds(100, 80, 700, 100);
		endingla3.setFont(new Font("맑은고딕", Font.BOLD, 30));
		
		endingla4.setVisible(false);
		endingla4.setBounds(100, 115, 700, 100);
		endingla4.setFont(new Font("맑은고딕", Font.BOLD, 30));
		
		jbtn.setVisible(false);
		jbtn.setBounds(1050, 100, 80, 50);
		jbtn.setFont(new Font("맑은고딕", Font.BOLD,15));
		
		jbtn2.setVisible(false);
		jbtn2.setBounds(1050, 100, 80, 50);
		jbtn2.setFont(new Font("맑은고딕", Font.BOLD,15));
		
		Gui.p7.add(endingla1);
		Gui.p7.add(endingla2);
		Gui.p7.add(endingla3);
		Gui.p7.add(endingla4);	
		Gui.p7.add(jbtn);	
		Gui.p7.add(jbtn2);	
		
		

		
		jbtn.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", true);
				m.start();
				Gui.background = new ImageIcon(GameMain.class.getResource("../Images/hospital.jpg"))
					.getImage(); 
				Gui.p7.setVisible(true);
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(false);
			jbtn2.setVisible(false);
			jbtn.setVisible(false);
			endingla1.setText("※※ 더이상 학교를 다닐 수 없습니다 ※※");
			endingla3.setText("※※ 강제 휴학 ※※");
			
			
			}});
		jbtn2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Music m = new Music("but1.mp3", true);
				m.start();
				Gui.background = new ImageIcon(GameMain.class.getResource("../Images/bil.jpg"))
					.getImage();
				Gui.p7.setVisible(true);
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(false);
			jbtn2.setVisible(false);
			jbtn.setVisible(false);
			endingla1.setText("※※ 건물을 샀습니다 ※※");
			endingla3.setText("※※ 아무것도 안해도 평생 살 수 있습니다 ※※");
			}});
	}
	public void rnd() {

		int rd = r.nextInt(45);
		if(rd == 3 && eventCount2 ==0) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ambulance.jpg"))
					.getImage();
			Gui.p7.setVisible(true);
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(false);
			endingla4.setVisible(false);
			jbtn2.setVisible(false);
			jbtn.setVisible(true);
			endingla1.setText("※※!교통사고를 당했다!※※");
			
			
			eventCount2++;
	}else if(rd == 45 && eventCount1 ==0) {
		Gui.p7.setVisible(true);
		Gui.background = new ImageIcon(GameMain.class.getResource("../Images/lotto.jpg"))
				.getImage();
		endingla1.setVisible(true);
		endingla2.setVisible(false);
		endingla3.setVisible(false);
		endingla4.setVisible(false);
		jbtn.setVisible(false);
		jbtn2.setVisible(true);
		endingla1.setText("※※!로또에 당첨됐다!※※");
		
		eventCount1++;
	}
	}//랜덤 이벤트 끝
	
	
	public void ending() {
		if(Person.hpcnt >= 10) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/muscle.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(false);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※머슬마니아※※");
			endingla3.setText("체력  ▲ ▲ ▲");
			// 머슬마니아 엔딩
		}else if(Person.money >= 5000000) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/don.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(false);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※자산가※※");
			endingla3.setText("자산  ▲ ▲ ▲");
			// 자산가 엔딩 
		}else if(Person.money <= 20000) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/beggar.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(true);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※거지※※");
			endingla3.setText("돈줘!");
			endingla4.setText("자산 ▲ ▲ ▲");
			// 거지 엔딩
		}else if(Person.attract >= 20) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ch.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(true);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※치킨집 사장님※※");
			endingla3.setText("기승전 치킨집");
			endingla4.setText("매력 ▼ ▼ ▼");
			//재수강 엔딩
		}else if(Person.stress >= 70) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ja.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(true);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※자연인※※");
			endingla3.setText("속세를 떠나 자연으로 가겠소.. ");
			endingla4.setText("스트레스  ▲ ▲ ▲ ");
			// 자연인 엔딩
		}else if(Person.alc >= 50) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ail.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(true);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※알콜중독자※※");
			endingla3.setText("술이 나를 부르고 내가 술을 부르고.. ");
			endingla4.setText("알콜  ▲ ▲ ▲");
		}else if(Person.friend <= 10 ) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/pepe.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(false);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※아웃싸이더※※");
			endingla3.setText("인간관계 ▼ ▼ ▼");
		}else if(Person.grade >= 42) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/li.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(false);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※리틀 아인슈타인※※");
			endingla3.setText("학점  ▲ ▲ ▲");
			// 아인슈타인 엔딩
		}else if(Person.grade <= 41 && Person.grade > 30) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/jeasu.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(true);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※재수강※※");
			endingla3.setText("님아 그 강을 건너지 마오...");
			endingla4.setText("학점  ▼ ▼");
			// 재수강 엔딩
		}else if(Person.grade<= 30) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/ameba.png"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(true);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※아메바※※");
			endingla3.setText("다음생에는 짚신벌레로...");
			endingla4.setText("학점  ▼ ▼ ▼ ");
			// 아메바 엔딩
		}else if(Person.grade >= 100 ) {
			Gui.background = new ImageIcon(GameMain.class.getResource("../Images/jol.jpg"))
					.getImage();
			endingla1.setVisible(true);
			endingla2.setVisible(false);
			endingla3.setVisible(true);
			endingla4.setVisible(false);
			jbtn.setVisible(false);
			jbtn2.setVisible(false);
			endingla1.setText("※※조기졸업※※");
			endingla3.setText("학점  ▲ ▲ ▲");
			// 조기졸업 엔딩
		
			//아웃사이더 엔딩
		}
	}
	
	
	
}


	
	
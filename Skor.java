import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Skor extends Rectangle {
	
	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int player1; //score of players
	int player2;
	
	Skor(int GAME_WIDTH, int GAME_HEIGHT){
		Skor.GAME_WIDTH = GAME_WIDTH;
		Skor.GAME_HEIGHT = GAME_HEIGHT;
	}
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.setFont(new Font("Consolas", Font.PLAIN, 60));
		g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
		
		String p1 = String.valueOf(player1/10) + String.valueOf(player1%10); //for displaying 0 at the beginning of 1 digit scores
		String p2 = String.valueOf(player2/10) + String.valueOf(player2%10);
		
		g.drawString(p1, (GAME_WIDTH/2)-85, 50);
		g.drawString(p2, (GAME_WIDTH/2)+20, 50);
	}
}

package Game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class pointer {

	private static Image pointer = null;
	static int xpos = 1;
	static int ypos = 1;
	
	public static void init(GameContainer gc) throws SlickException {
		gc.setMouseGrabbed(true);
		pointer = new Image("resources/sprites/pointer.png");
	}
	
	public static void getcords(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub	
		Input input = gc.getInput();
		xpos = input.getMouseX();
		ypos = input.getMouseY();
		System.out.println(ypos);
	}
	
	public static void render(GameContainer gc) throws SlickException {
		
		pointer.draw(xpos, ypos);
		
	}
	
	}
	

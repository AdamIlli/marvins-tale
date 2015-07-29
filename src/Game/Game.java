package Game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Game extends BasicGame {
	
	private Image bg = null;
	private Image marvin = null;
	
	public Game(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		bg.draw(0, 0);
		marvin.draw(200, 200);
		pointer.render(gc);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		bg = new Image("resources/background/biscuit-corner.png");
		marvin = new Image("resources/sprites/marvin-left.png");
		pointer.init(gc);
		try {
			map_loader.getmap("resources/maps/biscuits_corner.xml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(GameContainer gc, int arg1) throws SlickException {
		// TODO Auto-generated method stub	
			
		pointer.getcords(gc);	
		
	}
	
	public static void main(String[] args) throws SlickException {
		
		AppGameContainer app = new AppGameContainer(new Game("Marvins tale"));
		app.setDisplayMode(800,  600, false);		
		app.start();
	}

}

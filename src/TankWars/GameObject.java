package TankWars;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alvin Nguyen & Moses Martinez
 * 
 * 
 * A game object is any object represented in-game
 * The following behaviors are to be inherited:
 * isVisible, Collidable, Update, getCoordinates, setCoordinates
 */

public abstract class GameObject{

    BufferedImage content;
    protected int x, y, width,length;
    boolean visibility, collided;
    
    //constructor
    public GameObject(int x, int y, BufferedImage Image, int width, int length){
        this.content = Image;
        this.x = x;
        this.y = y;
    }
    
    public boolean isVisible(){
        return true;
    }
    
    public void setVisible(boolean visibility){
        this.visibility = visibility;
    }
    
     public BufferedImage getImage(){
        return this.content;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    //for collision detection
    public Rectangle getHitBox(){
	return new Rectangle(x, y, width, length);
    }
    
    
    
    public abstract void collide(GameObject gameObject);
    
    public abstract void collide(Tank tank);
    
    public abstract void collide(BreakableWall breakableWall);
    
    public abstract void collide(NormalWall normalWall);
    
//    public abstract void collide(Bullet bullet);
//    
//    public abstract void collide(BreakableWall breakableWall);
//    
//    public abstract void collide(PowerUp powerUp);
}
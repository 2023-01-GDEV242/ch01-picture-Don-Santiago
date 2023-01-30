/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square box1player;
    private Square box2opponent;
    private Triangle nextarrow;
    private Circle ball1;
    private Person opponent;
    private Person player;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        box1player = new Square();
        box2opponent = new Square();
        nextarrow = new Triangle();  
        ball1 = new Circle();
        opponent= new Person();
        player = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            box1player.moveHorizontal(-140);
            box1player.moveVertical(20);
            box1player.changeSize(120);
            box1player.makeVisible();
            
            box2opponent.changeColor("blue");
            box2opponent.moveHorizontal(-300);
            box2opponent.moveVertical(-260);
            box2opponent.changeSize(240);
            box2opponent.makeVisible();
    
            nextarrow.changeSize(20, 10);
            nextarrow.moveHorizontal(20);
            nextarrow.moveVertical(-60);
            nextarrow.makeVisible();
    
            ball1.changeColor("yellow");
            ball1.moveHorizontal(100);
            ball1.moveVertical(-40);
            ball1.changeSize(80);
            ball1.makeVisible();
            
            opponent.changeColor("red");
            opponent.moveHorizontal(140);
            opponent.moveVertical(-150);
            opponent.makeVisible();
            
            player.changeColor("blue");
            player.moveHorizontal(-220);
            player.moveVertical(30);
            player.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        box1player.changeColor("black");
        box2opponent.changeColor("white");
        nextarrow.changeColor("black");
        ball1.changeColor("black");
        opponent.changeColor("black");
        player.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        box1player.changeColor("red");
        box2opponent.changeColor("black");
        nextarrow.changeColor("green");
        ball1.changeColor("yellow");
        opponent.changeColor("green");
        player.changeColor("blue");
    }
}

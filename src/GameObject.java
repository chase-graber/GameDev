import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class GameObject {
    // AP Standard: private instance variables
    private int x;
    private int y;
    private int width;
    private int height;
    private Texture image;
    private Rectangle hitbox;

    // AP Standard: constructors
    public GameObject(int x, int y, int width, int height, String imagePath) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = new Texture(imagePath);
        this.hitbox = new Rectangle(x, y, width, height);
    }

    // TODO 1: Write getter methods for x, y, and hitbox.
    public int getX() { return x; }
    public int getY() { return y; }
    public Rectangle getHitbox() { return hitbox; }

    // TODO 2: Write setter methods for x and y. 
    // HINT: When you change x or y, you MUST also update the hitbox!
    // Example: hitbox.setPosition(newX, newY);
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    /**
     * Draws the object to the screen. 
     */
    public void draw(SpriteBatch batch) {
        batch.draw(image, x, y, width, height);
    }

    /**
     * To be overridden by subclasses (Polymorphism).
     * The default GameObject does not move.
     */
    public void move() {
        // Leave blank for subclasses to override!
    }
}
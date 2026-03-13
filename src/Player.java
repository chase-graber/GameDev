import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player extends GameObject {
    
    public Player(int x, int y) {
        super(x, y, 50, 50, "ship.png");
    }

    @Override
    public void move() {
        int speed = Boolean.compare(Gdx.input.isButtonPressed(Input.Keys.RIGHT), Gdx.input.isButtonPressed(Input.Keys.LEFT)) * 5;
        setX(getX() + speed);
    }
}

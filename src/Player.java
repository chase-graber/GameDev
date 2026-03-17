import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player extends GameObject {

    private int speed;

    public Player(double x, double y) {
        super(x, y, 50, 50, "assets/ship.png");
        this.speed = 200;
    }

    @Override
    public void move(double deltaTime) {
        double xMov = Boolean.compare(Gdx.input.isKeyPressed(Input.Keys.RIGHT), Gdx.input.isKeyPressed(Input.Keys.LEFT)) * speed * deltaTime;
        double yMov = Boolean.compare(Gdx.input.isKeyPressed(Input.Keys.UP), Gdx.input.isKeyPressed(Input.Keys.DOWN)) * speed * deltaTime;
        setX(xMov + getX());
        setY(yMov + getY());
    }
}

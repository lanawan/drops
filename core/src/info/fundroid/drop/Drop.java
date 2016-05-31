package info.fundroid.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


import java.util.Iterator;

/**
 * Created by Гризли on 30.05.2016.
 */
public class Drop extends Game {
    SpriteBatch batch;
    BitmapFont font;

    @Override
    public void create(){
        batch = new SpriteBatch();
        font = new BitmapFont();
        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();

    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
        font.dispose();
    }
}

package info.fundroid.drop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import info.fundroid.drop.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
//		System.setProperty("user.name","CorrectUserName");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "GameScreen";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Drop(), config);
	}
}

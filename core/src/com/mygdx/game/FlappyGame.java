package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;

public class FlappyGame extends Game {
	public static final int SCR_WIDTH = 1280, SCR_HEIGHT = 720;
	SpriteBatch batch;
	OrthographicCamera camera;
	Vector3 touch;
	ScreenMain screenMain;
	ScreenGame screenGame;

	@Override
	public void create () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, SCR_WIDTH, SCR_HEIGHT);
		touch = new Vector3();

		screenMain = new ScreenMain(this);
		screenGame = new ScreenGame(this);

		setScreen(screenMain);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}

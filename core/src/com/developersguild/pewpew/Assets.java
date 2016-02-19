package com.developersguild.pewpew;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Vihan on 1/10/2016.
 */
public class Assets {

    public static final int ENEMY_SPRITES = 15;
    public static final int TERRAIN_SPRITES = 7;

    public static BitmapFont font;

    public static Texture playText;
    public static TextureRegion playTextRegion;

    public static Texture exitText;
    public static TextureRegion exitTextRegion;

    public static Texture uiButtons;
    public static TextureRegion pauseButton;
    //public static TextureRegion reloadButton;
    //public static TextureRegion menuButton;
    public static TextureRegion playButton;
    //public static TextureRegion exitButton;

    public static Texture background;
    public static TextureRegion backgroundRegion;

    public static Texture bullet;
    public static TextureRegion bulletRegion;

    public static Texture[] terrains;
    public static TextureRegion[] terrainRegions;

    public static Texture ship;
    public static Animation shipNormal;

    public static Texture healthBar;
    public static TextureRegion healthRegion;

    public static Texture[] enemies;
    public static TextureRegion[] enemyRegions;

    public static Texture loadTexture(String file) {
        return new Texture(Gdx.files.internal(file));
    }

    public static void load() {
        font = new BitmapFont(Gdx.files.internal("font.fnt"), Gdx.files.internal("font.png"), false);

        playText = loadTexture("play.png");
        playTextRegion = new TextureRegion(playText, 160 - 150, 200 + 18, 300, 36);

        exitText = loadTexture("exit.png");
        exitTextRegion = new TextureRegion(exitText, 160 - 150, 200 - 18 - 36, 300, 36);

        uiButtons = loadTexture("ui_buttons.png");
        pauseButton = new TextureRegion(uiButtons, 0, 0, 40, 50);
        playButton = new TextureRegion(uiButtons, 235 - 40 * 2, 0, 40, 50);

        background = loadTexture("background.png");
        background.setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.Repeat);
        backgroundRegion = new TextureRegion(background, 0, 0, 320, 480);

        bullet = loadTexture("bullet.png");
        bulletRegion = new TextureRegion(bullet, 0, 0, 8, 8);

        terrains = new Texture[TERRAIN_SPRITES];
        terrainRegions = new TextureRegion[TERRAIN_SPRITES];
        for (int i = 0; i < TERRAIN_SPRITES; i++) {
            terrains[i] = loadTexture("terrain" + (i + 1) + ".png");
            terrainRegions[i] = new TextureRegion(terrains[i], 0, 0, 32, 32);
        }

        ship = loadTexture("ship.png");
        shipNormal = new Animation(0.02f, new TextureRegion(ship, 0, 0, 96, 96));
        shipNormal.setPlayMode(Animation.PlayMode.LOOP);

        healthBar = loadTexture("health_bar.png");
        healthRegion = new TextureRegion(healthBar, 0, 0, 95, 5);

        enemies = new Texture[ENEMY_SPRITES];
        enemyRegions = new TextureRegion[ENEMY_SPRITES];
        for (int i = 0; i < ENEMY_SPRITES; i++) {
            enemies[i] = loadTexture(i + 1 + ".png");
            enemyRegions[i] = new TextureRegion(enemies[i], 0, 0, 32, 32);
        }
    }
}

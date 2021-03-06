package io.developersguild.rebelinvader.components;

import com.badlogic.ashley.core.Component;

/**
 * Created by Vihan on 1/10/2016.
 */
public class PlayerComponent implements Component {
    public static final float STARTING_HEALTH = 100f;
    public static final int STATE_NORMAL = 0;
    public static final int STATE_KNOCKED_BACK = 1;

    public static final float VELOCITY_X = 1500f;
    public static final float VELOCITY_Y = 80f;
    public static final float WIDTH = 2f;
    public static final float HEIGHT = 2f;
    public static final float BULLETS_PER_SECOND = 4;
    public static final float FIRE_RATE = 1f / BULLETS_PER_SECOND;

    public static final float KNOCKBACK_DURATION = 0.4f;

    public float maxHealth;
    public float currentHealth;
    public float currentPower;

    public float heightSoFar = 0f;
    public float impactCooldown = 0f;
    public float bulletTimer = 0f;
    public float missileTimer = 0f;
}

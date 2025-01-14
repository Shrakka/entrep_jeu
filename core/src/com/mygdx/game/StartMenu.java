package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

/**
 * Created by alexis on 06/12/16.
 */

public class StartMenu {
    private String string;
    private Sprite sprite;
    private Button startbutton;
    private Button fbbutton;
    private Button cbutton;

    public StartMenu(String string){
        this.string = string;
        this.startbutton = new Button("center",Dimensions.Height(64),0.368,"startscreen/startbutton.png");
        this.fbbutton = new Button("center",Dimensions.Height(56),0.368,"startscreen/fbbutton.png");
        this.cbutton = new Button("center",Dimensions.Height(48),0.368,"startscreen/cbutton.png");

        this.init();
    }

    public Button getStartButton() {
        return this.startbutton;
    }

    public Button getCButton() {
        return this.cbutton;
    }


    public String getString(){
        return this.string;
    }

    public void init(){
        Texture texture = new Texture(Gdx.files.internal(this.getString()));
        texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        this.sprite = new Sprite(texture);
        this.sprite.setSize(Gdx.graphics.getWidth(), this.sprite.getHeight()*Gdx.graphics.getWidth()/this.sprite.getWidth());
        this.sprite.setOrigin(0,0);
        this.sprite.setPosition(0,0);
    }

    public void draw(SpriteBatch batch){
        this.sprite.draw(batch);
        this.getStartButton().draw(batch);
        this.fbbutton.draw(batch);
        this.cbutton.draw(batch);
    }
}

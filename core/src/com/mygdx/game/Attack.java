package com.mygdx.game;

import java.util.ArrayList;

/**
 * Created by alexis on 10/12/16.
 */

public class Attack extends Animated{
    private String element;

    public Attack(String string, int line, int y, int width, int height, String element){
        super(string, line, y, width, height);
        this.element = element;
    }

    public void Up(){
        this.setY(this.getY() + 8);
    }

    public void Down(){
        this.setY(this.getY() - 8);
    }

    public int checkCollision(ArrayList<Ennemy> ennemy){
        for (int i = 0; i < ennemy.size(); i++){
            if (this.getBounds().overlaps(ennemy.get(i).getBounds())){
                return i;
            }
        }
        return -1;
    }

    public boolean checkCollision(Character character){
        if (this.getBounds().overlaps(character.getBounds())){
            return true;
        }
        return false;
    }

    public int checkCollisionAttack(Ennemy ennemy){
        for (int i = 0; i < ennemy.getAttack().size(); i++){
            if (this.getBounds().overlaps(ennemy.getAttack().get(i).getBounds())){
                return i;
            }
        }
        return -1;
    }
}

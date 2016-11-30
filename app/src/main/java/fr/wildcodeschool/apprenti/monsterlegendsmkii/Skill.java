package fr.wildcodeschool.apprenti.monsterlegendsmkii;

import java.io.Serializable;

/**
 * Created by apprenti on 14/09/16.
 */
public class Skill implements Serializable{
    private int life;
    private int strenght;
    private int speed;
    private int stamina;

    public Skill(int life, int strenght, int speed, int stamina) {
        this.life = life;
        this.strenght = strenght;
        this.speed = speed;
        this.stamina = stamina;
    }

    public int getLife(){return this.life;}

    public int getStrenght(){return this.strenght;}

    public int getSpeed(){return this.speed;}

    public int getStamina(){return this.stamina;}
}

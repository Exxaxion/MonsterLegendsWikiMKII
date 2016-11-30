package fr.wildcodeschool.apprenti.monsterlegendsmkii;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by apprenti on 14/09/16.
 */
public class Monster implements Serializable{
    private String name;
    private String type;
    private int imgEgg;
    private int imgStats;
    private ArrayList<Skill> evolutions;
    private int evolutions_image;
    private int evolutions_image1;
    private int evolutions_image2;
    private int evolutions_image3;


    public Monster(String name, String type, int imgEgg, Skill[] skillsArg, int evolutions_image, int evolutions_image1, int evolutions_image2, int evolutions_image3) {
        this.name = name;
        this.type = type;
        this.imgEgg = imgEgg;
        this.evolutions = new ArrayList<Skill>();
        for (Skill skillItem : skillsArg) {
            evolutions.add(skillItem);
        }
        this.evolutions_image = evolutions_image;
        this.evolutions_image1 = evolutions_image1;
        this.evolutions_image2 = evolutions_image2;
        this.evolutions_image3 = evolutions_image3;



    }
    public String getName() { return this.name; }
    public String getType() { return this.type; }
    public int getEgg() { return this.imgEgg; }
    public int getEvolutions_image() { return this.evolutions_image; }
    public int getImgStats() { return this.imgStats; }
    public Skill getSkill_byEvolution(int evo){ return this.evolutions.get(evo); }

    public int getEvolutions_image1() { return this.evolutions_image1; }
    public int getEvolutions_image2() { return this.evolutions_image2; }
    public int getEvolutions_image3() { return this.evolutions_image3; }
 }





// public void addEvolution(Skill skill) {
//      this.evolutions.add(skill);
//  }

//   public Skill getEvolutionSkill(int evol) {
//       return this.evolutions.get(evol);
//    }
//}


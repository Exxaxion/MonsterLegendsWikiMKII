package fr.wildcodeschool.apprenti.monsterlegendsmkii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import  android.view.View;


public class MainActivity extends AppCompatActivity {
    public final static String MONSTER = "fr.wildcodeschool.apprenti.monsterlegendsmkii.MONSTER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Liste des Monstres

        final ArrayList<Monster> listmonster = new ArrayList<>();
        listmonster.add(new Monster("Fire Lion", "Feu", R.drawable.fire_lion_0, new Skill[]{new Skill(2480, 100, 875, 100), new Skill(2680, 120, 1075, 120), new Skill(2880, 140, 1275, 140), new Skill(3080, 160, 1475, 160)},R.drawable.fire_lion_0,R.drawable.fire_lion_1,R.drawable.fire_lion_2,R.drawable.fire_lion_3));
        listmonster.add(new Monster("Rockilla", "Terre", R.drawable.rockilla_0,new Skill[]{new Skill(3575, 875, 875, 100), new Skill(3675, 950, 1075, 120), new Skill(3775, 1050, 1275, 140), new Skill(3975, 1250, 1475, 160)},R.drawable.rockilla_0,R.drawable.rockilla_1,R.drawable.rockilla_2,R.drawable.rockilla_3));
        listmonster.add(new Monster("Turtle", "Eau", R.drawable.turtle_0, new Skill[]{new Skill(2777, 1000, 1000, 100), new Skill(2977, 120, 1200, 120), new Skill(3177, 140, 1400, 140), new Skill(3377, 160, 1600, 160)},R.drawable.turtle_0,R.drawable.turtle_1,R.drawable.turtle_2,R.drawable.turtle_3));
        listmonster.add(new Monster("Panda", "Nature", R.drawable.panda_0, new Skill[]{new Skill(2480, 1000, 950, 100), new Skill(2680, 1200, 1150, 120), new Skill(2880, 1400, 1350, 140), new Skill(3080, 1600, 1550, 160)},R.drawable.panda_0,R.drawable.panda_1,R.drawable.panda_2,R.drawable.panda_3));
        listmonster.add(new Monster("Thunder Eagle", "Foudre", R.drawable.thunder_eagle_0, new Skill[]{new Skill(2480, 875, 1250, 100), new Skill(2680, 1075, 1450, 120), new Skill(2880, 1275, 1650, 140), new Skill(3080, 1475, 1850, 160)},R.drawable.thunder_eagle_0,R.drawable.thunder_eagle_1,R.drawable.thunder_eagle_2,R.drawable.thunder_eagle_3));
        listmonster.add(new Monster("Light Spirit", "Lumière", R.drawable.light_spirit_0, new Skill[]{new Skill(3521, 875, 875, 100), new Skill(3721, 1075, 1075, 120), new Skill(3921, 1275, 1275, 140), new Skill(4121, 1475, 1475, 160)},R.drawable.light_spirit_0,R.drawable.light_spirit_1,R.drawable.light_spirit_2,R.drawable.light_spirit_3));
        listmonster.add(new Monster("Tyrannoking", "Mort", R.drawable.tyrannoking_0, new Skill[]{new Skill(2480, 1150, 875, 100), new Skill(2680, 1350, 1075, 120), new Skill(2880, 1550, 1275, 140), new Skill(3080, 1750, 1475, 160)},R.drawable.tyrannoking_0,R.drawable.tyrannoking_1,R.drawable.tyrannoking_2,R.drawable.tyrannoking_3));
        listmonster.add(new Monster("Genie", "Magie", R.drawable.genie_0, new Skill[]{new Skill(2480, 950, 1250, 100), new Skill(2680, 1150, 1450, 120), new Skill(2880, 1350, 1650, 140), new Skill(3080, 1550, 1850, 160)},R.drawable.genie_0,R.drawable.genie_1,R.drawable.genie_2,R.drawable.genie_3));
        listmonster.add(new Monster("Firesaur", "Feu", R.drawable.firesaur_0, new Skill[]{new Skill(2480, 1375, 875, 100), new Skill(2680, 1575, 1075, 120), new Skill(2880, 1775, 1275, 140), new Skill(3080, 1975, 1475, 160)},R.drawable.firesaur_0,R.drawable.firesaur_1,R.drawable.firesaur_2,R.drawable.firesaur_3));
        listmonster.add(new Monster("Mersnake", "Eau", R.drawable.mersnake_0, new Skill[]{new Skill(2777, 1125, 1000, 100), new Skill(2977, 1325, 1200, 120), new Skill(3177, 1525, 1400, 140), new Skill(3377, 1725, 1600, 160)},R.drawable.mersnake_0,R.drawable.mersnake_1,R.drawable.mersnake_2,R.drawable.mersnake_3));
        listmonster.add(new Monster("Treezard", "Nature", R.drawable.treezard_0, new Skill[]{new Skill(2777, 1125, 1000, 100), new Skill(2977, 1325, 1200, 120), new Skill(3177, 1525, 1400, 140), new Skill(3377, 1725, 1600, 160)},R.drawable.treezard_0,R.drawable.treezard_1,R.drawable.treezard_2,R.drawable.treezard_3));
        listmonster.add(new Monster("Metalsaur", "Métal", R.drawable.metalsaur_0, new Skill[]{new Skill(2976, 1120, 1000, 100), new Skill(3176, 1320, 1200, 120), new Skill(3376, 1520, 1400, 140), new Skill(3576, 1720, 1600, 160)},R.drawable.metalsaur_0,R.drawable.metalsaur_1,R.drawable.metalsaur_2,R.drawable.metalsaur_3));

        CustomAdapter adapter = new CustomAdapter(this, listmonster);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle monBundle = new Bundle();
                monBundle.putSerializable(MONSTER, listmonster.get(position));
                intent.putExtras(monBundle);
                startActivity(intent);

            }
        });
    }
}
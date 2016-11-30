package fr.wildcodeschool.apprenti.monsterlegendsmkii;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

// Bundle
        final Monster monMonster = (Monster) getIntent().getSerializableExtra(MainActivity.MONSTER);

// affiche le nom
        TextView txtName = (TextView) findViewById(R.id.list_row_name);
        txtName.setText(monMonster.getName());

// image oeuf
        ImageView imgEgg = (ImageView) findViewById(R.id.img_egg);
        imgEgg.setImageResource(monMonster.getEgg());

// affiche le type
        TextView txtElement = (TextView) findViewById(R.id.element_type);
        txtElement.setText(monMonster.getType());


// image stats
        final TextView statsLife = (TextView) findViewById(R.id.number_row_life);
        statsLife.setText(Integer.toString(monMonster.getSkill_byEvolution(0).getLife()));

        final TextView statsPower = (TextView) findViewById(R.id.number_row_power);
        statsPower.setText(Integer.toString(monMonster.getSkill_byEvolution(0).getStrenght()));

        final TextView statsAgility = (TextView) findViewById(R.id.number_row_agility);
        statsAgility.setText(Integer.toString(monMonster.getSkill_byEvolution(0).getSpeed()));

        final TextView statsStamina = (TextView) findViewById(R.id.number_row_stamina);
        statsStamina.setText(Integer.toString(monMonster.getSkill_byEvolution(0).getStamina()));

        // image evos
        ImageView img_evolutions = (ImageView) findViewById(R.id.img_evolution0);
        img_evolutions.setImageResource(monMonster.getEvolutions_image());
        img_evolutions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statsLife.setText(Integer.toString(monMonster.getSkill_byEvolution(0).getLife()));
                statsPower.setText(Integer.toString(monMonster.getSkill_byEvolution(0).getStrenght()));
                statsAgility.setText(Integer.toString(monMonster.getSkill_byEvolution(0).getSpeed()));
                statsStamina.setText(Integer.toString(monMonster.getSkill_byEvolution(0).getStamina()));

            }

        });

        ImageView img_evolutions1 = (ImageView) findViewById(R.id.img_evolution1);
        img_evolutions1.setImageResource(monMonster.getEvolutions_image1());
        img_evolutions1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statsLife.setText(Integer.toString(monMonster.getSkill_byEvolution(1).getLife()));
                statsPower.setText(Integer.toString(monMonster.getSkill_byEvolution(1).getStrenght()));
                statsAgility.setText(Integer.toString(monMonster.getSkill_byEvolution(1).getSpeed()));
                statsStamina.setText(Integer.toString(monMonster.getSkill_byEvolution(1).getStamina()));

            }
        });

        ImageView img_evolutions2 = (ImageView) findViewById(R.id.img_evolution2);
        img_evolutions2.setImageResource(monMonster.getEvolutions_image2());
        img_evolutions2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statsLife.setText(Integer.toString(monMonster.getSkill_byEvolution(2).getLife()));
                statsPower.setText(Integer.toString(monMonster.getSkill_byEvolution(2).getStrenght()));
                statsAgility.setText(Integer.toString(monMonster.getSkill_byEvolution(2).getSpeed()));
                statsStamina.setText(Integer.toString(monMonster.getSkill_byEvolution(2).getStamina()));

            }
        });

        ImageView img_evolutions3 = (ImageView) findViewById(R.id.img_evolution3);
        img_evolutions3.setImageResource(monMonster.getEvolutions_image3());
        img_evolutions3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statsLife.setText(Integer.toString(monMonster.getSkill_byEvolution(3).getLife()));
                statsPower.setText(Integer.toString(monMonster.getSkill_byEvolution(3).getStrenght()));
                statsAgility.setText(Integer.toString(monMonster.getSkill_byEvolution(3).getSpeed()));
                statsStamina.setText(Integer.toString(monMonster.getSkill_byEvolution(3).getStamina()));

            }
        });

    }

}

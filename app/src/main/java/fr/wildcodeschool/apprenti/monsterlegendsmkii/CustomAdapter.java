package fr.wildcodeschool.apprenti.monsterlegendsmkii;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


/**
 * Created by apprenti on 13/09/16.
 */
public class CustomAdapter extends ArrayAdapter<Monster> {

    //Attributs
    private final Activity context;
    private final ArrayList<Monster> list;

    //Constructeur
    public CustomAdapter(Activity context, ArrayList<Monster> list) {
        super(context, R.layout.listview, list);

        this.context=context;
        this.list=list;
    }

    //Methode pour mettre nos valeurs dans les textView et imageView
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview, null,true);

        //Identifier les id de nos Views qui sont dans le fichier listview.xml
        TextView txtTitle = (TextView) rowView.findViewById(R.id.list_row_name);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.list_row_icon);

        //Affecter nos valeurs dans la View souhaité
        Monster m = this.list.get(position);
        txtTitle.setText(m.getName());
        imageView.setImageResource(getImagefromType(m.getType()));

        //Retourne une ligne de la liste
        return rowView;
    }

    //Interverti le type texte avec l'image dans les res
    private static int getImagefromType(String type){
        switch (type){
            case "Feu":
                return R.drawable.feu;
            case "Terre":
                return R.drawable.terre;
            case "Eau":
                return R.drawable.eau;
            case "Nature":
                return R.drawable.nature;
            case "Foudre":
                return R.drawable.foudre;
            case "Lumière":
                return R.drawable.lumiere;
            case "Mort":
                return R.drawable.mort;
            case "Magie":
                return R.drawable.magie;
            case "Métal":
                return R.drawable.metal;
            default:
                return R.drawable.oeuf_inconnu;
        }


    }

}
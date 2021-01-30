package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /*Exercice 3 le view avec le code
        TextView nom = new TextView(this);
        nom.setText("Nom: ");
        TextView prenom = new TextView(this);
        prenom.setText("Prenom: ");
        TextView age = new TextView(this);
        age.setText("Age: ");
        TextView domaineDeCompetence = new TextView(this);
        domaineDeCompetence.setText("Skill: ");
        TextView numeroDeTelephone = new TextView(this);
        numeroDeTelephone.setText("N Telephone: ");
        EditText Enom = new EditText(this);
        Enom.setHint("saisi le nom ici");
        Enom.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,100,400));
        EditText Eprenom = new EditText(this);
        Eprenom.setHint("saisi le prenom ici");
        Eprenom.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,100,400));
        EditText Eage = new EditText(this);
        Eage.setHint("saisi le age ici");
        Eage.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,100,400));
        EditText EdomaineDeCompetence = new EditText(this);
        EdomaineDeCompetence.setHint("saisi le skill ici");
        EdomaineDeCompetence.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,100,400));
        EditText EnumeroDeTelephone = new EditText(this);
        EnumeroDeTelephone.setHint("saisi le numero ici");
        EnumeroDeTelephone.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,100,400));
        Button submit = new Button(this);
        submit.setText("Submit");
        submit.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,100,400));
        LinearLayout myLayout = new LinearLayout(this);
        LinearLayout nomLayout = new LinearLayout(this);
        LinearLayout prenomLayout = new LinearLayout(this);
        LinearLayout ageLayout = new LinearLayout(this);
        LinearLayout skillLayout = new LinearLayout(this);
        LinearLayout nTelephoneLayout = new LinearLayout(this);
        myLayout.setOrientation(LinearLayout.VERTICAL);
        nomLayout.setOrientation(LinearLayout.HORIZONTAL);
        nomLayout.addView(nom);
        nomLayout.addView(Enom);
        prenomLayout.addView(prenom);
        prenomLayout.addView(Eprenom);
        ageLayout.addView(age);
        ageLayout.addView(Eage);
        skillLayout.addView(domaineDeCompetence);
        skillLayout.addView(EdomaineDeCompetence);
        nTelephoneLayout.addView(numeroDeTelephone);
        nTelephoneLayout.addView(EnumeroDeTelephone);
        myLayout.addView(nomLayout);
        myLayout.addView(prenomLayout);
        myLayout.addView(ageLayout);
        myLayout.addView(skillLayout);
        myLayout.addView(nTelephoneLayout);
        myLayout.addView(submit);
        setContentView(myLayout); */

    }
}

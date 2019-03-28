package com.example.lsport;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.rootContainer);

        RadioButton dFormII = new RadioButton(this);
        dFormII.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        dFormII.setText(R.string.formI);
        dFormII.setId(0);

        RadioButton fFormII = new RadioButton(this);
        fFormII.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        fFormII.setText(R.string.formII);
        fFormII.setId(1);

        RadioGroup selectForm = new RadioGroup(this);
        LinearLayout.LayoutParams params =  new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(40, 0, 0, 0);
        selectForm.setLayoutParams(params);



        if (linearLayout != null){
            selectForm.addView(dFormII);
            selectForm.addView(fFormII);
            linearLayout.addView(selectForm);

            selectForm.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    TextView form = findViewById(R.id.form);

                    TextView attDef = findViewById(R.id.attDef);

                    if (checkedId == 0) { //Ceux qui sont au début de la Form II
                            int firstCheckFormI = (int)(Math.random()* 11);
                            switch (firstCheckFormI){ //Random attaque Form I ou juste Form II
                                case 0:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Destro");
                                    break;
                                case 1:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Sinestro");
                                    break;
                                case 2:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Levante");
                                    break;
                                case 3:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Montante");
                                    break;
                                case 4:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Revescio");
                                    break;
                                case 5:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Fendente");
                                    break;
                                case 6:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Settima");
                                    break;
                                case 7:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Ottava");
                                    break;
                                case 8:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Diagonale destro");
                                    break;
                                case 9:
                                    form.setText("Utiliser que la Form I");
                                    attDef.setText("Diagonale Sinestro");
                                    break;
                                default:
                                    form.setText("Utiliser que la Form II");
                                    attDef.setText("");
                            }

                    }else{ //Ceux qui sont fin Form II
                        int xform = (int)(Math.random()*3); //Random entre Form I - II ou autorisation des 2
                        switch (xform){
                            case 0:
                                form.setText("Utiliser que la Form I");
                                int secondCheckFormI = (int)(Math.random()*10);
                                switch (secondCheckFormI){
                                    case 0:
                                        attDef.setText("Destro");
                                        break;
                                    case 1:
                                        attDef.setText("Sinestro");
                                        break;
                                    case 2:
                                        attDef.setText("Levante");
                                        break;
                                    case 3:
                                        attDef.setText("Montante");
                                        break;
                                    case 4:
                                        attDef.setText("Revescio");
                                        break;
                                    case 5:
                                        attDef.setText("Fendente");
                                        break;
                                    case 6:
                                        attDef.setText("Settima");
                                        break;
                                    case 7:
                                        attDef.setText("Ottava");
                                        break;
                                    case 8:
                                        attDef.setText("Diagonale destro");
                                        break;
                                    default:
                                        attDef.setText("Diagonale Sinestro");
                                }
                                break ;
                            case 1:
                                form.setText("Utiliser que la Form II");
                                int secondCheckFormII = (int)(Math.random()*14);
                                switch (secondCheckFormII){
                                    case 0:
                                        attDef.setText("Semi-affondo basso");
                                        break;
                                    case 1:
                                        attDef.setText("Semi-affondo medio");
                                        break;
                                    case 2:
                                        attDef.setText("Semi-affondo alto");
                                        break;
                                    case 3:
                                        attDef.setText("Dritto");
                                        break;
                                    case 4:
                                        attDef.setText("Revescio");
                                        break;
                                    case 5:
                                        attDef.setText("Fendente");
                                        break;
                                    case 6:
                                        attDef.setText("Raggrupo");
                                        break;
                                    case 7:
                                        attDef.setText("Secunda quarta");
                                        break;
                                    case 8:
                                        attDef.setText("Secunda quarta inversa");
                                        break;
                                    case 9 :
                                        attDef.setText("Fendente rovesciato");
                                        break;
                                    case 10:
                                        attDef.setText("Prima due manni");
                                        break;
                                    case 11:
                                        attDef.setText("Secunda due manni");
                                        break;
                                    case 12:
                                        attDef.setText("Terza due manni");
                                        break;
                                    default:
                                        attDef.setText("Quarta due manni");
                                }
                                break;
                            default:
                                form.setText("Droit aux 2 Form");
                                int secondCheckFormIAndII = (int)(Math.random()*24);
                                switch (secondCheckFormIAndII){
                                    case 0:
                                        attDef.setText("Destro");
                                        break;
                                    case 1:
                                        attDef.setText("Sinestro");
                                        break;
                                    case 2:
                                        attDef.setText("Levante");
                                        break;
                                    case 3:
                                        attDef.setText("Montante");
                                        break;
                                    case 4:
                                        attDef.setText("Revescio");
                                        break;
                                    case 5:
                                        attDef.setText("Fendente");
                                        break;
                                    case 6:
                                        attDef.setText("Settima");
                                        break;
                                    case 7:
                                        attDef.setText("Ottava");
                                        break;
                                    case 8:
                                        attDef.setText("Diagonale destro");
                                        break;
                                    case 9:
                                        attDef.setText("Diagonale Sinestro");
                                        break;
                                    case 10:
                                        attDef.setText("Semi-affondo basso");
                                        break;
                                    case 11:
                                        attDef.setText("Semi-affondo medio");
                                        break;
                                    case 12:
                                        attDef.setText("Semi-affondo alto");
                                        break;
                                    case 13:
                                        attDef.setText("Dritto");
                                        break;
                                    case 14:
                                        attDef.setText("Revescio");
                                        break;
                                    case 15:
                                        attDef.setText("Fendente");
                                        break;
                                    case 16:
                                        attDef.setText("Raggrupo");
                                        break;
                                    case 17:
                                        attDef.setText("Secunda quarta");
                                        break;
                                    case 18:
                                        attDef.setText("Secunda quarta inversa");
                                        break;
                                    case 19 :
                                        attDef.setText("Fendente rovesciato");
                                        break;
                                    case 20:
                                        attDef.setText("Prima due manni");
                                        break;
                                    case 21:
                                        attDef.setText("Secunda due manni");
                                        break;
                                    case 22:
                                        attDef.setText("Terza due manni");
                                        break;
                                    default:
                                        attDef.setText("Quarta due manni");

                                }
                        }

                    }

                }
            });
        }

    }
}

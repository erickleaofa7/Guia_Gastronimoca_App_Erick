package com.erick.guia_gastronimoca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Layout_Playero extends AppCompatActivity {

    TextView text, text1, text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__playero);
        String inf = "            1. 1 ½ kg de Pargo limpio y sin escamas  "
                                + System.getProperty("line.separator") +
                                "            2. Zumo de 1 limón    "
                                + System.getProperty("line.separator") +
                                "            3. 3 cucharaditas de sa "
                                + System.getProperty("line.separator") +
                                "            4. ½ taza de harina de trigo   "
                                + System.getProperty("line.separator") +
                                "            5.  ¾ taza de aceite de freír";


                text.setText(inf);

                text1 = findViewById(R.id.txtPreparacion);

                String prep =
                        "       1.  Colocar el pescado en un envase con la sal y el zumo de   "
                                + System.getProperty("line.separator") +
                                "        limón y dejar marinar durante ½ hora.  "
                                + System.getProperty("line.separator")
                                + System.getProperty("line.separator") +
                                "  2.  Sacar las ruedas de la marinada y escurrir    "
                                + System.getProperty("line.separator") +
                                "  con papel absorbente.    "
                                + System.getProperty("line.separator") +
                                "  3. Pasar el pescado por la harina y freír en un sartén    "
                                + System.getProperty("line.separator") +
                                "      con aceite caliente.   "
                                + System.getProperty("line.separator")
                                + System.getProperty("line.separator") +
                                "  4.  Freír durante 10 minutos por cada lado o hasta " +
                                " ver ambos lados dorados.  ";

                text1.setText(prep);

                text2 = findViewById(R.id.txtConsejo);

                String con =
                        "   Puede acompañar con tostones o arroz y ensalada de lechugas. ";


                text2.setText(con);
            }
        }
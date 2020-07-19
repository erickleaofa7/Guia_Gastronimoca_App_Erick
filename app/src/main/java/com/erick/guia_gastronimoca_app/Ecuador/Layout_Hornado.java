package com.erick.guia_gastronimoca_app.Ecuador;

import androidx.appcompat.app.AppCompatActivity;
import com.erick.guia_gastronimoca_app.R;

import android.os.Bundle;
import android.widget.TextView;

public class Layout_Hornado extends AppCompatActivity {
    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__hornado);

        text = findViewById(R.id.txtEncevollado);

        String inf =
                        "            1. 20 libras una pierna entera de chancho  "
                        + System.getProperty("line.separator") +
                        "            2. El jugo de tres limones   "
                        + System.getProperty("line.separator") +
                        "            3. 40 dientes de ajo ~3 cabezas de ajo,   "
                        + System.getProperty("line.separator") +
                        "                 machacados o enteros   "
                        + System.getProperty("line.separator") +
                        "            4. 1/2 cebolla roja opcional "
                        + System.getProperty("line.separator") +
                        "            5. Tres cucharadas de comino molido "
                        + System.getProperty("line.separator") +
                        "            6. Una cucharada de pimienta molida  "
                        + System.getProperty("line.separator") +
                        "            7. Opcional: 1-2 cucharadas de hierbas: oregano "
                        + System.getProperty("line.separator") +
                        "               perejil, cilantro "
                        + System.getProperty("line.separator") +
                        "            8. Ocho tazas de cerveza para marinar la pierna   "
                        + System.getProperty("line.separator") +
                        "            9. 4-8 onzas de mantequilla o manteca    "
                        + System.getProperty("line.separator") +
                        "            10. 2-3 cucharadas de achiote molido"
                        + System.getProperty("line.separator") +
                        "            11. Diez papas de tamaño mediano peladas y "
                        + System.getProperty("line.separator")+
                        "                cortadas por la mitad";

        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                        "   1.  Limpie bien la pierna de chancho y pongala en una "
                        + System.getProperty("line.separator") +
                        "       bandeja o recipiente grande donde se lo pueda marinar  "
                        + System.getProperty("line.separator") +
                        "   2.  Prepare el aliño con el ajo machacado, cebolla, "
                        + System.getProperty("line.separator") +
                        "       cedimentos, tambien se puede agregar un poco de achiote.   "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   3.  Rocie la pierna de chanco con el jugo de limon  "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   4.  Haga varias incisiones de buen tamaño en la pierna de "
                        + System.getProperty("line.separator") +
                        "        chancho y rellene las incisiones con el aliño. "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   5.  Agrega la cerveza (mezcla con sidra y jugo de naranja)"
                        + System.getProperty("line.separator") +
                        "       cubra y deje reposar en al refrigeradora por 24 a 72 horas."
                                + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   6.  Pre-caliente el horno a 400 F (200C).   "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   7.  Ponga la pierna, con el lado de la piel hacia arriba, en"
                        + System.getProperty("line.separator") +
                        "       la fuente de hornear con la mezcla de la marinada "
                                + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   8.  En una olla pequeña derrita 4 oz de mantequilla (o manteca)"
                        + System.getProperty("line.separator") +
                        "       con una cucharada de achiote,y un poco de sal "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   9.   Hornee la pierna de cerdo o chancho a 400F-"
                        + System.getProperty("line.separator")+
                        "       (200C)30 minutos."
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   10.  Reduzca la temperatura a 325F(160F) y siga"
                        + System.getProperty("line.separator") +
                        "        horneando durante 3 horas.Si los jugos se "
                        + System.getProperty("line.separator") +
                        "        empieza a secar, caliente un poco de"
                        + System.getProperty("line.separator") +
                        "        la cerveza adicional con un poco de la mezcla"
                        + System.getProperty("line.separator") +
                        "        de mantequilla y achiote, agregue este liquido"
                        + System.getProperty("line.separator") +
                        "        a la fuente de hornear."
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   11.  Terminadas las primeras 3 horas, puede agregar las papas"
                        + System.getProperty("line.separator") +
                        "        o patatas al horno (si tiene espacio). "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   12.  Continúe horneando la pierna a 325F(160C) durante unas"
                        + System.getProperty("line.separator") +
                        "        3.5 a 4 horas adicionales.El tiempo total de cocción"
                        + System.getProperty("line.separator") +
                        "        para una pierna de chancho de 20 libras es casi 8 horas  "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   13.  Si cubrió la pierna con papel aluminio, lo puede retirar"
                        + System.getProperty("line.separator") +
                        "        durante los últimos 20-30 minutos para que la piel "
                        + System.getProperty("line.separator") +
                        "        o cuero se ponga crocante."
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   14.  Sirva con los acompañantes de su preferencia, incluyendo "
                        + System.getProperty("line.separator") +
                        "        as papas horneadas con la pierna de chancho, mote  "
                        + System.getProperty("line.separator") +
                        "        blanco o refrito en la salsa del hornado";

        text1.setText(prep);

        text2 = findViewById(R.id.txtConsejo);

        String con =      "   Se puede acompañar con: "
                + System.getProperty("line.separator") +
                "   Agrio  "
                + System.getProperty("line.separator") +
                "   Curtido de cebolla y tomate  "
                + System.getProperty("line.separator") +
                "   Platanos maduros fritos   ";

        text2.setText(con);
    }
}
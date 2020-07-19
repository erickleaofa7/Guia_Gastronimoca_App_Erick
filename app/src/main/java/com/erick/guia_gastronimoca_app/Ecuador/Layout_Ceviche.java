package com.erick.guia_gastronimoca_app.Ecuador;

import androidx.appcompat.app.AppCompatActivity;

|

import android.os.Bundle;
import android.widget.TextView;

public class Layout_Ceviche extends AppCompatActivity {

    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__ceviche);

        text = findViewById(R.id.txtEncevollado);

        String inf =
                "            1. dos libras de camarones ya cocinados  "
                + System.getProperty("line.separator") +
                "            2. dos cebollas coloradas pequeñas (cortadas en rodajas)    "
                + System.getProperty("line.separator") +
                "            3. cuatro tomates (cortados en finos cubitos) "
                + System.getProperty("line.separator") +
                "            4. un pimiento verde o rojo (picado en cubitos opcional)    "
                + System.getProperty("line.separator") +
                "            5. 15-20 limones (el jugo)"
                + System.getProperty("line.separator") +
                "            6. El jugo de una naranja"
                + System.getProperty("line.separator") +
                "            7. Media taza de salsa de tomate (o tomate licuado)"
                + System.getProperty("line.separator") +
                "            8. Un manojo de cilantro o culantro (picado finamente)"
                + System.getProperty("line.separator") +
                "            9. Sal y aceite al gusto";

        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                "       1.  Frote las rodajas de cebolla con una cucharada  "
                        + System.getProperty("line.separator") +
                "           de sal, luego enjuaguelas bien con agua fria   "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                "       2.  Mezcle todos los ingredientes en una fuente de   "
                        + System.getProperty("line.separator") +
                "           gran tamaño y deje reposar en la refrigeradora por    "
                        + System.getProperty("line.separator") +
                "           lo menos durante una dos horas. Pruebe y ajuste   "
                        + System.getProperty("line.separator") +
                "           la sal si es necesario   "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                "       3.  Sirva acomáñado de aji o salsa picante  ";

        text1.setText(prep);

        text2 = findViewById(R.id.txtConsejo);

        String con =
                "   Se puede acompañar con: "
                + System.getProperty("line.separator") +
                "   Chifles   "
                + System.getProperty("line.separator") +
                "   Patacones o tostones    "
                + System.getProperty("line.separator") +
                "   Canguil   ";

        text2.setText(con);
    }
}
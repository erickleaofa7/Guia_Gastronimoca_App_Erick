package com.erick.guia_gastronimoca_app.Venezuela;

import androidx.appcompat.app.AppCompatActivity;
import com.erick.guia_gastronimoca_app.R;

import android.os.Bundle;
import android.widget.TextView;

public class Layout_Arepa extends AppCompatActivity {

    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__arepa);

        text = findViewById(R.id.txtEncevollado);

        String inf =
                "            1. 2 tazas de harina de maíz precocida  "
                        + System.getProperty("line.separator") +
                        "            2. 4 tazas de agua tibia    "
                        + System.getProperty("line.separator") +
                        "            3. Una pizca de sal "
                        + System.getProperty("line.separator") +
                        "            4. 1 cucharadita de aceite   "
                        + System.getProperty("line.separator") +
                        "            5.  queso en lonchas"
                        + System.getProperty("line.separator") +
                        "            6. ¼ de taza de cebolla finamente picada"
                        + System.getProperty("line.separator") +
                        "            7. ¼ de taza de tomate cortado en cuadritos"
                        + System.getProperty("line.separator") +
                        "            8. 2 huevos grandes)"
                        + System.getProperty("line.separator") +
                        "            9. 2 huevos grandes)";

        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                "       1.  Esparza el aceite en un sartén grande y póngalo  "
                        + System.getProperty("line.separator") +
                        "        en la cocina a fuego medio alto  "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "  2.  Coloque el agua y una pizca de sal en un tazón   "
                        + System.getProperty("line.separator") +
                        "  agregue poco a poco la harina y remueva con una cuchara.    "
                        + System.getProperty("line.separator") +
                        "  Espere unos tres minutos hasta que la masa tome un poco    "
                        + System.getProperty("line.separator") +
                        "      de consistencia.   "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "  3.  Si desea las arepas muy crujientes puede introducir en el" +
                        " horno unos 10 minutos a fuego medio 180 °C.  ";

        text1.setText(prep);

        text2 = findViewById(R.id.txtConsejo);

        String con =
                "   También puedes enriquecer la masa con distintos ingredientes "
                        + System.getProperty("line.separator") +
                        "   para darle color, sabor, textura y elevar su valor nutritivo.   "
                        + System.getProperty("line.separator") +
                        "   Por ejemplo, puedes añadirle queso, huevos, leche, avena, semillas   "
                        + System.getProperty("line.separator") +
                        "   de chía o incluso verduras en puré o en crudo.     ";

        text2.setText(con);
    }
}
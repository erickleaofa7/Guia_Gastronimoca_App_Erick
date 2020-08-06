package com.erick.guia_gastronimoca_app.Colombia;

import androidx.appcompat.app.AppCompatActivity;
import com.erick.guia_gastronimoca_app.R;
import android.os.Bundle;
import android.widget.TextView;

public class Layout_ArrozC extends AppCompatActivity {

    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__arroz_c);

        text = findViewById(R.id.txtArrozC);

        String inf =
                "            1. tres unidades de tomates  "
                        + System.getProperty("line.separator") +
                        "            2. cuatro huevos   "
                        + System.getProperty("line.separator") +
                        "            3. 200 gramos de cebolla cabezona  "
                        + System.getProperty("line.separator") +
                        "            4. Un diente de ajo    "
                        + System.getProperty("line.separator") +
                        "            5. dos aguacates   "
                        + System.getProperty("line.separator") +
                        "            6. cuatro chorizos  "
                        + System.getProperty("line.separator") +
                        "            7. una pisca de comino   "
                        + System.getProperty("line.separator") +
                        "            8. una libra de frijol cargamanto  "
                        + System.getProperty("line.separator") +
                        "            9. dos platanos maduros  "
                        + System.getProperty("line.separator") +
                        "            10. una libra de arroz    "
                        + System.getProperty("line.separator") +
                        "            11. aceite    "
                        + System.getProperty("line.separator") +
                        "            12. una libra de chicharon   "
                        + System.getProperty("line.separator") +
                        "            13. cuatro arepas de maiz   "
                        + System.getProperty("line.separator") +
                        "            14. 350 gramos de carne picada de ternera  ";
        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                "   1.  El dia anterior dejar reposar en un recipiente "
                        + System.getProperty("line.separator") +
                        "       con agua fria los frijoles    "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator")+
                        "   2.  Para preparar el arroz agregamos 2 tazas de arroz  "
                        + System.getProperty("line.separator") +
                        "       y el doble de agua, es decir, 4 tazas de agua. "
                        + System.getProperty("line.separator") +
                        "       Cuando el agua hierva añadir el arroz y la hoja  "
                        + System.getProperty("line.separator") +
                        "       de laurel. Cocinar a fuego medio durante 15 minutos. "
                        + System.getProperty("line.separator") +
                        "       Apagar el fuego y dejar reposar por 5 min tapado. "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   3.  Para los platanos vamos a preparar una sarten con   "
                        + System.getProperty("line.separator") +
                        "       aceite. Sacar tajadas a los platanos y freir hasta   "
                        + System.getProperty("line.separator") +
                        "       que esten dorados, luego dejar reposar en un plato   "
                        + System.getProperty("line.separator") +
                        "       con papel absorbente o de cocina.   "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   4.  Procedemos a preparar el hogao. Corta la cebolla y  "
                        + System.getProperty("line.separator") +
                        "       y el tomate en dados, picar el ajo en trocitos muy   "
                        + System.getProperty("line.separator") +
                        "       pequeños. Sofreir la cebolla en aceite durante 4 min.  "
                        + System.getProperty("line.separator") +
                        "       sazonar con sal y agregar el tomate, incorporar el  "
                        + System.getProperty("line.separator") +
                        "       ajo y el comino, mezclar bien y cocinar por 2 minutos.  "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   5.  Escurrir los frijoles y llevarlos a la olla de presion,  "
                        + System.getProperty("line.separator") +
                        "       añadir el hogao. Cubre con agua y dejar cocinar por   "
                        + System.getProperty("line.separator") +
                        "       30 minutos aproximadamente.   "
                        + System.getProperty("line.separar")
                        + System.getProperty("line.separator") +
                        "   6.  En una sarten cocinar la carne y el chorizo hasta que  "
                        + System.getProperty("line.separator") +
                        "       esten bien dorados. Luego retirar y en la misma sarten  "
                        + System.getProperty("line.separator") +
                        "       freir los huevos. En otra sarten fritar los chicharrones. "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   7.  Para montar la bandeja paisa, colocamos el arroz los   "
                        + System.getProperty("line.separator") +
                        "       frijoles, las tajadas, la carne picada, el chorizo   "
                        + System.getProperty("line.separator") +
                        "       los chicharrones y el huevo (arriba del arroz). Cortar   "
                        + System.getProperty("line.separator") +
                        "       el aguacate y adicionar las arepas de maiz."
                        + System.getProperty("line.separator") +
                        "       Y ¡ listo a disfrutar!  ";

        text1.setText(prep);

        text2 = findViewById(R.id.txtConsejo);

        String con =
                "   *Inclusive los vegetarianos lo pueden degustar "
                        + System.getProperty("line.separator") +
                        "   basta con retirar la carne y el chorizo    "
                        + System.getProperty("line.separator") +
                        "   podren servirse un plata tradicional de Colombia.";

        text2.setText(con);
    }
}
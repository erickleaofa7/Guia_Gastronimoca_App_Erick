package com.erick.guia_gastronimoca_app.Peru;

import androidx.appcompat.app.AppCompatActivity;
import com.erick.guia_gastronimoca_app.R;
import android.os.Bundle;
import android.widget.TextView;

public class Layout_Llunca extends AppCompatActivity {
    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__llunca);

        text = findViewById(R.id.txtEncevollado);

        String inf =
                        "            1. Una Gallina de corral  "
                        + System.getProperty("line.separator") +
                        "            2. Un cuarto de trigo resbalado"
                        + System.getProperty("line.separator") +
                        "            3. Una cebolla china picada "
                        + System.getProperty("line.separator") +
                        "            4. Una zanahoria picada de 2cm"
                        + System.getProperty("line.separator") +
                        "            5. Tres litros de agua"
                        + System.getProperty("line.separator") +
                        "            6. Una rama de apio"
                        + System.getProperty("line.separator") +
                        "            7. Una rama de perejil picado"
                        + System.getProperty("line.separator") +
                        "            8. Una cucharada de oregano"
                        + System.getProperty("line.separator") +
                        "            9. Ajo molido"
                        + System.getProperty("line.separator")+
                        "            10. Cuatro cucharadas de aji "
                        + System.getProperty("line.separator");

        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                        "   1.   En una olla de barro, ponga los"
                        + System.getProperty("line.separator") +
                        "        tres litros de agua"
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   2.   Una vez listo córtalo en seis porciones "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   3.   Aparte pela y ralla las yucas"
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   4.   En un paño limpio y escúrrelo todo el jugo "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   5.   En una olla calienta la manteca y frie la"
                        + System.getProperty("line.separator") +
                        "        cebolla,ajo y sazona con sal,comino y pimienta"
                        + System.getProperty("line.separar")
                        + System.getProperty("line.separator") +
                        "   6.   Una vez dorado agrega el culantro y fríe hasta"
                        + System.getProperty("line.separator") +
                        "        se seque un poco la yuca y cocina removiendo"
                        + System.getProperty("line.separator") +
                        "        hasta que espese."
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   7.   Luego la yuca y cocina removiendo hasta que"
                        + System.getProperty("line.separator") +
                        "        espese"
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   8.   Una vez cocidos la gallina y el trigo"
                        + System.getProperty("line.separator") +
                        "        quite la rama de apio, y echele el"
                        + System.getProperty("line.separator") +
                        "        oregano y siga cocinando a fuego lento"
                        + System.getProperty("line.separator") +
                        "        En otra olla de barro, prepare un"
                        + System.getProperty("line.separator") +
                        "        aderezo, los ajos y la cebolla"
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   9.   Por ultimo agregar el perejil finamente"
                        + System.getProperty("line.separator") +
                        "        picado y en 3 minutos estara listo";

        text1.setText(prep);

        text2 = findViewById(R.id.txtConsejo);

        String con =
                "   Se puede acompañar con: "
                + System.getProperty("line.separator") +
                "   * Arroz   "
                + System.getProperty("line.separator") +
                "   * Aji de cocona   ";

        text2.setText(con);
    }
}
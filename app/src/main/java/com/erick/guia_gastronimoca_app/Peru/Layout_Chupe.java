package com.erick.guia_gastronimoca_app.Peru;

import androidx.appcompat.app.AppCompatActivity;
import com.erick.guia_gastronimoca_app.R;
import android.os.Bundle;
import android.widget.TextView;

public class Layout_Chupe extends AppCompatActivity {
    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__chupe);

        text = findViewById(R.id.txtEncevollado);

        String inf =
                "                    1. Un kilo de camarones  "
                        + System.getProperty("line.separator") +
                        "            2. Media taza de arroz"
                        + System.getProperty("line.separator") +
                        "            3. Medio kilo de patata pelada "
                        + System.getProperty("line.separator") +
                        "            4. Una taza de guisantes"
                        + System.getProperty("line.separator") +
                        "            5. Una lata de leche evaporada"
                        + System.getProperty("line.separator") +
                        "            6. Una cucharada de aji molido"
                        + System.getProperty("line.separator") +
                        "            7. Una cucharada de ajo picado"
                        + System.getProperty("line.separator") +
                        "            8. Una cebolla morada"
                        + System.getProperty("line.separator") +
                        "            9. Un calamar de rodajas"
                        + System.getProperty("line.separator")+
                        "            10. Dos huevos batidos por plato"
                        + System.getProperty("line.separator")+
                        "            11. Queso fresco"
                        + System.getProperty("line.separator")+
                        "            11. Sal, pimienta, oregano";

        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                        "   1.  Precionar la cabeza de los camarones y,"
                        + System.getProperty("line.separator") +
                        "       guardar el liquido obtenido"
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   2.  Una vez listo córtalo en seis porciones "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   3.  Aparte pela y ralla las yucas"
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
                        "   7.  Luego la yuca y cocina removiendo hasta que"
                        + System.getProperty("line.separator") +
                        "       espese"
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   8.  Por cada juane coloca dos hojas de bijao"
                        + System.getProperty("line.separator") +
                        "       previamente soasadas, en forma de cruz"
                        + System.getProperty("line.separator") +
                        "       sobre ellos una porción de masa de"
                        + System.getProperty("line.separator") +
                        "       Incorporar el calamar, el arroz y los"
                        + System.getProperty("line.separator") +
                        "       guisantes."
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   9.  Cocinar durante dos minutos, agregar los"
                        + System.getProperty("line.separator") +
                        "       huevos batidos y el queso fresco";

        text1.setText(prep);

        text2 = findViewById(R.id.txtConsejo);

        String con =      "   Se puede acompañar con: "
                + System.getProperty("line.separator") +
                "   Salsa de cebolla   "
                + System.getProperty("line.separator") +
                "   Aji de cocona   ";

        text2.setText(con);
    }
}
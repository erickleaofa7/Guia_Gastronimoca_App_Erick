package com.erick.guia_gastronimoca_app.Peru;

import androidx.appcompat.app.AppCompatActivity;
import com.erick.guia_gastronimoca_app.R;
import android.os.Bundle;
import android.widget.TextView;

public class Layout_Juane extends AppCompatActivity {
    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__juane);


        text = findViewById(R.id.txtEncevollado);

        String inf =
                "            1. Un kilo de yuca  "
                + System.getProperty("line.separator") +
                "            2. Un paiche    "
                + System.getProperty("line.separator") +
                "            3. Porciones de carne de cerdo,gallina "
                + System.getProperty("line.separator") +
                "            4. 1/8 de taza de culantro licuado"
                + System.getProperty("line.separator") +
                "            5. 50 gramos de manteca"
                + System.getProperty("line.separator") +
                "            6. Una cebolla picada"
                + System.getProperty("line.separator") +
                "            7. Doce hojas de bijao"
                + System.getProperty("line.separator") +
                "            8. Una cucharada de ajos"
                + System.getProperty("line.separator") +
                "            9. Sal,pimienta y comino al gusto"
                + System.getProperty("line.separator");

        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                "   1.  Remoja el paiche de un día para otro,"
                + System.getProperty("line.separator") +
                "       despues escurrelo y cocínalo en agua"
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
                "       yuca y en el centro de esta un pedazo"
                + System.getProperty("line.separator") +
                "       de pescado, envuélvelo y átalo."
                + System.getProperty("line.separator")
                + System.getProperty("line.separator") +
                "   9.  Pon todos los juanes en una olla con agua"
                + System.getProperty("line.separator") +
                "       hirviendo y cocínalos durante 30 minutos";

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
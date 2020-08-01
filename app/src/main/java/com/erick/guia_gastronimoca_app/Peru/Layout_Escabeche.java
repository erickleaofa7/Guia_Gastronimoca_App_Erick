package com.erick.guia_gastronimoca_app.Peru;

import androidx.appcompat.app.AppCompatActivity;
import com.erick.guia_gastronimoca_app.R;
import android.os.Bundle;
import android.widget.TextView;

public class Layout_Escabeche extends AppCompatActivity {
    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__escabeche);

        text = findViewById(R.id.txtEncevollado);

        String inf =
                        "            1. Seis filete de pescado  "
                        + System.getProperty("line.separator") +
                        "            2. Dos cebollas grandes    "
                        + System.getProperty("line.separator") +
                        "            3. Tres huevos duros "
                        + System.getProperty("line.separator") +
                        "            4. Harina en cantidad necesaria"
                        + System.getProperty("line.separator") +
                        "            5. Media taza de aceite"
                        + System.getProperty("line.separator") +
                        "            6. Media taza de vinagre"
                        + System.getProperty("line.separator") +
                        "            7. Media cucharada de comino molido"
                        + System.getProperty("line.separator") +
                        "            8. Media cucharada de pimienta molida"
                        + System.getProperty("line.separator") +
                        "            9. Seis hojas de lechuga"
                        + System.getProperty("line.separator");

        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                        "   1.  Sazonar los filetes de pescado con,"
                        + System.getProperty("line.separator") +
                        "       sal y pimienta, pasarlos por harina"
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   2.  Colocar en una fuente adornada con hojas  "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   3.  Freir las cebollas en cuatro partes"
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   4.   Agregar el vinagre cuando ya la cebolla "
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
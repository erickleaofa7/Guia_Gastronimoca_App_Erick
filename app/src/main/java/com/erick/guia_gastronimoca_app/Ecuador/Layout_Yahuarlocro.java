package com.erick.guia_gastronimoca_app.Ecuador;

import androidx.appcompat.app.AppCompatActivity;
import com.erick.guia_gastronimoca_app.R;

import android.os.Bundle;
import android.widget.TextView;

public class Layout_Yahuarlocro extends AppCompatActivity {
    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__yahuarlocro);

        text = findViewById(R.id.txtEncevollado);

        String inf =
                "            1. Una libra y media de menudo de borrego • 2 limones  "
                + System.getProperty("line.separator") +
                "            2. Hierbabuena    "
                + System.getProperty("line.separator") +
                "            3. tres cucharadas de sal    "
                + System.getProperty("line.separator") +
                "            4. Achiote   "
                + System.getProperty("line.separator") +
                "            5. Aceite   "
                + System.getProperty("line.separator") +
                "            6. Dos ramas de cebolla blanca  "
                + System.getProperty("line.separator") +
                "            7. Dos cucharadas de cilantro picado, "
                + System.getProperty("line.separator") +
                "               1 cucharada de orégano   "
                + System.getProperty("line.separator") +
                "            8. Una cucharada de comino   "
                + System.getProperty("line.separator") +
                "            9. Una taza de maní tostado    "
                + System.getProperty("line.separator") +
                "            10. Una taza de leche    "
                + System.getProperty("line.separator") +
                "            11. Un tomate riñón    "
                + System.getProperty("line.separator") +
                "            12. Una cebolla paiteña "
                + System.getProperty("line.separator") +
                "            13. Perejil, Cilantro    ";
        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                "   1.  En abundante agua se lava el menudo de borrego "
                + System.getProperty("line.separator")
                + System.getProperty("line.separator") +
                "   2.  Coloque el menudo en un recipiente sin agua y agregue  "
                + System.getProperty("line.separator") +
                "       el jugo de los limones; ponga la hierbabuena y la sal"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator") +
                "   3.  Frote con fuerza sin dañar el producto   "
                + System.getProperty("line.separator")
                + System.getProperty("line.separator") +
                "   4.  Deje reposar durante 10 minutos y enguaje con abundante agua fria  "
                + System.getProperty("line.separator")
                + System.getProperty("line.separator") +
                "   5.  Cocine en una olla de presion aproximadamente 30 minutos, verifique  "
                + System.getProperty("line.separator") +
                "       que este bien cocido(debe ser blando).   "
                + System.getProperty("line.separar")
                + System.getProperty("line.separator") +
                "   6.  Retire el menudo y corte las tripas en aros y la pansa en cubos  "
                + System.getProperty("line.separator")
                + System.getProperty("line.separator") +
                "   7.  Reserve el liquido de coccion del menudo, se lo utilizara para  "
                + System.getProperty("line.separator") +
                "       la elaboracion de la sopa   "
                        
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   8.  Corte la cebolla blanca en cuadritos  "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   9.  Aparte en otra olla sofri la cebolla junto con el comino, la  "
                        + System.getProperty("line.separator") +
                        "       pimienta, el cilantro, el oregano y el ajo machacado. Lave,"
                        + System.getProperty("line.separator") +
                        "       pele y corte las papas en cubos, agregue las papas al sofrito. "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   10.  Licue el mani junto con la leche y agregue el sofrito. Tape  "
                        + System.getProperty("line.separator") +
                        "        y deje hervir durante 15 minutos."
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   11.  Agregue el liquido de coccion del menudo, añada sal y deje "
                        + System.getProperty("line.separator") +
                        "        heervir hasta que las papas esten bien cocidas. Incorpore el  "
                        + System.getProperty("line.separator") +
                        "        menudo picado y deje hervir durante tres minutos.  "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   12.  Corte el tomate por la mitad y retire las semillas, corte "
                        + System.getProperty("line.separator") +
                        "        la cebolla en cuadritos, pique las hojas de perejil y cilantro  "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   13.  Elabore un sofrito con el tomate, la cebolla, el perejil  "
                        + System.getProperty("line.separator") +
                        "        el cilantro y la sangre  "
                        + System.getProperty("line.separator")
                        + System.getProperty("line.separator") +
                        "   14.  Corte el aguacate en ocho porciones  ";




        text1.setText(prep);

        text2 = findViewById(R.id.txtConsejo);

        String con =      "   Se puede acompañar con: "
                + System.getProperty("line.separator") +
                "   Aguacate   "
                + System.getProperty("line.separator") +
                "   Sangre   "
                + System.getProperty("line.separator") +
                "   Cebolla, limon   ";

        text2.setText(con);
    }
}
package com.erick.guia_gastronimoca_app.Ecuador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.erick.guia_gastronimoca_app.R;

public class Layout_Encebollado extends AppCompatActivity {

    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__encebollado);

        text = findViewById(R.id.txtEncevollado);

        String inf = "            1. dos libras de albacora  "
                     + System.getProperty("line.separator") +
                     "            2. libra y media de yuca    "
                     + System.getProperty("line.separator") +
                     "            3. dos cebollas en rama    "
                     + System.getProperty("line.separator") +
                     "            4. tres diente de ajo    "
                     + System.getProperty("line.separator") +
                     "            5. un comino    "
                     + System.getProperty("line.separator") +
                     "            6. pimienta   "
                     + System.getProperty("line.separator") +
                     "            7. aji peruano    "
                     + System.getProperty("line.separator") +
                     "            8. cilantro en rama    "
                     + System.getProperty("line.separator") +
                     "            9. cilantro picado    "
                     + System.getProperty("line.separator") +
                     "            10. salsa de cebollas    "
                     + System.getProperty("line.separator") +
                     "            11. aceite    "
                     + System.getProperty("line.separator") +
                     "            12. limom    "
                     + System.getProperty("line.separator") +
                     "            13. sal    ";
                text.setText(inf);

           text1 = findViewById(R.id.txtPreparacion);

           String prep = "   1.  En una olla onda se pone a hervir el albacora  "
                             + System.getProperty("line.separator") +
                         "       el trozo entero, si se consigue comprar la    "
                             + System.getProperty("line.separator") +
                         "       cabeza tambien y se la pone a hervir con suficiente   "
                             + System.getProperty("line.separator") +
                         "       agua que tape los trozos de pescado, calculando seis   "
                             + System.getProperty("line.separator") +
                         "       platos hondos, se aliña con el ajo entero, las ramas   "
                             + System.getProperty("line.separator") +
                         "       de cebolla blanca, comino, pimienta al gusto.   "
                             + System.getProperty("line.separator")
                             + System.getProperty("line.separator") +
                         "   2.  Cuando el albacora este cocinada se saca del caldo   "
                             + System.getProperty("line.separator") +
                         "       y se reserva, se cierne el caldo.   "
                             + System.getProperty("line.separator")
                             + System.getProperty("line.separator") +
                         "   3.  En el mismo caldo se pone a cocinar la yuca en trozos   "
                             + System.getProperty("line.separator") +
                         "       grandes, y cuando esta blanda se saca del caldo.   "
                             + System.getProperty("line.separator")
                             + System.getProperty("line.separator") +
                         "   4.  En una taza se deshace las 2 cucharadas de aji peruano  "
                             + System.getProperty("line.separator") +
                         "       se cierne y se añade al caldo de pescado, se deja   "
                             + System.getProperty("line.separator") +
                         "       hervir unos diez minutos aproximadamente.   "
                             + System.getProperty("line.separator")
                             + System.getProperty("line.separator") +
                         "   5.  Se agrega el cilantro entero y se de hervir 5 minutos  "
                             + System.getProperty("line.separator") +
                         "       se salpimienta y se retira del fuego   "
                             + System.getProperty("line.separar")
                             + System.getProperty("line.separator") +
                         "   6.  La albacora es un pescado en que su carne una vez   "
                             + System.getProperty("line.separator") +
                         "       cocinada se puede deshojar   "
                             + System.getProperty("line.separator")
                             + System.getProperty("line.separator") +
                         "   7.  Se corta en cuadritos la yuca y se acomoda en un   "
                             + System.getProperty("line.separator") +
                         "       plato hondo de sopa, sobre el una porcion de albacora   "
                             + System.getProperty("line.separator") +
                         "       deshojada, se le agrega una taza y media de caldo de   "
                             + System.getProperty("line.separator") +
                         "       pescado, luego una porcion de salsa de cebolla, se   "
                             + System.getProperty("line.separator") +
                         "       espolvorea cilantro, una cucharada de aceite, se    "
                             + System.getProperty("line.separator") +
                         "       acompaña de medio limon para que el comensal lo exprima   "
                             + System.getProperty("line.separator") +
                         "       al gusto sobre el encebollado   ";
        text1.setText(prep);

       text2 = findViewById(R.id.txtConsejo);

       String con =      "   Se puede acompañar con: "
                             + System.getProperty("line.separator") +
                         "   Chifles   "
                             + System.getProperty("line.separator") +
                         "   Maiz tostado    "
                             + System.getProperty("line.separator") +
                         "   Pan, aji   ";

       text2.setText(con);
    }
}
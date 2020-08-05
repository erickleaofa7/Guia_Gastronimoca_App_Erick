package com.erick.guia_gastronimoca_app.Colombia;

import androidx.appcompat.app.AppCompatActivity;
import com.erick.guia_gastronimoca_app.R;

import android.os.Bundle;
import android.widget.TextView;

public class Layout_Sancocho extends AppCompatActivity {

    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__sancocho);

        text = findViewById(R.id.txtEncevollado);

        String inf =
                "            1. Un Kg. de costilla de ternera  "
                + System.getProperty("line.separator") +
                "            2. tres platanos verdes (viches)    "
                + System.getProperty("line.separator") +
                "            3. Un kg. de yuca troceada y deshilachada   "
                + System.getProperty("line.separator") +
                "            4. Un kg. de papas peladas en trozos grandes  "
                + System.getProperty("line.separator") +
                "            5. Tres choclos tierno cortados en trozos "
                + System.getProperty("line.separator") +
                "            6. dos cebollas cabezonas peladas  "
                + System.getProperty("line.separator") +
                "            7. cuatro tallos de cebolla larga peladas  "
                + System.getProperty("line.separator") +
                "            8. dos tallos de cebolla larga picada    "
                + System.getProperty("line.separator") +
                "            9. dos manojos de cilantro cimarron   "
                + System.getProperty("line.separator") +
                "            10. dos tomates verdes    "
                + System.getProperty("line.separator") +
                "            11. dos cubitos de caldo    "
                + System.getProperty("line.separator") +
                "            12. Sal y aliños al gustro    ";

        text.setText(inf);

        text1 = findViewById(R.id.txtPreparacion);

        String prep =
                "   1.  Picar las cebollas largas y los tomates verdes.  "
                + System.getProperty("line.separator") +
                "       las cebollas cabezonas las debes machacar y poner    "
                + System.getProperty("line.separator") +
                "       todo esto junto, en una olla que sete acorde con la    "
                + System.getProperty("line.separator") +
                "       cantidad de ingredientes y la cantidad de agua a hervir  "
                + System.getProperty("line.separator") +
                "       ademas de poner en la misma olla la cebolla larga entera  "
                + System.getProperty("line.separator") +
                "       y la cola de res, luego poner  fuego alto por 1 hora.   "
                + System.getProperty("line.separator")
                + System.getProperty("line.separator") +
                "   2.  Se baja la temperatura de coccion a fuego medio, debes   "
                + System.getProperty("line.separator") +
                "       tapar la olla nuevamente y dejar cocinar por 30 min mas   "
                + System.getProperty("line.separator")
                + System.getProperty("line.separator") +
                "   3.  Luego de este tiempo puedes sacar cebolla entera y el   "
                + System.getProperty("line.separator") +
                "       cilantro y agregar el platano y la papa, dejar que se   "
                + System.getProperty("line.separator") +
                "       cocine por unos 10 min aproximadamente con sal, comino   "
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

        String con =
                "   Se puede acompañar con: "
                + System.getProperty("line.separator") +
                "   * Chifles   "
                + System.getProperty("line.separator") +
                "   * Maiz tostado    "
                + System.getProperty("line.separator") +
                "   * Pan, aji   ";

        text2.setText(con);
    }
}
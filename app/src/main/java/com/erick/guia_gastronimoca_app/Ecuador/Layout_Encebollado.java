package com.erick.guia_gastronimoca_app.Ecuador;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.erick.guia_gastronimoca_app.R;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Layout_Encebollado extends AppCompatActivity {
    //CAMARA
    ImageView foto;
    ImageButton camara;
    private final int SELECT_PICTURE = 300;
    //TEXTOS
    TextView text, text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout__encebollado);

        foto = findViewById(R.id.imgFoto);
        camara = findViewById(R.id.btnCamara);

        camara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showOptions();
            }
        });
        if (ContextCompat.checkSelfPermission(Layout_Encebollado.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!=
                PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(Layout_Encebollado.this,Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(Layout_Encebollado.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA},1000);
        }



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

    String mCurrentPhotoPath;
    private File createImageFile() throws IOException{
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "Backup_" + timeStamp +"_";
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image =File.createTempFile(imageFileName, ".jpg", storageDir);
        mCurrentPhotoPath = image.getAbsolutePath();
        return image;

    }
    static final int REQUEST_TAKE_PHOTO = 1;
    public void tomarFoto(){
        Intent takePictureIntent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager())!= null){
            File photoFile = null;
            try {
                photoFile =createImageFile();

            }catch (IOException ex){

            }

            if(photoFile!=null){
                Uri photoUri = FileProvider.getUriForFile(this,"com.erick.guia_gastronimoca_app.FileProvider",photoFile);
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,photoUri);
                startActivityForResult(takePictureIntent, REQUEST_TAKE_PHOTO);
            }

        }

    }

    private void showOptions(){
        final CharSequence[] option = {"Foto", "Galeria", "Cancelar"};
        final AlertDialog.Builder builder = new AlertDialog.Builder(Layout_Encebollado.this);
        builder.setTitle("Opciones");
        builder.setItems(option, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int op) {
                if (option[op]=="Foto"){
                    tomarFoto();
                }else if (option[op]=="Galeria"){
                    Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    intent.setType("image/*");
                    startActivityForResult(intent.createChooser(intent,"Selecciona"),SELECT_PICTURE);
                }else if (option[op]=="Cancelar"){
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
         if (requestCode == 1){
              File imgFile = new File(mCurrentPhotoPath);
            if (imgFile.exists()){
               Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
               ImageView myImage = findViewById(R.id.imgFoto);
               foto.setImageBitmap(myBitmap);
            }
            switch (requestCode){
                case SELECT_PICTURE:
                    Uri path = data.getData();
                    foto.setImageURI(path);
                    break;
            }
         }
    }
}
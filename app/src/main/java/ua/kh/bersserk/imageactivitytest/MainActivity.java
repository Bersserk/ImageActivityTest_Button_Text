package ua.kh.bersserk.imageactivitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    // объявим наши объекты.

    private boolean tp;
    private TextView myTextView;
    private Button myButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // найдем наше изображение
        final ImageView sniperImg = (ImageView) findViewById(R.id.imageView);

        //зададим метод OnClick для картинки;
        sniperImg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tp = !tp;
                sniperImg.setImageResource(tp ? R.drawable.sniper : R.drawable.oficer);
                return false;
            }
        });




        //найдем текст и кнопку
        myTextView = (TextView) findViewById(R.id.myTextView);
        myButton = (Button) findViewById(R.id.myButton);

        //зададим обработчик событий и метод OnClick для кнопки
        myButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                myTextView.setText("Ку-ку ёпта!");

            }
        });

        //зададим обработчик событий и метод OnClick для текста
        myTextView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                myTextView.setText("TEXT");
            }




        });
    }

    public void showToast(View view) {
        //создаем и отображаем текстовое уведомление
        int duration = Toast.LENGTH_LONG;
        Toast toast2 = Toast.makeText(getApplicationContext(),
                "Это картинка!",
                duration);
        toast2.setGravity(Gravity.TOP, 0, 0);
        toast2.show();
    }
}

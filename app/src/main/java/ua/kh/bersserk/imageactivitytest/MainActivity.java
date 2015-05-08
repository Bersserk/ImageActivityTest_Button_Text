package ua.kh.bersserk.imageactivitytest;

import android.app.Activity;
import android.os.Bundle;
//import android.view.Gravity;
import android.view.View;
import android.widget.Button;
//import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.Toast;



public class MainActivity extends Activity {

    // объявим наши объекты.

  //  public boolean tp;
    TextView myTextView;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // находим наши кнопки
        Button myButton1 = (Button) findViewById(R.id.myButton1);
        Button myButton2 = (Button) findViewById(R.id.myButton2);

        //устанавливаем общий обработчик
        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.myButton1:
                        myTextView.setText(R.string.textBtn1);
                        break;
                    case R.id.myButton2:
                        myTextView.setText("");
                        break;

                }

            }
        };

        myButton1.setOnClickListener(onClickListener);
        myButton2.setOnClickListener(onClickListener);

        /* найдем наше изображение
        final ImageView sniperImg = (ImageView) findViewById(R.id.imageView);

        //зададим метод OnClick для картинки;
        sniperImg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tp = !tp;
                sniperImg.setImageResource(tp ? R.drawable.sniper : R.drawable.oficer);
                return false;
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
            });
        } */
    }
}


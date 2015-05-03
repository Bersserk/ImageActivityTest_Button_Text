package ua.kh.bersserk.imageactivitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    // объявим наши объекты.

    private boolean tp;
    private TextView myTextView;
    private Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // найдем наше изображение
       final ImageView sniperImg = (ImageView) findViewById(R.id.imageView);

        //зададим метод OnClick для картинки;
        sniperImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //логика поиска текущей картинки и замены на другую
                tp = !tp;
                sniperImg.setImageResource(tp ? R.drawable.sniper : R.drawable.oficer);
            }
        });

        //найдем текст и кнопку
        myTextView = (TextView) findViewById(R.id.myTextView);
        myButton = (Button) findViewById(R.id.myButton);

        //зададим обработчик событий и метод OnClick для кнопки
        myButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                myTextView.setText("Ку-ку ёпта!");

            }
        });

        //зададим обработчик событий и метод OnClick для текста
        myTextView.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                myTextView.setText("снова какой-то текст");
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

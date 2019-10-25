package android.example.com.hellotoast;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity{
    private int mCount=0;
    private TextView mShowToast;


    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowToast = (TextView) findViewById(R.id.show_count);


    }


    public void countUp(View view){

        mCount++;

        if (mShowToast != null)
            mShowToast.setText(Integer.toString(mCount));



    }
    public void showToast(View view){
        Context context = getApplicationContext();
        Toast toast=Toast.makeText(context,R.string.toast_message,Toast.LENGTH_LONG);
        toast.show();


    }
}

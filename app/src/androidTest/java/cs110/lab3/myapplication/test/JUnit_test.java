package cs110.lab3.myapplication.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import cs110.lab3.myapplication.MainActivity;
import cs110.lab3.myapplication.R;

/**
 * Created by HUDSON on 4/12/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>
{
    MainActivity my;

    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){

        my = getActivity();
        final EditText et1 = (EditText)my.findViewById(R.id.et1);
        final EditText et2 = (EditText)my.findViewById(R.id.et2);
        TextView tv = (TextView)my.findViewById(R.id.textView);

        my.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                et1.setText("2");
                et2.setText("3");

            }
        });

        assertEquals(5, my.getSum());

    }

}

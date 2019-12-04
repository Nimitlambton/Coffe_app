package com.example.coffe_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Coffee C;
    TextView total;
    RadioButton wheat, white;
    CheckBox cream, butter, peach;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C = new Coffee();

        total = findViewById(R.id.Result);
        //radio button
        wheat = findViewById(R.id.rbwheat);
        white = findViewById(R.id.rbwhite);
        //check box
        cream = findViewById(R.id.cbcream);
        butter = findViewById(R.id.cbbutter);
        peach = findViewById(R.id.cbpeach);
    }


    public void radioclick(View view) {

        Boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.rbwheat:
                if (checked) {

                    C.setToppings(10.0);
                }

                break;

            case R.id.rbwhite:
                if (checked) {
                    C.setToppings(20.0);
                }
                break;
        }
        total.setText("hello" + C.getToppings());

    }

    public void oncheck(View view) {

        Boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){

            case R.id.cbbutter:


                if (checked){

                     C.setBagelwithcream(20.0);


                }
                else {

                    C.setBagelwithcream(0.0);
                }
                    break;
            case R.id.cbcream:
                if (checked) {

                    C.setBagelwithbutter(90.0);
                }
                else{
                    C.setBagelwithbutter(0.0);
                }
                      break;
            case R.id.cbpeach:
                if (checked){

                        C.setBagelwithpeach(20.0);
                }
                else{

                    C.setBagelwithpeach(0.0);
                }

                    break;

        }


            total.setText("total_value"+ calc());

            }



            public double calc(){

              Double total_price = C.getToppings()+ C.getBagelwithbutter()+ C.getBagelwithcream()+C.getBagelwithpeach();

              return total_price;

            }

}


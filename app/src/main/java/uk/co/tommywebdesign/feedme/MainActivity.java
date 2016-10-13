package uk.co.tommywebdesign.feedme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    private String LOG_TAG = "TOMMY/DEBUG";


    ImageButton gotoIngredientsBtn;
    ImageButton gotoRecipeBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initatieInterfaceObjects();
        setListeners();

    }



    private void setListeners(){

        gotoIngredientsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadActivity(v);
            }
        });

        gotoRecipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadActivity(v);
            }
        });

    }




    private  void initatieInterfaceObjects(){
        gotoIngredientsBtn=(ImageButton)findViewById(R.id.goto_ingredients_btn);
        gotoRecipeBtn=(ImageButton)findViewById(R.id.goto_recipe_btn);

    }







    private void loadActivity(View view){

        if(view.getId() == R.id.goto_ingredients_btn){

            Intent intent = new Intent("uk.co.tommy.INGREDIENTSACTIVITY");
            startActivity(intent);



            Log.d(LOG_TAG, "Goto ingriedents");
        }else if(view.getId() ==R.id.goto_recipe_btn){
            Log.d(LOG_TAG, "Gotorecipe");
            Intent intent = new Intent("uk.co.tommy.RECIPEACTIVITY");
            startActivity(intent);
        }



    }






}

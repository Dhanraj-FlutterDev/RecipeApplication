package com.example.recipe;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class RecipeActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView mRecipeName = (TextView) findViewById(R.id.text_recipe);
        TextView mRecipeIngredients = (TextView) findViewById(R.id.ingredients);
        TextView mRecipeMethodTitle = (TextView) findViewById(R.id.method);
        TextView mRecipe = (TextView) findViewById(R.id.recipe);

        Intent intent = getIntent();
        String Title = Objects.requireNonNull(intent.getExtras()).getString("RecipeName");
        String Ingredients = intent.getExtras().getString("RecipeIngredients");
        String MethodTitle = intent.getExtras().getString("RecipeMethodTitle");
        String Recipe = intent.getExtras().getString("Recipe");

        mRecipeName.setText(Title);
        mRecipeIngredients.setText(Ingredients);
        mRecipeMethodTitle.setText(MethodTitle);
        mRecipe.setText(Recipe);

    }
}

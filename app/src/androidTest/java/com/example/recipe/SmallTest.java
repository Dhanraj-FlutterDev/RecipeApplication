package com.example.recipe;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class SmallTest {
    @Rule
    public ActivityScenarioRule<RecipeActivity> addActivityRule =
            new ActivityScenarioRule<>(RecipeActivity.class);

    @Test
    public void testRecipeName() {
        onView(withId(R.id.text_recipe)).check(matches(withText("recipeName")));

    }

    @Test
    public void testAddTaskText() {
        onView(withId(R.id.text_recipe)).perform(click()).check(matches(isDisplayed()));
        onView(withId(R.id.ingredients)).perform(click()).check(matches(isDisplayed()));
    }
}

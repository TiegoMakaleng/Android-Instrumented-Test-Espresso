package com.tiego.makaleng.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.tiego.makaleng.espresso.MainActivity;
import com.tiego.makaleng.espresso.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Tiego Makaleng on 1/20/2019.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test() {

        // check if the text view is empty initially
        onView(withId(R.id.textViewNote)).check(matches(withText("")));

        // click on the button
        onView(withId(R.id.buttonTypeSomething))
                .check(matches(withText(R.string.button_text))).perform(click());

        // check if the note has changed
        onView(withId(R.id.textViewNote)).check(matches(withText(R.string.note)));
    }
}

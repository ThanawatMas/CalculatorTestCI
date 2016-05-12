package com.aouohosolution.calculatortest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void add() {
        onView(withId(R.id.tv_operand1))
                .perform(typeText("2"));

        onView(withId(R.id.tv_operand2))
                .perform(typeText("1"));

        onView(withId(R.id.btn_add))
                .perform(click());

        onView(withId(R.id.tv_result))
                .check(matches(withText("3.0")));
    }

    @Test
    public void minus() {
        onView(withId(R.id.tv_operand1))
                .perform(typeText("2"));

        onView(withId(R.id.tv_operand2))
                .perform(typeText("1"));

        onView(withId(R.id.btn_minus))
                .perform(click());

        onView(withId(R.id.tv_result))
                .check(matches(withText("1.0")));
    }

    @Test
    public void multiply() {
        onView(withId(R.id.tv_operand1))
                .perform(typeText("2"));

        onView(withId(R.id.tv_operand2))
                .perform(typeText("1"));

        onView(withId(R.id.btn_multiply))
                .perform(click());

        onView(withId(R.id.tv_result))
                .check(matches(withText("2.0")));
    }

    @Test
    public void divide() {
        onView(withId(R.id.tv_operand1))
                .perform(typeText("2"));

        onView(withId(R.id.tv_operand2))
                .perform(typeText("1"));

        onView(withId(R.id.btn_divide))
                .perform(click());

        onView(withId(R.id.tv_result))
                .check(matches(withText("2.0")));
    }
}
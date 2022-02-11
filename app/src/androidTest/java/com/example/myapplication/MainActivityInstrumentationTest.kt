package com.example.myapplication

import android.R
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.endsWith
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentationTest {

    @get:Rule
    var activityTestRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    // Looks for an EditText with id = "R.id.etInput"
    // Types the text "Hello" into the EditText
    // Verifies the EditText has text "Hello"
    @Test
    fun validateEditText() {
//        onView(withText("Mansi")).perform(clearText()).check(matches(withText("")))
        onView(withText(endsWith("Mansi"))).check(matches(isDisplayed()));


        /*onView(withText("Hello!"))
            .perform(typeText("Hello!"),click())
            .check(matches(withText("Hello!")))*/
    }

    /*@Test
    fun ensureTextChangesWork() {
        // Type text and then press the button.
        onView(withId(R.id.inputField))
            .perform(typeText("HELLO"), closeSoftKeyboard())
        onView(withId(R.id.changeText)).perform(click())

        // Check that the text was changed.
        onView(withId(R.id.inputField)).check(matches(withText("Lalala")))
    }*/
}
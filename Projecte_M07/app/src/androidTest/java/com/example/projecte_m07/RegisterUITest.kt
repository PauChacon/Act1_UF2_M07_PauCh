package com.example.projecte_m07

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RegisterUITest {

    @get:Rule
    val activityRule = ActivityScenarioRule(Register::class.java)

    @Test
    fun testUsuarioCortoMuestraError() {
        onView(withId(R.id.editTextRegisterUsername)).perform(typeText("ab"), closeSoftKeyboard())
        onView(withId(R.id.editTextRegisterEmail)).perform(typeText("correo@gmail.com"), closeSoftKeyboard())
        onView(withId(R.id.editTextRegisterPhone)).perform(typeText("612345678"), closeSoftKeyboard())
        onView(withId(R.id.editTextRegisterPassword)).perform(typeText("Abcd@1234"), closeSoftKeyboard())
        onView(withId(R.id.editTextRegisterConfirmPassword)).perform(typeText("Abcd@1234"), closeSoftKeyboard())

        onView(withId(R.id.buttonConfirmRegister)).perform(click())

        // Verifica que el mensaje de error se muestra
        onView(withId(R.id.textViewRegisterError))
            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
            .check(matches(withText("El nom d'usuari ha de tenir més de 3 caràcters.")))
    }
}

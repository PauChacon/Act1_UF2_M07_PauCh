package com.example.projecte_m07

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.projecte_m07.viewmodel.RegisterViewModel
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RegisterViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()


    private lateinit var viewModel: RegisterViewModel

    @Before
    fun setup() {
        viewModel = RegisterViewModel()
    }

    @Test
    fun usuariCurt() {
        val result = viewModel.validate("ab", "mail@gmail.com", "612345678", "Abcd@1234", "Abcd@1234")
        assertFalse(result)
    }

    @Test
    fun telefonIncorrecte() {
        val result = viewModel.validate("usuario", "mail@gmail.com", "123", "Abcd@1234", "Abcd@1234")
        assertFalse(result)
    }

    @Test
    fun correuMalFormat() {
        val result = viewModel.validate("usuario", "gmail.com", "612345678", "Abcd@1234", "Abcd@1234")
        assertFalse(result)
    }

    @Test
    fun contrasenyaFeble() {
        val result = viewModel.validate("usuario", "mail@gmail.com", "612345678", "abc123", "abc123")
        assertFalse(result)
    }

    @Test
    fun totCorrecte() {
        val result = viewModel.validate("usuario", "mail@gmail.com", "612345678", "Abcd@1234", "Abcd@1234")
        assertTrue(result)
    }
}

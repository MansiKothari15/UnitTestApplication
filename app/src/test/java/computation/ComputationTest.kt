package com.example.myapplication.computation

import android.util.Log
import com.example.myapplication.ComputationActivity
import com.example.myapplication.Operations
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner
import org.junit.AfterClass

import org.junit.BeforeClass

@RunWith(MockitoJUnitRunner::class)
class ComputationTest {
    @Mock
    lateinit var operators: Operations
    lateinit var computationActivity: ComputationActivity

    @Before
    fun setUp(){
        computationActivity = ComputationActivity(operators)
    }

    @Test
    fun givenValidInput_getAddition_shouldCallAddOperator() {
        val x = 5
        val y = 10
        computationActivity.getAddition(x, y)
        verify(operators).add(x, y)
    }

    @Test
    fun givenValidInput_getSubtraction_shouldCallSubtractOperator() {
        val x = 5
        val y = 10
        computationActivity.getSubtraction(x, y)
        Operations.subtract(x, y)
    }

    @Test
    fun givenValidInput_getMultiplication_shouldCallMultiplyOperator() {
        val x = 5
        val y = 10
        computationActivity.getMultiplication(x, y)
        Operations.multiply(x, y)
    }

    @Test
    fun givenValidInput_getDivision_shouldCallDivideOperator() {
        val x = 5
        val y = 10
        computationActivity.getDivision(x, y)
        Operations.divide(x, y)
    }

    /*@BeforeClass
    fun initialConnection() {
        Log.i("startup i.e - ", "creating DB connection")
    }

    @AfterClass
    fun tearDown() {
        Log.i("closing i.e - ","DB connection")
    }*/

}
package io.sukyology.demo.kotlinspring.unit

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assumptions.assumeTrue

internal class Junit5Practice {

    lateinit var answer: SurveyAnswer

    companion object {
        @JvmStatic
        @BeforeAll
        fun beforeAll(){
            println(">>>>>> beforeAll triggered")
        }
    }

    @BeforeEach
    fun beforeEach() {
        answer = SurveyAnswer("what")
        println(">>>>>>>>>> beforeEach triggered")
    }

    @Test
    fun `test the test before do any real test`(){
        Assertions.assertTrue(true)
    }

    @Test
    fun `check the answer is valid`() {
        assertDoesNotThrow {
            println(answer.answer)
        }
    }

    @Test
    fun `when someone answers wrong answer`() {
        val wrongAnswer = SurveyAnswer("michael")

        assumeTrue(wrongAnswer.isWrong()) {
            "answer is not wrong"
        }
    }

    @Test
    fun `get Tst Reporter`(reporter: TestReporter) {
        reporter.publishEntry("from reporter")
    }



}
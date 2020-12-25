package io.sukyology.demo.kotlinspring

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo

internal class FindOutTestTest(testInfo: TestInfo) {

    @Test
    fun `proceed to next question if user submit answer` () {
        val user : SubmitActionHolder = Participator()
        val test : FindOutTest = FindOutTestManagerManager().getManager().getTestById("nba")
        val findOutTestPaper = user.start(test)
        val question: Question = findOutTestPaper.nextQuestion

    }
}






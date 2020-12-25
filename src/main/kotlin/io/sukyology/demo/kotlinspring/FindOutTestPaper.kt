package io.sukyology.demo.kotlinspring

class FindOutTestPaper(
    val questions: List<Question>
) {
    var solvingNumber = -1
    var submittedNumber = -1

    val nextQuestion: Question
        get() {
            if (questions.size-1 == solvingNumber)
                throw NoMoreQuestionException()
            if (solvingNumber == submittedNumber)
                return questions[solvingNumber+1]
            else
                throw NotAnsweredExistException()
        }
}

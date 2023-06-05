package com.sancho.kotlin_quiz_app.repository

import com.sancho.kotlin_quiz_app.R
import com.sancho.kotlin_quiz_app.model.QuestionModel

class QuestionRepository {


    fun getAllQuestions():ArrayList<QuestionModel> = arrayListOf(
        QuestionModel(question = "Это 1?", image = R.drawable.sevendeadlysins, test1 = "Семь смертных грехов", test2 = "Боец Баки", test3 = "С нуля", test4 = "Ванпанчмен", answer = "Семь смертных грехов"),
        QuestionModel(question = "Это 1?", image = R.drawable.baki, test1 = "Боец Баки", test2 = "С нуля", test3 = "Ванпанчмен", test4 = "Семь смертных грехов", answer = "Боец Баки"),
        QuestionModel(question = "Это 1?", image = R.drawable.rezero, test1 = "Ванпанчмен", test2 = "Наруто", test3 = "С нуля", test4 = "Боец Баки", answer = "С нуля"),
        QuestionModel(question = "Это 1?", image = R.drawable.foxandprice, test1 = "Милый во франксе", test2 = "Семь смертных грехов", test3 = "Боец Баки", test4 = "Волчица и пряности", answer = "Волчица и пряности"),
        QuestionModel(question = "Это 1?", image = R.drawable.deamonsleader, test1 = "Волчица и пряности", test2 = "Клинок рассекающий демонов", test3 = "Семь смертных грехов", test4 = "Милый во франксе", answer = "Клинок рассекающий демонов"),
        QuestionModel(question = "Это 1?", image = R.drawable.darlinginthefranks, test1 = "Наруто", test2 = "Волчица и пряности", test3 = "Очень приятно Бог", test4 = "Милый во франксе", answer = "Милый во франксе"),
        QuestionModel(question = "Это 1?", image = R.drawable.onepunchman, test1 = "Волчица и пряности", test2 = "Клинок рассекающий демонов", test3 = "Ванпанчмен", test4 = "Очень приятно Бог", answer = "Ванпанчмен"),
        QuestionModel(question = "Это 1?", image = R.drawable.naruto, test1 = "Наруто", test2 = "Боец Баки", test3 = "Семь смертных грехов", test4 = "Клинок рассекающий демонов", answer = "Наруто"),
        QuestionModel(question = "Это 1?", image = R.drawable.god, test1 = "Клинок рассекающий демонов", test2 = "Очень приятно Бог", test3 = "Милый во франксе", test4 = "С нуля", answer = "Очень приятно Бог"),
    )
}
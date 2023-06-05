package com.sancho.kotlin_quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.sancho.kotlin_quiz_app.databinding.ActivityMainBinding
import com.sancho.kotlin_quiz_app.model.QuestionModel
import com.sancho.kotlin_quiz_app.repository.QuestionRepository

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var questionRepository: QuestionRepository
    lateinit var arrayList: ArrayList<QuestionModel>
    lateinit var questionModel: QuestionModel
    var trueanswer=0
    var falseanswer=0
    var count=0
    var cheked=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        questionRepository= QuestionRepository()
        arrayList=questionRepository.getAllQuestions()
        arrayList.shuffle()

       setQuestoins()

        binding.apply {
            buttonnext.setOnClickListener{
                setQuestoins()
            }
            textviewtest1.setOnClickListener {
                checkanswers(questionModel,textviewtest1)
            }
            textviewtest2.setOnClickListener {
                checkanswers(questionModel,textviewtest2)
            }
            textviewtest3.setOnClickListener {
                checkanswers(questionModel,textviewtest3)
            }
            textviewtest4.setOnClickListener {
                checkanswers(questionModel,textviewtest4)
            }
        }


    }

    fun setQuestoins(){
        binding.apply {
            checkanswerlimit()
            imageviewquestion.setImageResource(questionModel.image!!)
            textviewquestion.text=questionModel.question
            val arrayList= arrayListOf(
                questionModel.test1,
                questionModel.test2,
                questionModel.test3,
                questionModel.test4,
            )
            arrayList.shuffle()
            textviewtest1.text=arrayList.get(0)
            textviewtest2.text=arrayList.get(1)
            textviewtest3.text=arrayList.get(2)
            textviewtest4.text=arrayList.get(3)
            clearcheckcolor()
            cheked=true
        }


    }
    fun checkanswerlimit(){
        title="count=${count}, q"

        if (count < arrayList.size){
            questionModel=arrayList.get(count)
            title="count${count}, q ${arrayList.get(count).question}"
        }
        if (count==arrayList.size-1){
            binding.buttonnext.text="finish"
        }
        if (count==arrayList.size){
            endgame()
        }
        if (count==arrayList.size+1){
            restart()
        }
        count++
    }

    fun endgame(){
        binding.apply {
            linearlay1.gone()
            buttonnext.text="REATART ?"
            textviewtrueorfalseanswer.visible()
            textviewtrueorfalseanswer.text="True $trueanswer\nFalse $falseanswer"
        }
    }

    fun restart(){
        count=0
        setQuestoins()
        trueanswer=0
        falseanswer=0
        binding.apply {
            linearlay1.visible()
            buttonnext.text="NEXT"
            textviewtrueorfalseanswer.gone()
        }
    }

    fun checkanswers(questionModel: QuestionModel,view:TextView){
        binding.apply {
            if (view.text.toString()==questionModel.answer){
                //showtoast(this@MainActivity,"true")
                checkcolor(true,view)
                if (cheked){
                    trueanswer++
                    cheked=false
                }
            }else{
                //showtoast(this@MainActivity,"false")
                checkcolor(false,view)
                if (cheked){
                    cheked=false
                    falseanswer++
                }
            }
        }
    }

    fun checkcolor(trueorfalse:Boolean,view: TextView){
        if (trueorfalse){
            view.background=ContextCompat.getDrawable(this@MainActivity,R.drawable.background_greenwne)
        }else{
            view.background=ContextCompat.getDrawable(this@MainActivity,R.drawable.background_redone)
        }
    }

    fun clearcheckcolor(){
        binding.apply {
            textviewtest1.background=ContextCompat.getDrawable(this@MainActivity,R.drawable.background_transparent)
            textviewtest2.background=ContextCompat.getDrawable(this@MainActivity,R.drawable.background_transparent)
            textviewtest3.background=ContextCompat.getDrawable(this@MainActivity,R.drawable.background_transparent)
            textviewtest4.background=ContextCompat.getDrawable(this@MainActivity,R.drawable.background_transparent)
        }
    }






}
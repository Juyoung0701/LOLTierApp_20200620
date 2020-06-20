package kr.co.namu.loltierapp_20200620

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        MMR - 1250 미만 : 브론즈
//        1250~1500 : 실버
//        1500~1800 : 골드
//        1800~2200 : 플레티넘
//        2200 ~ : 다이아


        calculateBtn.setOnClickListener {

            val mmrScore = mmrScoreEdt.text.toString().toInt()


            if (mmrScore < 1250) {
                tierTxt.text = "당신은 브론즈 입니다."
            }
            else if (mmrScore < 1500) {
                tierTxt.text = "당신은 실버 입니다."
            }

            else if (mmrScore < 1800){
                tierTxt.text = "당신은 골드 입니다."
            }
            else if (mmrScore < 2200){
                tierTxt.text = "당신은 플레 입니다."
            }
            else {
                tierTxt.text = "당신은 다이아 입니다."
            }



        }


    }
}
package com.leral3.containerspinnerwithhoroscpoes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.leral3.containerspinnerwithhoroscpoes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




        //data 변수에 listOf를 이용해서 별자리 추가
        var data = listOf(
            "--선택하세요--",
            "물병자리",
            "물고기자리",
            "양자리",
            "황소자리",
            "쌍둥이자리",
            "게자리",
            "사자자리",
            "처녀자리",
            "천칭자리",
            "전갈지리",
            "사수자리",
            "염소자리"
        )

        // data와 스피너를 연결해줄 ArrayAdapter 클래스를 만들어 adapter 변수에 지정
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)

        binding.spinner.adapter = adapter
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    0 -> {
                        binding.textViewStars.setText("별자리를 선택하세요")
                    }
                    1 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgaquarius)
                        binding.textViewStars.setText(R.string.Aquarius)
                    }
                    2 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgpisces)
                        binding.textViewStars.setText(R.string.Pisces)
                    }
                    3 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgaries)
                        binding.textViewStars.setText(R.string.Aries)
                    }
                    4 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgtaurus)
                        binding.textViewStars.setText(R.string.Taurus)
                    }
                    5 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imggemini)
                        binding.textViewStars.setText(R.string.Gemini)
                    }
                    6 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgcancer)
                        binding.textViewStars.setText(R.string.cancer)
                    }
                    7 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgleo)
                        binding.textViewStars.setText(R.string.Leo)
                    }
                    8 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgvirgo)
                        binding.textViewStars.setText(R.string.Virgo)
                    }
                    9 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imglibra)
                        binding.textViewStars.setText(R.string.Libra)
                    }
                    10 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgscorpio)
                        binding.textViewStars.setText(R.string.Scorpio)
                    }
                    11 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgsagitarus)
                        binding.textViewStars.setText(R.string.Sagitarius)
                    }
                    12 -> {
                        binding.imageViewStars.setImageResource(R.drawable.imgcapricorn)
                        binding.textViewStars.setText(R.string.Capricorn)
                    }
                }
                binding.btnStars.setOnClickListener {
                    var temp = data.get(position)
                    val intent = Intent(baseContext, WebViewActivity::class.java)
                    intent.putExtra("stars", temp)
                    startActivity(intent)
                }
            }


            override fun onNothingSelected(parent: AdapterView<*>?) {
            }


        }
    }
}
package com.yaofaquan.yaocalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.yaofaquan.kotlincalculator.R
import kotlinx.android.synthetic.main.activity_main.*

@ExperimentalStdlibApi
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val mYaoOperands : YaoOperands = YaoOperands()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_clear.setOnClickListener(this)
        btn_del.setOnClickListener(this)
        btn_divide.setOnClickListener(this)
        btn_multipy.setOnClickListener(this)
        btn_7.setOnClickListener(this)
        btn_8.setOnClickListener(this)
        btn_9.setOnClickListener(this)
        btn_minus.setOnClickListener(this)
        btn_4.setOnClickListener(this)
        btn_5.setOnClickListener(this)
        btn_6.setOnClickListener(this)
        btn_plus.setOnClickListener(this)
        btn_1.setOnClickListener(this)
        btn_2.setOnClickListener(this)
        btn_3.setOnClickListener(this)
        btn_a.setOnClickListener(this)
        btn_0.setOnClickListener(this)
        btn_b.setOnClickListener(this)
        button.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if(p0 == null) {
            return;
        }
        when(p0.id) {
            R.id.btn_clear -> mYaoOperands.clear()
            R.id.btn_del -> mYaoOperands.del()
            R.id.btn_a -> mYaoOperands.compute()
            else -> {
                if(p0 is Button) {
                    var text = p0.text
                    mYaoOperands.add(text[0])
                }
            }
        }
        et_input.setText(mYaoOperands.toString())
    }
}
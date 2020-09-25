package dev.yangfengfan.kotlin.extensions.android

import android.content.Context
import android.widget.Toast

/**
 * @author yangfengfandev@gmail.com 2020-09-25
 */
fun Context.toast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}
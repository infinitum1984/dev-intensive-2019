package ru.skillbranch.devintensive.extentsions

import java.text.SimpleDateFormat
import java.util.*

fun Date.dformat(pattern:String="HH:mm:ss dd.MM.yy"):String{
    val dateFormat=SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

package com.mrgrd56.app

import com.mrgrd56.app.utils.getResource

fun main() {
    val text = getResource("text.txt").readText()
    val wordsCount = countWords(text)
    wordsCount.forEach { (word, count) ->
        println("$word: $count")
    }
}
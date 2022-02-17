package com.mrgrd56.app

val WORDS_REGEX = Regex("\\b[\\w-'’]+\\b")

fun countWords(text: String): Map<String, Int> {
    return WORDS_REGEX.findAll(text)
        .groupBy { it.value }
        .mapValues { it.value.size }
        .toList()
        .sortedByDescending { (_, v) -> v }
        .toMap()
}
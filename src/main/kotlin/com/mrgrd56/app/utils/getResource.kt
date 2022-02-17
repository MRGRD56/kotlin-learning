package com.mrgrd56.app.utils

import java.io.IOException
import java.net.URL

fun getResource(name: String): URL =
    object {}.javaClass.getResource(name)
        ?: throw IOException("Unable to read the resource")
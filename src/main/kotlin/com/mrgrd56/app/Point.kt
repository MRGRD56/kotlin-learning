package com.mrgrd56.app

data class Point(val x: Int, val y: Int) {
    operator fun plus(that: Point): Point {
        return Point(x + that.x, y + that.y);
    }
}

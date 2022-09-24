package dev.synapsetech.compass

enum class Cardinal(val letter: String, val degree: Int) {
    NORTH("N", 0),
    EAST("E", 90),
    SOUTH("S", 180),
    WEST("W", 270),
    ;

    companion object {
        fun fromDegree(degree: Int): Cardinal {
            val divisor: Int = 360 / values().size
            val coci = degree / divisor
            val resto = degree % divisor
            return if (resto <= divisor / 2) {
                values()[coci % values().size]
            } else {
                values()[(coci + 1) % values().size]
            }
        }
    }
}
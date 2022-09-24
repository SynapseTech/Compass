package dev.synapsetech.compass

import org.junit.Test

import org.junit.Assert.*

class CardinalEnumTest {
    @Test
    fun detection_isCorrect() {
        assertEquals(Cardinal.NORTH, Cardinal.fromDegree(0))
        assertEquals(Cardinal.NORTH, Cardinal.fromDegree(360))
        assertEquals(Cardinal.NORTH, Cardinal.fromDegree(10))
        assertEquals(Cardinal.NORTH, Cardinal.fromDegree(350))

        assertEquals(Cardinal.EAST, Cardinal.fromDegree(90))
        assertEquals(Cardinal.EAST, Cardinal.fromDegree(83))
        assertEquals(Cardinal.EAST, Cardinal.fromDegree(99))

        assertEquals(Cardinal.SOUTH, Cardinal.fromDegree(180))
        assertEquals(Cardinal.SOUTH, Cardinal.fromDegree(172))
        assertEquals(Cardinal.SOUTH, Cardinal.fromDegree(194))

        assertEquals(Cardinal.WEST, Cardinal.fromDegree(270))
        assertEquals(Cardinal.WEST, Cardinal.fromDegree(267))
        assertEquals(Cardinal.WEST, Cardinal.fromDegree(286))
    }
}
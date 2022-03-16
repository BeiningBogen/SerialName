package no.beiningbogen

import metadata.commonMain.kotlin.no.beiningbogen.fromSerialName
import metadata.commonMain.kotlin.no.beiningbogen.toSerialName
import kotlin.test.Test
import kotlin.test.assertEquals

class DirectionTest {

    @Test
    fun eastFromSerialName() {
        assertEquals(Directions.EAST, Directions.fromSerialName("east"))
    }

    @Test
    fun eastToSerialName() {
        assertEquals("east", Directions.EAST.toSerialName())
    }

    @Test
    fun northFromSerialName() {
        assertEquals(Directions.NORTH, Directions.fromSerialName("north"))
    }

    @Test
    fun northToSerialName() {
        assertEquals("north", Directions.NORTH.toSerialName())
    }

    @Test
    fun westFromSerialName() {
        assertEquals(Directions.WEST, Directions.fromSerialName("west"))
    }

    @Test
    fun westToSerialName() {
        assertEquals("west", Directions.WEST.toSerialName())
    }

    @Test
    fun southFromSerialName() {
        assertEquals(Directions.SOUTH, Directions.fromSerialName("south"))
    }

    @Test
    fun southToSerialName() {
        assertEquals("south", Directions.SOUTH.toSerialName())
    }
}

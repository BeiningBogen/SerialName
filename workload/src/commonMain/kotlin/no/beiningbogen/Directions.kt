package no.beiningbogen

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
enum class Directions {
    @SerialName("east")
    EAST,

    @SerialName("north")
    NORTH,

    @SerialName("west")
    WEST,

    @SerialName("south")
    SOUTH;

    companion object
}

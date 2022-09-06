package de.siastudios.ions.backend.model

data class Location (
    val name: String,
    val building: String,
    val floor: Int,
    val status: Boolean
)
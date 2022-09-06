package de.siastudios.ions.backend.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.stereotype.Component

@Component
@Document("location_category")
data class LocationCategory(
    @Id val id: String,
    @Field(name="type") @Indexed(unique = true) var type: String,
    @Field("description") var description: String,
    @Field("image_reference") var imageReference: String,
    @Field("flutter_icon_hex") var flutterIconHex: String,
    @Field(name="locations") var locations: List<Location>
)

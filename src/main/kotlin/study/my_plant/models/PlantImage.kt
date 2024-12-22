package study.my_plant.models

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
class PlantImage (
    val date: LocalDate,
    val imageUrl: String
)

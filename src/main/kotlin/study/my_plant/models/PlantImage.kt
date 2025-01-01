package study.my_plant.models

import java.time.LocalDate

class PlantImage (
    val date: LocalDate = LocalDate.now(),
    val imageUrl: String
)

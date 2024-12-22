package study.my_plant.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
class Plant(
    @Id
    val id: String? = null,
    val name: String,
    val memo: String,
    val mainImageUrl: String? = null,
    val dateAcquired: LocalDate, //처음 데려온 날짜
    val lastWateredDate: LocalDate, //마지막으로 물을 준 날짜
    val images: MutableList<PlantImage> = mutableListOf() // 날짜별 이미지 목록
)

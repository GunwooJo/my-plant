package study.my_plant.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
class Plant(
    @Id
    val id: String? = null,
    val userId: String,
    val name: String,
    val memo: String,
    val dateAcquired: LocalDate, //처음 데려온 날짜
    val lastWateredDate: LocalDate, //마지막으로 물을 준 날짜
    val images: MutableList<PlantImage> = mutableListOf() // 날짜별 이미지 목록
): BaseDoc() {

    val mainImage: PlantImage?
        get() = images.maxByOrNull { it.date }  // 가장 최근 날짜의 이미지 반환
}

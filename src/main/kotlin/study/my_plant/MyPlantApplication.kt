package study.my_plant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing

@SpringBootApplication
@EnableMongoAuditing  // MongoDB Auditing 활성화
class MyPlantApplication

fun main(args: Array<String>) {
	runApplication<MyPlantApplication>(*args)
}

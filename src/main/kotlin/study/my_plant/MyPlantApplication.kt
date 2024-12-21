package study.my_plant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyPlantApplication

fun main(args: Array<String>) {
	runApplication<MyPlantApplication>(*args)
}

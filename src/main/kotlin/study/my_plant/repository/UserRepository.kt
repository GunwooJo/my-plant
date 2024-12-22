package study.my_plant.repository

import org.springframework.data.mongodb.repository.MongoRepository
import study.my_plant.models.User

interface UserRepository : MongoRepository<User, String> {
    fun findByName(name: String): List<User>
}

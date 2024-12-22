package study.my_plant.service

import org.springframework.stereotype.Service
import study.my_plant.models.User
import study.my_plant.repository.UserRepository

@Service
class UserService(private val userRepository: UserRepository) {

    fun createUser(user: User): User {
        return userRepository.save(user)
    }

    fun getUserByName(name: String): List<User> {
        return userRepository.findByName(name)
    }

    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }
}

package study.my_plant.controller

import org.springframework.web.bind.annotation.*
import study.my_plant.models.User
import study.my_plant.service.UserService

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @PostMapping
    fun createUser(@RequestBody user: User): User {
        return userService.createUser(user)
    }

    @GetMapping("/{name}")
    fun getUserByName(@PathVariable name: String): List<User> {
        return userService.getUserByName(name)
    }

    @GetMapping
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }
}

package com.kotlin.facebook

import com.kotlin.facebook.repositiories.*
import com.kotlin.facebook.services.*

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping

@SpringBootApplication
class FacebookApplication

fun main(args: Array<String>) {
	runApplication<FacebookApplication>(*args)
}

// User

@RestController
class UserResource(val service: UserService) {
	@GetMapping(path = ["/users"])
	fun index(): List<com.kotlin.facebook.repositiories.User> = service.findUsers()


	@PostMapping(path = ["/user/new"])
	fun post(@RequestBody user: User) {
		print(user);
		service.post(user)
	}
}

// Friendship

@RestController
class FriendshipResource(val service: FriendshipService) {
	@GetMapping(path = ["/friendships"])
	fun index(): List<Friendship> = service.findFriendships()

	@PostMapping(path = ["/friendship/new"])
	fun post(@RequestBody friendship: Friendship) {
		service.post(friendship)
	}
}

// Group

@RestController
class GroupResource(val service: GroupService) {
	@GetMapping(path = ["/groups"])
	fun index(): List<Group> = service.findGroups()

	@PostMapping(path = ["/group/new"])
	fun post(@RequestBody group: Group) {
		service.post(group)
	}
}

// Page

@RestController
class PageResource(val service: PageService) {
	@GetMapping(path = ["/pages"])
	fun index(): List<Page> = service.findPages()

	@PostMapping(path = ["/page/new"])
	fun post(@RequestBody page: Page) {
		service.post(page)
	}
}

// Post

@RestController
class PostResource(val service: PostService) {
	@GetMapping(path = ["/posts"])
	fun index(): List<Post> = service.findPosts()

	@PostMapping(path = ["/post/new"])
	fun post(@RequestBody post: Post) {
		service.post(post)
	}
}

// TextMessage

@RestController
class TextMessageResource(val service: TextMessageService) {
	@GetMapping(path = ["/messages"])
	fun index(): List<TextMessage> = service.findTextMessages()

	@PostMapping(path = ["/message/new"])
	fun post(@RequestBody textMessage: TextMessage) {
		service.post(textMessage)
	}
}








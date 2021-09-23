package me.user.shared


class Greeting {
  fun hello(message: String) {

  }

  fun greeting(): String {
    return "Hello, ${Platform().platform}!"
  }
}

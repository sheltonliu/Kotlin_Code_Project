package b_类和对象

/**
 * Created by liushuo on 17/9/1.
 */

object TestWeiTuo2 {

  @JvmStatic fun main(args: Array<String>) {
    val user = User(mapOf("name" to "John Doe", "age" to 25
    ));

    println(user.age)
    println(user.map)
  }

  class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
  }
}




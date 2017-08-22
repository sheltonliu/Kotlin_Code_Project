package com.example

object MyClass {

  @JvmStatic fun main(args: Array<String>) {
    print("hello")

    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
      println("item at $index is ${items[index]}")
      index++
    }

    testMap()
    testdeng()
  }

  fun testMap(){
    //只读map
    val map = mapOf<String,Int>("a" to 1,"b" to 2, "c" to 3)
    //访问map
    println(map["c"])
  }

  fun testdeng(){
//    val a :Int = 100;
//    val a1 : Int? = a;
//    val a2 : Int? = a
//    println(a1 == a2)


    //注意数字装箱不必保留同一性:
    val a: Int = 10000
    println(a === a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // !!!输出“false”!!!    三个"="
  }
}

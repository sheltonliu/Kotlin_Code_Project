package d_其他

/**
 * Created by liushuo on 17/9/7.
 */
object TestJieGou {

  @JvmStatic fun main(args: Array<String>) {

    val map = mapOf<Int, String>(1 to "one", 2 to "two")

    map.mapValues { entry -> "${entry.value}!" }

    println("================")
    //解构声明和映射,  可能遍历一个映射(map)最好的方式就是这样:
    for((key, value) in map){
      println(key)
      println(value)
    }



    println("================")

    val items = listOf(1, 2, 3, 4)
    val itfilter = items.filter { it % 2 == 0 }
    println(itfilter)
    for(aa in itfilter){
      println(aa)
    }

  }

}
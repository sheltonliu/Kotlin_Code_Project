package a_基础

import com.example.MyClass

/**
 * Created by liushuo on 17/8/17.
 */
object test{

  @JvmStatic fun main(args: Array<String>) {

      testshow();

     // printStr();
  }

  //打印字符串
  private fun printStr() {
    for(c in "hello world"){
        println(c)
    }

    val text = """    |Tell me and I forget. |Teach me and I remember. |Involve me and I learn. |(Benjamin Franklin) """.trimMargin()
    println(text)
  }

  //显示转换
  private fun testshow() {
//    // 假想的代码,实际上并不能编译:
//    val a: Int? = 1 // 一个装箱的 Int (java.lang.Integer)
//    val b: Long? = a // 隐式转换产生一个装箱的 Long (java.lang.Long)
//    print(a == b) // 惊!这将打印 "false" 鉴于 Long 的 equals() 检测其他部分也是 Long


    //较小类型不能转化成较大类型
    val b: Byte = 1 //
    //val i: Int = b

    val i: Int = b.toInt() // OK: 显式拓宽
    val l = 1L + 3 //
    println(i)
    println(l)

    val price = """  ${'$'}9.99  """
    println(price)

  }


}
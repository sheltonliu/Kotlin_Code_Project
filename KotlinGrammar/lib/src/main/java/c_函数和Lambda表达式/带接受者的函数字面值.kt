package c_函数和Lambda表达式

/**
 * Created by liushuo on 17/9/3.
 */

object TestZiMianZhi{

  @JvmStatic fun main(args: Array<String>) {

    val sum = fun Int.(other: Int): Int = this + other

    println(1.sum(2))
  }

}
package b_类和对象

/**
 * Created by liushuo on 17/8/23.
 */

object TestFanXing{

  @JvmStatic fun main(args: Array<String>) {


    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any :Array<Any> = arrayOf("1","2","3")
    val ss = arrayOf("1","2")
    val number : Array<Number> = arrayOf(1,2,3)

    fill(number, "")
    fill(ints, "")
    fill(any, "")

  }

  //out:需要int的子类型才可以传递
  fun fill(dest: Array<*>, value: String) {

  }

  fun <T> singletonList(item: T): List<T> { // ......

    return arrayListOf();
  }

}


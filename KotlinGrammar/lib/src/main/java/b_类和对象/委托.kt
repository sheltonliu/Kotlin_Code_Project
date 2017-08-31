package b_类和对象

/**
 * Created by liushuo on 17/8/30.
 */

object TestWeiTuo{

//  fun main(args: Array<String>) {
//    val b = BaseImpl(10) Derived(b).print() // 输出 10
//  }


  @JvmStatic fun main(args: Array<String>) {
    val b = BaseImpl(10)

    Derived(b).print() // 输出 10


  }

}


interface Base {
  fun print()
}

class BaseImpl(val x: Int) : Base {
  override fun print() { print(x) }
}

class Derived(b: Base) : Base by b



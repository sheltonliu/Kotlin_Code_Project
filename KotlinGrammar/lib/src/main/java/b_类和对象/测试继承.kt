package b_类和对象

/**
 * Created by liushuo on 17/8/21.
 */

object TestTwo{

  @JvmStatic fun main(args: Array<String>) {
    val cc = C()
    println(cc.f())

  }


  open class A {
    open fun f() { print("A") }

    fun a() { print("a") }
  }
  interface B {
    fun f() { print("B") } // 接口成员默认就是“open”的 fun b() { print("b") }
  }

  class C() : A(), B {
// 编译器要求覆盖 f():
    override fun f() {
      super<A>.f() // 调用 A.f()
//      super<B>.f() // 调用 B.f() }

      println("class c")
    }
  }




  interface Foo {
    val count: Int
  }
  //构造函数中使用 override
  class Bar1(override val count: Int) : Foo

  class Bar2 : Foo {
    override var count: Int = 0
  }

}


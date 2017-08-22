package b_类和对象

/**
 * Created by liushuo on 17/8/20.
 */

object test{

  @JvmStatic fun main(args: Array<String>) {

    val cus = Customer("xiaoming", 18)
    cus.testOther();

    val cu2 = Customer2("jack");
    val cuTest = testFun();
    println(cuTest.name)
  }


  open class Base(p: Int)
  //继承
  class Derived(p: Int) : Base(p){
    val name = "deriv"
  }

  fun testFun() : Derived {
    val result = Derived(5)
    return result;
  }

}
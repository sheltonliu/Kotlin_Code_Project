package b_类和对象

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by liushuo on 17/8/30.
 */

object TestWeiTuo {

//  fun main(args: Array<String>) {
//    val b = BaseImpl(10) Derived(b).print() // 输出 10
//  }


  @JvmStatic fun main(args: Array<String>) {
    val b = BaseImpl(10)

    Derived(b).print() // 输出 10

    //延迟属性
    println(lazyValue)
    println(lazyValue)


    //委托观察属性
    val user = User()
    user.name = "first"
    user.name = "second"

  }

}


class User {
  var name: String by Delegates.observable("初始值") {
    prop, old, new ->
    println("$old -> $new")
  }
}

class Delegate {
  operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
    return "$thisRef, thank you for delegating '${property.name}' to me!"
  }

  operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
    println("$value has been assigned to '${property.name} in $thisRef.'")
  }
}


val lazyValue: String by lazy {
  println("computed!")

  "Hello"
}


interface Base {
  fun print()
}

class BaseImpl(val x: Int) : Base {
  override fun print() {
    println(x)
  }
}

class Derived(b: Base) : Base by b



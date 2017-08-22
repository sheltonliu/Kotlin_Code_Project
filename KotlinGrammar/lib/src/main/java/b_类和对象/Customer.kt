package b_类和对象

import a_基础.test

/**
 * Created by liushuo on 17/8/20.
 */
class Customer constructor(val name:String){

  //类体内声明的属性
  val upName = name.toUpperCase();

  //初始化块
  init {
    println("初始化块...upName..."+upName)
  }

  //次构造函数,通过this关键字,委托给主构造函数
  constructor(name:String, age:Int) : this(name){

    println("次构造函数..."+name+"   "+age)
  }

  fun testOther(){
    println("函数体...")
  }

}
package b_类和对象

/**
 * Created by liushuo on 17/8/22.
 */
object TestKuozhan{

  @JvmStatic fun main(args: Array<String>) {

    val vv = mutableListOf<Int>(1,2,3)
//    vv.swap(0,2)
    vv.other(0,2)
    vv.forEach {
        println(it)
    }

    for(test in vv){
      println(test)
    }

    val v2 = null;
    println(v2.toMyString())
  }

}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
  val tmp = this[index1] // “this”对应该列表
  this[index1] = this[index2]
  this[index2] = tmp
}

fun MutableList<Int>.other(i1:Int, i2:Int){
  val temp = this[i1]
  this[i1] = this[i2]
  this[i2] = temp
}

fun Any?.toMyString(): String {
  if (this == null) return "null"
  // 空检测之后,“this”会自动转换为非空类型,所以下面的 toString()
  // 解析为 Any 类的成员函数
  return toString()
}





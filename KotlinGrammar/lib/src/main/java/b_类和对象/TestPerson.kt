package b_类和对象

/**
 * Created by liushuo on 17/11/30.
 */
object TestPerson {

    @JvmStatic fun main(args: Array<String>) {

        val p1 = Person("a",11)
        val p2 = Person("b",12)
        val p3 = Person("c",13)

        val test = listOf(p1,p2,p3)
        val t2 = mutableListOf(test)
        if (test == t2){
            System.out.print("=====")
        }else{
            System.out.print("!!")
        }

        if (test.get(0).age > 0){

        }

        System.out.print("githubhello")

    }

}
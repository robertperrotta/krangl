package krangl.scratch

import krangl.*
import java.io.BufferedReader
import java.io.FileReader


@Suppress("UNUSED_VARIABLE")
        /**
 * Created by brandl on 6/7/16.
 */

fun main(args: Array<String>) {


//    listOf(1,2,3).so
//    sleepData.sortBy { it{""}}


    val tt = sleepData.addColumn("user_id") {
        const("id") + rowNumber
    }

    val col = IntCol("foo", listOf(1, 2, 3))

    val ff = col + 3
    val fd = col + 3.0

    //    val df = dataFrameOf(
    //            "foo", "bar")(
    //            "ll", 2, 3,
    //            "sdfd", 4, 5,
    //            "sdf", 5, 8
    //    )

    col + "sdf"
}


class Foo {
    infix fun `==`(isEqualTo: Int): BooleanArray {
        TODO("not implemented")
    }

    infix fun `==`(isEqualTo: String): BooleanArray {
        TODO("not implemented")
    }

}

fun main3(args: Array<String>) {


    //    fun `~!@#$%^&*()_+`() = "foo"


}

fun main2(args: Array<String>) {
    BufferedReader(FileReader("sdf")).lineSequence().map { line ->
        TODO()
    }.toList()

    generateSequence() { readLine() }.map { line ->
        TODO()
    }


    val df = dataFrameOf(
        "foo", "bar")(
        "ll", 2, 3,
        "sdfd", 4, 5,
        "sdf", 5, 8
    )


    df.addColumn("ot") { it["ll"] }
    df.addColumn("ot") { it["ll"] }


    // most wanted
    df.filter({ it["vore"] eq "omni" })
    // instead of
    df.filter { it["vore"] gt 5 }
    //    df.filter { it["vore"] `==` 5 }
    //    df.filter { it["vore"] `>` 5 }
    //    df.filter { it["vore"] > 5 }
    //    df.filter { it["vore"]` `  }


    df.addColumn("foo") { it["df"].median() }


    df["foo"] + 3

}



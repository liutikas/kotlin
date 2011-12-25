package std.template.html

import std.*
import std.template.*
import std.template.io.*
import std.io.*
import std.util.*
import std.test.*
import java.util.*

/*
  TODO generates compiler error
  see: http://youtrack.jetbrains.net/issue/KT-866

val justBody = body {
    +"Hello world"
  }

fun result(args : List<String>) =
  html {
    head {
      title {+"XML encoding with Kotlin"}
    }
    body {
      h1 {+"XML encoding with Kotlin"}
      p {+"this format can be used as an alternative markup to XML"}

      // an element with attributes and text content
      a(href = "http://jetbrains.com/kotlin") {+"Kotlin"}

      // mixed content
      p {
        +"This is some"
        b {+"mixed"}
        +"text. For more see the"
        a(href = "http://jetbrains.com/kotlin") {+"Kotlin"}
        +"project"
      }
      p {+"some text"}

      // content generated by
      p {
        for (arg in args)
          +arg
      }
    }
  }
*/

class TemplateHtmlTest() : TestSupport() {
  fun testNoneCompileYet() {
  }

/*
 TODO: compiler bug
 see: http://youtrack.jetbrains.net/issue/KT-866

  fun testJustBody() {
    println(justBody)
  }

  fun testHtmlFunction() {
    val text = result(arrayList("a", "b", "c"))
    println(text)
  }

  fun testEmbeddedFunction() {
    val e = html {
      head {
        title {+"XML encoding with Kotlin"}
      }
        body {
          a("http://jetbrains.com/kotlin")
        }
    }
    println(e)
  }
*/
}
package de.takeweiland.kotlinmppnpmdemo.common

import kotlin.js.JsName

/**
 * I would like to use this code in a Typescript project also.
 */
object CommonClass {

    val commonValue = "This is a common value"

}

@JsName("commonFun")
fun commonFun() = "Hello from Kotlin MPP common code!"
package com.box.kotlin

fun main() {
   Box.select()
}

fun requestInputValue(unit:String) : Float {
    var unitVal : Float
    print("Please enter object's $unit:")
    do {
        unitVal = readLine()?.toFloatOrNull() ?: 0f
    }while (unitVal == 0f)
    return unitVal
}

abstract class Box(var length:Float, var width:Float, var height:Float){

    companion object {
        @JvmStatic
        fun select(){
            val length = requestInputValue("length")
            val width = requestInputValue("width")
            val height = requestInputValue("height")
            val boxes = mutableListOf(Box3(), Box5())
            boxes.forEach {
                if (it.validated(length, width, height)) {
                    print("Your selected box is ${it.name()} and the price is $${it.price()}")
                    return
                }
            }
            print("No box match!")
        }
    }

    fun validated(length:Float, width:Float, height:Float) =
         (length <= this.length && width <= this.width && height <= this.height)

    abstract fun name(): String
    abstract fun price(): Int
}

class Box3 : Box(23f,14f,13f){
    override fun name(): String {
        return "Box3"
    }

    override fun price(): Int {
        return 100
    }
}

class Box5 : Box(39.5f,27.5f,23f){
    override fun name(): String {
        return "Box5"
    }

    override fun price(): Int {
        return 200
    }
}
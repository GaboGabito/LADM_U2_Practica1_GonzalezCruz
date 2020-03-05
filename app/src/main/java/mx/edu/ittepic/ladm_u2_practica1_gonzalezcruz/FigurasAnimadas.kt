package mx.edu.ittepic.ladm_u2_practica1_gonzalezcruz

import android.graphics.Canvas
import android.graphics.Paint

class FigurasAnimadas() {

    var x = 0f
    var y = 0f
    var radio = 0f
    var incy = 5
    var incx = 5
    var doble = 10

    constructor(x: Int,y: Int,radio: Int):this() {
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
    }

    fun pintar(c: Canvas, p: Paint){

        c.drawCircle(x,y,radio,p)
    }

    fun movNube(){
        x += incx
    }
    fun movSol(){
        x += doble
    }

    fun nevar(alto:Int){
        y+=incy
        if(y>=alto){
            y=0f
        }

    }
}
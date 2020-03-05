package mx.edu.ittepic.ladm_u2_practica1_gonzalezcruz

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.View

class Lienzo(p:MainActivity): View(p){
    var puntero = p

    var nube = FigurasAnimadas(800,300, 80)
    var nube2 = FigurasAnimadas(750,300,80)
    var nube3 = FigurasAnimadas(750,250,80)
    var nube4 = FigurasAnimadas(800,250,80)
    var nube5 = FigurasAnimadas(860,300,80)
    var sol = FigurasAnimadas(200,300, 100)
    var copoN = FigurasAnimadas(30,-700, 10)
    var copoN2 = FigurasAnimadas(70, -120,20)
    var copoN3 = FigurasAnimadas(180,-220, 10)
    var copoN4 = FigurasAnimadas(200,-300, 50)
    var copoN5 = FigurasAnimadas(430,-400, 10)
    var copoN6 = FigurasAnimadas(800,-500, 30)
    var copoN7 = FigurasAnimadas(300,-600, 40)
    var copoN8 = FigurasAnimadas(580,-300, 35)
    var copoN9 = FigurasAnimadas(480,-180, 20)
    var copoN10 = FigurasAnimadas(700,-240, 25)
    var copoN11 = FigurasAnimadas(1000,-380, 15)
    var copoN12 = FigurasAnimadas(100,-100, 20)
    var copoN13 = FigurasAnimadas(600,-450, 30)
    var copoN14 = FigurasAnimadas(900,-360, 35)
    var copoN15 = FigurasAnimadas(880,-560, 40)
    var copoN16 = FigurasAnimadas(30,-1400, 10)
    var copoN17 = FigurasAnimadas(70, -820,20)
    var copoN18 = FigurasAnimadas(180,-920, 10)
    var copoN19 = FigurasAnimadas(200,-1000, 50)
    var copoN20 = FigurasAnimadas(430,-900, 10)
    var copoN21 = FigurasAnimadas(800,-1500, 30)
    var copoN22 = FigurasAnimadas(300,-1400, 40)
    var copoN23 = FigurasAnimadas(580,-1000, 35)
    var copoN24 = FigurasAnimadas(480,-1280, 20)
    var copoN25 = FigurasAnimadas(700,-1240, 25)
    var copoN26 = FigurasAnimadas(1000,-1080, 15)
    var copoN27 = FigurasAnimadas(100,-900, 20)
    var copoN28 = FigurasAnimadas(600,-1050, 30)
    var copoN29 = FigurasAnimadas(900,-1160, 35)
    var copoN30 = FigurasAnimadas(880,-1260, 40)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()
        var path=Path()



        //FONDO
        canvas.drawARGB(100,0,255,255)

       //SUELO
        paint.color=Color.rgb(86,225,34)
        canvas.drawRect(0f, 1200f,width.toFloat(),height.toFloat(),paint)

        //ARBOL
        paint.color=Color.rgb(192,118,8)
        canvas.drawRect(250f,1400f,150f,1200f,paint)
        paint.color=Color.rgb(51,131,19)
        canvas.drawCircle(200f,1140f, 80f,paint)
        paint.color=Color.rgb(51,131,19)
        canvas.drawCircle(200f,1060f,80f,paint)

        //SOL Y NUBE
        paint.color=Color.WHITE
        nube.pintar(canvas,paint)
        nube2.pintar(canvas,paint)
        nube3.pintar(canvas,paint)
        nube4.pintar(canvas,paint)
        nube5.pintar(canvas,paint)

        paint.color=Color.YELLOW
        sol.pintar(canvas,paint)


        //CASA
        paint.color=Color.rgb(255,171,233)
        canvas.drawRect(480f,1000f,900f,1400f, paint)
        paint.color=Color.rgb(149,0,255)
        canvas.drawRect(700f,1200f,800f,1400f,paint)
        path.moveTo(420f,1000f)
        path.lineTo(690f,800f)
        path.lineTo(960f,1000f)
        paint.color=Color.GRAY
        canvas.drawPath(path,paint)
        paint.color=Color.WHITE
        canvas.drawCircle(600f,1200f,80f,paint)
        paint.style = Paint.Style.STROKE
        paint.color =Color.rgb(149,0,255)
        paint.strokeWidth = 10f
        canvas.drawCircle(600f,1200f,80f,paint)

        paint.style = Paint.Style.FILL
        paint.color=Color.argb(200,255,255,255)
        copoN.pintar(canvas,paint)
        copoN2.pintar(canvas,paint)
        copoN3.pintar(canvas,paint)
        copoN4.pintar(canvas,paint)
        copoN5.pintar(canvas,paint)
        copoN6.pintar(canvas,paint)
        copoN7.pintar(canvas,paint)
        copoN8.pintar(canvas,paint)
        copoN9.pintar(canvas,paint)
        copoN10.pintar(canvas,paint)
        copoN11.pintar(canvas,paint)
        copoN12.pintar(canvas,paint)
        copoN13.pintar(canvas,paint)
        copoN14.pintar(canvas,paint)
        copoN15.pintar(canvas,paint)
        copoN16.pintar(canvas,paint)
        copoN17.pintar(canvas,paint)
        copoN18.pintar(canvas,paint)
        copoN19.pintar(canvas,paint)
        copoN20.pintar(canvas,paint)
        copoN21.pintar(canvas,paint)
        copoN22.pintar(canvas,paint)
        copoN23.pintar(canvas,paint)
        copoN24.pintar(canvas,paint)
        copoN25.pintar(canvas,paint)
        copoN26.pintar(canvas,paint)
        copoN27.pintar(canvas,paint)
        copoN28.pintar(canvas,paint)
        copoN29.pintar(canvas,paint)
        copoN30.pintar(canvas,paint)

    }
    fun animacion(){
        copoN.nevar(height)
        copoN2.nevar(height)
        copoN3.nevar(height)
        copoN4.nevar(height)
        copoN5.nevar(height)
        copoN6.nevar(height)
        copoN7.nevar(height)
        copoN8.nevar(height)
        copoN9.nevar(height)
        copoN10.nevar(height)
        copoN11.nevar(height)
        copoN12.nevar(height)
        copoN13.nevar(height)
        copoN14.nevar(height)
        copoN15.nevar(height)
        copoN16.nevar(height)
        copoN17.nevar(height)
        copoN18.nevar(height)
        copoN19.nevar(height)
        copoN20.nevar(height)
        copoN21.nevar(height)
        copoN22.nevar(height)
        copoN23.nevar(height)
        copoN24.nevar(height)
        copoN25.nevar(height)
        copoN26.nevar(height)
        copoN27.nevar(height)
        copoN28.nevar(height)
        copoN29.nevar(height)
        copoN30.nevar(height)

        sol.movSol()
        nube.movNube()
        nube2.movNube()
        nube3.movNube()
        nube4.movNube()
        nube5.movNube()

        invalidate()
    }

}
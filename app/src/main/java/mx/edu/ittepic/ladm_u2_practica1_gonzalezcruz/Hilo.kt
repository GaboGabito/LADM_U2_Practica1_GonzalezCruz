package mx.edu.ittepic.ladm_u2_practica1_gonzalezcruz

class Hilo(p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(50)
            puntero.runOnUiThread {
                puntero.miLienzo!!.animacion()
            }
        }
    }
}
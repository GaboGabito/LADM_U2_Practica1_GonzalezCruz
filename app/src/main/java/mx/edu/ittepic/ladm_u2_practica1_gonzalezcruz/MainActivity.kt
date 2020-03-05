package mx.edu.ittepic.ladm_u2_practica1_gonzalezcruz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var miLienzo : Lienzo ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miLienzo = Lienzo(this)
        setContentView(miLienzo!!)
        Hilo(this).start()
    }
}

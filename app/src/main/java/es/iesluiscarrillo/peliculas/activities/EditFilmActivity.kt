package es.iesluiscarrillo.peliculas.activities

import android.os.Bundle
import es.iesluiscarrillo.peliculas.R

class EditFilmActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_film)
    }
}
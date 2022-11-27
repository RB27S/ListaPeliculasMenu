package es.iesluiscarrillo.peliculas.activities

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import es.iesluiscarrillo.peliculas.R

open class ActivityWithMenus : AppCompatActivity() {
    companion object {
        var actividadActual = 0
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)

        for (i in 0 until(menu.size())) menu.getItem(i).isEnabled = true
        menu.getItem(actividadActual).isEnabled = false

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.iPelicula -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 0
                startActivity(intent)
                true
            }
            R.id.iEditarPelicula -> {
                val intent = Intent(this, EditFilmActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 1
                startActivity(intent)
                true
            }
            R.id.iInfoApp -> {
                val intent = Intent(this, InfoActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 2
                startActivity(intent)
                true
            }
            R.id.iSalir -> {
                val cuadroDialogo = CDSalir()
                cuadroDialogo.show(supportFragmentManager, "CDSalir")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
package es.iesluiscarrillo.peliculas.activities

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import es.iesluiscarrillo.peliculas.FilmProvider
import es.iesluiscarrillo.peliculas.adapter.FilmAdapter
import es.iesluiscarrillo.peliculas.databinding.ActivityMainBinding

class MainActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = FilmAdapter(FilmProvider.filmList)
    }
}
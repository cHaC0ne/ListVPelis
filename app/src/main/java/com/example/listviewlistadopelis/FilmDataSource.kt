package com.example.listviewlistadopelis


object FilmDataSource{
    val films: MutableList<Film> = mutableListOf<Film>()
    init {
        var f = Film()
        f.title = "Regreso al futuro"
        f.director = "Robert Zemeckis"
        f.imageResId = R.mipmap.ic_launcher
        f.comments = ""
        f.format = Film.Companion.FORMAT_DIGITAL
        f.genre = Film.Companion.GENRE_SCIFI
        f.imdbUrl = "http:// www.imdb.com/title/tt0088763"
        f.year = 1985
        films.add(f)
    }
}

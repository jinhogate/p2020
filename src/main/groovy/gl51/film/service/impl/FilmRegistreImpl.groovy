package gl51.film.service.impl

import gl51.film.data.Film
import gl51.film.service.FilmRegistre

import javax.inject.Singleton

@Singleton
class FilmRegistreImpl implements FilmRegistre {

    private List<Film> internalRegistre=[]

    @Override
    void ajouterFilmFavoris(String imdbID) {
        internalRegistre << new Film(imdbID: imdbID)
    }

    @Override
    List<Film> listFavoris() {
        internalRegistre
    }
}

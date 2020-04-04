package gl51.film.service

import gl51.film.data.Film

/**
 * Enregistre les films favoris
 */
interface FilmRegistre {
    /**
     * ajouter un film à mes favoris
     * @param imdbID
     */
    void ajouterFilmFavoris(String imdbID)

    /**
     * retourne la liste des films favoris
     * @return
     */
    List<Film> listFavoris()
}
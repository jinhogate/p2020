package gl51.film.service

import gl51.film.data.Film

/**
 * recupérer les détails du film
 */
interface FilmClient {
    /**
     * Avoir les details du film
     * @param imdbID
     * @return
     */
    Film getFilmDetail(String imdbID)
}
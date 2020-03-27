package movie.service.impl

import movie.data.Movie

    @Singleton
class MovieRegistryImpl implements movie.service.MovieRegistry {
        private List<Movie> internalRegistry=[]
        @Override
    void addMovieToFavorites(String imdbID) {

    }

    @Override
    List<Movie> listFavorites() {
        return internalRegistry
    }
}

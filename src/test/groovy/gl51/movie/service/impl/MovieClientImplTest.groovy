package gl51.movie.service.impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieClient
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MovieClientImplTest extends Specification {
    @Inject
    MovieRegistryImpl registry
    @Inject
    MovieClient clientMock = Mock()

    void "injectionShouldWork"(){
        expect:
        registry != null
        clientMock != null
    }

    void "getAmovieByItsImdbIDShouldWork"(){
        when:
        // appel du clients
        clientMock.getMovieDetail ("test")
        then:
        // ajouter un favoris
        Movie movie = new Movie (imdbID: "hello")
        registry.addMovieToFavorites(movie.imdbID)
        registry.listFavorites().size() == 1

    }

}

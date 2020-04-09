package gl51.movie.service.impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieClient
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification
import io.micronaut.test.annotation.MockBean

import javax.inject.Inject

@MicronautTest
class MovieRegistryImplTest extends Specification {

    //injection
    @Inject
    MovieRegistryImpl registry

    void "injection should work"() {
        expect:
            registry != null
    }

    void "favorites should be empty"() {
        expect:
            registry.listFavorites() == []
    }

    void "adding a favorite should fill in the database"() {
        when:
        registry.addMovieToFavorites("aaaaa")
        then:
        registry.listFavorites().size() == 1
        registry.listFavorites().find { it.title == 'my movie'}
    }

    @MockBean(MovieClientImpl)
    MovieClient movieClient() {
        def mock = Mock(MovieClient)
        mock.getMovieDetail("aaaaa") >> new Movie(imdbID: "aaaaa", title: 'my movie')
        mock
    }


}

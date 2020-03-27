package movie.service.impl

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MovieRegistryImplTest extends Specification {

    @Inject
    MovieRegistryImpl registry

//    void "test qui plante" (){
//        expect:
//            registry!=null
//    }

    void "favorite should be empty" (){
        expect:
        registry.listFavorites()==[]
    }
}

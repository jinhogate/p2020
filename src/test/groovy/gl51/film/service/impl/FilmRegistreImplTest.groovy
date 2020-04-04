package gl51.film.service.impl

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class FilmRegistreImplTest extends Specification {

    @Inject
    FilmRegistreImpl registre

    void "test qui plante" (){
        expect:
            registre!= null
    }

    void "favoris doit etre vide" (){
        expect:
            registre.listFavoris() == []
    }

    void "ajout de film donc liste pas vide" (){
        when:
            registre.ajouterFilmFavoris("aaaa")
        then:
            registre.listFavoris().size() == 1


    }

}

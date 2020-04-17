package gl51.pictureservice.impl

import gl51.picture.Picture
import gl51.pictureservice.Igenerate
import gl51.pictureservice.Iresize

import javax.inject.Inject


class IgenerateImpl implements Igenerate {
    static  int i = 1;
    @Inject
            Iresize resizer
    @Override
    Picture generate(String linkLogo) {
        Picture logo
        int dim1 = 50
        int dim2 = 50
        logo = resizer (logo,dim1, dim2)
        logo.link = linkLogo
        logo.name = "name"+i
        i++;
        return logo;
    }
}

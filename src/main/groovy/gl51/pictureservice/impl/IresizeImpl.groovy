package gl51.pictureservice.impl

import gl51.picture.Picture
import javax.inject.Singleton

@Singleton
class IresizeImpl implements gl51.pictureservice.Iresize {

    // Cette Classe permet de redimenssionner une photo.

    @Override
    Picture resize(Picture picture, int dim1, int dim2) {
        picture.dim1 = dim1
        picture.dim2 = dim2
        return picture
    }
}

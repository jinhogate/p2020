package gl51.pictureservice

import gl51.picture.Picture

interface Iresize {

    Picture resize (Picture picture, int dim1, int dim2)
}
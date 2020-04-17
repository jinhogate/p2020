package gl51.pictureservice.impl

import gl51.picture.Picture
import gl51.pictureservice.Igenerate
import gl51.pictureservice.Iresize
import gl51.pictureservice.Isave
import gl51.pictureservice.Iupdate

import javax.inject.Inject


class IuploadImpl implements gl51.pictureservice.Iupload {
    @Inject
            Iresize resizer
    @Inject
            Igenerate generater
    @Inject
            Isave saver
    @Inject
            Iupdate updater

    @Override
    void upload(Picture picture) {
        int size = 1024
        Picture thumbnail
        /*resize*/
        picture = resizer.resize (picture, size,size)
        /*generate*/
        thumbnail = generater.generate()
        /*save*/
        saver.save(picture,thumbnail)
        /*update db*/
        updater.update(picture)
    }
}

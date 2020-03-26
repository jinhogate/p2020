package gl51.pictureservice.impl

import gl51.picture.Picture
import gl51.pictureservice.Igenerate
import gl51.pictureservice.Iresize
import gl51.pictureservice.Isave
import gl51.pictureservice.Iupdate

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class IuploadImpl implements gl51.pictureservice.Iupload {

    // Cette Classe permet de charger une photo et de faire des traitements sur la photo chargée

    @Inject Iresize
    Iresize resizer

    @Inject Igenerate
    Igenerate generizer

    @Inject Isave
    Isave saver

    @Inject Iupdate
    Iupdate updater

    @Override
    void upload(Picture picture) {
        int size = 1024
        Picture thumbnail
        /*resize*/
        picture = resizer (picture, size,size)
        /*generate*/
        thumbnail = generizer()
        /*save*/
        saver(picture,thumbnail)
        /*update db*/
        updater(picture)
    }
}

package gl51.pictureservice

import gl51.picture.Picture

/**
 * This class saves image in database
 * @author Kossi GBEGNON
 */
interface Isave {
    /**
     * save image and his thumbnail in database
     * @param photo
     * @param thumnail
     */
    void save (Picture photo, Picture thumnail)
}
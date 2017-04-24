package com.planarform.daniel.owstats;

/**
 * Created by Daniel on 3/22/17.
 */


        import android.graphics.Bitmap;
        import android.widget.ImageView;

/**
 * Interface used as a callback method to retrieve data from API
 */
public interface NetworkingListener <T, V> {
    public void onResponse(T response);//getting information from the server.
    public void onError(V error);
    public void onImageDownloaded(Bitmap bitmap);
}

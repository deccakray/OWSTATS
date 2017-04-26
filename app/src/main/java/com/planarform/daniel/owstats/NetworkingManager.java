package com.planarform.daniel.owstats;

/**
 * Created by Daniel on 3/22/17.
 */
        import android.app.AlertDialog;
        import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.widget.ImageView;

        import com.android.volley.Request;
        import com.android.volley.RequestQueue;
        import com.android.volley.Response;
        import com.android.volley.VolleyError;
        import com.android.volley.toolbox.ImageRequest;
        import com.android.volley.toolbox.JsonObjectRequest;
        import com.android.volley.toolbox.Volley;
        import org.json.JSONObject;

public class NetworkingManager {

    /*Initializing Variables*/
    private static NetworkingManager networking;
    private static RequestQueue mRequestQueue;
    ImageView profile;
    static Context context;

    /**
     * Constructor
     */
    public NetworkingManager()
    {
        mRequestQueue = Volley.newRequestQueue(SearchController.getContext());
    }

    // Always good to make manager type classes a singleton to guarantee that there is at most one
    // instance at one time.

    /** Gets an instance of a NetworkingManager
     *
     * @return a NetworkingManager object
     */
    public static NetworkingManager getInstance()
    {
        if (networking == null) {
            networking = new NetworkingManager();
        }

        return networking;
    }

    /** Gets a request queue if it's not null or throws an exception it is not initialized.
     *
     *
     */
    public static RequestQueue getRequestQueue()
    {
        if (mRequestQueue != null) {
            return mRequestQueue;
        } else {
            throw new IllegalStateException("RequestQueue not initialized");
        }
    }

    /** Sends a get request to the url
     *
     * @param url changes based on the user input
     * @param listener
     */
    public void sendGetRequest(String url, final NetworkingListener<String, VolleyError> listener)
    {
        // you might have to make the listener passed in an instance variable so you can
        // reference it in a volley onResponse call

        RequestQueue queue = NetworkingManager.getRequestQueue();
        JsonObjectRequest myReq = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        listener.onResponse(response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                listener.onError(error);
            }
        });
        queue.add(myReq);
    }

    /** Sends image request to the url
     *
     * @param url changes based on the input
     * @param listener
     */
    public void sendImageRequest(String url, final NetworkingListener<String, VolleyError> listener) {

        RequestQueue queue = NetworkingManager.getRequestQueue();

        // Retrieves an image specified by the URL, displays it in the UI.
        ImageRequest request = new ImageRequest(url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap bitmap) {
                        listener.onImageDownloaded(bitmap);
                    }
                }, 0, 0, null,
                new Response.ErrorListener() {
                    public void onErrorResponse(VolleyError error) {
                        listener.onError(error);
                    }
                });
        queue.add(request);
    }
}



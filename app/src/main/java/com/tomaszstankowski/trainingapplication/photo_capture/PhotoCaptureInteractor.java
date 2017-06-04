package com.tomaszstankowski.trainingapplication.photo_capture;

import android.net.Uri;

import com.tomaszstankowski.trainingapplication.model.Photo;

/**
 * Model layer fetching last photo taken by user from database.
 */

public interface PhotoCaptureInteractor {
    interface OnLastPhotoChangeListener {
        void onLastPhotoChanged(Photo photo, Uri imageUri);

        void onLastPhotoNull();

        void onLastPhotoFetchError();
    }

    void addListenerForLastPhotoChanges(OnLastPhotoChangeListener listener, String userKey);

    void removeListenerForLastPhotoChanges();
}
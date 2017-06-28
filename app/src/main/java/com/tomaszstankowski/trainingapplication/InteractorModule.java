package com.tomaszstankowski.trainingapplication;

import com.tomaszstankowski.trainingapplication.home.HomeInteractor;
import com.tomaszstankowski.trainingapplication.home.HomeInteractorImpl;
import com.tomaszstankowski.trainingapplication.login.LoginInteractor;
import com.tomaszstankowski.trainingapplication.login.LoginInteractorImpl;
import com.tomaszstankowski.trainingapplication.photo_details.PhotoDetailsInteractor;
import com.tomaszstankowski.trainingapplication.photo_details.PhotoDetailsInteractorImpl;
import com.tomaszstankowski.trainingapplication.photo_save.PhotoSaveInteractor;
import com.tomaszstankowski.trainingapplication.photo_save.PhotoSaveInteractorImpl;
import com.tomaszstankowski.trainingapplication.settings.SettingsInteractor;
import com.tomaszstankowski.trainingapplication.settings.SettingsInteractorImpl;
import com.tomaszstankowski.trainingapplication.user_photos.UserPhotosInteractor;
import com.tomaszstankowski.trainingapplication.user_photos.UserPhotosInteractorImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class InteractorModule {

    @Provides
    @Singleton
    HomeInteractor providesPhotoCaptureInteractor(HomeInteractorImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    PhotoDetailsInteractor providesPhotoDetailsInteractor(PhotoDetailsInteractorImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    PhotoSaveInteractor providesPhotoSaveInteractor(PhotoSaveInteractorImpl impl) {
        return impl;
    }


    @Provides
    @Singleton
    UserPhotosInteractor providesUserPhotosInteractor(UserPhotosInteractorImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    LoginInteractor providesLoginInteractor(LoginInteractorImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    SettingsInteractor providesSettingsInteractor(SettingsInteractorImpl impl) {
        return impl;
    }
}

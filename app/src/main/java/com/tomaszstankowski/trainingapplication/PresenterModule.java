package com.tomaszstankowski.trainingapplication;

import com.tomaszstankowski.trainingapplication.home.HomePresenter;
import com.tomaszstankowski.trainingapplication.home.HomePresenterImpl;
import com.tomaszstankowski.trainingapplication.login.LoginPresenter;
import com.tomaszstankowski.trainingapplication.login.LoginPresenterImpl;
import com.tomaszstankowski.trainingapplication.main.MainPresenter;
import com.tomaszstankowski.trainingapplication.main.MainPresenterImpl;
import com.tomaszstankowski.trainingapplication.photo_details.PhotoDetailsPresenter;
import com.tomaszstankowski.trainingapplication.photo_details.PhotoDetailsPresenterImpl;
import com.tomaszstankowski.trainingapplication.photo_save.PhotoSavePresenter;
import com.tomaszstankowski.trainingapplication.photo_save.PhotoSavePresenterImpl;
import com.tomaszstankowski.trainingapplication.settings.SettingsPresenter;
import com.tomaszstankowski.trainingapplication.settings.SettingsPresenterImpl;
import com.tomaszstankowski.trainingapplication.user_photos.UserPhotosPresenter;
import com.tomaszstankowski.trainingapplication.user_photos.UserPhotosPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class PresenterModule {
    @Provides
    @Singleton
    MainPresenter providesMainPresenter(MainPresenterImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    LoginPresenter providesLoginPresenter(LoginPresenterImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    HomePresenter providesPhotoCapturePresenter(HomePresenterImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    PhotoDetailsPresenter providesPhotoDetailsPresenter(PhotoDetailsPresenterImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    PhotoSavePresenter providesPhotoSavePresenter(PhotoSavePresenterImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    UserPhotosPresenter providesUserPhotosPresenter(UserPhotosPresenterImpl impl) {
        return impl;
    }

    @Provides
    @Singleton
    SettingsPresenter providesSettingsPresenter(SettingsPresenterImpl impl) {
        return impl;
    }
}

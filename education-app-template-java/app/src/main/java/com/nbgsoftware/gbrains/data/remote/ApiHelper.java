package com.nbgsoftware.gbrains.data.remote;

import com.nbgsoftware.gbrains.data.models.User;

import io.reactivex.rxjava3.core.Single;

public interface ApiHelper {

    Single<User> getDataUser();

}

package com.zulip.android.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by patrykpoborca on 8/25/16.
 */

public interface ZulipServices {

    @POST("v1/register")
    Call<ResponseBody> register();

}

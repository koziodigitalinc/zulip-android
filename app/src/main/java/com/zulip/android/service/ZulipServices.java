package com.zulip.android.service;

import com.zulip.android.networking.response.LoginResponse;
import com.zulip.android.networking.response.UserConfigurationResponse;
import com.zulip.android.networking.response.ZulipBackendResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by patrykpoborca on 8/25/16.
 */

public interface ZulipServices {

    @FormUrlEncoded
    @POST("v1/register")
    Call<UserConfigurationResponse> register(@Field("apply_markdown") boolean applyMarkdown);

    @FormUrlEncoded
    @PUT("v1/users/me/pointer")
    Call<ResponseBody> updatePointer(@Field("pointer") String pointer);

    @POST("v1/get_auth_backends")
    Call<ZulipBackendResponse> getAuthBackends();

//    @POST("v1/dev_fetch_api_key")
//    Call<>

//    if (devServer) execute("POST", "v1/dev_fetch_api_key");
//    else execute("POST", "v1/fetch_api_key");

    @FormUrlEncoded
    @POST("v1/fetch_api_key")
    Call<LoginResponse> login(@Field("username") String username, @Field("password") String password);

    @POST("v1/dev_fetch_api_key")
    Call<LoginResponse> loginDEV(@Field("username") String username);
}

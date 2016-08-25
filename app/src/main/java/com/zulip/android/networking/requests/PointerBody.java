package com.zulip.android.networking.requests;

import com.google.gson.annotations.SerializedName;

/**
 * Created by patrykpoborca on 8/25/16.
 */

public class PointerBody {

    @SerializedName("pointer")
    private String pointer;

    public PointerBody(String pointer) {
        this.pointer = pointer;
    }
}

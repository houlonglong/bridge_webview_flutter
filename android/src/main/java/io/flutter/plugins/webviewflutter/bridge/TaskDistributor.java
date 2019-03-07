package io.flutter.plugins.webviewflutter.bridge;

import android.content.Context;

import org.json.JSONObject;

import io.flutter.plugins.webviewflutter.view.WVJBWebView;


public class TaskDistributor {
    private Context context;
    BridgeForwarderImpl bridgeForwarder;
    JSONObject dataJSON;
    WVJBWebView.WVJBResponseCallback callbac;
    JSONObject responseJSON = new JSONObject();

    public TaskDistributor(Context Context, BridgeForwarderImpl bridgeForwarder, JSONObject dataJSON, WVJBWebView.WVJBResponseCallback callback) {
        this.context = context;
        this.bridgeForwarder = bridgeForwarder;
        this.dataJSON = dataJSON;
        this.callbac = callback;
    }

    public void invokeTask() {
        try {
            String msg = dataJSON.getString("msg");
            switch (msg) {
                case "": {
                    break;
                }
            }
        } catch (Exception e) {

        }
    }
}

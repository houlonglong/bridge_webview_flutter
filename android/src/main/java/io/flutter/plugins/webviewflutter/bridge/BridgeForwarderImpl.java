package io.flutter.plugins.webviewflutter.bridge;

import android.content.Context;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import io.flutter.plugins.webviewflutter.view.ObservableWebView;


public class BridgeForwarderImpl implements IBridgeForwarder {
    private Context context;

    public BridgeForwarderImpl(Context context) {
        this.context = context;
    }

    @Override
    public void receiveMessageFromJs(String dataFromJsString, ObservableWebView.WVJBResponseCallback<String> callback) {
        try {
            JSONObject paramsFromJsJSON = new JSONObject(dataFromJsString);
            Log.e("receiveMessageFromJs", dataFromJsString);
            new TaskDistributor(context, this, paramsFromJsJSON, callback).invokeTask();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendMessageToJs(String dataFromNativeString, ObservableWebView.WVJBResponseCallback<String> callback) {
        Log.e("sendMessageToJs", dataFromNativeString);
        if (callback != null) {
            callback.onResult(dataFromNativeString);
        }
    }
}

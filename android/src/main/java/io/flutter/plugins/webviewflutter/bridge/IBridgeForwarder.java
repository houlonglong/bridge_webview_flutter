package io.flutter.plugins.webviewflutter.bridge;


import io.flutter.plugins.webviewflutter.view.ObservableWebView;

public interface IBridgeForwarder {
    void receiveMessageFromJs(String dataFromJsString, ObservableWebView.WVJBResponseCallback<String> callback);

    void sendMessageToJs(String dataFromNativeString, ObservableWebView.WVJBResponseCallback<String> callback);
}

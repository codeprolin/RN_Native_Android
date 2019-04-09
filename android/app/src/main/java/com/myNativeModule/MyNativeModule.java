package com.myNativeModule;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class MyNativeModule extends ReactContextBaseJavaModule {
    private Context mContext;

    public MyNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext = reactContext;
    }

    @Override
    public String getName() {
        // 返回的这个名字是必须的，是Native暴露给JS的名字
        return "MyNativeModule";
    }

    // 函数不能有返回值，因为被调用的原生代码是异步的，原生代码执行结束后只能通过回调函数或者发送消息给RN
    @ReactMethod
    public void rnCallNative(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }
}

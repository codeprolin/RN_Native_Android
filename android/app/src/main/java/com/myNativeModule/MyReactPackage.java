package com.myNativeModule;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.myNativeModule.MyNativeModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyReactPackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {

        List<NativeModule> modules = new ArrayList<>();
        // 将我们创建的类添加到原生模块中
        modules.add(new MyNativeModule(reactContext));
        return modules;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {

        //返回值需要修改
        return Collections.emptyList();
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        // 返回值需要修改
        return Collections.emptyList();
    }
}

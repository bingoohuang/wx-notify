package com.github.bingoohuang.xnotify.smsprovider;

import com.github.bingoohuang.xnotify.SmsProvider;
import com.github.bingoohuang.xnotify.SmsSender;
import com.github.bingoohuang.xnotify.smssender.YunpianSmsSender;
import com.github.bingoohuang.xnotify.util.XNotifyConfig;

public class YunpianSmsProvider implements SmsProvider {
    @Override public String getProviderName() {
        return "yunpian";
    }

    @Override public SmsSender getSmsSender() {
        return new YunpianSmsSender(XNotifyConfig.get("yunpian.apikey"));
    }
}
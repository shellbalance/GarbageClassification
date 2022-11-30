package cn.itcast.garbageclassification;


import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.llw.mvplibrary.BaseApplication;
import com.llw.mvplibrary.network.NetworkApi;

import org.litepal.LitePal;

/**
 * 自定义Application
 */
public class TrashApplication extends BaseApplication {
    @Override
    public void onCreate(){
        super.onCreate();
        //初始化网络框架
        NetworkApi.init(new NetworkRequiredInfo(this));

        //配置讯飞语音SDK
        SpeechUtility.createUtility(this, SpeechConstant.APPID + "=c34af252");

        //数据库初始化
        LitePal.initialize(this);
    }
}

package json.chao.com.wanandroid.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Glass {

    private String glassName;
    // Glass本身是被注入的，构造函数中的参数InnerGlass也是被注入的，
    // 这里直接在Glass构造函数上添加注解
    InnerGlass innerGlass;
    @Inject
    public Glass(InnerGlass innerGlass){
        this.glassName = "GLASS";
        Log.d("xianyu","glass init");
        this.innerGlass = innerGlass;
    }

    public void printName(){
        Log.d("xianyu",this.glassName);
        innerGlass.printName();
    }



}

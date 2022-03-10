package json.chao.com.wanandroid.dagger;

import android.util.Log;

import javax.inject.Inject;

public class InnerGlass {
    private String glassName;
    @Inject
    public InnerGlass(){
        this.glassName = "InnerGlass";
        Log.d("xianyu","InnerGlass init");
    }

    public void printName(){
        Log.d("xianyu",this.glassName);
    }
}

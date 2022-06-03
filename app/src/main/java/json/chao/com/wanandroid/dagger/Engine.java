package json.chao.com.wanandroid.dagger;
import android.util.Log;

import javax.inject.Inject;


public class Engine {

    private String gear;
    @Inject
    public Engine(String gear){
        this.gear = gear;
    }

    public void printGearName(){
        Log.d("xianyu","==> "+this.gear);
    }
}

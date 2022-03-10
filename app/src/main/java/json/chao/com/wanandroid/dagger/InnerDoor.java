package json.chao.com.wanandroid.dagger;

import android.util.Log;

public class InnerDoor {

    private String name;

    public InnerDoor(String name) {
        this.name = name;
    }
    public void openDoor(){
        Log.d("xianyu","innner opendoor "+name);
    }
}


package json.chao.com.wanandroid.dagger;

import android.util.Log;

public class Door {

    private InnerDoor innerDoor;

    public Door(InnerDoor innerDoor) {
        this.innerDoor = innerDoor;
    }
    public void openDoor(){
        Log.d("xianyu","opendoor ");
        innerDoor.openDoor();
    }
}


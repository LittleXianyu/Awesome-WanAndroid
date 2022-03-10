package json.chao.com.wanandroid.dagger;

import android.util.Log;

import com.tencent.bugly.proguard.D;

import javax.inject.Inject;

public class Car {
// 使用注入的类

    @QualifierA
    @Inject
    Engine engineA;

    @QualifierB
    @Inject
    Engine engineB;

    @Inject
    Door DoorA;

    @Inject
    Glass glass;



    public Car() {
        DaggerCarComponent.builder()
                .engineModule(new EngineModule())
                .doorModule(new DoorModule())
                .build().injectCar(this);
    }

    public Engine getEngineA() {
        return this.engineA;
    }

    public Engine getEngineB() {
        return this.engineB;
    }

    public Door getDoorA(){
        return this.DoorA;
    }

    public void callGlass(){
        Log.d("xianyu","callGlass");
        glass.printName();
    }

}

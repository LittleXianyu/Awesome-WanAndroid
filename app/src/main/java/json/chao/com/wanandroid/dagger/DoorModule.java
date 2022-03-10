package json.chao.com.wanandroid.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class DoorModule {
    public DoorModule(){

    }

    @Provides
    InnerDoor provideInnerDoor(){
        return new InnerDoor("inner door");
    }

    // Module中可以自动注入被@Provider注解的函数，返回值作为参数

    @Provides
    Door provideDoorA(InnerDoor innerDoor){
        return new Door(innerDoor);
    }
}

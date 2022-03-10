package json.chao.com.wanandroid.dagger;

import dagger.Module;
import dagger.Provides;


@Module
public class EngineModule {

    public EngineModule(){ }

    // 依赖查找的时候会从Module注解的类中找 @Provides注解的函数，根据返回类型来判断提供的注入类
    // 如果返回的类型相同，则用@Qualifier 注解来区分
    @QualifierA
    @Provides
    Engine provideEngineA(){
        return new Engine("gearA");
    }

    @QualifierB
    @Provides
    Engine provideEngineB(){
        return new Engine("gearB");
    }
}

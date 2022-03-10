package json.chao.com.wanandroid.dagger;
import dagger.Component;


// 连接器，连接代理生产对应 Engine 和 Door
@Component(modules = {EngineModule.class,DoorModule.class})
public interface CarComponent {
    void injectCar(Car car);
}

package json.chao.com.wanandroid.aop;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect  //①
public class MethodAspect {

    @Pointcut("call(* json.chao.com.wanandroid.dagger.Car.callGlass(..))")//②
    public void callMethod() {
    }

    @Pointcut("call(json.chao.com.wanandroid.dagger.Car.new(..))")//②
    public void callConstruct() {
    }

    @Before("callMethod()")//③
    public void beforeMethodCall(JoinPoint joinPoint) {
        Log.e("xianyu", "before->" + joinPoint.getTarget().toString()); //④
    }

    @Before("callConstruct()")//③
    public void beforeCallConstruct(JoinPoint joinPoint) {
        Log.e("xianyu", "construct before->callConstruct "); //④
    }
}

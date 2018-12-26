package mybatisframe;

import java.lang.reflect.Proxy;

/**
 * @author pxl
 * @description
 * @date 2018/11/28 23:03
 */
public class MySqlSession {
    private Executor executor = new SimpleExecutor();

    public <T> T selectOne(String statement, Object parameter){
        return executor.query(statement, parameter);
    }

    public <T> T getMapper(Class<T> clazz){
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new MapperProxy<>(this, clazz));
    }
}

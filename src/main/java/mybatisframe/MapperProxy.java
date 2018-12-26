package mybatisframe;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author pxl
 * @description
 * @date 2018/11/28 23:08
 */
public class MapperProxy<T> implements InvocationHandler {
    private final MySqlSession sqlSession;
    private final Class<T> mapperInterface;

    public MapperProxy(MySqlSession sqlSession, Class<T> mapperInterface) {
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().getName().equals(UserMapperXml.nameSpace)){
            String sql = UserMapperXml.methodSqlMapping.get(method.getName());
            System.out.println(String.format("SQL[%s], parameter[%s]", sql, args[0]));
            return sqlSession.selectOne(sql, String.valueOf(args[0]));
        }
        return null;
    }
}

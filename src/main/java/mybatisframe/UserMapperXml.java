package mybatisframe;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pxl
 * @description
 * @date 2018/11/28 22:57
 */
public class UserMapperXml {
    public static final String nameSpace = "com.pxl.demo.dao.UserMapper";

    public static final Map<String, String> methodSqlMapping = new HashMap<>(16);

    static {
        methodSqlMapping.put("loadUserByUserId", "select * from gw_user WHERE user_id=%d");
    }
}

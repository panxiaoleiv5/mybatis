package mybatisframe;

import com.pxl.demo.dao.UserMapper;
import com.pxl.demo.entity.User;

/**
 * @author pxl
 * @description
 * @date 2018/11/28 22:56
 */
public class Bootstrap {
    public static void start(){
        MySqlSession sqlSession = new MySqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.loadUserByUserId(1L);
        System.out.println(user.toString());
    }

    public static void main(String[] args) {
        start();
    }
}

package mybatisframe;

import com.pxl.demo.entity.User;

import java.sql.*;

/**
 * @author pxl
 * @description
 * @date 2018/11/28 23:16
 */
public class SimpleExecutor implements Executor {
    private String driverName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://106.75.213.54:3306/lhl_gw?useUnicode=true&amp;characterEncoding=utf-8";
    private String userNmae = "oa";
    private String password = "root";

    @Override
    public <E> E query(String statement, Object parameter) {
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(String.format(statement, Integer.parseInt(String.valueOf(parameter))));
            ResultSet rs = pstmt.executeQuery();
            User user = new User();
            while (rs.next()){
                user.setAccountId(1L);
                user.setUserName("pxl");
            }
            return (E) user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Connection getConnection() throws Exception {
        Class.forName(driverName);
        return DriverManager.getConnection(url, userNmae, password);
    }
}

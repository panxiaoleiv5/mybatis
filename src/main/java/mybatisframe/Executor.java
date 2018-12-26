package mybatisframe;

/**
 * @author pxl
 * @description
 * @date 2018/11/28 23:15
 */
public interface Executor {
    <E> E query(String statement, Object parameter);
}

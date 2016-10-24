package cloud.simple.hello.Mybatis.mapper;

import cloud.simple.hello.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2016/10/18.
 */
@Mapper
public interface UserMapper {

    public List<User> nickName();

    @Select("select * from bd_user where user_id = #{id}")
    public User getById(long id);

    @Select("select nick_name as nickName from bd_user where user_id = #{id}")
    public String getNameById(long id);
}

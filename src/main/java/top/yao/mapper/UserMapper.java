package top.yao.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.yao.domain.User;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}

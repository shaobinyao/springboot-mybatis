package top.yao.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.yao.domain.User;
import top.yao.mapper.UserMapper;

import java.util.List;

@Controller
public class MyBatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("query")
    @ResponseBody
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

}

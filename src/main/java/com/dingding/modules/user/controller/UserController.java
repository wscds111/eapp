package com.dingding.modules.user.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dingding.modules.common.entity.PageResult;
import com.dingding.modules.common.entity.Result;
import com.dingding.modules.common.entity.StatusCode;
import com.dingding.modules.user.entity.User;
import com.dingding.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dingding.modules.common.controller.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caolei
 * @since 2019-04-28
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result getList(){
        return new Result(true, StatusCode.OK,"查询成功",userService.list());
    }

    @RequestMapping(value = "/search/{page}/{size}",method = RequestMethod.POST)
    public Result pageQuery(@RequestBody User user, @PathVariable int page, @PathVariable int size){
        IPage<User> iPage = userService.page(new Page<>(page,size));
        return new Result(true, StatusCode.OK,"查询成功",new PageResult<User>(iPage.getTotal(),iPage.getRecords()));
    }

}

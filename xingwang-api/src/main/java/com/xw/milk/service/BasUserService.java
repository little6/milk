package com.xw.milk.service;

import com.xw.milk.common.PageList;
import com.xw.milk.common.Paginator;
import com.xw.milk.model.BasUser;
import com.xw.milk.model.VO.BasUserVO;

import java.util.Map;

/**
 * Created by ChoviWu on 2018/02/22
 * Description:
 */
public interface BasUserService extends BaseService<BasUser> {

    PageList getList(Paginator p, Map map);

    BasUser getOneByUser(String openId,String mobile,String password);

    Object updateUserType(Map map);
    //用户注册
    Integer doRegister(String openId,String accessToken,String ip);

    //查询用户信息
    BasUserVO getUserByOpenId(String openId);

    //用户绑定手机号
    Object bindMobile(String mobile,Integer userId);



}
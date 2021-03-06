package com.xw.milk.service;

import com.xw.milk.model.BasUser;
import com.xw.milk.model.BasWx;
import com.xw.milk.model.VO.BasUserVO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by ChoviWu on 2018/02/22
 * Description:
 */
public interface BasWxService extends BaseService<BasWx> {

    BasWx getOneByOpenId(String openId);


//    BasWx doAuth(HttpServletResponse response, HttpServletRequest request);


    Map getAnthTokenByCode(String code);



}

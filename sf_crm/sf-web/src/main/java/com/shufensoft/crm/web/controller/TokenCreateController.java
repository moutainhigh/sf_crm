package com.shufensoft.crm.web.controller;

import com.google.common.collect.Maps;
import com.shufensoft.crm.web.annotation.PreventDuplicateSubmission;
import com.shufensoft.crm.web.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 *  @ProjectName: sf-crm  
 *  @Description: 获取token
 *  @author litu  litu@shufensoft.com
 *  @date 2015/5/15  
 */
@Controller
public class TokenCreateController extends BaseController {

    @RequestMapping("/createToken")
    @PreventDuplicateSubmission(needCreateToken = true)
    public
    @ResponseBody
    Map<String, Object> CreateToken(HttpServletRequest request) {
        Map<String, Object> datas = Maps.newHashMap();
        datas.put("token", request.getAttribute("token"));
        return datas;
    }




}

package com.bilibili.user.executor.query;


import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.convert.Convert;
import com.alibaba.cola.dto.SingleResponse;
import com.bilibili.domain.user.UserInfo;
import com.bilibili.domain.user.gateway.UserGateway;
import com.bilibili.user.assembler.UserInfoAssembler;
import com.bilibili.user.dto.data.UserInfoDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserInfoQueryExe {

    @Resource
    private UserGateway userGateway;


    public SingleResponse<UserInfoDTO> execute() {

        UserInfo userInfo = userGateway.getUserInfoById(Convert.toLong(StpUtil.getLoginId()));
        return SingleResponse.of(UserInfoAssembler.toDataTransferObject(userInfo));
    }

}
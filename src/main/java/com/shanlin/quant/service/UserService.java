package com.shanlin.quant.service;
import com.shanlin.quant.model.Application;
import com.shanlin.quant.model.Token;
import com.shanlin.quant.model.UserInfo;
import com.shanlin.quant.param.UserParam;
import com.shanlin.quant.result.BaseResponse;

import java.util.List;

public interface UserService {
	BaseResponse checkLoginForUser(UserParam user);

	UserInfo selectUserByName(String userName);

	Application selectAppSecrect(String appId);

	Token insertIntoToken(List<String> list, String appToken);

	BaseResponse selectUserAndAppMsg(String userName, String appId);
}

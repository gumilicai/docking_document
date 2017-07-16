package com.gumilicai.platform.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gumilicai.platform.entity.BidInfo;
import com.gumilicai.platform.entity.CreateUserReq;
import com.gumilicai.platform.entity.InvestInfo;
import com.gumilicai.platform.entity.LoginReq;
import com.gumilicai.platform.entity.QueryReq;
import com.gumilicai.platform.entity.Redirect;
import com.gumilicai.platform.entity.RepayInfo;
import com.gumilicai.platform.entity.UserInfo;


/**
 * Created by architect of touzhijia on 2016/3/1.
 */
@Service
public class PlatformServiceImpl implements PlatformService {

	@Override
	public UserInfo createUser(CreateUserReq req) throws PlatformException {
		UserInfo userInfo = new UserInfo();
		userInfo.setSalt("1234567777777777");
		userInfo.setPlatformUserno(req.getPlatformUserNo());
		// TODO Auto-generated method stub
		return userInfo;
	}
	
	@Override
	public Redirect bindUser(CreateUserReq req) throws PlatformException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Redirect login(LoginReq req) throws PlatformException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> queryUser(QueryReq req) throws PlatformException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BidInfo> queryBids(QueryReq req) throws PlatformException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvestInfo> queryInvests(QueryReq req) throws PlatformException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RepayInfo> queryRepays(QueryReq req) throws PlatformException {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.example.test.service.account;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.test.model.account.dao.AccountDAO;
import com.example.test.model.account.dto.AccountDTO;
import com.example.test.model.user.dao.UserDAO;

@Service
public class AccountServiceImpl implements AccountService {

	@Inject
	AccountDAO accountdao;
	@Inject
	UserDAO userdao;
	
	@Override
	@Transactional
	public void append_account(AccountDTO dto) {
		accountdao.append_account(dto);
		String userid=dto.getUserid();
		userdao.update_account(userid);
	}

	@Override
	public List<AccountDTO> account_list(String userid) {
		return accountdao.account_list(userid);
	}

	@Override
	public void delete_account(int cno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update_account(AccountDTO dto) {
		// TODO Auto-generated method stub

	}
	@Override
	public void buy_fund(int cno, int price) {
		accountdao.buy_fund(cno, price);	
	}
	@Override
	public AccountDTO view(int cno) {
		return accountdao.view(cno);
	}
	
	@Override
	public void moneyCharge(AccountDTO dto) {	
		accountdao.moneyCharge(dto);	
	}
	
	@Override
	public String charge_chk(AccountDTO dto) {
		return accountdao.charge_chk(dto);
	}

}

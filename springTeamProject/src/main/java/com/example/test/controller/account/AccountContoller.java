package com.example.test.controller.account;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.model.account.dto.AccountDTO;
import com.example.test.model.user.dto.UserDTO;
import com.example.test.service.account.AccountService;

import oracle.net.aso.s;


@Controller
@RequestMapping("account/*")
public class AccountContoller {

	private static final Logger logger =LoggerFactory.getLogger(AccountContoller.class);
	
	@Inject
	AccountService accountService;
	@Inject
	BCryptPasswordEncoder pwEncoder;
	
	@RequestMapping("append_account.do")
	public String append_account() {
		return "account/append_account";
	}
	
	@RequestMapping("insert_account.do")
	public ModelAndView insert_account(@ModelAttribute AccountDTO dto, HttpSession session) {
		String userid=(String)session.getAttribute("userid");
		dto.setAccount_passwd(pwEncoder.encode(dto.getAccount_passwd()));
		dto.setBuy_passwd(pwEncoder.encode(dto.getBuy_passwd()));
		dto.setUserid(userid);
		ModelAndView mav=new ModelAndView();
		System.out.println(dto);
		accountService.append_account(dto);
		mav.addObject("dto", dto);
		mav.setViewName("account/append_complete");
		return mav;
	}
	
	@RequestMapping("my_account.do")
	public ModelAndView my_account(HttpSession session) {
		String userid=(String)session.getAttribute("userid");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("account/my_account");
		mav.addObject("list", accountService.account_list(userid));
		return mav;
	}
	
	@RequestMapping("mypageaccountbankinfo.do")
	public ModelAndView mypageaccountbankinfo(int cno) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("account/mypageaccountbankinfo");
		mav.addObject("list", accountService.view(cno));
		return mav;
	}
	
	@RequestMapping("moneyCharge.do")
	public ModelAndView moneyCharge(AccountDTO dto, HttpSession session,ModelAndView mav) {
		String userid=(String)session.getAttribute("userid");
		dto.setUserid(userid);
		String result=accountService.charge_chk(dto);
		if(pwEncoder.matches(dto.getAccount_passwd(), result) && pwEncoder.matches(dto.getBuy_passwd(), result)) {
			accountService.moneyCharge(dto);
			session.setAttribute("userid", dto.getUserid());
			mav.setViewName("account/mypageaccountbankinfo.do");
		}else {
			mav.setViewName("account/mypageaccountbankinfo.do");
			mav.addObject("message", "error");   
		}  
		return mav;
	}
	
}

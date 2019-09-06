package com.study.bankprocess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.bankprocess.dao.BankDao;
import com.study.bankprocess.model.Transaction;

@Service
public class BankServiceImpl implements BankSerice{

	@Autowired
	BankDao dao;
	
	@Override
	public List<Transaction> listTrans(String acctNum) {
		// TODO Auto-generated method stub
		return dao.listTrans(acctNum);
	}

}

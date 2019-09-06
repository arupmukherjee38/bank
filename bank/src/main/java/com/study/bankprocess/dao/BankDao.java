package com.study.bankprocess.dao;

import java.util.List;

import com.study.bankprocess.model.Transaction;

public interface BankDao {

	public List<Transaction> listTrans(String acctNum);
}

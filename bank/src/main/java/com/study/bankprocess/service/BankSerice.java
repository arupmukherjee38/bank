package com.study.bankprocess.service;

import java.util.List;

import com.study.bankprocess.model.Transaction;

public interface BankSerice {

	public List<Transaction> listTrans(String acctNum);
}

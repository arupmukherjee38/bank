package com.study.bankprocess.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.bankprocess.model.Transaction;
import com.study.bankprocess.utility.TransactionRowMapper;

@Repository
public class BankDaoImpl implements BankDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Transaction> listTrans(String acctNum) {
		// TODO Auto-generated method stub
		 return jdbcTemplate.query("select trans_id,acc_num,trans_type,summary,to_char(tras_date,'MM/dd/yyyy hh24:mi:ss') tras_date from (select * from bank_trans where acc_num=? order by tras_date desc) where rownum<=2", new TransactionRowMapper(),acctNum);
	}

}

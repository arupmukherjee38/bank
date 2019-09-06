package com.study.bankprocess.utility;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.study.bankprocess.model.Transaction;

public class TransactionRowMapper implements RowMapper<Transaction>{

	@Override
	public Transaction mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Transaction transaction=new Transaction();
		transaction.setTransId(rs.getInt("trans_id"));
		transaction.setAccNum(rs.getString("acc_num"));
		transaction.setTransType(rs.getString("trans_type"));
		transaction.setSummary(rs.getString("summary"));
		transaction.setTrasDate(rs.getString("tras_date"));
		return transaction;
	}

}

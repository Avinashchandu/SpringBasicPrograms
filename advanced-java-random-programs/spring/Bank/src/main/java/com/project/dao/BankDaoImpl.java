package com.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.model.BankDetails;
@Component
public class BankDaoImpl implements BankDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void regesistration(BankDetails bankDetails) {
		String insert = "insert into bank(bankid,name,gender,address,pin) values(?,?,?,?,?)";
		jdbcTemplate.update(insert,bankDetails.getBankid(),bankDetails.getName(),bankDetails.getGender(),bankDetails.getAddress(),bankDetails.getPin());
		
		
	}
	@Override
	public boolean login(String name, String password) {
		BeanPropertyRowMapper<BankDetails> beanPropertyRowMapper = new BeanPropertyRowMapper<BankDetails>(BankDetails.class);
		String select = "select * from bank where name = ? and pin = ?";
        try{
        BankDetails bankDetails=  jdbcTemplate.queryForObject(select,beanPropertyRowMapper, name,password);
        return true;
        }
        catch (Exception e) {
			return false;
		}
		
	}
	@Override
	public boolean loginByTwo(String email, String password) {
		BeanPropertyRowMapper<BankDetails> beanPropertyRowMapper = new BeanPropertyRowMapper<BankDetails>(BankDetails.class);
		String select = "select * from bank where (email = ?  or phone = ?) and pin = ?";
        try{
        BankDetails bankDetails=  jdbcTemplate.queryForObject(select,beanPropertyRowMapper, email,email,password);
        if(bankDetails.getGender().equals("male"))
        	System.out.println("Welcome mr. "+bankDetails.getName());
        else
        	System.out.println("Welcome mrs. "+bankDetails.getName());
        return true;
        }
        catch (Exception e) {
			return false;
		}
		
	}

}

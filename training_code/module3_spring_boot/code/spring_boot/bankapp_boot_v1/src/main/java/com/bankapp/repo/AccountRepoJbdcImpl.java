package com.bankapp.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Repository
@Primary
//@Profile("prod")
public class AccountRepoJbdcImpl implements AccountRepo{

    //dataSource is aka infra bean... spring i need to define this as a bean
    //business bean vs infra bean
    //@Componet vs  @Bean
    private DataSource dataSource;

    @Autowired
    public AccountRepoJbdcImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Account> getAll() {
        System.out.println("------------jdbc wala code is running------------");
        List<Account> accounts=new ArrayList<>();
        try (Connection connection=dataSource.getConnection()){
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from account");
            while (rs.next()){
                accounts.
                        add(new Account(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return accounts;
    }

    @Override
    public Account getById(int id) {
        return null;
    }

    @Override
    public void update(Account account) {

    }
}

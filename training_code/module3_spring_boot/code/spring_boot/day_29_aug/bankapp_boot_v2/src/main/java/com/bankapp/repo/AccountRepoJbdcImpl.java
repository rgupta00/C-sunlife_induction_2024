package com.bankapp.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
@Primary
//@Profile("prod")
public class AccountRepoJbdcImpl implements AccountRepo{

    //dataSource is aka infra bean... spring i need to define this as a bean
    //business bean vs infra bean
    //@Componet vs  @Bean
    private final DataSource dataSource;

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
       Account account=null;
        try (Connection connection=dataSource.getConnection()){
            PreparedStatement stmt=connection.prepareStatement("select * from account where id=?");
            ResultSet rs=stmt.executeQuery();
            if (rs.next()){
                account= new Account(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return  account;
    }

    @Override
    public void update(Account account) {
        try (Connection connection=dataSource.getConnection()){
            PreparedStatement stmt=connection
                    .prepareStatement("update account set balance=? where id=?");
            stmt.setDouble(1, account.getBalance());
            stmt.setInt(2, account.getId());
           stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Account account) {
        try (Connection connection=dataSource.getConnection()){
            PreparedStatement stmt=connection
                    .prepareStatement("insert into account(name, balance) values(?,?)");
            stmt.setString(1, account.getName());
            stmt.setDouble(2, account.getBalance());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try (Connection connection=dataSource.getConnection()){
            PreparedStatement stmt=connection
                    .prepareStatement("delete from table where id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

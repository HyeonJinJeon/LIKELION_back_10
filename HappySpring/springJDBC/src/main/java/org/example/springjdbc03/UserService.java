package org.example.springjdbc03;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

@RequiredArgsConstructor
@Service
public class UserService {
    private final JdbcTemplate jdbcTemplate;
    private final TransactionTemplate transactionTemplate;

    public void executeComplexBusinessProcess(String name, String email){
        transactionTemplate.execute(status -> {
            jdbcTemplate.update("INSERT INTO users(name, email) VALUES (?, ?)", name, email);
            if(email.contains("error")){

                //error가 발생하면 rollback 할 수 있도록 명시적으로 설정한다.
                status.setRollbackOnly();
                throw new RuntimeException("Simulated error to trigger rollback");
            }
            jdbcTemplate.update("UPDATE users SET email = ? WHERE name = ?", "updated.email@example.com", name);
            return null;
        });

    }
}

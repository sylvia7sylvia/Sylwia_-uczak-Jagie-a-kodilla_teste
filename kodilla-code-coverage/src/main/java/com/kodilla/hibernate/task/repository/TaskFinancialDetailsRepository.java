package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Repository
@Transactional
public interface TaskFinancialDetailsRepository extends CrudRepository<TaskFinancialDetails, Integer> {
    List<TaskFinancialDetails> findByPrice(BigDecimal price);
}
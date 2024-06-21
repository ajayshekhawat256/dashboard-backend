package com.example.dashboard.Repository;

import com.example.dashboard.Modal.Data;
import net.sf.jsqlparser.statement.select.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<Data,Long> {
    List<Data> findByEndYear(int endYear);

    List<Data> findBysector(String sector);
}

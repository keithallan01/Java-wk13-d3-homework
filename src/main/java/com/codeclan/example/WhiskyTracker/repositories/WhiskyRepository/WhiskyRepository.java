package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {

    //    TODO: Get all the whiskies for a particular year
    //    HAVE: age- int age
    //    Want:List<Whisky>

    List<Whisky> getWhiskyByAge(int age);
}

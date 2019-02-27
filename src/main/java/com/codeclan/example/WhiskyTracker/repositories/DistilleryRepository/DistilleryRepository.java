package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {
//   Todo: Get all the distilleries for a particular region
//    have: region
//    want: list<distillery>

    List<Distillery> getDistilleryByRegion(String region);
}

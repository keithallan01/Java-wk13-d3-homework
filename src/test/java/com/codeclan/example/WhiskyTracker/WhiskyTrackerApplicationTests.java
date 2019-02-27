package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {


	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;
	@Test
	public void contextLoads() {
	}

	@Test
	public void findWhiskiesOfACertainAge(){
		List<Whisky> found = whiskyRepository.getWhiskyByAge(12);
	}

	@Test
	public void findWhiskiesOfACertainYear(){
		List<Whisky> found = whiskyRepository.getWhiskyByYear(1995);
	}

	@Test
	public void canFindDistilleryByRegion(){
		List<Distillery> found = distilleryRepository.getDistilleryByRegion("Lowland");
	}

	@Test
	public void canFindWhiskyFromDistilleryOfACertainAge(){
		List<Whisky> found = whiskyRepository.findWhiskyOfACertainAgeFromDistillery(15, 1L);
	}
}

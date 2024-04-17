package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.MachineData;

@Repository
public interface MachineDataRepository extends JpaRepository<MachineData, Long> {

//	@Query("select m from MachineData m LIMIT 20")
//    List<MachineData> findAll();
	
	@Query("select m from MachineData m where m.ts between '2024-01-21T15:00:00Z' and '2024-01-21T15:01:00Z'")
    List<MachineData> findDataForOneHour();

    @Query("select m from MachineData m where m.ts between '2024-01-21T15:00:00Z' and '2024-01-21T15:08:00Z'")
    List<MachineData> findDataForEightHour();

    @Query("select m from MachineData m where m.ts between '2024-01-21T15:00:00Z' and '2024-01-21T15:23:59Z'")
    List<MachineData> findDataForTwentyFourHour();
	
}

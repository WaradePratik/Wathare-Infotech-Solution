package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.MachineData;
import com.app.service.MachineDataService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MachineController {
	@Autowired
	private MachineDataService machineDataService;

//	@GetMapping("/getData")
//	public ResponseEntity<?> getAllData() {
//		return new ResponseEntity<>(machineDataService.getAllData(), HttpStatus.OK);
//	}

	@PostMapping("/import")
	public ResponseEntity<?> importData(@RequestBody List<MachineData> dataList) {
		machineDataService.saveData(dataList);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/getData")
	public ResponseEntity<List<MachineData>> getAllMachineData() {
		List<MachineData> machineDataList = machineDataService.getAllData();
		return new ResponseEntity<>(machineDataList, HttpStatus.OK);
	}

//	@GetMapping("/get20")
//	public ResponseEntity<List<MachineData>> getData() {
//		List<MachineData> machineDataList = machineDataService.getData();
//		return new ResponseEntity<>(machineDataList, HttpStatus.OK);
//	}

	@GetMapping("/forOneHour")
	public ResponseEntity<List<MachineData>> getDataForOneHour() {
		List<MachineData> machineDataList = machineDataService.getDataForOneHour();
		return new ResponseEntity<>(machineDataList, HttpStatus.OK);
	}

	@GetMapping("/forEightHour")
	public ResponseEntity<List<MachineData>> getDataForEightHour() {
		List<MachineData> machineDataList = machineDataService.getDataForEightHour();
		return new ResponseEntity<>(machineDataList, HttpStatus.OK);
	}

	@GetMapping("/forTwentyHour")
	public ResponseEntity<List<MachineData>> getDataForTwentyHour() {
		List<MachineData> machineDataList = machineDataService.getDataForTwentyFourHour();
		return new ResponseEntity<>(machineDataList, HttpStatus.OK);
	}

}

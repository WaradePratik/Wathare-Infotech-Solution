package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.MachineData;
import com.app.repository.MachineDataRepository;

@Service
@Transactional
public class MachineDataServiceImpl implements MachineDataService {
	@Autowired
	private MachineDataRepository machineDataRepository;

	@Override
	public List<MachineData> getAllData() {
		return machineDataRepository.findAll();
	}

	@Override
	public void saveData(List<MachineData> dataList) {
		machineDataRepository.saveAll(dataList);
	}

//	@Override
//	public List<MachineData> getData() {
//		return machineDataRepository.findAll();
//	}

	@Override
	public List<MachineData> getDataForOneHour() {
		return machineDataRepository.findDataForOneHour();
	}

	@Override
	public List<MachineData> getDataForEightHour() {
		return machineDataRepository.findDataForEightHour();
	}

	@Override
	public List<MachineData> getDataForTwentyFourHour() {
		return machineDataRepository.findDataForTwentyFourHour();
	}

}

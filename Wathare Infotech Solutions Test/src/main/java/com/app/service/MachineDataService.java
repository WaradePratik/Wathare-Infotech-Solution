package com.app.service;

import java.util.List;

import com.app.entity.MachineData;

public interface MachineDataService {

	public List<MachineData> getAllData();

	public void saveData(List<MachineData> dataList);

	//public List<MachineData> getData();

	public List<MachineData> getDataForOneHour();

	public List<MachineData> getDataForEightHour();

	public List<MachineData> getDataForTwentyFourHour();

}

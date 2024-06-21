package com.example.dashboard.Service;

import com.example.dashboard.Modal.Data;
import com.example.dashboard.Repository.DataRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements DataService{
    private final DataRepository dataRepository;
    public DataServiceImpl(DataRepository dataRepository){
        this.dataRepository=dataRepository;
    }
    @Override
    public List<Data> getAllOrders() {
        return dataRepository.findAll();
    }

    @Override
    public List<Data> getByEndYear(int year) {
        return dataRepository.findByEndYear(year);
        //List<Data> lst=new ArrayList<Data>()
    }

    @Override
    public List<Data> getBySector(String sector) {
        return dataRepository.findBysector(sector);
    }

}

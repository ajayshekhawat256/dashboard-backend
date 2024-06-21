package com.example.dashboard.Service;

import com.example.dashboard.Modal.Data;

import java.util.List;

public interface DataService {
    public List<Data> getAllOrders();

    public List<Data> getByEndYear(int sector);

    public List<Data> getBySector(String sector);
}

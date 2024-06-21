package com.example.dashboard.Controller;

import com.example.dashboard.Modal.Data;
import com.example.dashboard.Service.DataService;
import com.example.dashboard.Service.DataServiceImpl;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
@CrossOrigin("http://localhost:3000")
public class DataController {
    private final DataService dataService;
    @Autowired
    public DataController(DataService dataService){
        this.dataService=dataService;
    }

    @GetMapping()
    public List<Data> getAllData(){
        return  dataService.getAllOrders();
    }
    @GetMapping("/{year}")
    public List<Data> getByEnd_Year(@PathVariable int year){
        return dataService.getByEndYear(year);
    }
    @GetMapping("/sector/{sector}")
    public List<Data> getBySector(@PathVariable String sector) {
        return dataService.getBySector(sector);
    }


}

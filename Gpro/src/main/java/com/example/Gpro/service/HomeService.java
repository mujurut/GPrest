package com.example.Gpro.service;

import com.example.Gpro.model.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    public List<Staff> getStaff(){
        List<Staff> staff = new ArrayList<>();

        Staff staff1 = new Staff(1,"assets/img/team/team-1.jpg","one","one");
        Staff staff2 = new Staff(2,"assets/img/team/team-2.jpg","2","2");

        staff.add(staff1);
        staff.add(staff2);

        return staff;
    }

    public List<Staff> searchStaff(String name){
        List<Staff> staff = new ArrayList<>();

        Staff staff1 = new Staff(1,"assets/img/team/team-1.jpg",name,"one");

        staff.add(staff1);

        return staff;
    }
}

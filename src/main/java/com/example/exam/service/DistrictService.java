package com.example.exam.service;

import com.example.exam.entity.District;
import com.example.exam.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    public List<District> findAll() {
        return districtRepository.findAll();
    }

    public District save(District district) {
        return districtRepository.save(district);
    }
}

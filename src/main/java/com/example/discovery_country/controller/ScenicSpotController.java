package com.example.discovery_country.controller;

import com.example.discovery_country.model.dto.request.ScenicSpotRequest;
import com.example.discovery_country.model.dto.request.ZoneCriteriaRequest;
import com.example.discovery_country.model.dto.request.ZoneRequest;
import com.example.discovery_country.model.dto.response.ScenicSpotResponse;
import com.example.discovery_country.model.dto.response.ZoneResponse;
import com.example.discovery_country.service.ScenicSpotService;
import com.example.discovery_country.service.ZoneService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("scenicSpot")
@Slf4j
@RequiredArgsConstructor
public class ScenicSpotController {
    private final ScenicSpotService service;

    @PostMapping
    public ResponseEntity<ScenicSpotResponse> createScenicSpot(@RequestBody ScenicSpotRequest request) {
        log.info("Controller.createZone start");

        ScenicSpotResponse scenicSpot = service.createScenicSpot(request);
        log.info("Controller.createZone end");
        return ResponseEntity.status(HttpStatus.CREATED).body(scenicSpot);
    }

    //
//    @GetMapping
//    public ResponseEntity<Page<ZoneResponse>> getZones(ZoneCriteriaRequest criteriaRequest,
//                                                       Pageable pageable) {
//        log.info("Controller.getZones start");
//        Page<ZoneResponse> zones = service.getZones(criteriaRequest, pageable);
//
//        log.info("Controller.getZones end");
//        return ResponseEntity.ok(zones);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<ZoneResponse> updateZone(
//            @PathVariable Long id,
//            @RequestBody ZoneRequest zoneRequest) {
//        log.info("Controller.updateZone start with id#" + id);
//
//        ZoneResponse response = service.update(id, zoneRequest);
//
//        log.info("Controller.updateZone end");
//
//        return ResponseEntity.ok(response);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteZone(
//            @PathVariable Long id) {
//        log.info("Controller.deleteZone start with id#" + id);
//        service.delete(id);
//        log.info("Controller.deleteZone end");
//    }
    @PatchMapping("/{id}")
    public void updateStatus(
            @PathVariable Long id) {
        log.info("Controller.updateStatus start with id#" + id);
        service.updateStatus(id);
        log.info("Controller.updateStatus end");
    }

}
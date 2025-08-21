package com.rainscape.backend.controller;

import com.rainscape.backend.model.Report;
import com.rainscape.backend.repository.ReportRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {

    private final ReportRepository reportRepository;

    public ReportController(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @GetMapping
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    @PostMapping
    public Report createReport(@RequestBody Report report) {
        return reportRepository.save(report);
    }
}

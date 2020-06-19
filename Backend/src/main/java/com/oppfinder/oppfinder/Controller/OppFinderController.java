package com.oppfinder.oppfinder.Controller;

import com.oppfinder.oppfinder.Model.*;
import com.oppfinder.oppfinder.Service.OppFinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("apis")
public class OppFinderController {
    @Autowired
    private OppFinderService oppFinderService;

    @PostMapping(value="/jobpost", consumes = "application/json", produces = "application/json")
    public boolean addJobPost(@RequestBody JobPostAndSkills post) {
        return oppFinderService.insertJobPost(post);
    }

    @PutMapping(value = "/jobpost", consumes = "application/json", produces="application/json")
    public boolean editJobPost(@RequestBody JobPostAndSkills post) {
        return oppFinderService.updateJobPost(post);
    }

    @DeleteMapping(value = "/jobpost")
    public boolean deleteJobPost(@RequestParam String id) {
        return oppFinderService.deleteJobPost(id);
    }

    @GetMapping(value = "/jobpost/skills")
    public List<Skills> getJobPostSkills(@RequestParam String id) {
        return oppFinderService.getJobPostSkills(id);
    }

    @GetMapping(value = "/jobpost")
    public List<JobPost> getAllJobPost() {
        return oppFinderService.getAllJobPost();
    }

    @GetMapping(value = "/locations")
    public List<Location> getAllLocation() {
        return oppFinderService.getAllLocations();
    }

    @GetMapping(value = "/skills")
    public List<Skills> getAllSkills() {
        return oppFinderService.getAllSkills();
    }

    @GetMapping(value = "/profiles")
    public List<JobProfiles> getAllJobProfiles() {
        return oppFinderService.getAllJobProfiles();
    }

    
    @GetMapping(value = "/employmenttype")
    public List<EmploymentType> getEmploymentType() {
        return oppFinderService.getEmploymentType();
    }

    @GetMapping(value="/location/trends")
    public List<LocationNameAndCount> getLocationTrend() {
        return oppFinderService.getLocationTrend();
    }

    @GetMapping(value="/skill/trends")
    public List<SkillNameAndCount> getSkillTrend() {
        return oppFinderService.getSkillTrend();
    }

    @GetMapping(value="profile/trends")
    public List<ProfileNameAndCount> getProfileTrend() {
        return oppFinderService.getProfileTrend();
    }


}

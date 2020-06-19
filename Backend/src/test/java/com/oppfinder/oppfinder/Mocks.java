package com.oppfinder.oppfinder;

import com.oppfinder.oppfinder.Model.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mocks {
    static public JobPost job = new JobPost("aas111", 1, "amazing job", 1, true, 10,
            "20/01/2020", "Abhigyan Nayak", "21/01/2020", "", 1);

    static public List<JobPost> jobPosts = Collections.singletonList(job);

    static public List<Skills> skills = Arrays.asList(new Skills(1, "Angular"),
            new Skills(2, "Angular JS"));

    static public List<Location> locations = Arrays.asList(new Location(1, "bombay"), new Location(2, "bangalore"));

    static public List<JobProfiles> jobProfilesList = Arrays.asList(new JobProfiles(1, "SDE"), new JobProfiles(2, "Intern"));

    static public List<EmploymentType> employmentTypes = Arrays.asList(new EmploymentType(1, "FTE"), new EmploymentType(2, "Intern"));

    static public List<LocationNameAndCount> locationTrends = Arrays.asList(new LocationNameAndCount("Bombay", 10),
            new LocationNameAndCount("Bangalore", 20));

    static public List<SkillNameAndCount> skillTrends = Arrays.asList(new SkillNameAndCount("Angular", 10),
            new SkillNameAndCount("AngularJS", 20));

    static public List<ProfileNameAndCount> profileTrends = Arrays.asList(new ProfileNameAndCount("SDE", 10),
            new ProfileNameAndCount("HR", 20 ));
}

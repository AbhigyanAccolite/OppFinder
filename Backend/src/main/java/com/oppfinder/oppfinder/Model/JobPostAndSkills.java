package com.oppfinder.oppfinder.Model;

import java.util.List;

public class JobPostAndSkills {
    private JobPost jobPost;
    private List<Skills> skills;

    public JobPostAndSkills() {

    }

    public JobPostAndSkills(JobPost jobPost, List<Skills> skills) {
        this.jobPost = jobPost;
        this.skills = skills;
    }

    public JobPost getJobPost() {
        return jobPost;
    }

    public void setJobPost(JobPost jobPost) {
        this.jobPost = jobPost;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }
}

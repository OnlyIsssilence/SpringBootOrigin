package com.onlyisssilence.muya.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.onlyisssilence.muya.domain.db1.Project;
import com.onlyisssilence.muya.domain.db1.ProjectRepository;
import com.onlyisssilence.muya.domain.view.BasicView;
import com.onlyisssilence.muya.domain.view.FatherView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: MuYa
 * Date  : 2017/7/21
 * Description:
 */
@RestController
@RequestMapping("/json")
public class JsonDemoController {

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping("/basicView")
    @JsonView(BasicView.class)
    public List<Project> getBasicProjectInfos(){
        List<Project> projects = null;
        projects = projectRepository.findAll();
        return projects;
    }

    @RequestMapping("/fatherView")
    @JsonView(FatherView.class)
    public List<Project> getFatherProjectInfos(){
        List<Project> projects = null;

        projects = projectRepository.findAll();
        return projects;
    }

    @RequestMapping("/all")
    public List<Project> getProjectInfos(){
        List<Project> projects = null;

        projects = projectRepository.findAll();
        return projects;
    }
}

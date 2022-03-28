package com.school.zyg.controller;

import com.school.zyg.pojo.Resource;
import com.school.zyg.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ResourceController {
    @Autowired
    ResourceService resourceService;

    @RequestMapping(value = "/resourceSearchAll", method = RequestMethod.GET)
    public List<Resource> resourceSearchAll() {
        return resourceService.resourceSearchAll();
    }

    @RequestMapping(value = "/resourceSearchByName", method = RequestMethod.GET)
    public List<Resource> resourceSearchByName(String name) {
        return  resourceService.resourceSearchByName(name);
    }

    @RequestMapping(value = "/resourceUpdate", method = RequestMethod.POST)
    public void resourceUpdate(@RequestBody Resource resource) {
        resourceService.resourceUpdate(resource);
    }

    @RequestMapping(value = "/resourceAdd", method = RequestMethod.POST)
    public void resourceAdd(@RequestBody Resource resource) {
        resourceService.resourceAdd(resource);
    }

    @RequestMapping(value = "/resourceRemove", method = RequestMethod.GET)
    public void resourceRemove(int id) {
        resourceService.resourceRemove(id);
    }

}

package com.school.zyg.service;

import com.school.zyg.dao.ResourceMapper;
import com.school.zyg.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    ResourceMapper resourceMapper;

    public List<Resource> resourceSearchAll() {
        return resourceMapper.selectAll();
    }

    public List<Resource>  resourceSearchByName(String name) {
        return resourceMapper.selectByName(name);
    }

    public void resourceUpdate(Resource resource) {
        resourceMapper.updateByPrimaryKey(resource);
    }

    public void resourceAdd( Resource resource) {
        resourceMapper.insert(resource);
        System.out.println(resource);
    }

    public void resourceRemove(int id) {
        resourceMapper.deleteByPrimaryKey(id);
        System.out.println(id);
    }
}

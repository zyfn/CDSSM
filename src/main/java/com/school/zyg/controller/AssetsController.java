package com.school.zyg.controller;

import com.school.zyg.pojo.Assets;
import com.school.zyg.pojo.User;
import com.school.zyg.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AssetsController {
    @Autowired
    AssetsService assetsService;

    @RequestMapping(value = "/assetsSearchAll", method = RequestMethod.GET)
    public List<Assets> assetsSearchAll() {
        List<Assets> assetsList = assetsService.assetsSearchAll();
        return assetsList;
    }

    @RequestMapping(value = "/assetsSearchByName", method = RequestMethod.GET)
    public List<Assets> assetsSearchByName(String name) {
        return assetsService.assetsSearchByName(name);
    }

    @RequestMapping(value = "/assetsUpdate", method = RequestMethod.POST)
    public void assetsUpdate(@RequestBody Assets assets) {
        System.out.println(assets.getAssetsName());
        assetsService.assetsUpdate(assets);
    }

    @RequestMapping(value = "/assetsAdd", method = RequestMethod.POST)
    public String assetsAdd(@RequestBody Assets assets) {
        assetsService.assetsAdd(assets);
        return "success";
    }

    @RequestMapping(value = "/assetsRemove", method = RequestMethod.GET)
    public void assetsRemove(int id) {
        assetsService.assetsRemove(id);
    }

}

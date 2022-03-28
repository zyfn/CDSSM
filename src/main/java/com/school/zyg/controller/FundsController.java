package com.school.zyg.controller;

import com.school.zyg.pojo.Funds;
import com.school.zyg.service.FundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class FundsController {
    @Autowired
    FundsService fundsService;
    @RequestMapping(value = "/fundsSearchAll", method = RequestMethod.GET)
    public List<Funds> fundsSearchAll() {
        return  fundsService.fundsSearchAll();
    }
    @RequestMapping(value = "/fundsSearchByType", method = RequestMethod.GET)
    public List<Funds>  fundsSearchType(String type) {
        return fundsService.fundsSearchByType(type);
    }

    @RequestMapping(value = "/fundsUpdate", method = RequestMethod.POST)
    public void fundsUpdate(@RequestBody Funds funds) {
        fundsService.fundsUpdate(funds);
    }

    @RequestMapping(value = "/fundsAdd", method = RequestMethod.POST)
    public void fundsAdd(@RequestBody Funds funds) {
        fundsService.fundsAdd(funds);
    }
    @RequestMapping(value = "/fundsRemove", method = RequestMethod.GET)
    public void fundsRemove(int id) {
        fundsService.fundsRemove(id);
    }
}

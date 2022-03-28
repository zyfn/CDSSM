package com.school.zyg.controller;

import com.school.zyg.pojo.Government;
import com.school.zyg.pojo.Party;
import com.school.zyg.pojo.Village;
import com.school.zyg.service.AffairsSe;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@CrossOrigin
@RestController
public class AffairsCon {

    @Resource
    private AffairsSe as;

    @RequestMapping("/addVillage")
    public void addVillage(Village village){
        as.addVillage(village);
    }
    @RequestMapping("/deleteVillage")
    public void deleteVillage(int id){
        as.deleteVillage(id);
    }
    @RequestMapping("/selectVillage")
    public ArrayList<Village> selectVillage(){
        ArrayList<Village> al=as.selectVillage();
        return al;
    }
    @RequestMapping("/selectVillageById")
    public Village selectVillageById(int id){
        Village village=as.selectVillageById(id);
        return village;
    }
    @RequestMapping("/updateVillage")
    public void updateVillage(Village village){
        as.updateVillage(village);
    }
    @RequestMapping("/selectVillageByDifference")
    public ArrayList<Village> selectVillageByDifference(String id){
        ArrayList<Village> al=as.selectVillageByDifference(id);
        return al;
    }










    @RequestMapping("/addGovernment")
    public void addGovernment(Government government){
        as.addGovernment(government);
    }
    @RequestMapping("/deleteGovernment")
    public void deleteGovernment(int id){
        as.deleteGovernment(id);
    }
    @RequestMapping("/selectGovernment")
    public ArrayList<Government> selectGovernment(){
        ArrayList<Government> al=as.selectGovernment();
        return al;
    }
    @RequestMapping("/selectGovernmentById")
    public Government selectGovernmentById(int id){
        Government Government=as.selectGovernmentById(id);
        return Government;
    }
    @RequestMapping("/updateGovernment")
    public void updateGovernment(Government government){
        as.updateGovernment(government);
    }
    @RequestMapping("/selectGovernmentByDifference")
    public ArrayList<Government> selectGovernmentByDifference(String id){
        ArrayList<Government> al=as.selectGovernmentByDifference(id);
        return al;
    }










    @RequestMapping("/addParty")
    public void addParty(Party party){
        as.addParty(party);
    }
    @RequestMapping("/deleteParty")
    public void deleteParty(int id){
        as.deleteParty(id);
    }
    @RequestMapping("/selectParty")
    public ArrayList<Party> selectParty(){
        ArrayList<Party> al=as.selectParty();
        return al;
    }
    @RequestMapping("/selectPartyById")
    public Party selectPartyById(int id){
        Party Party=as.selectPartyById(id);
        return Party;
    }
    @RequestMapping("/updateParty")
    public void updateParty(Party party){
        as.updateParty(party);
    }
    @RequestMapping(value = "/selectPartyByDifference",method = RequestMethod.GET)
    public ArrayList<Party> selectPartyByDifference(String id){
        System.out.println(id);
        ArrayList<Party> al=as.selectPartyByDifference(id);
        return al;
    }
}

package com.school.zyg.service;

import com.school.zyg.dao.Affairs;
import com.school.zyg.pojo.Government;
import com.school.zyg.pojo.Party;
import com.school.zyg.pojo.Village;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class AffairsSe {
    @Resource
    private Affairs affairs;

    public void addVillage(Village village){
        affairs.addVillage(village);
    }
    public void deleteVillage(int id){
        affairs.deleteVillage(id);
    }
    public ArrayList<Village> selectVillage(){
        return affairs.selectVillage();
    }
    public Village selectVillageById(int id){
        return affairs.selectVillageById(id);
    }
    public void updateVillage(Village village){
        affairs.updateVillage(village);
    }
    public ArrayList<Village> selectVillageByDifference(String id){
        return affairs.selectVillageByDifference(id);
    }



    public void addGovernment(Government government){
        affairs.addGovernment(government);
    }
    public void deleteGovernment(int id){
        affairs.deleteGovernment(id);
    }
    public ArrayList<Government> selectGovernment(){
        return affairs.selectGovernment();
    }
    public Government selectGovernmentById(int id){
        return affairs.selectGovernmentById(id);
    }
    public void updateGovernment(Government government){
        affairs.updateGovernment(government);
    }
    public ArrayList<Government> selectGovernmentByDifference(String id){
        return affairs.selectGovernmentByDifference(id);
    }





    public void addParty(Party party){
        affairs.addParty(party);
    }
    public void deleteParty(int id){
        affairs.deleteParty(id);
    }
    public ArrayList<Party> selectParty(){
        return affairs.selectParty();
    }
    public Party selectPartyById(int id){
        return affairs.selectPartyById(id);
    }
    public void updateParty(Party party){
        affairs.updateParty(party);
    }
    public ArrayList<Party> selectPartyByDifference(String id){
        return affairs.selectPartyByDifference(id);
    }
}

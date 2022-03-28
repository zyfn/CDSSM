package com.school.zyg.dao;

import com.school.zyg.pojo.Government;
import com.school.zyg.pojo.Party;
import com.school.zyg.pojo.Village;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface Affairs {
    public abstract void addVillage(Village village);
    public abstract void deleteVillage(int id);
    public abstract ArrayList<Village> selectVillage();
    public abstract Village selectVillageById(int id);
    public abstract void updateVillage(Village village);
    public abstract ArrayList<Village> selectVillageByDifference(String id);


    public abstract void addGovernment(Government government);
    public abstract void deleteGovernment(int id);
    public abstract ArrayList<Government> selectGovernment();
    public abstract Government selectGovernmentById(int id);
    public abstract void updateGovernment(Government government);
    public abstract ArrayList<Government> selectGovernmentByDifference(String id);


    public abstract void addParty(Party party);
    public abstract void deleteParty(int id);
    public abstract ArrayList<Party> selectParty();
    public abstract Party selectPartyById(int id);
    public abstract void updateParty(Party party);
    public abstract ArrayList<Party> selectPartyByDifference(String id);
}

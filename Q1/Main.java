package ppl_assignment;


import sun.nio.cs.Surrogate;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Boys> BoysList;
        BoysList = new ArrayList<Boys>(60);
        ArrayList<Girls> GirlsList;
        GirlsList = new ArrayList<Girls>(40);
        ArrayList<Commited> CommitedList;
        CommitedList = new ArrayList<Commited>(40);
        CSVBoys csvBoys = new CSVBoys();
        CSVGirls csvGirls = new CSVGirls();
        BoysList = csvBoys.generate();
        GirlsList = csvGirls.generate();
        for (Boys b : BoysList){
            for(Girls g: GirlsList){
                if(b.getBudget() >= g.getMaint_cost()
                        && g.getAttract_lvl() > b.getMin_attract_req() && b.isComm_or_not() == false
                        && g.isComm_or_not() == false ){
                    b.setComm_or_not(true);
                    g.setComm_or_not(true);
                    Commited couples = new Commited();
                    couples.setting(b,g);
                    CommitedList.add(couples);
                }
            }
        }
        CSVCommited csvCommited = new CSVCommited();
        csvCommited.generate(CommitedList);
    }


}

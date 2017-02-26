package ppl_assignment;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * Created by root on 26/2/17.
 */
public class CSVBoys {



    private String bname;                                 //name of boy
    private double attr_level;                            //level of attractiveness
    private double budget;                               //budget
    private double iq_lvl;                                //intelligence level
    private int c_type;                                    //commitment type
    private double happy_lvl;                                //happiness level
    private double min_attract_req;                          //minimum attraction requirement
    private boolean comm_or_not;

    public ArrayList<Boys> generate() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("Boy.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<Boys> boyArrayList = new ArrayList<Boys>(60);
        sb.append("Name");
        sb.append(',');
        sb.append("Attraction");
        sb.append(',');
        sb.append("Budget");
        sb.append(',');
        sb.append("IQ");
        sb.append(',');
        sb.append("Min_Attraction");
        sb.append(',');
        sb.append("Commited_or_not");
        sb.append(',');
        sb.append("Type");
        sb.append(',');
        sb.append("Happiness");
        sb.append('\n');

        int i,randomNum_boys,min_boys=20,max_boys=500;
        randomNum_boys = min_boys + (int)(Math.random() * max_boys);
        System.out.println("No. of boys :"+randomNum_boys);
        for(i=0;i<randomNum_boys;i++) {
            bname = "Boy_"+(i+1);
            attr_level = 2 + (int)(Math.random() * 45);
            budget = 2000 + (int)(Math.random() * 17000);
            iq_lvl = 50 + (int)(Math.random() * 150);
            min_attract_req = 2 + (int)(Math.random() * 7);
            comm_or_not = false;
            c_type = 2 + (int)(Math.random() * 9);
            happy_lvl = 0;
            sb.append("Boy_"+(i+1));
            sb.append(',');
            sb.append(attr_level);
            sb.append(',');
            sb.append(budget);
            sb.append(',');
            sb.append(iq_lvl);
            sb.append(',');
            sb.append(min_attract_req);
            sb.append(',');
            sb.append(comm_or_not);
            sb.append(',');
            sb.append(c_type);
            sb.append(',');
            sb.append(happy_lvl);
            sb.append('\n');
            Boys b = new Boys(bname,attr_level,budget,iq_lvl,c_type,min_attract_req);
            boyArrayList.add(b);
        }

        System.out.println("Size of Boys ArrayList" + boyArrayList.size());
        pw.write(sb.toString());
        pw.close();
        System.out.println("Boy.csv Done!");
        return boyArrayList;
    }






}

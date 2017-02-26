package ppl_assignment;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * Created by root on 26/2/17.
 */
public class CSVCommited {


    public void generate(ArrayList<Commited> arraylistcommited) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("Couple.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("Boy_Name");
        sb.append(',');
        sb.append("Boy_Attraction");
        sb.append(',');
        sb.append("Boy_Budget");
        sb.append(',');
        sb.append("Boy_IQ");
        sb.append(',');
        sb.append("Boy_Commited_or_not");
        sb.append(',');
        sb.append("Boy_Type");
        sb.append(',');
        sb.append("Boy_Happiness");

        sb.append("Girl_Name");
        sb.append(',');
        sb.append("Girl_Attraction");
        sb.append(',');
        sb.append("Girl_Maintenece");
        sb.append(',');
        sb.append("Girl_IQ");
        sb.append(',');
        sb.append("Girl_Commited_or_not");
        sb.append(',');
        sb.append("Girl_Type");
        sb.append(',');
        sb.append("Girl_Happiness");
        sb.append('\n');

        for (Commited couples : arraylistcommited) {
            sb.append(couples.getB_name());
            sb.append(',');
            sb.append(couples.getB_attr_level());
            sb.append(',');
            sb.append(couples.getB_budget());
            sb.append(',');
            sb.append(couples.getB_iq_lvl());
            sb.append(',');
            sb.append("TRUE");
            sb.append(',');
            sb.append(couples.getBoy_c_type());
            sb.append(',');
            sb.append(couples.getB_happy_lvl());
            sb.append(',');
            sb.append(couples.getG_name());
            sb.append(',');
            sb.append(couples.getG_attr_level());
            sb.append(',');
            sb.append(couples.getGirl_maint());
            sb.append(',');
            sb.append(couples.getG_iq_lvl());
            sb.append(',');
            sb.append("TRUE");
            sb.append(',');
            sb.append(couples.getGirl_c_type());
            sb.append(',');
            sb.append(couples.getG_happy_lvl());
            sb.append(',');
            sb.append('\n');
        }
        System.out.println("Size of Couple ArrayList" + arraylistcommited.size());
        pw.write(sb.toString());
        pw.close();
        System.out.println("Couple.csv Done!");
    }





}

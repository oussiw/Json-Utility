import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        JSONUtility utility = new JSONUtility();

        System.out.println("Begin writing...");
        utility.writeJson("data.json");

        System.out.println("\nBegin reading...");
        List<Prescription> prescriptions=utility.readJson("data.json");
        for(Prescription pr:prescriptions)
            System.out.println(pr.toString());
    }
}

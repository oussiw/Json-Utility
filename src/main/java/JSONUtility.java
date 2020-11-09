import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class JSONUtility {

    public void writeJson(String path){
        try{
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File(path));
            TypeReference<List<Prescription>> typeReference = new TypeReference<List<Prescription>>(){};
//            List<Prescription> prescriptions = mapper.readValue(inputStream,typeReference);

            List<Prescription> prescriptions = new ArrayList<>();
            Prescription p1 = new Prescription("Scan 1",new java.util.Date());
            prescriptions.add(p1);
            System.out.println(p1.toString());
            sleep(1500);
            Prescription p2 = new Prescription("Scan 2",new java.util.Date());
            prescriptions.add(p2);
            System.out.println(p2.toString());

            for(Prescription pr:prescriptions){
                mapper.writeValue(new File(path),pr);
            }
            inputStream.close();

        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }catch (JsonParseException exc){
            exc.printStackTrace();
        }catch (JsonMappingException exc){
            exc.printStackTrace();
        }catch (IOException exc){
            exc.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<Prescription> readJson(String path){
        List<Prescription> prescriptions;
        try{
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File(path));
            TypeReference<List<Prescription>> typeReference = new TypeReference<List<Prescription>>(){};
            prescriptions = mapper.readValue(inputStream,typeReference);
            inputStream.close();
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }catch (JsonParseException exc){
            exc.printStackTrace();
        }catch (JsonMappingException exc){
            exc.printStackTrace();
        }catch (IOException exc){
            exc.printStackTrace();
        }finally {
            prescriptions = new ArrayList<>();
        }
        return prescriptions;
    }
}

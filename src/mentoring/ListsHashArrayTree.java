package mentoring;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class ListsHashArrayTree {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("portland");
        cityList.add("san francisco");
        cityList.add("san diego");
        cityList.add("chicago");
        cityList.add("san diego");
        cityList.add("portland");
        //System.out.println("cityList: \t" + cityList);

        Set<String> citySet = new HashSet<>();
        citySet.add("orlando");
        citySet.add("charlotte");
        citySet.add("new york");
        citySet.add("las vegas");
        citySet.add("charlotte");
        citySet.add("las vegas");
        citySet.add("philadelphia");
        citySet.add("washington");
        //System.out.println("citySet: \t" + citySet);

        Set<String> cityTreeSet = new TreeSet<>();
        cityTreeSet.add("orlando");
        cityTreeSet.add("charlotte");
        cityTreeSet.add("new york");
        cityTreeSet.add("las vegas");
        cityTreeSet.add("charlotte");
        cityTreeSet.add("las vegas");
        cityTreeSet.add("philadelphia");
        cityTreeSet.add("washington");
        //System.out.println("cityTreeSet: \t" + cityTreeSet);


       // System.out.println("Does cityList contain charlotte? " + cityList.contains("charlotte"));
        //System.out.println("Does citySet contain charlotte? " + citySet.contains("charlotte"));
       // System.out.println("Does cityTreeSet contain charlotte ? " + cityTreeSet.contains("charlotte"));


        Map<String, String> cityMap= new HashMap<>();
        cityMap.put("city name", "houston");
        cityMap.put("city state", "texas");
        cityMap.put("city country", "usa");
        cityMap.put("city name", "orlando");// put with duplicate key overrides original keys value
            System.out.println("city hash map \t" + cityMap);

        //System.out.println(cityMap);
        //System.out.println("city`s state state is "+ cityMap.get("cityState"));
        Set<String> cityMapKeys=cityMap.keySet();
        for(String key: cityMapKeys) {
            // System.out.println(key);
        }
            Map<String, String> cityTreeMap= new TreeMap<>();
            cityTreeMap.put("city name", "houston");
            cityTreeMap.put("city state", "texas");
            cityTreeMap.put("city country", "usa");

            System.out.println("city tree map \t" + cityTreeMap);

        }

    }


package Controller;

import Model.Country;
import Repository.Repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Repository Repo;
    public Controller(Repository r){
        this.Repo=r;
    }
    public List<Country> getCountriesFromFile(String fileCountry){
        List<Country> CountryList=new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(fileCountry));
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                String[] countryBuilder=line.split(" ");
                if (countryBuilder[0].startsWith("M") && Long.parseLong(countryBuilder[2])>10000)
                {
                     CountryList.add(new Country(countryBuilder[0],countryBuilder[1],Long.parseLong(countryBuilder[2]),Long.parseLong(countryBuilder[3]),countryBuilder[4]));
                }
            }
            scanner.close();
            return CountryList;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}

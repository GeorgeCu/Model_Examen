package Repository;


import Model.Country;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Country> CountryList;

    public Repository() {
            CountryList=new ArrayList<Country>();
    }
    public List<Country>getAll(){
        return CountryList;
    }
    public void addInCountry(Country C){
        CountryList.add(C);
    }


}

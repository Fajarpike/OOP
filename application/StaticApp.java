package application;

import Util.MathUtil;
import data.Constant;
import data.Country;
import data.Application;

public class StaticApp {

    public static void main(String[] args) {
        
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.Version);

        System.out.println(MathUtil.sun(1,1,1,1,2,2,2));

        Country.City city = new Country.City();
        city.setName("Subang");
        System.out.println(city.getName());

        System.out.println(Application.PROCCESORS);
    }
    
}

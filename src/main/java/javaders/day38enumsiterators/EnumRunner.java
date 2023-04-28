package javaders.day38enumsiterators;

public class EnumRunner {

    public static void main(String[] args) {



        String capitalOfIlliniois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println("capitalOfIlliniois = " + capitalOfIlliniois);

        String abbreviatonOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println("abbreviatonOfFlorida = " + abbreviatonOfFlorida);

        UsStatesEnum state = UsStatesEnum.ALASKA;
        System.out.println("state = " + state);

        UsStatesEnum state2 = UsStatesEnum.FLORIDA;
        System.out.println("state2 = " + state2);


        String stateNameOfAlaska = UsStatesEnum.getStateNameByUsingAbbreviaton("AK");
        System.out.println("stateNameOfAlaska = " + stateNameOfAlaska);

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println("abbriviationOfAlaska = " + abbreviationOfAlaska);
    }
    }

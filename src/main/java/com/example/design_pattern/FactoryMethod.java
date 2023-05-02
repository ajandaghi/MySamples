package com.example.design_pattern;

public class FactoryMethod {
    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
        Plan plan=planFactory.getPlan("DOMESTICPLAN");
        plan.setRate();
        System.out.println(plan.rate);
        plan.calculateBill(2);


    }

}

class GetPlanFactory{

    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}

abstract class Plan{
    protected double rate;
    abstract void setRate();
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}

class  DomesticPlan extends Plan {
    @Override
    void setRate() {
        rate=3.5;

    }
}


class  CommercialPlan extends Plan {
    @Override
    void setRate() {
  rate=7.5;
    }
}

class  InstitutionalPlan extends Plan {
    @Override
    void setRate() {
    rate=5.5;
    }
}

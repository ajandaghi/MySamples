package com.example.design_pattern;

public class ProtoTypePattern {
    public static void main(String[] args) {
        EmployeeRecord e1=new EmployeeRecord(1,"Ali","Staff",200000,"TEH");
        e1.showRecord();
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}

interface Prototype {

    public Prototype getClone();

}


class EmployeeRecord implements Prototype{

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord(){
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");

    }

    public  EmployeeRecord(int id, String name, String designation, double salary, String address) {

        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord(){

        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
    }

    @Override
    public Prototype getClone() {

        return new EmployeeRecord(id,name,designation,salary,address);
    }
}



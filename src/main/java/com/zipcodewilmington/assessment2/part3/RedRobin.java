package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird implements Animal {
    private String migrationMonth = "August";

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }
    public void setMigrationMonth(){
        this.migrationMonth = migrationMonth;
    }
    public String getMigrationMonth() {
        return migrationMonth;
    }


}

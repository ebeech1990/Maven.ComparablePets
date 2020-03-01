package io.zipcoder;

public abstract class Pet implements Comparable<Pet> {

    private String name;


    public Pet(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public abstract String speak();

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Pet o) {
        int result = this.getName().compareTo(o.getName());
        if (result == 0) {
            if (this instanceof Cat && !(o instanceof Cat)) {
                return -1;
            } else if (o instanceof Cat) {
                return 1;
            } else if (this instanceof Dog && !(o instanceof Dog)) {
                return -1;
            } else if (o instanceof Dog) {
                return 1;
            } else if (this instanceof Fish && !(o instanceof Fish)) {
                return -1;
            } else if (o instanceof Fish){
                return 1;
            } else {
                return 0;
            }
        } else {
            System.out.println(result);
            return result;
        }

    }


}
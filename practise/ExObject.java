package practise;

public class ExObject {
    public String name;
    public String toString(){
        return name;
    }
 

    public boolean equals(ExObject obj) {
       return this.name.equals(obj.name);
    }

}

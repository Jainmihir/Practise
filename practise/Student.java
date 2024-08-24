package practise;

public class Student implements Comparable<Student>{
    private String name;
    private int marks;

    Student(int marks , String name){
        this.marks = marks;
        this.name = name;
    }
    
    public int getMarks(){
        return this.marks;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "name : " + this.name + " marks " + this.marks;
    }

    // public boolean equals(Student obj){
    //     return this.name.equals(obj.name);
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + marks;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (marks != other.marks)
            return false;
        return true;
    }

    public int compareTo(Student that){
        if(this.marks > that.marks){
            return 1;
        }else{
            return -1;
        }
    }


}

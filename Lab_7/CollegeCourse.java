/**
 * Aaron Knestaut
 * Cisc181
 */

package cisc181.Lab_7;

public class CollegeCourse implements Comparable<CollegeCourse> {
    private String department;
    private int courseNum;
    private int sectionNum;
    private int capacity;

    public CollegeCourse(String department, int courseNum, int sectionNum, int capacity){
        this.department = department.toUpperCase();
        this.courseNum = courseNum;
        this.sectionNum = sectionNum;
        this.capacity = capacity;
    }

    /*
    getters
     */
    public String getDepartment() { return this.department; }
    public int getCourseNum() { return this.courseNum; }
    public int getSectionNum() { return this.sectionNum; }
    public int getCapacity() { return this.capacity; }

    @Override
    public String toString() {
        return this.getDepartment() + this.getCourseNum() + "-" + this.getSectionNum();
    }

    //@Override
    public boolean equals(CollegeCourse other) {
        if(this.getDepartment().equals(other.getDepartment()) && this.getCourseNum() == other.getCourseNum() && this.getSectionNum() == other.getSectionNum()){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(CollegeCourse other) {
        String courseNumStr = "" + this.getCourseNum();
        String sectionNumStr = "" + this.getSectionNum();
        String courseNumStr2 = "" + other.getCourseNum();
        String sectionNumStr2 = "" + other.getSectionNum();

        if(this.getDepartment().compareTo(other.getDepartment()) != 0){
            return this.getDepartment().compareTo(other.getDepartment());
        }
        else if(courseNumStr.compareTo(courseNumStr2) != 0){
            return courseNumStr.compareTo(courseNumStr2);
        }
        else if(sectionNumStr.compareTo(sectionNumStr2) != 0){
            return sectionNumStr.compareTo(sectionNumStr2);
        }
        else{
            return 0;
        }
    }
}

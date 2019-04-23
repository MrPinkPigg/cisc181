/**
 * Aaron Knestaut
 * Cisc181
 */

package cisc181.Lab_7;

public class CoursesWithLab extends CollegeCourse {
    public static final int LAB_SESSION_CAPACITY = 20;
    private CollegeCourse labSessions [];

    public CoursesWithLab(String department, int courseNum, int sectionNum, int capacity){
        super(department, courseNum, sectionNum, capacity);

        int numSessions;
        if(capacity % LAB_SESSION_CAPACITY == 0){
            numSessions = capacity/LAB_SESSION_CAPACITY;
        }
        else{
            numSessions = capacity/LAB_SESSION_CAPACITY + 1;
        }

        labSessions = new CollegeCourse[numSessions];
        for(int i =0; i < numSessions; i++){
            labSessions[i] = new CollegeCourse(department, courseNum, 100 + i, LAB_SESSION_CAPACITY);
        }
    }

    /*
    getters
     */
    public CollegeCourse[] getLabSessions() { return this.labSessions; }


    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(100);
        output.append(this.getDepartment() + this.getCourseNum() + "-" + this.getSectionNum());

        for(int i = 0; i < this.labSessions.length; i++){
            output.append("\n\t");
            output.append(this.labSessions[i].toString());
        }

        return output.toString();
    }
}

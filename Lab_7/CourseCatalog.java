/**
 * Aaron Knestaut
 * Cisc 181
 */

package cisc181.Lab_7;

import java.util.ArrayList;
import java.util.Collections;

public class CourseCatalog {
    private ArrayList<CollegeCourse> catalog;

    public CourseCatalog(){
        this.catalog  = new ArrayList<CollegeCourse>();
    }

    private boolean courseExists(CollegeCourse course){
        for(int i = 0; i < catalog.size(); i++){
            if(catalog.get(i).compareTo(course) == 0) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<CollegeCourse> getAllCourses(){
        return this.catalog;
    }

    public boolean addCourse(CollegeCourse course){
        if(!this.courseExists(course)){
            catalog.add(course);
            Collections.sort(catalog);
            return true;
        }
        return false;
    }

    public boolean removeCourse(CollegeCourse course){
        if(this.courseExists(course)){
            catalog.remove(course);
            return true;
        }
        return false;
    }

    public void printCourseCatalog(){
        for(int i = 0; i < catalog.size(); i++){
            System.out.println(catalog.get(i).toString());
        }
    }
}

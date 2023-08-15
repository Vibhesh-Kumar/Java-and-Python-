import java.util.List;

public class Grades {
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
    for(int i = 0; i < grades.size(); i++) {
        int grade = grades.get(i);
        int multiple = grade;
        
        // Find the next multiple of 5 greater than or equal to the grade
        while(multiple % 5 != 0 && multiple - grade < 3) {
            multiple++;
        }
        
        if(multiple - grade < 3 && grade >= 38) {
            grades.set(i, multiple); // update list.
        }
    }
    
    return grades;
}

}

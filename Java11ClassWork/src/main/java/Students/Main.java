/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

/**
 *
 * @author jaden
 */
public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Trystan", "Dames", 21, "trystan@g.com", "0636845678", "0008085076096");
        Students student2 = new Students("Jaden", "Turnbull", 19, "jaden@h.com", "0847890234", "0206236789124");
        Students student3 = new Students("Sheldon", "Halls", 17, "shell@f.com", "0763457129", "0410045467821");
        Students student4 = new Students("Hannah", "Sawers", 20, "hana@g.com", "0834698722", "0103215678233");
        Students student5 = new Students("Lourens", "Norris", 18, "loun@l.com", "0987652341", "0312096758901");

        Students[] theStudents = {student1, student2, student3, student4, student5};

        for (Students theStudent: theStudents)
            System.out.println(theStudent.getStudentDetails());
    }
}
    


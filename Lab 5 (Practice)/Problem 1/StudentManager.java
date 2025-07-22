public class StudentManager {

    static Student searchStudentById(Student[] arr, int id) {

        for (Student i : arr) {

            if (i != null && i.getId() == id) {

                return i;
            }
        }

        return null;
    }


}
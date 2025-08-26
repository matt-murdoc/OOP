public class Main {
    
    public static void main(String[] args) {
    
        int[] arr = {1, 3, 5, 6};

        SortingContext obj = new SortingContext(new BubbleSort());
        
        SortingContext obj1 = new SortingContext(new InsertionSort());

        obj.performSort(arr);

        obj1.performSort(arr);

    }
}



/* Your task is to create a console application for managing student information. The information will be managed only by the admission officer(s). Upon starting the project, prompt the user to input their username and password. Validate this information from a file. If the provided password is incorrect, display an error message and request a reattempt.

Once successfully authenticated, the officer gains access to functionalities such as adding and viewing student information. The officer can input details like student ID, name, program, batch, password and CGPA. Additionally, the officer can search for student information using their ID and view all details except the password.

Likewise, the officer can assign courses to students. A student can take multiple courses. The application should have the functionality to search for advised course information based on a student's ID. All data, including student information and advised courses, must be stored and retrieved from a file.

You need to showcase the project through a screen recording and presentation. Also, you have to attach the source code during submission. */
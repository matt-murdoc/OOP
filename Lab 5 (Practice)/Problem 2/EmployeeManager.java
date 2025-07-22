public class EmployeeManager {
    
    static int[] filterEmployeeBySalary(Employee[] arr, double salary) {

        int[] idArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {

            if (arr[i] != null && arr[i].getSalary() > salary) {
                 
                idArr[i] = arr[i].getId();
            }
        }

        return idArr;
    }
}

public class Util {
    /* Необходимо создать утилитарный класс со следующими методами:
         поиск сотрудника в массиве по его имени
         поиск сотрудника в массиве по вхождению указанной строки в его имени
         подсчет зарплатного бюджета для всех сотрудников в массиве
         поиск наименьшей зарплаты в массиве
         поиск наибольшей зарплаты в массиве
         поиск наименьшего количества подчиненных в массиве менеджеров
         поиск наибольшего количества подчиненных в массиве менеджеров
         поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
         поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
     */
    private String[] employeeByName;
    private int[] employeeSalary;

    public Util() {

    }

    public void setEmployeeByName() {

    }

    public void setEmployeeSalary() {

    }

    public String[] getEmployeeByName() {
        return employeeByName;
    }

    public int[] getEmployeeSalary() {
        return employeeSalary;
    }

    // поиск сотрудника в массиве по его имени

    public static int findByName(String name, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {   //бежим по всему массиву
            if (name.equals(arr[i].getName())) {  //если имя равно имени в массиве
                return i;         //вываливаемся и возвращаем индекс масива которого нашли
            }

        }
        return -1;      // если ничего не нашли то выводим индекс -1 (по аналогии индексов ничего не найдено)
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени

    public static int findBySubName(String subname, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {            //бежим по всему массиву
            if (arr[i].getName().contains(subname)) {    //содержит ли имя определенный элемент.
                return i;                               //вываливаемся и возвращаем индекс масива которого нашли
            }

        }
        return -1;                    // если ничего не нашли то выводим индекс -1 (по аналогии индексов ничего не найдено)
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве

    public static int salarySum(Employee[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getBaseSalary();
        }
        return result;
    }

    //поиск наименьшей зарплаты в массиве

    public static int findMinSalary(Worker[] arrSalary) {
        if (arrSalary == null) {
            return -1;
        }
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < arrSalary.length; i++) {
            if (minSalary > arrSalary[i].getSalaryWorker()) {
                minSalary = arrSalary[i].getSalaryWorker();
            }

        }
        return minSalary;
    }

    //поиск наибольшей зарплаты в массиве

    public static int findMaxSalary(Worker[] arrSalary) {
        if (arrSalary == null) {
            return -1;
        }
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < arrSalary.length; i++) {
            if (maxSalary < arrSalary[i].getSalaryWorker()) {
                maxSalary = arrSalary[i].getSalaryWorker();
            }

        }
        return maxSalary;
    }


    //поиск наименьшего количества подчиненных в массиве менеджеров

    public static int findMinNumbersOfSubManager(Manager[] arr) {
        int minNumbersOfSubMan = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (minNumbersOfSubMan > arr[i].getNumberOfSubordinates()) {
                minNumbersOfSubMan = arr[i].getNumberOfSubordinates();
            }
        }
        return minNumbersOfSubMan;
    }


    //поиск наибольшего количества подчиненных в массиве менеджеров

    public static int findMAxNumbersOfSubManager(Manager[] arr) {
        int maxNumbersOfSubMan = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxNumbersOfSubMan < arr[i].getNumberOfSubordinates()) {
                maxNumbersOfSubMan = arr[i].getNumberOfSubordinates();
            }

        }
        return maxNumbersOfSubMan;
    }

    //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static int findHighest(Manager[] arr) {
        int maxDifference = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int difference = arr[i].getBaseSalary() - arr[i].getSalaryManager();
            if (difference > maxDifference) {
                maxDifference = difference;
            }
        }
        return maxDifference;

    }

    //поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static int findLowest(Manager[] arr) {
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int difference = arr[i].getBaseSalary() - arr[i].getSalaryManager();
            if (difference < minDifference) {
                minDifference = difference;
            }
        }
        return minDifference;
    }


}





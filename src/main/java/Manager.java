class Manager extends Employee {
   /* Необходимо создать класс Manager в который нужно добавить следующие методы:
    getNumberOfSubordinates - получить количество подчиненных
    setNumberOfSubordinates в классе, метод getSalaryManager будет возвращать значение
    по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
    Если количество подчиненных 0, то результат как у обычного рабочего.
*/

    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    void getNumberOfSubordinates(int num) {
        numberOfSubordinates = num;
    }

    int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }


        public int getSalaryManager(){
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return (int) (getBaseSalary() * getNumberOfSubordinates() / 100.0 * 3);
        }
    }


    public static void main(String[] args) {

        Manager manager = new Manager("Mark" , 38, 25);

        System.out.println(manager.getSalaryManager());


    }

}

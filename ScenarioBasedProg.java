// question - write java code to find number is even or odd without using loop or if else 

class ScenarioBasedProg{
    public static void main(String[] args) {
        int num=12;
        String []str={"even","odd"};

        System.out.println(str[num%2]);
    }
}
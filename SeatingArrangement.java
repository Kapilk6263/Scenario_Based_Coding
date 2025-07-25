public class SeatingArrangement {

public static void seating(){
 double d=20; 
 int n=(int)d;  //type casting 
 for(int i=1;i<=20;i++){
    if((i & 1)==0){
        System.out.println(i+" for boys");
    }else {
        System.out.println(i+" for girls ");
    }
 }

}

public static void main(String[] args) {
    seating();
}


}

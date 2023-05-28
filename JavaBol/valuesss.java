package JavaBol;

public class valuesss {
    public static void main(String[]args){
        //Me muetra  que es falso y verdadero
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        //Muestra de de dos numeros si es o no mayor 
        int x = 10;
        int y = 9;

        System.out.println(isJavaFun);     
        System.out.println(isFishTasty);

        System.out.println(x > y);
        //Muestra de nuestra variable si es igual, dando a si resultado un verdadero y falso

        System.out.println(x == 10);

        //Muestra mediante variables desognadas cual es mayor y retonar true or false
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
    
}

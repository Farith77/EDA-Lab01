package String;

public class strings {
    public static void main(String []args){
        //Creamos nuestra primera variable String
        String primer = ("Hello");
        //String length
        //Me manda la cantidad de caracteres de nuestro String
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Metodo de cadena toUpperCase()toLowerCase()
        //toUpperCase -> Mayuscula
        //toLowerCase -> Minuscula
        String txt2 = "Hello World";
        //IndexOf -> Me indica la posicion de la palabra colocada
        String txt3 = "Please locate where 'locate' occurs!";



        System.out.println(primer);
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt2.toUpperCase());   
        System.out.println(txt2.toLowerCase());
        System.out.println(txt3.indexOf("locate"));
        

    }
    
    
}

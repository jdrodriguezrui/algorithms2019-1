public class Main {
   public static void main(String[] args) {
       char comillas = 34;
       String s[] = {
           "public class Main {",
           "   public static void main(String[] args) {",
           "       char comillas = 34;",
           "       String s[] = {",
           "           ",
           "       };",
           "       for(int i=0;i<4;i++){",
           "            System.out.println(s[i]); //imprimir la primera parte",
           "        }",
           "        for (int i = 0; i < s.length; i++) {",
           "            System.out.println(s[4]+comillas+s[i]+comillas+','); //imprimir arreglo completo",
           "        }",
           "        for(int i=5;i<s.length;i++){",
           "            System.out.println(s[i]); //imprimir final",
           "        }",
           "    }  ",
           "}",
       };
       for(int i=0;i<4;i++){
            System.out.println(s[i]); //imprimir la primera parte
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[4]+comillas+s[i]+comillas+','); //imprimir arreglo completo
        }
        for(int i=5;i<s.length;i++){
            System.out.println(s[i]); //imprimir final
        }
    }  
}

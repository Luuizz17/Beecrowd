import java.util.Scanner;
public class beecrowdAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		
        if(nome.equalsIgnoreCase("vertebrado")){
            String choce1 = sc.nextLine();
            if(choce1.equalsIgnoreCase("ave")){
                String ave = sc.nextLine();
             if(ave.equalsIgnoreCase("carnivoro")){
                System.out.print("aguia");
             }else if(ave.equalsIgnoreCase("onivoro")){
                System.out.print("pomba");
             }
            } if(choce1.equalsIgnoreCase("mamifero")){
                String mamifero = sc.nextLine();
                if(mamifero.equalsIgnoreCase("onivoro")){
                    System.out.print("homem");
                } else if(mamifero.equalsIgnoreCase("herbivoro")){
                    System.out.print("vaca");
                }
            }
        } else if(nome.equalsIgnoreCase("invertebrado")){
            String choce2 = sc.nextLine();
            if(choce2.equalsIgnoreCase("inseto")){
                String inseto = sc.nextLine();
                if(inseto.equalsIgnoreCase("hematofago")){
                    System.out.print("pulga");
                } else if(inseto.equalsIgnoreCase("herbivoro")){
                    System.out.print("lagarta");
                }
            } else if(choce2.equalsIgnoreCase("anelideo")){
                String anelideo = sc.nextLine();  
                if(anelideo.equalsIgnoreCase("onivoro")){
                    System.out.println("minhoca");
                }  
            }
        }
		
		
		
		sc.close();
    }
}

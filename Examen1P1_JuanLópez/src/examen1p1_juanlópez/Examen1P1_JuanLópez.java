/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_juanlópez;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jjlm1
 */
public class Examen1P1_JuanLópez {
static Scanner leer=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("1. Fight or Flight");
        System.out.println("2. Tri Fuerza");
        System.out.println("");
        System.out.println("3. Salir");
        int opcion=leer.nextInt();
        while(opcion<3&&opcion>0){
            switch (opcion){
                case 1:
                    int balas=25;
                    int distancia =new Random().nextInt ((16-0))+15;
                    int vidazombie=25;
                    System.out.println("Ingrese maestría");
                    System.out.println("1. Principiante (0% de incremento de probabilidad de daño)");
                    System.out.println("2. Intermedio (5% de incremento de probabilidad de daño)");
                    System.out.println("3. Experto (15% de incremento de probabilidad de daño");
                    int maestria=leer.nextInt();
                    if (maestria==1){
                        char resp='s';
                        while(balas>0&&vidazombie>0&&distancia>0&&(resp=='s'||resp=='S')){
                        System.out.println("El zombie está a: "+distancia);
                        System.out.println("");
                        System.out.println("El jugador tiene: "+balas+" balas");
                        int probabilidad =new Random().nextInt ((101-0));
                        if (probabilidad<=65){
                            int daño =new Random().nextInt ((7-1)+1);
                            vidazombie-=daño;
                            distancia-=0;
                            if (vidazombie<=0){
                                vidazombie=0;
                            }
                            System.out.println("Hit! El tiro ha reducido los HP del zombie por un total de: "+daño+"!");
                            System.out.println("");
                            balas--;
                            
                        }else{
                            int mov =new Random().nextInt ((4-0))+2;
                            distancia-=mov;
                            if (distancia<=0){
                                distancia=0;
                            }
                            System.out.println("El tiro ha fallado! Ahora el zombi se encuentra a: "+distancia+" metros");
                            System.out.println("");
                            balas--;
                        }
                            System.out.println("Vida restante del zombi: "+vidazombie);
                            System.out.println("EL zombie está a una distancia de: "+distancia+" metros");
                            System.out.println("");
                            
                            if (vidazombie>0&&balas>0&&distancia>0){
                            System.out.println("Desea realizar otra ronda?");
                            resp=leer.next().charAt(0);
                            
                        }
                        
                             
                    }
                        if(vidazombie==0){
                                System.out.println("El zombie ha sido derrotado!! Fin del juego");
                            }else if (balas==0){
                                System.out.println("Se han acabado las balas!! Fin del juego");
                            }else if (distancia==0){
                                System.out.println("El zombie te ha alcanzado!! Fin del juego");
                            }else if (resp!='s'&&resp!='S'){
                                System.out.println("El usuario ha decidido salir. Cobarde >:(  Fin del juego");
                            }
            }
                      if (maestria==2){
                        char resp='s';
                        while(balas>0&&vidazombie>0&&distancia>0&&(resp=='s'||resp=='S')){
                        System.out.println("El zombie está a: "+distancia);
                        System.out.println("");
                        System.out.println("El jugador tiene: "+balas+" balas");
                        int probabilidad =new Random().nextInt ((101-0));
                        if (probabilidad<=70){
                            int daño =new Random().nextInt ((7-1)+1);
                            vidazombie-=daño;
                            distancia-=0;
                            if (vidazombie<=0){
                                vidazombie=0;
                            }
                            System.out.println("Hit! El tiro ha reducido los HP del zombie por un total de: "+daño+"!");
                            System.out.println("");
                            balas--;
                            
                        }else{
                            int mov =new Random().nextInt ((4-0))+2;
                            distancia-=mov;
                            if (distancia<=0){
                                distancia=0;
                            }
                            System.out.println("El tiro ha fallado! Ahora el zombi se encuentra a: "+distancia+" metros");
                            System.out.println("");
                            balas--;
                        }
                            System.out.println("Vida restante del zombi: "+vidazombie);
                            System.out.println("EL zombie está a una distancia de: "+distancia+" metros");
                            System.out.println("");
                            
                            if (vidazombie>0&&balas>0&&distancia>0){
                            System.out.println("Desea realizar otra ronda?");
                            resp=leer.next().charAt(0);
                            
                        }
                        
                             
                    }
                        if(vidazombie==0){
                                System.out.println("El zombie ha sido derrotado!! Fin del juego");
                            }else if (balas==0){
                                System.out.println("Se han acabado las balas!! Fin del juego");
                            }else if (distancia==0){
                                System.out.println("El zombie te ha alcanzado!! Fin del juego");
                            }else if (resp!='s'&&resp!='S'){
                                System.out.println("El usuario ha decidido salir. Cobarde >:(  Fin del juego");
                            }
            }
                        if (maestria==3){
                        char resp='s';
                        while(balas>0&&vidazombie>0&&distancia>0&&(resp=='s'||resp=='S')){
                        System.out.println("El zombie está a: "+distancia);
                        System.out.println("");
                        System.out.println("El jugador tiene: "+balas+" balas");
                        int probabilidad =new Random().nextInt ((101-0));
                        if (probabilidad<=80){
                            int daño =new Random().nextInt ((7-1)+1);
                            vidazombie-=daño;
                            distancia-=0;
                            if (vidazombie<=0){
                                vidazombie=0;
                            }
                            System.out.println("Hit! El tiro ha reducido los HP del zombie por un total de: "+daño+"!");
                            System.out.println("");
                            balas--;
                            
                        }else{
                            int mov =new Random().nextInt ((4-0))+2;
                            distancia-=mov;
                            if (distancia<=0){
                                distancia=0;
                            }
                            System.out.println("El tiro ha fallado! Ahora el zombi se encuentra a: "+distancia+" metros");
                            System.out.println("");
                            balas--;
                        }
                            System.out.println("Vida restante del zombi: "+vidazombie);
                            System.out.println("EL zombie está a una distancia de: "+distancia+" metros");
                            System.out.println("");
                            
                            if (vidazombie>0&&balas>0&&distancia>0){
                            System.out.println("Desea realizar otra ronda?");
                            resp=leer.next().charAt(0);
                            
                        }
                        
                             
                    }
                        if(vidazombie==0){
                                System.out.println("El zombie ha sido derrotado!! Fin del juego");
                            }else if (balas==0){
                                System.out.println("Se han acabado las balas!! Fin del juego");
                            }else if (distancia==0){
                                System.out.println("El zombie te ha alcanzado!! Fin del juego");
                            }else if (resp!='s'&&resp!='S'){
                                System.out.println("El usuario ha decidido salir. Cobarde >:(  Fin del juego");
                            }
            }
                        break;
                case 2:
                    zelda();
                    break;
        }
    }
    
}
    public static void zelda(){
    System.out.println("Ingrese tamaño:");
                    int size=leer.nextInt();
                    char resp='s';
                    int largo=size/2+1;
                    int largo1=size*2+1;
                    int control=size/2;
                   
                    while (size>=20&&size%2==0&&control%2!=0&&resp=='s'){
                        while (resp=='s'){
                            for (int i=1;i<=largo;i++){
                                for (int j=1;j<=size+1;j++){
                                    if (j==largo+i-1||j==largo-i+1){
                                        System.out.print("*");
                                    }else if (j>=largo+i&&j<=largo-i){
                                        System.out.print("*");
                                    }else if (i==largo){
                                        if (j!=largo&&j<=(size*2+1)/2){
                                        System.out.print("*");
                                        }else{
                                            System.out.print(" ");
                                        }
                                    }else if (i<=largo/2){
                                        if (j<=largo+i-1&&j>=largo-i+1){
                                        System.out.print("*");
                                        }else{
                                            System.out.print(" ");
                                        }
                                    }else if (i>largo/2){
                                        if ((j<=largo+i-1&&j>=largo-i+1)&&j>size/2+size/2+2-i){
                                        System.out.print("*");
                                        }else if(j<size/4-size/5-1+i&&(j<=largo+i-1&&j>=largo-i+1)){
                                            System.out.print("*");
                                        }else {
                                            System.out.print(" ");
                                        }
                                    
                                    }
                                    
                                }
                                System.out.println("");
                            }
                            System.out.println("Ingresar otro número?");
                            resp=leer.next().charAt(0);
                            
                        }
                        
                        
                        System.out.println("Ingresar otro número?");
                            resp=leer.next().charAt(0);
                    }
}
}

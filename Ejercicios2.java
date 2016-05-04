/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mayo042016;
import java.util.Stack;

/**
 *
 * @author Alumnos
 */
public class Ejercicios2 {
    //CREAR PILA JUEGOS FAVORITOS Y REALICE LAS OPERACIONES DESCRITAS EN LAS 
    //DIAPOSITIVAS DE EDTAP31.BLOGSPOT.COM
    public void _2_1(){
        
        Stack juegos = new Stack();
        juegos.push("World of Warcraft");
        juegos.push("Leage of Legends");
        juegos.push("XCOM");
        juegos.push("Terraria");
        juegos.push("Duke Nukem 3D");
        juegos.push("Doom3");
        juegos.push("XCOM Enemy Unknown");
        juegos.push("Skyrim");
        juegos.push("Minecraft");
        juegos.push("7 Days to Die");
        juegos.push("The Forest");
        
        System.out.println("Tamaño Pila:\t" + juegos.size() + "\n");
        System.out.println("Cima de la Pila:\t" + juegos.peek()+ "\n");
        System.out.println("Posición del Elemento World of Warcraft: \t" + juegos.search("World of Warcaraft")+ "\n");
        System.out.println("Posición del Elemento Terraria :\t" + juegos.search("Terraria")+ "\n");
        System.out.println("Elemento Desapilado:\t" + juegos.pop() + "\n");
        System.out.println("Está Vacía la Pila?:\t" + juegos.empty());
    }
    
    //CREAR PILA 5 NOTAS Y DESPLIEGE USANDO BUCLE FOR Y METODO GET
    public void _2_2(){
        
        Stack notas = new Stack();
        notas.push(6.3);
        notas.push(7);
        notas.push(5.5);
        notas.push(4.0);
        notas.push(6.8);
        
        
        
        for (int x=0;x<notas.size();x++){
            notas.get(x);
            
            System.out.println("La nota\t" + x + " " + "de la Pila es:\t" + notas.get(x));
            
        }
        
    }
    
    public void _2_3(){
        
        Stack notas = new Stack();
        notas.push(6.3);
        notas.push(7);
        notas.push(5.5);
        notas.push(4.0);
        notas.push(6.8);
                             
        for (Object nms : notas){
            System.out.println(nms);
            
        }
        
    }
    
    public void _2_4(){
        
        Stack libros = new Stack();
        libros.push("Maraquitas");
        libros.push("Técnicas de Travestismo");
        libros.push("Aumente su tamaño hoy");
        libros.push("La vecina Hot 2");
        
        int a = 0;
        
        while (!libros.empty()){//empty tira valor FALSO mientras hayan ITEMS dentro
                                //de la PILA por eso se usa el signo de exclamaciòn
                                 //Para negar esa CONDICION se puede usar tamb a<=3 (tamaño de la pila)
            
            libros.pop();
            a++;
        }
       
        System.out.println("Esta Vacía la Pila? :" + libros.empty());
    }
    
    
    public void _2_5(){
        
        
        
    }
}

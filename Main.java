/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Issei
 */
import java.util.PriorityQueue; 
import java.util.Scanner; 
import java.util.Comparator;
import static paquete.Huffman.printCode;


public class Main {
    public static void main(String[] args) 
    { 
  
        Scanner s = new Scanner(System.in); 
  
        // numero de caracteres 
        int n = 6; 
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
        int[] charfreq = { 5, 9, 12, 13, 16, 45 }; 
  
   
        PriorityQueue<NodoHuffman> q 
            = new PriorityQueue<NodoHuffman>(n, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }); 
  
        for (int i = 0; i < n; i++) { 
 
            NodoHuffman hn = new NodoHuffman(); 
  
            hn.c = charArray[i]; 
            hn.data = charfreq[i]; 
  
            hn.left = null; 
            hn.right = null; 

            q.add(hn); 
        } 
  
        // crea nodo raiz
        NodoHuffman root = null; 
  

        while (q.size() > 1) { 

            NodoHuffman x = q.peek(); 
            q.poll(); 

            NodoHuffman y = q.peek(); 
            q.poll(); 
  
            NodoHuffman f = new NodoHuffman(); 
  
            f.data = x.data + y.data; 
            f.c = '-'; 

            f.left = x; 

            f.right = y; 

            root = f; 
  
            q.add(f); 
        } 

        printCode(root, ""); 
    }
}

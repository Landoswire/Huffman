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
public class Huffman {
    public static void printCode(NodoHuffman root, String s){ 
        if (root.left == null && root.right == null && Character.isLetter(root.c)){ 
  
            // c es el caracter en el nodo
            System.out.println(root.c + ":" + s); 
  
            return; 
        } 

        printCode(root.left, s + "0"); 
        printCode(root.right, s + "1"); 
    } 
  
    
}


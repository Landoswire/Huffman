/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Comparator;

/**
 *
 * @author Issei
 */
class Comparador implements Comparator<NodoHuffman> { 
    @Override
    public int compare(NodoHuffman x, NodoHuffman y) 
    { 
  
        return x.data - y.data; 
    } 
}
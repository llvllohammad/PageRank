
package org.jgrapht.alg.scoring;

import org.jgrapht.alg.interfaces.*;
import org.jgrapht.graph.*;
import org.junit.*;

import com.google.common.graph.Graph;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class PageRankTest
{


    @Test
    public void testUndirectedGraph() throws FileNotFoundException
    {
    	DirectedPseudograph<String, DefaultEdge> g = new DirectedPseudograph<>(DefaultEdge.class);
    	System.out.println("where is soc-sign-bitcoinotc.txt ?");
    	Scanner keyboard = new Scanner(System.in);
    	String path = keyboard.nextLine();
    	
        readfile(path, g);

        VertexScoringAlgorithm<String, Double> pr = new PageRank<>(g);
     double [] score = new double [6006];
     int [] index = new int[6006];
     for (int i = 1; i < score.length; i++) {
		if (g.containsVertex(String.valueOf(i))) {
			score[i] = pr.getVertexScore(String.valueOf(i));
			
			index[i] = i;
		}
		else {
			score[i] = -100;
			index[i] = -1;
		}
	}
      
     
       
    bubbleSort(score, index);
    DecimalFormat df = new DecimalFormat("#.########################");
   
    for (int i = 0; i < 10; i++) {
    	 System.out.println(i+1 +":	"+index[i]+ "/ "+ df.format(score[i]));
	}
    }
   

    public static void readfile (String Path,  DirectedPseudograph<String, DefaultEdge> g) throws FileNotFoundException{
		
        File file = new File(Path);
        Scanner reader = new Scanner(file);
        reader.useDelimiter(",");
        reader.useDelimiter("\n");
       
        
  	   String i,k = "";
  	   int j = 0;
  	   while (reader.hasNext() ){
  		 String s = reader.next();
         String [] sp = s.split(", ");
  		 i = sp[0];
  		 k=sp[1];
  		 //System.out.println(k);
  		 g.addVertex(i);
         g.addVertex(k);
         g.addEdge(i, k);
 		} 
    
    
    }   
    
    void bubbleSort(double arr[], int[] index) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] < arr[j+1]) 
                { 
                    
                    double temp = arr[j];
                    int t= index[j];
                    index[j] = index[j+1];
                    arr[j] = arr[j+1]; 
                    index[j+1] = t;
                    arr[j+1] = temp; 
                } 
    } 
    
}
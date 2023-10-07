/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nartea_exam3;


import java.util.Scanner;




public class Nartea_Exam3 {
   private class Prriority{
            
            int special;
            int data;
          
       Prriority next;           
        }

   
    public static void main(String[] args) throws Exception {
        Nartea_Exam3 list = new Nartea_Exam3();
        Scanner scanner = new Scanner(System.in);
        boolean ins = true;
        while (ins) {            
            System.out.println("Enter Pages: ");
                    int item = scanner.nextInt();
                    System.out.println("Enter Priority: ");
                    int priority = scanner.nextInt();
                      
                    list.insertion(item, priority);
                     if(printCount>4){
                         list.deletion();
                     }
                        
                    
                    list.display();
        }
                
    }
     private Prriority front = null;
   static int printCount = 0;
   
    public int deletion() throws Exception{
          if (front == null){
              throw new Exception("Queue is Empty");
          } 
          int rebound = front.data;
          front = front.next;
            
           return rebound; 
        
        }
    private void insertion(int item, int priority){
            Prriority node = new Prriority();
            node.data=item;
            node.special = priority;
            node.next = null;
            
            
            if (front == null || priority <= front.special) {
                node.next = front;
                front = node;
            }
            else{
                Prriority rebound = front;
                while (rebound.next != null && rebound.next.special <= priority) {                    
                    rebound = rebound.next;
                }
                   node.next = rebound.next;
                   rebound.next = node;
               printCount++;
               
               }
            
        }
     
        public void display() throws Exception{
            if (front == null){
              throw new Exception("Queue is Empty");
          }
            Prriority temporary = front;
            
            System.out.println("Priority \t Pages");
            
            while(temporary != null){
              
                   System.out.println(temporary.special + "\t\t" + temporary.data);
                temporary = temporary.next;

            }
            System.out.println("\n");
        }
}
    


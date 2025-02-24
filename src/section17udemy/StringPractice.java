package section17udemy;

public class StringPractice {
	
	  public static void main(String[] args) {
	      String s="Hello Word";  //drow
	      String reverse="";
	        String reverse1="";
	          String r="";
	       
	      String[] arr=s.split(" ");
	      for (int i=0;i<arr.length;i++)
	      {
	         
	          reverse=arr[i]+" "+reverse;
	          
	          
	      }
	       //System.out.println(reverse);
	      //word Hello 
	     
	      ////////////////
	      for(int i=0;i<s.length();i++){
	          
	          reverse1=s.charAt(i)+reverse1;
	      }
	    
	       
	       
	       ///////////////////
	       
	       for(int i=0;i<arr.length;i++){
	               String reverse12="";
	           for(int j=0;j<arr[i].length();j++){
	               
	        reverse12=arr[i].charAt(j)+reverse12;
	               
	           }
	           r=r+" "+reverse12;
	         
	       }
	         System.out.println(r);
	    } 

}

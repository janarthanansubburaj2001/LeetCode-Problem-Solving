class Solution {
    public boolean isPalindrome(int x) {
         int las=0;
         if(x<0){
          return false;
         }
         
           int g=x;
            
            int f=0;
            while (g!=0){
            
                f=(f*10)+g%10;
                g=g/10; 
            }
           
            return (x==f);
        }

           
    }

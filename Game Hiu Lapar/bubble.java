 import greenfoot.*;  
 public class bubble extends Actor  
 {  
   public void act()   
   {  
     setLocation(getY() - 5, getX());  
      if (getY() <= 0)  
      {  
          setLocation(getWorld().getHeight() + 20 , Greenfoot.getRandomNumber(600));  
      }  
   }     
 }  
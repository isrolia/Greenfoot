import greenfoot.*;  
 public class fish extends Actor  
 {  
   public void act()   
   {  
     move (2) ;  
     if (Greenfoot.getRandomNumber (20) < 10)  
   {  
     turn (Greenfoot.getRandomNumber (50) - 20) ;  
   }   
   if (getX () <= 5 || getX() >= getWorld().getWidth () - 5)  
   {  
   turn (180) ;  
   }  
   if (getY () <= 5 || getY() >= getWorld().getHeight () - 5)  
   {  
     turn (180) ;  
   }  
   }     
 }  
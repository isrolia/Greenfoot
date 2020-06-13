import greenfoot.*;   
 abstract class Menus extends World  
 {  
   public static GreenfootSound titleSound;  
   public Menus()  
   {    
     super(720, 480, 1);  
     if (this.getClass().getName().equalsIgnoreCase("MenuScreen"))  
     {  
       addObject(new StartBtn(), 80, 100);  
       addObject(new StoryBtn(), 100, 220);  
       addObject(new HelpBtn(), 80, 310);  
       titleSound = new GreenfootSound("title-theme.mp3");  
       titleSound.stop();
       titleSound.play();
             titleSound.setVolume(70);
             
     }  
     else  
     {  
       addObject(new BackBtn(), 100, 400);  
     }  
   }  
 }  
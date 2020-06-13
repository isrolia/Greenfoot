import greenfoot.*;   
 
 public class Score extends Actor  
 {  
 Font font1=new Font("Helvetica",35);  
  public Score(String text)  
  {  
    GreenfootImage img_field = new GreenfootImage(140,50);  
    img_field.setFont(font1);  
    img_field.setColor(Color.WHITE);  
    img_field.drawString(text, 0, 45);  
    setImage(img_field);  
   }  
  public void setText(String text)  
   {  
     GreenfootImage img_field = getImage();  
     img_field.clear();  
     img_field.drawString(text, 0, 45);  
   }  
 }  
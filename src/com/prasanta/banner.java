package com.prasanta;

import java.awt.*;
import java.applet.*;
public class banner extends Applet implements Runnable
{
      String msg=" ** PRASANTA KUMAR PARIDA ** ";
      char ch;
      boolean  stopFlag= true;
      Thread t= null;
     
      public void start(){
          t = new Thread(this);
          stopFlag=false;
          t.start();
       }

       public void run(){
             for(;;){
                 try{
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1,msg.length());
                msg = msg + ch;
                if(stopFlag)
                     break;
                }catch(InterruptedException e) {}
            }
        }

       public void stop(){
           stopFlag=true;
           t = null;
         }

         public void paint(Graphics g){
              g.drawString(msg,60,30);
        }
}
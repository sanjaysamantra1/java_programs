import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class MyImage extends  JFrame
{


    static int xPixel =96;
    static int yPixel =56;

    Image myImage, offScreenImage;
    Graphics offScreenGraphics;


    public MyImage()
    {

       try{
          myImage = Toolkit.getDefaultToolkit().getImage("e:\\images\\12345.jpg");
       }

        catch(Exception e) {}
        setSize(800,600);
        setVisible(true);
moveImage();

    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {

        int width  = getWidth();
        int height = getHeight();

        if (offScreenImage == null) {
            offScreenImage    = createImage(width, height);
            offScreenGraphics = offScreenImage.getGraphics();
        }

        // clear the off screen image
        offScreenGraphics.clearRect(76, 36, width + 1, height + 1);

        // draw your image off screen
        offScreenGraphics.drawImage(myImage, xPixel, yPixel, this);

        // show the off screen image

        g.drawImage(offScreenImage, 1,1, this);


    }

    void moveImage() {

        for ( int i = 0 ; i < 500 ; i++ ){

            System.out.println("next set of Pixels " + xPixel);

            xPixel +=1;

           for(int k=0;k<5;k++){yPixel +=1;}

           repaint();
		if(yPixel>=450)
		{yPixel=56;xPixel=96;}

            // then sleep for a bit for your animation
            try { Thread.sleep(500); }   /* this will pause for 50 milliseconds */
            catch (InterruptedException e) { System.err.println("sleep exception"); }

        }
    }

    public static void main(String args[])
    {
        MyImage me = new MyImage();

    }
}



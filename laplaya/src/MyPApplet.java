/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferchuqui
 */
import processing.core.*;
public class MyPApplet extends PApplet
{
private String URL ="http://cdn.masdemx.com/wp-content/uploads/2017/03/playa-norte-isla-muejeres-mexico-7.jpg";
private PImage backgroundImg;

public void setup()
{
    size(200,200);
    backgroundImg = loadImage (URL,"jpg");
}
public void draw()
{
    backgroundImg.resize(0,height);
    image (backgroundImg,0,0); 
    fill (255,209,0);
    ellipse(width/4, height/5, width/5, height/5);
//body not shown
}
}

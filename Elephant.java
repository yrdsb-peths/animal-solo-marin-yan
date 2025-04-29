import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Marin
 * @version April 2025
 */
public class Elephant extends Actor
{
    public Elephant() {
        setImage("images/elephant.png");  
    }
    public void act()
    {
        move(1);
    }
}

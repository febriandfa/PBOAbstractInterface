/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abstrakinterfes.interfes;

/**
 *
 * @author Asus
 */
public class Demo_Social_Graph {
    public static void main(String[] args){
        Facebook fbTukul = new Facebook();
        fbTukul.setFacebook("Tukul Arwana", "Kembali ke Laptop");
        fbTukul.like();
        fbTukul.like();
        
        Twitter twJokowi = new Twitter();
        twJokowi.setTwitter("Joko Widodo", "Yo Gak Tau Kok Tanya Saya");
        twJokowi.favorite();
        twJokowi.favorite();
        twJokowi.favorite();
        
        SocialGraph socialGraph = new SocialGraph();
        socialGraph.compareLike(fbTukul, twJokowi);
    }
}

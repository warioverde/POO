/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasebastian;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author CORE 7
 */
public class PruebaSebastian {

    public static void main(String[] args) {
       int candidatos=6;
       int locales=20;
       int mayor=0;
       int lugar=0;
       float porcentaje=0;
       
        int votos [][]= new int [candidatos][locales];
        LLenarMatriz(votos, candidatos, locales);
        mostrarMatriz(votos,candidatos,locales);
        TotalVotosLocal(votos,candidatos,locales);
        for (int i = 0; i < 4; i++) {
            int acumulador=0;
            
            for (int j = 0; j < locales; j++) {
                acumulador+=votos[i][j];
                
              
            }
            porcentaje=(float)(acumulador*100)/Porcentaje(votos,candidatos,locales);//las 2 ultimas filas son votos nulos y votos blancos
            System.out.println("la cantidad de votos del candidato "+(i+1)+" es "+acumulador+" su porcentaje es "+porcentaje);
            
            if(porcentaje>50){
                System.out.println("el ganador es "+(i+1));
                
            }
            
            
           
           
            }
           System.out.println("la mayoria de votos lo tuvo el candidato "+MayoriaDeVotos(votos,candidatos,locales));
           System.out.println("la menor cantidad de votos lo tuvo el candidato "+MenoriaDeVotos(votos,candidatos,locales));
        
       
        
        
        
        
       
        
       
       
        
    }
    public static void LLenarMatriz(int votos [][], int candidatos, int locales){
       Scanner leer = new Scanner(System.in);
       Random azar = new Random();
        for (int i = 0; i < candidatos; i++) {
            for (int j = 0; j < locales; j++) {
                /*while(leer.nextInt=<0){
                System.out.println("ingrese cantidad de votos del candidato "+(i+1)+" en la localidad "+(j));
                hola[i][j]=leer.nextInt();
                } */
                votos[i][j]=azar.nextInt(10);
                
            }
            
        }
       
    }
    public static void mostrarMatriz(int matriz [][],int ve, int coronel){
        for (int i = 0; i < ve; i++) {
            for (int j = 0; j < coronel; j++) {
                System.out.print(matriz [i][j]+"\t");
                
            }
        
            System.out.println(" ");
        }
    }
    public static void TotalVotosLocal(int votos [][], int cand , int loc){
        for (int j = 0; j < loc; j++) {
            int acumulador=0;
            for (int i = 0; i < cand; i++) {
                acumulador+=votos[i][j];
                
                
                
            }
            System.out.println("la cantidad de votos de la localidad "+(j+1)+" es "+acumulador);
        }
    }
        public static int Porcentaje(int hola [][], int candi, int locales){
        
       int acumuTotal=0;
        for (int i = 0; i < 6; i++) {
            
            for (int j = 0; j < locales; j++) {
               
                acumuTotal+=hola[i][j];
            }
           
         
            
           
            }
            return acumuTotal;
    }


   
    public static int MayoriaDeVotos(int hola [][], int x, int y){
       int mayor=0;
       int lugar=0;
       int comparar=0;
       //las 2 ultimas filas son votos nulos y votos blancos
        for (int i = 0; i <4 ; i++) {
             int xxx=0;
             
            for (int j = 1; j < y; j++) {
                xxx+=hola[i][j];
                
            }
            if(xxx>mayor){
                
                mayor=xxx;
                lugar=i+1;
               
            }
                
        
        
    }
        return lugar;
    }
    public static int MenoriaDeVotos(int seco [][], int x,int y){
        int menor=999999;
       int lugar=0;
       int comparar=0;
        for (int i = 0; i <4 ; i++) {
             int xxx=0;
             
            for (int j = 1; j < y; j++) {
                xxx+=seco[i][j];
                
            }
            if(xxx<menor){
                
                menor=xxx;
                lugar=i+1;
               
            }
                
        
        
    }
        return lugar;
    }
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
package test;

import modelo.Coordenada;

public class Test 
{
    
     public static void main(String[] args)
    {
        Coordenada c1 = new Coordenada();
        c1.setX(1.3);
        c1.setY(5.3);
        
        Coordenada c2 = new Coordenada(1.3,5.3);
        Coordenada c3 = c1;
        Coordenada c4 = c2;
        
        c2.CalcularDistancia(c1);
        System.out.println("La Distancia Que Hay Entre Los Dos Puntos Es: " + c2.getDistancia());
        System.out.println(c1);
        System.out.println(c2);
        
        if(c1.equals(c2))
        {
            System.out.println("Las Coordenadas Son iguales");
        }
        else
        {
            System.out.println("Las Coordenadas No Son Iguales");
        }
        
    }
}

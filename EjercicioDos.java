package com.company;
    public class EjercicioDos {

        public static void main(String[] args) {
        // Calcular el area de una circunferencia // Area de un circulo es = Radio^2 *PI
        double rad2, rad, pi, Area;
        rad = 5;            //Base
        pi= 3.1416;
        rad2= Math.pow(rad,2); // Altura
        Area = (rad2 * pi);
        System.out.println("El Area de un circulo con un radio de " + rad + "es = a " + Area);

        // Resolver la siguiente operacion (a*b+c*4)/(5-2)
            int a,b,c,Res,Div;
            a=2;
            b=2;
            c=2;
            a=(a+b);
            c=(c*4);
            a=(a+c);
            Div=(5-2);
            Res=(a/Div);
            System.out.println("El resultado de igualar a 2 y multiplicarlo por 4 y dividirlo para "+ Div+ " es = a "+ Res);


            System.out.println("Estudiante: Kevin Adrian Roldan Rojas");
            System.out.println("Materia: Programacion de interfaces Graficas");
            System.out.println("Segundo Ciclo Desarrollo de Software");
        }

    }



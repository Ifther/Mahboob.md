package mypack2;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        System.out.println("Complete Geometrical  formulas:  ");
        System.out.println("ENTER 'end' TO END THE FORMULA CALCULATION");
        Scanner s = new Scanner(System.in);
             while (true) {
                 System.out.print("choose any one 1.Area,2.Perimeter,3.Volume:");
                 String S = s.next();
                 if(S.equals("area")||S.equals("perimeter")||S.equals("volume")) {
                     if (S.equals("area")) {
                         System.out.println("ENTER 'terminate' TO END THE AREA CALCULATION");
                         while (true) {
                             System.out.print("enter the specific shape's area which we want:");
                             String u = s.next();
                                 if (u.equals("circle") || u.equals("triangle") || u.equals("rectangle") || u.equals("isosceles triangle") || u.equals("parallelogram") || u.equals("rhombus")) {
                                   if (u.equals("circle")) {
                                         System.out.print("enter the radius:");
                                         int R = s.nextInt();
                                         float area = (float) R * R * 3.14f;
                                         System.out.println("area of circle is:" + area);
                                     } else if (u.equals("triangle")) {
                                         System.out.print("enter the base:");
                                         int B = s.nextInt();
                                         System.out.print("enter the height:");
                                         int h = s.nextInt();
                                         float base = 0.5f * B * h;
                                         System.out.println("area of triangle is:" + base);
                                     } else if (u.equals("rectangle")) {
                                         System.out.print("enter the length:");
                                         int l = s.nextInt();
                                         System.out.print("enter the width:");
                                         int w = s.nextInt();
                                         int y = l * w;
                                         System.out.println("area of rectangle is:" + y);
                                     } else if (u.equals("isosceles triangle")) {
                                         System.out.print("enter the base:");
                                         int B = s.nextInt();
                                         System.out.print("enter the height:");
                                         int h = s.nextInt();
                                         float base = 0.5f * B * h;
                                         System.out.println("area of isosceles triangle is:" + base);
                                     } else if (u.equals("parallelogram")) {
                                         System.out.print("enter the base:");
                                         int l = s.nextInt();
                                         System.out.print("enter the height:");
                                         int w = s.nextInt();
                                         int y = l * w;
                                         System.out.println("area of parallelogram  is:" + y);
                                     } else if (u.equals("rhombus")) {
                                         System.out.print("enter the diagonal1:");
                                         int B = s.nextInt();
                                     System.out.print("enter the diagonal2:");
                                     int h = s.nextInt();
                                     float base = 0.5f * B * h;
                                     System.out.println("area of rhombus  is:" + base);
                                     }
                                 } else if (u.equals("terminate")) {
                                 System.out.println("area operation terminated");
                                 break;
                                 }else {
                                 System.out.println("Error!! enter correct shape name..");
                                 }
                         }
                     } else if (S.equals("perimeter")) {
                         System.out.println("ENTER 'terminate' TO END THE AREA CALCULATION");
                         while (true){
                             System.out.print("enter the specific shape's perimeter which we want:");
                             String p = s.next();
                               if (p.equals("circle")||p.equals("triangle")||p.equals("parallelogram")||p.equals("rectangle")||p.equals("square")||p.equals("rhombus")) {
                                 if (p.equals("circle")) {
                                     System.out.print("enter the radius:");
                                     int R = s.nextInt();
                                     float area = (float) R * 2 * 3.14f;
                                     System.out.println("perimeter of circle is:" + area);
                                 } else if (p.equals("triangle")) {
                                     System.out.print("enter the side:");
                                     int B = s.nextInt();
                                     float base = 3*B;
                                     System.out.println("perimeter of equilateral triangle is:" + base);
                                 } else if (p.equals("rectangle")) {
                                     System.out.print("enter the length:");
                                     int l = s.nextInt();
                                     System.out.print("enter the width:");
                                     int w = s.nextInt();
                                     int y = 2*(l+w);
                                     System.out.println("perimeter of rectangle is:" + y);
                                 } else if (p.equals("parallelogram")) {
                                     System.out.print("enter the base:");
                                     int l = s.nextInt();
                                     System.out.print("enter the side:");
                                     int w = s.nextInt();
                                     int y = 2*(l+w);
                                     System.out.println("perimeter of parallelogram  is:" + y);
                                 } else if (p.equals("rhombus")) {
                                     System.out.print("enter the side:");
                                     int B = s.nextInt();
                                     float base = 4*B;
                                     System.out.println("perimeter of rhombus  is:" + base);
                                 }
                              } else if (p.equals("terminate")) {
                                 System.out.println("perimeter operation terminated");
                                 break;
                              }else {
                                 System.out.println("Error!! enter correct shape name..");
                              }
                         }
                     }else if (S.equals("volume")) {
                         System.out.println("ENTER 'terminate' TO END THE AREA CALCULATION");
                         while (true){
                             System.out.print("enter the specific shape's volume which we want:");
                             String v = s.next();
                               if (v.equals("cone")||v.equals("prism")||v.equals("cylinder")||v.equals("sphere")||v.equals("pyramid")) {
                                 if (v.equals("cone")) {
                                     System.out.print("enter the radius:");
                                     int R = s.nextInt();
                                     System.out.print("enter the height");
                                     int h = s.nextInt();
                                     float area = (float) R * R * 3.14f*h*((float) 1 /3);
                                     System.out.println("volume of cone is:" + area);
                                 } else if (v.equals("prism")) {
                                     System.out.print("enter the base area:");
                                     int B = s.nextInt();
                                     System.out.print("enter the height:");
                                     int h = s.nextInt();
                                     float base = B*h;
                                     System.out.println("volume of prism is:" + base);
                                 } else if (v.equals("cylinder")) {
                                     System.out.print("enter the radius:");
                                     int l = s.nextInt();
                                     System.out.print("enter the height:");
                                     int w = s.nextInt();
                                     float y = 3.14f*l*l*w;
                                     System.out.println("volume of cylinder is:" + y);
                                 } else if (v.equals("sphere")) {
                                     System.out.print("enter the radius:");
                                     int l = s.nextInt();
                                     float y =(( float)4/3)*3.14f*l*l*l;
                                     System.out.println("volume of sphere  is:" + y);
                                 } else if (v.equals("pyramid")) {
                                     System.out.print("enter the base area:");
                                     int B = s.nextInt();
                                     System.out.print("enter the height:");
                                     int h=s.nextInt();
                                     float y =(( float)1/3)*B*h;
                                     System.out.println("perimeter of rhombus  is:" + y);
                                 }
                               } else if (v.equals("terminate")) {
                                 System.out.println("perimeter operation terminated");
                                 break;
                               }else {
                                 System.out.println("Error!! enter correct shape name..");
                               }
                         }
                     }
                 }else if (S.equals("end")) {
                     System.out.println("operation ending......");
                     break;
                 }else {
                     System.out.println("error!!! please enter correct method");
                 }
            }
    }
}
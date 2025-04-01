/*
Class: CSE 1322L
Section: J03
Term: Fall 2021
Instructor: Yamini Hanisha Talluri
Name: Ryan Shah
Lab#: Lab 1
*/

public class Lab1 {
    public static void main(String[] args) {
        int i,j;

        char[][] pixel=new char[4][13];

        pixel=make_forward();

        for(i=0;i<4;i++){
            for(j=0;j<13;j++){
                System.out.print(pixel[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        char[][] p2 = new char[4][13];
        p2=make_mirror(pixel);

        for(i=0;i<4;i++){
            for(j=0;j<13;j++){
                System.out.print(p2[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for(i=0;i<4;i++){
            for(j=0;j<13;j++){
                System.out.print(pixel[i][j]);
            }
            for(j=0;j<13;j++){
                System.out.print(p2[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] make_mirror(char[][] pixel){
        char[][] p2=new char[4][13];
        int i,j,k;
        for(i=0;i<4;i++){
            for(k=0,j=12;j>=0;j--,k++){

                switch (pixel[i][k]) {
                    case '(':
                        p2[i][j]=')';
                        break;
                    case ')':
                        p2[i][j]='(';
                        break;
                    case '/':
                        p2[i][j]='\\';
                        break;
                    case '\\':
                        p2[i][j]='/';
                        break;
                    default:
                        p2[i][j]=pixel[i][k];
                        break;
                }

            }
        }

        return p2;
    }

    public static char[][] make_forward(){
        char[][] pixel=new char[4][13];
        int i,j;
        for(i=0;i<4;i++)
            for(j=0;j<13;j++){
                pixel[i][j]=' ';
            }
        for(i=2;i<8;i++)
            pixel[0][i]='_';
        pixel[1][1]='/';
        pixel[1][2]='|';
        pixel[1][3]='_';
        pixel[1][4]='|';
        pixel[1][5]='|';
        pixel[1][6]='_';
        pixel[1][7]='\\';
        pixel[1][8]='\'';
        pixel[1][9]='.';
        pixel[1][10]='_';
        pixel[1][11]='_';
        pixel[2][0]='(';
        pixel[2][4]='_';
        pixel[2][9]='_';
        pixel[2][11]='_';
        pixel[2][12]='\\';
        pixel[3][0]='=';
        pixel[3][1]='\'';
        pixel[3][2]='-';
        pixel[3][3]='(';
        pixel[3][4]='_';
        pixel[3][5]=')';
        pixel[3][6]='-';
        pixel[3][7]='-';
        pixel[3][8]='(';
        pixel[3][9]='_';
        pixel[3][10]=')';
        pixel[3][11]='-';
        pixel[3][12]='\'';
        return pixel;
    }
}

class HomePattern {
    public static void main(String[] args) {

        int rows = 8;
        int cols = 9;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if (i == 1 && j == 4) 
                   System.out.print("*");

                else if (i == 2 && (j == 3 || j == 5)) 
                    System.out.print("*");

                else if (i == 3 && (j == 2 || j == 6))
                     System.out.print("*");

                else if (i == 4 && (j >= 1 && j <= 7))
                    System.out.print("*");

                else if ((i == 5 || i == 6 || i == 7) && (j == 2 || j == 6))
                    System.out.print("*");


                else if (i == 8 && (j >= 2 && j <= 6))
                    System.out.print("*");

                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

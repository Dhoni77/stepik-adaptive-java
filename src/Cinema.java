import java.util.Scanner;

//The cinema has n rows, each consisting of m seats (n and m do not exceed 20). The two-dimensional matrix stores the information on the sold tickets, number 1 means that the ticket for this place is already sold, the number 0 means that the place is available. You want to buy k tickets to the neighbouring seats in the same row. Find whether it can be done.
//
//        Input data format
//
//        On the input, the program gets the numbers n and m. Next go n lines, each containing m numbers (0 or 1), separated by spaces. Next goes the number k.
//
//        Output data format
//
//        The program should output the row number in which there are k consecutive available seats. If there are several such rows, output the number of the smallest such row. If there is no such row, output the number 0.
//
//        Sample Input:
//
//        3 4
//        0 1 0 1
//        1 0 0 1
//        1 1 1 1
//        2
//        Sample Output:
//
//        2

public class Cinema {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int rows = scan.nextInt();
    int seatsInRow = scan.nextInt();
    int[][] matrix = new int[rows][seatsInRow];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < seatsInRow; j++) {
        matrix[i][j] = scan.nextInt();
      }
    }
    int seats = scan.nextInt();
    int counter = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < seatsInRow; j++) {
        if (matrix[i][j] == 0) {
          for (int k = 0; k < seats; k++) {
            if (j + k < seatsInRow && matrix[i][j + k] == 0) {
              counter++;
            } else {
              counter = 0;
              break;
            }
          }
          if (counter == seats) {
            System.out.println(i + 1);
            break;
          }
        }
        if (counter == seats) {
          break;
        }
      }
      if (counter == seats) {
        break;
      }
    }

    if (counter != seats) {
      System.out.println("0");
    }
  }
}

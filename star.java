// import java.util.*;
// class star patten{
//     public static void main(String[]args) {
//         int []arr=new arr[20];
//         int arr[0]=23;
//         int arr[1]=25;
//     for (int i=0;i<10;i++){
//         System.out.println(i);
//     }
//        }
// }


// star pattan
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=1;
//         for (int  i=1;i<=n;i++){
//             if(i%2==0){//1,
//                 k=2;
//             }
//                 else{
//                     k=1;
//                 }
//             for (int j=1;j<=i;j++){
//                 System.out.print(" *");
//                 k=k+2;
//             }
//             System.out.println();
            
//         }
        
//     }
// }


// star reverse patten

// Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int  i=n;i>=1;i--){
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
                
//             }
//             System.out.println();
            
//         }
        
//     }
// }



//       *
//     * *
//   * * *
//  this pattan
// Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int  i=1;i<=n;i++){
//             for (int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//                 for(int k=1;k<=i;k++){
//                     System.out.print("*");
//                 }
                
            
//             System.out.println();
            
//         }
        
//     }
// }

// 


// Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int  i=n;i>=1;i--){
//             for (int j=1;j<=n-i;j++){
//                 // System.out.print(" ");
//             }
//                 for(int k=1;k<=i;k++){
//                     System.out.print("*");
//                 }
                
            
//             System.out.println();
            
//         }
        
//     }
// }







// public class JavaExample {
//   public static void main(String[] args)
//   {

//     // Initializing the variable with the number at which
//     // the number of stars will be maximum. In this case, the
//     // stars will increase till 7th row, 7th row will have max
//     // stars and the stars will start decreasing after 7th row.
//     int numberOfRows = 6;

//     int i, j;

//     //This loop will print the first half of the diamond pattern
//     for (i = 1; i <= numberOfRows; i++) {

//       // This will print whitespaces, 6 spaces in first row
//       // 5 spaces in second row and so on
//       for (j = 1; j <= numberOfRows - i; j++) {
//         System.out.print(" ");
//       }

//       // This will print the stars after the whitespaces printed
//       // by above loop. It will print 1 star in first row, 3 in second
//       // 5 in third and so on
//       for (j = 1; j <= i * 2 - 1; j++) {
//         System.out.print("*");
//       }

//       // Move the cursor to new line after each row
//       System.out.println();
//     }

//     //This loop will print the second half of the diamond pattern
//     for (i = numberOfRows - 1; i > 0; i--) {

//       // This will print whitespaces in second half of triangle pattern
//       for (j = 1; j <= numberOfRows - i; j++) {
//         System.out.print(" ");
//       }

//       // This will print stars in second half of triangle pattern
//       for (j = 1; j <= i * 2 - 1; j++) {
//         System.out.print("*");
//       }

//       // Move the cursor to new line after each row
//       System.out.println();
//     }
//   }
// }


// freq interview problem


// import java.util.*;
// class oops{
//     public static void main(String args []){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for (int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int arr1[]=new int[n];
//         for (int i=0;i<n;i++){
//             arr1[i]=0;

//         }for(int i=0;i<n;i++){
//            int c=0;
//            if (arr1[i]==1){
//             continue;
//            }for(int j=0;j<n;j++){
//             if(arr[i]==arr[j]){
//                 arr1[j]=1;
//                 c++;

//             }
//            }System.out.println("count of"+arr[i]+"="+c);
//         }
//     }
// }



// import java.util.*;
// class star {
//     public static void main(String[]args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<=n;i++){
//           for (int j=0;j<i;j++){
//             System.out.print("*");
//           }System.out.println();
//     }
//     }
//         }


// import java.util.*;
// class star {
//     public static void main(String[]args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//           for (int j=0;j<n;j++){
//             if(i==0||i==3||j==0||j==3){
//               System.out.print("*");
//             }else{
//             System.out.print(" ");
//             }
//           }System.out.println();
//     }
//     }
// }



import java.util.*;
class star {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
          for (int j=1;j<=i;j++){

            System.out.print(" *");
            
          }System.out.println();
    }
    }
}

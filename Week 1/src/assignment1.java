import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        //2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello! My name is AssistantBot.\n");
        System.out.print("I was created in 2023\n");
        System.out.print("Please, remind me your name.\n");
        String name = scanner.next();
        System.out.print("What a great name you have, " + name + "!\n");
        System.out.print("Let me guess your age.\n");
        System.out.print("Say me remainders of dividing your age by 3, 5 and 7\n");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.print("Your age is "+ age +"; that's a good time to start programming!\n");
        System.out.print("Now I will prove to you that I can count to any number you want\n");
        int I = scanner.nextInt();
        for(int i = 0; i <= I; i++) {
            System.out.println(i + "!");
        }
        System.out.print("Let's test your programming knowledge.\n");
        System.out.print("Why do we use methods?\n\n");
        boolean a = true;
        while (a){
            System.out.print("1. To repeat a statement multiple times.\n");
            System.out.print("2. To decompose a program into several small subroutines.\n");
            System.out.print("3. To determine the execution time of a program.\n");
            System.out.print("4. To interrupt the execution of a program.\n");
            int Ans = scanner.nextInt();
            if (Ans == 2) {
                System.out.print("Congratulations, have a nice day!\n");
                a = false;
            }
            else{
                System.out.print("Wrong, try again!\n");
            }
        }
        //3
        int sum = 0;
        int num = scanner.nextInt();
        while(num != 0){
            sum += (num % 10);
            num/=10;
        }
        System.out.println(sum + " \n");
        //4
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        if(n1>n2 && n1>n3)
            System.out.println(n1 + " \n");
        else if (n2>n1 && n2>n3)
            System.out.println(n2 + " \n");
        else
            System.out.println(n3 + " \n");
        //5
        int year = scanner.nextInt();
        if (year > 1584 && ((year % 400 == 0) || (year %4 == 0 && year % 100 != 0)))
            System.out.println("YES\n");
        else
            System.out.println("NO\n");
        //6
        String[] TMPSs = scanner.nextLine().split(" ");
        String[] numbers1 = scanner.nextLine().split(" ");
        String[] numbers2 = scanner.nextLine().split(" ");
        int a1 = Integer.parseInt(numbers1[0]);
        int a2 = Integer.parseInt(numbers1[1]);
        int b1 = Integer.parseInt(numbers2[0]);
        int b2 = Integer.parseInt(numbers2[1]);
        if(a1%2==0 && a2%2==0 || b1%2==0 && b2%2==0)
            System.out.println("NO\n");
        else
            System.out.println("YES\n");
        //7
        int assdads = scanner.nextInt();
        String[] Tmp = scanner.nextLine().split(" ");
        String[] Nums = scanner.nextLine().split(" ");
        for (int i = Nums.length-1; i >= 0; i--) {
            System.out.print(Nums[i] + " ");
        }
        System.out.print("\n");
        //8
        int x = 0;
        int l = 0;
        String[] asdtmp = scanner.nextLine().split(" ");
        String[] Nums2 = scanner.nextLine().split(" ");
        for (int i = 0;i<Nums2.length; i++) {
            int X = Integer.parseInt(Nums2[i]);
            if (X>x) {
                x = X;
                l = i;
            }
        }
        System.out.print(x + " " + l + "\n");
        //9
        int li = 0;
        int L;
        int asds = scanner.nextInt();
        String[] Tmps = scanner.nextLine().split(" ");
        String[] Numbs2 = scanner.nextLine().split(" ");
        int xo = Integer.parseInt(Numbs2[0]);
        for (String s : Numbs2) {
            int X = Integer.parseInt(s);
            if (X < xo) {
                xo = X;
            }
        }
        L = xo;
        for (String s : Numbs2) {
            int X = Integer.parseInt(s);
            if (X == L) {
                li++;
            }
        }
        System.out.print(li + "\n");
        //10
        int N = scanner.nextInt();
        String[] Tmmp = scanner.nextLine().split(" ");
        String[] Nums3 = scanner.nextLine().split(" ");
        int[] Fin = new int[Nums3.length];
        for(int i = 0; i < N; i++){
            Fin[i*2] = Integer.parseInt(Nums3[i]);
        }

        for(int j = 1; j < N+1; j++) {
            Fin[(j*2)-1] = Integer.parseInt(Nums3[N+j-1]);
        }
        for (int j : Fin) {
            System.out.print(j + " ");
        }
    }
}


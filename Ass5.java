import java.util.*;

public class Ass5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of process: ");
        int n = sc.nextInt();
        int pid[] = new int[n];
        int ar[] = new int[n];
        int bt[] = new int[n];
        int ct[] = new int[n];
        int ta[] = new int[n];
        int wt[] = new int[n];
        int temp;
        float avgwt = 0, avgta = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("enter process " + (i + 1) + " arrival time: ");
            ar[i] = sc.nextInt();
            System.out.println("enter process " + (i + 1) + " brust time: ");
            bt[i] = sc.nextInt();
            pid[i] = i + 1;
        }

//sorting according to arrival times for(int i = 0 ; i <n; i++)
        {
            for (int j = 0; j < n - ( j + 1); j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;
                    temp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {

            } else {

                ct[i] = ar[i] + bt[i];


                if (ar[i] > ct[i - 1]) {

                } else {

                }

                ct[i] = ar[i] + bt[i];


                ct[i] = ct[i - 1] + bt[i];
                ta[i] = ct[i] - ar[i];
                wt[i] = ta[i] - bt[i];
                avgwt += wt[i];
                avgta += ta[i];
            }
            System.out.println("\npid arrival brust complete turn waiting");
            for (int k = 0; k < n; k++) {
                System.out.println(pid[k] + " \t " + ar[k] + "\t" + bt[k] + "\t" + ct[k] + "\t" + ta[k] + "\t" + wt[k]);
            }
            sc.close();
            System.out.println("\naverage waiting time: " + (avgwt / n));
            System.out.println("average turnaround time:" + (avgta / n));
        }
    }
}


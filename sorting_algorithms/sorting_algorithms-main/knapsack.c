#include<stdio.h>
int max(int x, int y) {
     if(x>y){
         return x;
    } else {
         return y;
    }
}
int knapsack(int W, int wt[], int val[], int n) {
     int i, w;
     int knap[n+1][W+1];
     for (i = 0; i <= n; i++) {
     for (w = 0; w <= W; w++) {
     if (i==0 || w==0)
         knap[i][w] = 0;
     else if (wt[i-1] <= w)
         knap[i][w] = max(val[i-1] + knap[i-1][w-wt[i-1]], knap[i-1][w]);
     else
         knap[i][w] = knap[i-1][w];
    }
 }
      return knap[n][W];
}
void main() {   
     int value[] = {60,100,120,20,80,70,90,50,40,110,130};
     int weight[] = {10,20,30,8,40,15,18,19,25,37,12};
     int W = 113,n=11;//113kg  n=no of parcels
     printf("\n**************Project***************\n");
     printf("Sonal Mishra sap id:1000013967\n");
     printf("Using 0/1 knapsack in Real life  application solving\n");
     printf("Total weight is: %d\n",W);
     printf("After selection of objects \n");
     printf("Total profit/cost value  : %d  ", knapsack(W, weight, value, n));
} 

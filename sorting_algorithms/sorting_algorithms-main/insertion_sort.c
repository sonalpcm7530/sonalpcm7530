#include<stdio.h>
void insertionsort(int *a,int n){
    int keys,j;
    for (int i = 1; i <= n-1; i++)
    {
        keys=a[i];
        j=i-1;
        while (j>=0 && a[j]>keys)
        {
            a[j+1]=a[j];
            j--;
            
        }
        a[j+1]=keys;

        
        
    }
    a[j+1]=keys;
    
    
}
void print(int *a,int n){
    for (int i = 0; i <n; i++)
    {
        printf(" elements: %d\n",a[i]);
    }
}
void main(){
    int a[]={23,56,89,44,3,34,45,1,90};
    int n=9;
   // print(a,n);
    insertionsort(a,n);
    print(a,n);
    
}
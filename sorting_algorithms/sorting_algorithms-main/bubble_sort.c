#include<stdio.h>
void bubblesort(int *a,int n){
    int temp;
    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0; j < n-1-i; j++)
        {
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        
    }
    
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
    bubblesort(a,n);
    print(a,n);
    
}
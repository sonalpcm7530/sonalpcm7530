#include<stdio.h>
void selectionsort(int *a,int n){
    for (int i = 0; i < n-1; i++)
    {
        int index=i;
        for (int j = i+1; j < n; j++)
        {
            if (a[j]>a[index])
            {
                index=j;
            }
            
        }
        int temp=a[i];
        a[i]=a[index];
        a[index]=temp;
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
    int n=a.length();
   // print(a,n);
    selectionsort(a,n);
    print(a,n);
    
}
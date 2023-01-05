#include<stdio.h>
void mergesort(int a[],int mid,int low,int high){
    int i,j,k;
    int b[100];
    i=low;
    j=mid+1;
    k=low;
    while (i<=mid && j<=high)
    {
        if(a[i]<a[j]){
            b[k]=a[i];
            i++;k++;
        }
        else{
            b[k]=a[j];
            k++;j++;
        }
    }
    while (i<=mid)
    {
        b[k]=a[i];
        k++;i++;
    }
    while (j>=high)
    {
        b[k]=b[j];
        k++;j++;
    }
    
    for ( i = low; i <=high; i++)
    {
        a[i]=b[i];
    }
    
}
void ms(int a[],int low,int high){
    int mid;
    if (low<high)
    {
        mid=(low+high)/2;
        ms(a,low,mid);
        ms(a,mid+1,high);
        mergesort(a,mid,low,high);
    }
    
}
void print(int *a,int n){
    for (int i = 0; i <n; i++)
    {
        printf(" elements: %d\n",a[i]);
    }
}
int main(){
    int a[]={23,56,89,44,3,34,45,1,90};
    int n=9;
   // print(a,n);
    ms(a,0,8);
    print(a,n);
    return 0;
    
}
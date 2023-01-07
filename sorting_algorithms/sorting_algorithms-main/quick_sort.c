#include<stdio.h>
int partition(int arr[],int low,int high){
    int pivot=arr[high];
    int i=low-1;
    for(int j=low;j<high;j++){
        if(arr[j]<=pivot){
            i++;
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    //swap arr[i+1] and arr[high]
   int  temp=arr[i+1];
    arr[i+1]=arr[high];
    arr[high]=temp;

    return (i+1);
}
void qucksort(int arr[],int low,int high){
    if(low<high){
        int pi=partition(arr,low,high);
        qucksort(arr,low,pi-1);
        qucksort(arr,pi+1,high);
    }
}
//print
void print(int arr[],int n){
    int i;
    for ( i = 0; i < n; i++)
    {
        printf("%d",arr[i]);
        printf("\n");
    }
    
}
int main(){ 

    int arr[]={12,11,99,67,34,98};
    int n=sizeof(arr)/sizeof(arr[0]);
   qucksort(arr,0,n-1);
   print(arr,n);

}
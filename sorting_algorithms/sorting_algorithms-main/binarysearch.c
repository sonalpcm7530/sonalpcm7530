#include<stdio.h>
int binary_search(int arr[],int i,int j,int x){
    if(j>=i){
        int mid=i+(j-i)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
            return binary_search(arr,i,mid-1,x);
        }
        if(arr[mid]<x){
            return binary_search(arr,mid+1,j,x);
        }
        return -1;
    }
}
void main() {
   int arr[100],i,n,x;
   printf("Sonal Mishra  Sap id:1000013967\n");
   printf("Enter  size : \n");
   scanf("%d", &n);
   printf("Enter %d elements: \n",n);
   for(i = 0; i < n; i++)
    scanf("%d", &arr[i]);
    printf("Enter element to search: \n");
    scanf("%d",&x);
    int val=binary_search(arr,0,n-1,x);
    if(val==-1){
        printf("Element is not present");
    }
    else{
        printf("Element present at %d",val);
    }
}

#include<stdio.h>
int main()
{
    int i,n,arr[50];
    printf("enter the number of element in the array:\n");
    scanf("%d",&n);
    printf("enter the array element:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        int rem,sum=0;
        while(arr[i] !=0)
        {
            rem=arr[i]%10;
            sum+=rem;
            arr[i]=arr[i]/10;
        }
        if(i==n-1)
            printf("%d",sum);
        else
            printf("%d,",sum);
    }
    return 0;
}
#include <stdio.h>

int temp[100],array[100];

int marge_sort(int low, int high)
{
    if(low==high)
    {
        return;
    }

    int mid = (high + low)/2;

    marge_sort(low,mid); ///divide the left side

    marge_sort(mid+1,high);///divide the right side

  int i,j,k;

  for(i=low,j=mid+1,k=low;k<=high;k++)///compare and save all value to an other array
  {
      if(i==mid+1)
      {
          temp[k]=array[j++];
      }
      else if(j==high+1)
      {
          temp[k]=array[i++];
      }
      else if(array[i]<array[j])
      {
         temp[k]=array[i++];
      }
      else
        {
           temp[k]=array[j++];
        }
  }

  for(i=low;i<=high;i++)///replace temp array to the main array
  {
      array[i]=temp[i];
  }

}

int main()
{

    int i,n;

    printf("Please Enter Array Size: ");
    scanf("%d",&n);

    printf("Please Enter Array Element: \n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&array[i]);
    }

    int high=n-1,low=0;

    marge_sort(low,high);

    printf("Your Sorted Array: \n");
    for(i=0; i<n; i++)
    {
        printf("%d ",array[i]);
    }printf("\n");

    return 0;
}

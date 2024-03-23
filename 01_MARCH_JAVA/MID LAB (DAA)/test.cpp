#include<bits/stdc++.h>
using namespace std ;
int partition (vector<int>& vec, int low ,int high){
  int pivot = vec[low];
  int i = low;
  int j = high;
  while(i<j){
    while(vec[i]<= pivot && i<= high-1){
    i++;
    }
    while(vec[i] >= pivot && j>= low+1){
      j--;
    }
    if(i<j){
      swap(vec[i] , vec[j]);
    }
  }
  swap(vec[low] , vec[j]);
  return j;
}
void quick_sort(vector<int>& vec , int low,int high){
  if(low < high){
    int pivot_index= partition(vec, low , high);
    quick_sort(vec, low ,pivot_index-1);
    quick_sort(vec, pivot_index+1, high);
  }
}
int main(){
  int n ;
  cin>>n;
  vector<int>vec(n);
  for(int i=0;i<n;i++){
    cin>>vec[i];
  }
  quick_sort(vec,0,n-1);
  for(int i=0;i< n;i++){
    cout<<vec[i]<<" ";
  }
}
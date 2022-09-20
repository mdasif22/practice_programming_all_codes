package G4G;

class pair  
{  
   long first, second;  
   public pair(long first, long second)  
   {  
       this.first = first;  
       this.second = second;  
   }  
} 

class min_max 
{
    static pair getMinMax(long a[], long n)  
    {
       long min = a[0];
       long max = a[0];
       for(int i=0;i<n;i++){
           if(a[i]<min){
               min=a[i];
           }
           else if(a[i]>max){
               max=a[i];
           }
       }
    return new pair(min,max);
    }
}
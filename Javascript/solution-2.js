var fib1 = 0, fib2 = 1, fib3 = 1;
var sum=0;
   while (fib1 + fib2 < 4000000)
   {
       fib3 = fib1 + fib2;
       if(fib3%2==0){
         sum=sum+fib3;
       }
       fib1 = fib2;
       fib2 = fib3;
    
   }
console.log(sum);

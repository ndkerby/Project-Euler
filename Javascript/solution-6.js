function sqr_sum(){
  var i=0, sum1=0;
  
  for(i=1;i<=100;i++){
    sum1=sum1+(i*i);

  }

  return sum1;
}    

function sum_sqr(){
  var i=0,sum2=0,sum_t=0;
  for(i=1;i<=100;i++){
    sum_t=sum_t+i;
  }
  sum2=sum_t*sum_t;
  return sum2;
}

var a=sqr_sum()
var b=sum_sqr()
console.log(b-a);


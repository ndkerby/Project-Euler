var num = 200;
var i, m, flag;
flag = 0;
var sum = 0;
var j = 1;
for (i = 2; i <= num; i++) {
	for (j = 2; j <= Math.sqrt(i); j++) {
		if (i % j == 0) {
			flag = 1;
			console.log('not prime', i);
			//break;
		}
	}
	if (flag == 0) {
		sum = sum + i;
		console.log('P_no', i);
	}
}
console.log(sum);



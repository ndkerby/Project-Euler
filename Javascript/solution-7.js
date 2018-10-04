var a, div, i, flag;
var arr = [];
for (a = 2; a <= 10001; a++) {
	div = a / 2;
	for (i = 2; i < div; i++) {
		if (i % div == 0) {
			flag = 1;
			continue;
		}
		if (flag == 0) {
			arr.push(i);
		}
	}
	console.log(i);
}
console.log(arr);

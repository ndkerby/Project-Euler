var num = 600851475143;
var div = 2,
	ans = 0,
	maxFact;
while (num != 0) {
	if (num % div != 0) div = div + 1;
	else {
		maxFact = num;
		num = num / div;

		if (num == 1) {
			console.log('%d is the largest prime factor !', maxFact);
			ans = 1;
			break;
		}
	}
}

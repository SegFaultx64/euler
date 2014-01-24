-- The prime factors of 13195 are 5, 7, 13 and 29.

-- What is the largest prime factor of the number 600851475143 ?

function factors( n )
	t = {}
	for i=math.floor(math.sqrt(n)),1,-1 do
		if n % i == 0 then
			table.insert(t, i)
		end
	end
	return t
end

function isPrime( n )
	return #factors(n) == 1
end

for i,v in ipairs(factors(600851475143)) do
	if (isPrime(v)) then
		print(v)
		break
	end
end

sum = 0
n1 = 0
n2 =1
n3 = 0
while n3 <= 4000000
  n3 = n1+n2
  if n3%2 == 0
    sum = sum +n3
  end

  n1=n2
  n2=n3 
end

puts sum
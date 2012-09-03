#Add all the natural numbers below one thousand that are multiples of 3 or 5.

sum = 0;
for i in 1..999
  if i%3 == 0 or i%5 ==0
    sum =sum+i
  end 
end
puts sum

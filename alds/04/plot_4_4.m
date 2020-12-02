
clc
close all
clear

e = 2.7182818284590452
k = 2:1:12
p = (1- e.^(-100*k/1000)).^k .* 100

figure
plot(k, p, 'linestyle','none', 'marker', '+')
xlim([1 13])
xlabel('k')
ylabel('p')
use costomer;
select count(distinct id) from customer.customer_data;
select count(distinct name), count(distinct address), count(distinct mobile) from customer.customer_data;

-- distinct - By using the DISTINCT keyword in a function called COUNT, we can return the number of different objects.


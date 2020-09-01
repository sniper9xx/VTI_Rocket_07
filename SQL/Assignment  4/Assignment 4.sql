Use classicmodels;
SELECT * from orders; -- shippeddate, ordernumber
select * from payments;  -- amount
select * from orderdetails; -- priceEach
select * from products;
select * from customers;
select * from productlines;

-- Câu 1: Tính tổng giá trị của các order đã xuất kho (‘shipped’) trong tháng Tám năm 2004 ?
select sum(priceeach * quantityordered) as tong from orderdetails as od
join orders o  on od.ordernumber = o.ordernumber
where '2004-08-01 '<= shippeddate <= '2004-08-31' and `status` = 'shipped';

/* Câu 2: Tính lợi nhuận (profit) thu được từ mỗi khách hàng dựa trên các orders mà họ thực hiện. Liệt kê theo tên khách hàng ?
 Bước 1: thống kê lợi nhuận của mỗi order
 Bước 2: join customer với order
*/
select c.customername, ifnull(sum(od.priceeach*od.quantityordered - p.buyprice *od.quantityordered),0) as tong_tien
from customers c
left join orders o 				on c.customernumber = o.customernumber
left join orderdetails od 		on o.ordernumber = od.ordernumber
left join products p 			on od.productcode = p.productcode
GROUP BY c.customername
ORDER BY c.customername;

-- Câu 3: Tính doanh thu (revenue) mà mỗi sản phẩm mang lại. Liệt kê theo tên sản phẩm.
select p.productcode,p.productName, sum(od.priceeach*od.quantityordered) as doanh_thu 
from orderdetails as od
join products as p on  od.productcode = p.productcode
GROUP BY productname
order by productcode;












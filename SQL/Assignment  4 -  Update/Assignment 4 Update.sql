Use classicmodels;
SELECT * FROM orders; -- shippeddate, ordernumber
select * FROM payments;  -- amount
select * FROM orderdetails; -- priceEach
select * FROM products;
select * FROM customers;
select * FROM productlines;

-- Câu 1: Tính tổng giá trị của các order đã xuất kho (‘shipped’) trong tháng Tám năm 2004 ?
SELECT 		sum(priceeach * quantityordered) AS tong 
FROM 		orderdetails OD
JOIN 		orders O ON OD.ordernumber = O.ordernumber
WHERE 		'2004-08-01 '<= shippeddate <= '2004-08-31' AND`status` = 'shipped';

-- Câu 2:Tính lợi nhuận (profit) thu được từ mỗi khách hàng dựa trên các orders mà họ thực hiện. Liệt kê theo tên khách hàng ?
SELECT C.customername, ifnull(sum(OD.priceeach*OD.quantityordered - P.buyprice *OD.quantityordered),0) AS profit
FROM customers C
LEFT JOIN 	orders O 			ON 	C.customernumber = O.customernumber
LEFT JOIN 	orderdetails OD		ON 	O.ordernumber = OD.ordernumber
LEFT JOIN 	products P			ON 	OD.productcode = P.productcode
GROUP BY 	C.customername
ORDER BY 	C.customername;

-- Câu 3: Tính doanh thu (revenue) mà mỗi sản phẩm mang lại. Liệt kê theo tên sản phẩm.
SELECT 		P.productcode,P.productName, sum(OD.priceeach *	OD.quantityordered) AS revenue
FROM 		orderdetails  OD
JOIN 		products P ON  OD.productcode = P.productcode
GROUP BY	productname
ORDER BY 	productname;

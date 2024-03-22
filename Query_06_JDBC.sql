USE _01_jdbc_lovelace;

select * FROM coder;
DELETE FROM coder WHERE name like "%da%" limit 2;

INSERT coder (name, age, clan) VALUES ("Ayda", 18, "Lovelace"), ("Darwing", 23, "Lovelace");
 
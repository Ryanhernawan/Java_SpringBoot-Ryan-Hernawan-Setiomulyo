## 27 Spring Security
## Resume
## beberapa hal yang saya pelajari dalam materi kali ini
1. Beberapa dependency yang harus disiapkan sebelum membuat projek Spring Security di springboot
- Spring web
- Spring security
- Spring Data JPA
- Database driver(Postgre Sql, MySql dan lainnya)
- Lombok 
- JJWT Dependency

2. Cara untuk configuration Datasource 
- tambahkan artibute di application.properties dan disesuaikan dengan mySQL yang digunakan
    - spring.datasource.url
    -spring.datasource.username
    -spring.datasource.password
    
    -spring.jpa.show-sql=true
    -spring.jpa.hibernate.ddl-auto=update
    
3. Untuk membuat sebuah json web token kita perlu membuat entity class user hal tersebut berfungsi untuk menyimpan data dari user. 
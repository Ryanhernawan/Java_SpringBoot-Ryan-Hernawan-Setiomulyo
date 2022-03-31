## 26 Jpa No Sql
## Resume
## Beberapa Hal yang saya pelajari dalam materi kali ini
1. Konfigurasi awal untuk menggunakan database no sql mongoDB
- dalam file application.properties masukan attribute seperti :
spring.data.mongodb.host=localhost
spring.data.mongodb.port = {port yang digunakan}
spring.data.mongodb.database= {nama database}
spring.data.mongodb.username= root
spring.data.mongodb.password= {password}

2. Membuat model dalam No Sql 
- dengan menggunakan anotation @Document("nama_class")

3. Membuat Repository dalam database No Sql
- dengan membuat interface yang lalu di extends ke MongoRepository<Model, Tipe data identitity di class model tersebut>


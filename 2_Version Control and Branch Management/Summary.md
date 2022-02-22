## 2 Version Control and Branch Management
## Resume
Dalam materi kali ini hal-hal yang dipelajari seperti :
1. Pengenalan Git 
2. Fungsi dari Git
3. Cara install dan setting Git
4. Cara kerja Git dan github
5. Cara Membuat repository di Github
6. Menyambungkan antara git dengan local file 
7. Mengenal Perintah-perintah yang berada pada Git
## Apa itu Git
Git Merupakan salah satu sistem pengontrol versi (Version Control System) pada proyek perangkat lunak. Git juga sebagai pengontrol versi bertugas mencatat setiap perubahan pada file proyek yang dikerjakan oleh banyak orang maupun sendiri.
## Fungsi Dari Git
Git berfugsi untuk mengatur atau atau mencatat dari setiap perubahan yang terjadi pada file yang sedang dikerjakan oleh orang banyak ataupun individual. Degan adanya Git mempermudah developer untuk mengembangkan suatu software secara bersama-sama
## Cara Kerja Git
Dengan menyambungkan Projek yang berada pada local file kita kedalam github melalui git sehingga project tersebut dapat dikembangakan lebih mudah secara bersama-sama
## Beberapa Perintah - Perintah yang ada pada Git
1. Git init 
2. Git Remote
3. Git add
4. Git Commit
5. Git Push
6. Git Pull 
7. Git Stash
8. Git Merge dan lainnya
## Task
1. Buatlah Repository = link repository https://github.com/Ryanhernawan/Java_SpringBoot-Ryan-Hernawan-Setiomulyo
2. Implementasi Branching yang terdiri dari master, development, FeatureA, FeatureB =
    - Branching Development = git checkout -b development
    - Branching FeatureA = git checkout -b featureA
    - Branching featureB = git checkout -b featureB

3. Implementasi Push, Pull, Stash dan Merge = 
    - Push = Git push origin master
    - Pull = Git pull origin master
    - Stash = git stash -> git stash apply
    - Merge =step 1 git checkout (Branch yang ingin di merge)
        - step 2 git merge (Branch yang ingin digabungkan)
        - contoh -> git checkout master git merge featureA

4. Implementasi Sebuah Penanganan Conflict di Branch =
   - Jika terjadi sebuah konflik yang berada pada branch yang bisa terjadi karena kedua Branch
    mengerjakan di file dan line code yang sama dapat dengan mengimplementasikan git stash 
    lalu dilakukan git apply kembali. Lalu jika terdapat pop-up message code yang ada pada 
    line yang sama maka kita dapat melalakukan klik pada bagian "Accept Both Changes"

5. Merge No Fast Forward
implementasi merge no fast foward dengan cara :
- git merge --no--ff (nama branch yang ingin dimerge)
contoh :
- git merge --no--ff featrueB





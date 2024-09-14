# ИТОГОВАЯ КОНТРОЛЬНАЯ РАБОТА ПО БЛОУ СПЕЦИАЛИЗАЦИЯ

Задания

### Часть 1. Linux

1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).

Решение задания:

* Создаем файл Pets и записываем Dogs, Cats, Hamsters

  db@db-VirtualBox:~/controlwork$ cat > Pets

  Dogs

  Cats

  Hamsters

* Создаем файл Pack animals и записываем Horses, Camels, Donkeys

  db@db-VirtualBox:~/controlwork$ cat > 'Pack animals'

  Horses

  Camels

  Donkeys

* Объединяем файлы Pets и Pack animals в единый файл Animals

  db@db-VirtualBox:~/controlwork$ cat 'Pets' 'Pack animals' > Animals

* Просматриваем файлы в рабочей директории

  db@db-VirtualBox:~/controlwork$ ls
 
  Animals  'Pack animals'   Pets

* Открываем в редакторе nano файл Animals и просматриваем его

  db@db-VirtualBox:~/controlwork$ nano Animals

  ![Файл Animals в редакторе nano](/Linux%20commands/nano%20animals.PNG)

* Переименовываем файл Animals в Human friends

  db@db-VirtualBox:~/controlwork$ mv Animals 'Human friends'

* Просматриваем файлы в рабочей директории

  db@db-VirtualBox:~/controlwork$ ls

  'Human friends'  'Pack animals'   Pets

2. Создать директорию, переместить файл туда.

Решение задания:

* Создаём директорию Animals directory

  db@db-VirtualBox:~/controlwork$ mkdir 'Animals directory'

* Переносим файл Human friends в Animals directory

  db@db-VirtualBox:~/controlwork$ mv 'Human friends' 'Animals directory'/

* Просматриваем файлы в рабочей директории
db@db-VirtualBox:~/controlwork$ ls

  'Animals directory'  'Pack animals'   Pets

* Переходим в директорию Animals directory

  db@db-VirtualBox:~/controlwork$ cd 'Animals directory'

* Просматриваем все файлы в Animals directory

  db@db-VirtualBox:~/controlwork/Animals directory$ ls

  'Human friends'

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.

Решение задания:

* Скачиваем файл deb MySQL для Linux Ubuntu

  db@db-VirtualBox:~$ wget https://dev.mysql.com/get/mysql-apt-config_0.8.32-1_all.deb

* Переходим в root режим

  db@db-VirtualBox:~$ sudo su

* Устанавливаем deb пакет mysql

  root@db-VirtualBox:/home/db# dpkg -i mysql-apt-config_0.8.32-1_all.deb

* Обновляем информацию о пакетах

  root@db-VirtualBox:/home/db# sudo apt-get update

  (Get:9 http://repo.mysql.com/apt/ubuntu noble/mysql-8.0 Sources [961 B]
  
  Get:10 http://repo.mysql.com/apt/ubuntu noble/mysql-8.0 amd64 Packages [12.7 kB]
  )

* Устанавливаем MySQL сервер
  
  root@db-VirtualBox:/home/db# apt-get install mysql-server

* Проверяем статус MySQL сервера

  root@db-VirtualBox:/home/db# systemctl status mysql  
  
  Sep 14 14:07:03 db-VirtualBox systemd[1]: Starting mysql.service - MySQL Community Server...
  
  Sep 14 14:07:04 db-VirtualBox systemd[1]: Started mysql.service - MySQL Community Server.

4. Установить и удалить deb-пакет с помощью dpkg.

Решение задания:

* Скачиваем файл deb linux-firmware для Linux Ubuntu

  db@db-VirtualBox:~$ wget http://archive.ubuntu.com/ubuntu/pool/main/l/linux-firmware/linux-firmware_20240318.git3b128b60-0ubuntu2.3_amd64.deb

* Переходим в root режим

  db@db-VirtualBox:~$ sudo su

* Устанавливаем deb пакет linux-firmware

  root@db-VirtualBox:/home/db# dpkg -i linux-firmware_20240318.git3b128b60-0ubuntu2.3_amd64.deb

* Удаляем deb пакет linux-firmware

  root@db-VirtualBox:/home/db# dpkg -r linux-firmware

5. Выложить историю команд в терминале ubuntu

Решение задания:

* Выводим историю программ через команду history

root@db-VirtualBox:/home/db# history

  208  ls

  209  cd .

  210  cd

  211  ls

  212  exit

  213  ls

  214  dpkg -i mysql-apt-config_0.8.32-1_all.deb

  215  sudo apt-get update

  216  sudo apt-get install mysql-server

  217  systemctl status mysql

  218  sudo apt-get install mysql-server

  219  systemctl status mysql

  220  dpkg - i linux-firmware_20240318.git3b128b60-0ubuntu2.3_amd64.deb

  221  dpkg -i linux-firmware_20240318.git3b128b60-0ubuntu2.3_amd64.deb

  222  sudo dpkg -r linux-firmware_2024031
  
  223  sudo dpkg -r linux-firmware_20240318.git3b128b60-0ubuntu2.3_amd64

  224  sudo dpkg -r linux-firmware

  225  get-update

  226  apt-get update

  227  history

### Часть 2. Схема классов

6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).

Решение задания:

* Рисуем схему классов с помощью сервиса https://www.drawio.com

  ![Схема классов](/Schemes/animals.drawio.png)

# iot-firmware-mgmt
The codebase is dedicated to managing  firmware in the iot platform

### Database

Execute the following SQLs in your MySQL database.

```sql
create DATABASE iot_firmware CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

create USER 'iot_firmware'@'%' IDENTIFIED BY '8a4b041e';

grant all privileges on iot_firmware.* TO 'iot_firmware'@'%';

FLUSH PRIVILEGES;
```
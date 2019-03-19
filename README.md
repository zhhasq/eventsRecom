# TicketMaster with recommendations

**Demo: click to view Youtube**</br>
[![](http://img.youtube.com/vi/cIJlQOTnPCE/0.jpg)](https://youtu.be/cIJlQOTnPCE "")

**Demo: click to view Youku**</br>
[![](http://img.youtube.com/vi/cIJlQOTnPCE/0.jpg)](http://player.youku.com/embed/XNDA5MzkwNzQ4OA== "")

**ER diagram**
![alt text](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/b45af7a8-0c27-4c0e-ab3f-5f518f3511e4/_2019-03-19_16.11.01.png?AWSAccessKeyId=ASIAT73L2G45ORJYZ2PK&Expires=1553119879&Signature=eRaewrVY6mGaUig9cXEh4Dmdibc%3D&response-content-disposition=filename%20%3D%22_2019-03-19_16.11.01.png%22&x-amz-security-token=FQoGZXIvYXdzELf%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDI%2B%2FKPQ0Q9Nwkn7GFCK3A%2FADW91g1EDrN19Zd2WBIRBeeYokb5ceaOZBK1KCL78qU%2FRhG8dYQmnB5OD9QDxJE2hAdfAbQa3oAgUkviSdZ6COKMxKVRJ8PntiEMZreG3BNaMbQq1Wlo6SRUsZCvOtQKMiZzZrzu40%2FCsGiNdL5Pw3oihrDHGSEj1tVwepPK%2F%2Fu0aXTdTDYwGRaY7LPjFqSSNONjFxODs4CKZuWh1VbyT4N7rcDIi8IxaCLYZ7EDIcxqZv23Foe%2FSxAmJ2L28rLrcuEUMGoGNLmrHqWkkBBfgGMTP32bedPSrzpvqci7Wmu1M5hPEV2dljLLmpZvaY%2FWnes%2BBogl88hbvUj25bgTIYd4jE%2BmiKkSE91pymMep4d7FpE2UWMAi1yYxUUh2tPc566lE7je0IrriKGGTbE2gvcElEIo%2B6PZkKO7f6LZrHn806wUuYQiit%2BzflTBo0VUO8YTx0qdeB%2FQ3OpkRLQ4WK%2FjTtXvBiSSrr81Ebw57vTa2B1Kj8TWmj6vrnJi4MHBLBrSDCZytsCJN6mdyhBPCK8SoSAAEw8PZP7sqYahPxzOR8SLqYOpEq73wKPN%2FnsxjrKWIPj3wosr3F5AU%3D)


**schema**</br>
User(user_id, password, first_name, last_name); primary_key: user_id; </br>
Item(item_id, name, rating, address, image_url, url, distance); primary_key: item_id; </br>
Like(user_id, item_id, fovor_time); primary_key: user_id, item_id. Foreign_key: user_id, item_id; </br>
Category(item_id, category); primary_key: item_id, category. Foreign_key: item_id; </br>



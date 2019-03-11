# TicketMaster with recommendations

**Demo: click to view Youtube**</br>
[![](http://img.youtube.com/vi/cIJlQOTnPCE/0.jpg)](http://www.youtube.com/watch?v=cIJlQOTnPCE "")

**Demo: click to view Youku**</br>
[![](http://img.youtube.com/vi/cIJlQOTnPCE/0.jpg)](http://player.youku.com/embed/XNDA5MzkwNzQ4OA== "")

**ER diagram**
![alt text](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e3762d92-bf3e-4873-b0d8-7cedbcba4dd6/Image-1.jpg?AWSAccessKeyId=ASIAT73L2G45NFVZU4GB&Expires=1552414066&Signature=ItaYoFoVqj8uQvJ6r8C0q2oBcjI%3D&response-content-disposition=filename%20%3D%22Image-1.jpg%22&x-amz-security-token=FQoGZXIvYXdzEO7%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDHrftlyRjJqYdihRbiK3A1dupQwVLIySSXxlheIkvZNvGjQNa3L56JZTOdF7d29ASMSLE57wgQ7X5gueY6Y5VwwtvDP%2Fb1EAevG507m5WbgWqVlOX0Zj4%2FNc7ny1D7mr4Q1j55AIkhuMfIZmtmPDCIjPbi2Q5fl9IlWWz75AqSYZKoaDwngWs0vny%2FZMQzrBwtjrx1R0Aa2ETmu6ObTxqVzS5l4CEiZk%2BIETvSYzGXQpVvHVnJBLUNvaF%2BgkhV6Rroa4%2B3LSZlPXzcR2Z1CNXD5OJQbyvy9d1YQPBAdIt9sJ1nqVY%2BxMEQL1IaI5E%2BhEvfsgDprNL2oDg6a6BBMtli74WxSNXV1%2B2I%2B7tONDjlXo0k3GjWNzGKs1CTceER7icyAqP2UrHITG5SjgzVau%2BIkkZKXTbWOfl2Dt4%2F9KkY4uaftRyNpANJKR0EJ1CseJJlReDtl0oJJhFZVLYoxr5ec2hgxAriBdgVFwCVhljt6PLTrhvQLNLoDibxqGhRMga6y8c%2FTzV1zs581FfSEFVf9%2FPUABLrsonKYcHuyr%2ByGxXLuAiuSylfl%2BXWgmCeJIRjQ7skx01o%2BFQSOvBk%2BFlMmcJ8H8%2F7co8K6Z5AU%3D)


**schema**</br>
User(user_id, password, first_name, last_name); primary_key: user_id; </br>
Item(item_id, name, rating, address, image_url, url, distance); primary_key: item_id; </br>
Like(user_id, item_id, fovor_time); primary_key: user_id, item_id. Foreign_key: user_id, item_id; </br>
Category(item_id, category); primary_key: item_id, category. Foreign_key: item_id; </br>



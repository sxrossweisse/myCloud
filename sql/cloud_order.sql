create table mycloud.cloud_order
(
  id       bigint      not null comment '订单id'
    primary key,
  order_no varchar(64) not null comment '订单流水号'
)
  comment '订单表' charset = utf8mb4;


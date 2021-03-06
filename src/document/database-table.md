# 数据库表设计

## 1. 物料管理

### 1.1. 物料
 - 自增ID
 - 物料名称
 - 物料编号
 - 物料成分
 - 物料单价
 - 单位
 - 类型（面料/辅料）
 - 入库时间
 - 颜色说明
 - 门幅
 - 出量
 - 外关联：供应商编号
 - 仓储位置
 - 库存数量

### 1.2. 供应商
 - 自增ID
 - 供应商编号
 - 供应商名称
 - 供应商电话
 - 供应商手机
 - 地址
 - 供应商等级

## 2. 库存管理

### 2.1. 库存调度记录
 - 自增ID
 - 外关联：物料编号
 - 调度类型（入库/出库）
 - 调度数量
 - 调度时间
 - 外关联：负责人（用户ID）

## 3. 客户管理

### 3.1. 客户
 - 自增ID
 - 品牌名
 - 类型
 - 主联系人
 - 电话
 - 邮箱
 - 状态

## 4. 系统管理

### 4.1. 用户管理
 - 自增ID
 - 账号
 - 姓名
 - 手机号码
 - E-mail
 - 微信号
 - 公司名称
 - 外关联：部门
 - 地址

### 4.2. 组织管理
 - 自增ID
 - 部门名称
 - 部门编码
 - 英文名称
 - 简称
 - 电话
 - 简要描述

## 5. 款式管理

### 5.1 款式表
 - 自增id
 - 款式编号
 - 款式图片链接
 - 创建时间
 - 款式描述
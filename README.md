# algorithm/algorithm

## Getting Started

Download links:

SSH clone URL: ssh://git@git.jetbrains.space/liangb/algorithm/algorithm.git

HTTPS clone URL: https://git.jetbrains.space/liangb/algorithm/algorithm.git

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

## Prerequisites

What things you need to install the software and how to install them.

```
Examples
```

## Deployment

Add additional notes about how to deploy this on a production system.

## Resources

Add links to external resources for this project, such as CI server, bug tracker, etc.

## 算法

### 什么是算法

- 有具体的问题
- 有设计解决这个问题的具体流程
- 有评价处理流程的可量化指标

### 算法的分类

- 分类当然非常多
- 对于新手学习特别重要的一个分类：
  - 明确知道怎么算的流程
  - 明确知道怎么试的流程

### 数据结构

大致分为两种： 连续结构（线性）， 跳转结构（非线性）

- 数据结构是存储、组织数据的方式
- 精心选择的数据结构可以带来更高的运行或者存储效率
- 数据结构是很多算法得以进行的载体

### 最基本的数据结构

- 数组
  - 便于寻址，不便于增删数据
- 链表
  - 便于增删数据，不便于寻址

### Math.random()函数

`Math.random() 函数的返回值是  [0,1) 的随机数， 并且每个数出现的概率相同`

- 0 ~ a 区间的所有数 出现的概率和在  [0, 1) 为  a,  `例： 0~0.3 的概率为0。3` ， 那么0~ a平方出现的概率为 0~a平方

### 对数器

1. 有一个你想要测的方法a;
2. 实现一个绝对正确但是复杂度不好的方法b
3. 实现一个随机样本产生器
4. 实现对比算法a和b的方法
5. 把方法a和方法b比对多次来验证方法a是否正确
6. 如果有一个样本使得比对出错，打印样本分析是哪个方法出错
7. 当样本数量很多时比对测试依然正确，可以确定方法a已经正确


### 二分查找

#抽象工厂模式

###Provide an interface for creating families of related or dependent objects without specifying their concrete classes
###提供用于创建相关或互相依赖对象系列的接口，而不指定其具体类

###抽象工厂包含四个角色   抽象产品（Shape、Color）、具体产品（Round、Rectangle、Red、Green）、抽象工厂（AbstractFactory）、具体工厂（ShapeFactory、ColorFactory）

###在这里，具体产品实现了抽象产品接口；具体工厂实现了抽象工厂接口

###通过FactoryProuducer来获得一个具体的工厂，然后使用这个工厂来生成这一类产品，如：通过ShapeFactory可以生成Round和Rectangle这一类产品，他们同属于Shape的子产品
package com.liu.com.liu.sales

open class Customer(var name: String, var price: Int){
    open var off=0.1f
    fun backmoney()=(price/1000)*off*1000
    open fun print(){
        if (price>=1000)
        println("$name\t$price\t${price-backmoney()}")
        else
            println("$name\t$price\t\t$price")
    }
}
open class SilverCustomer(name: String, price: Int):Customer(name, price){
    override fun print(){
        if (price>=1000)
            println("$name\t$price\t${price-backmoney()}\t${backmoney()}")
        else
            println("$name\t$price\t$price")
    }
}
class GoldenCustomer(name: String,price: Int):SilverCustomer(name,price){
    override var off=0.2f
    override fun print(){
        if (price>=1000)
            println("$name\t$price\t${price-backmoney()}\t${backmoney()}")
        else
            println("$name\t$price\t$price")
    }
}

fun main(){
    val cus1=Customer("001",1500);
    cus1.print()
    val cus2=Customer("002",500)
    cus2.print()
    val cus3=SilverCustomer("003",1500)
    cus3.print()
    val cus4=GoldenCustomer("004",5000)
    cus4.print()
}
package com.driver;

public class Pizza {

    private int cheesePrice;
    private int  toppingPrice;
    private int  totalPrice;
    private int paperBagprice;
    private boolean isToppingadded;
    private boolean ischeeseAddres;
    private boolean isPaperBagadded;
    private boolean isBillgenrated;
    private int basePrice;

    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true)
        {
            basePrice=300;
            toppingPrice=70;
        }
        else{
            basePrice=400;
            toppingPrice=120;
                    }
cheesePrice=80;
paperBagprice=20;
   // your code goes here
   totalPrice=basePrice;
    bill="Base Price Of The Pizza:"+basePrice+"\n";
    }


    public int getPrice(){


        return this.totalPrice;
    }

    public void addExtraCheese(){

if(ischeeseAddres==false)
{
    totalPrice=totalPrice+cheesePrice;
    ischeeseAddres=true;

}

        // your code goes here
    }

    public void addExtraToppings(){

if(isToppingadded==false)
{
    totalPrice=totalPrice+toppingPrice;
    isToppingadded=true;
}
        // your code goes here
    }


    public void addTakeaway(){
if(!isPaperBagadded)
{
    isPaperBagadded=true;
    totalPrice=totalPrice+paperBagprice;
}



        // your code goes here
    }



    public String getBill(){
   if (!isBillgenrated) {
        isBillgenrated = true;
        bill = "Base Price Of The Pizza: " + basePrice + "\n";
        if (ischeeseAddres)
            bill += "Extra Cheese Added: " + cheesePrice + "\n";
        if (isToppingadded)
            bill += "Extra Toppings Added: " + toppingPrice + "\n";
        if (isPaperBagadded)
            bill += "Paperbag Added: " + paperBagprice + "\n";
        bill += "Total Price: " + totalPrice + "\n";
    }
    return this.bill;
}

// ... other methods
}


package questions.VendingMachine.entities;

public class Inventory {
 ItemShelf[] inventory = null;
 Inventory(int size){
     ItemShelf[] inventory = new ItemShelf[size];
     initialEmptyInventory();

 }
 public void initialEmptyInventory(){
      int startCode = 1;
     for(int i=0;i< inventory.length;i++){
         ItemShelf item = new ItemShelf();
         item.setCode(startCode);
         item.setSoldOut(true);
         inventory[i]=item;
         startCode++;
     }
 }

}

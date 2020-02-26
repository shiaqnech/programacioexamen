package shop.funcions;

public class StockProducte{

    int idstock, quanitatstock;
    RegistraProducte prod;

    public StockProducte(int idstock) {
        this.idstock = idstock;
    }

    public int getIdstock() {
        return idstock;
    }

    public void setIdstock(int idstock) {
        this.idstock = idstock;
    }

    public int getQuanitatstock() {
        return quanitatstock;
    }

    public void setQuanitatstock(int quanitatstock) {
        this.quanitatstock = quanitatstock;
    }

    public RegistraProducte getProd() {
        return prod;
    }

    public void setProd(RegistraProducte prod) {
        this.prod = prod;
    }

    public void addNewStock(int quanitat){
        
        this.quanitatstock += quanitat;
    
    }
    public void addNewStockAfterBuy(int quanitat){
        
        this.quanitatstock = quanitat;
    
    }

    public void showStockProducte(){
        System.out.println("Referencia: "+this.prod.getReferencia());
        System.out.println("Descripció: "+this.prod.getDescripcio());
        System.out.println("Preu: "+this.prod.getPreu());
        System.out.println("Referencia: "+this.quanitatstock);
    }

    
}
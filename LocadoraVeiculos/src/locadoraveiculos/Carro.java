
package locadoraveiculos;


public class Carro extends Veiculo{

    @Override
    public double getCalculaTotal(int dias) {
        double total = 0;
        try{
          total =  getPrecoAluguel() * dias;
        } catch(Exception e){
            System.out.println("Houve um erro" + e);
        }
        return total;
    }

    
    
}

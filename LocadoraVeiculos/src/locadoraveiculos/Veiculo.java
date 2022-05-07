
package locadoraveiculos;


public abstract class Veiculo implements IVeiculo{
    private String modelo;
   
    private Double precoAluguel;
    
    @Override
    public Double getPrecoAluguel() {
        return precoAluguel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setPrecoAluguel(Double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }
    
    public abstract double getCalculaTotal(int dias);
}

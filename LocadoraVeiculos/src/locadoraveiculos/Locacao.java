
package locadoraveiculos;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Locacao {
    public void devolucaoLocacao() throws IOException, ParseException{
        Menu menu = new Menu();
        Scanner teclado = new Scanner(System.in);
        int pagamento = 0;
        int dias;
        Carro carro = new Carro();
        System.out.println("Deseja devolver o carro?");
        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Devolver");
        System.out.println("2 - Voltar ao menu principal");
        
        int opcao = teclado.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Qual o modelo do carro ?");
                System.out.println("Escola uma opcao:");
                System.out.println("1 - Renault Kwid");
                System.out.println("2 - Fiat Mobi");
                System.out.println("3 - Hyundai HB20");
                System.out.println("4 - Volkswagen Gol");
                
                int opcaoModelo = teclado.nextInt();
                
                switch(opcaoModelo){
                    case 1:
                        carro.setModelo("Renault Kwid");
                        carro.setPrecoAluguel(50.0);
                        System.out.println("Carro modelo: " + carro.getModelo() + "Diaria: R$ "+ carro.getPrecoAluguel());
                        System.out.println("Quantos dias o carro foi locado ?");
                        
                        dias = teclado.nextInt();
                        
                        System.out.println("O valor da locação, ficou no total de R$: "+ carro.getCalculaTotal(dias) + ", por "+ dias + "  dias com o carro");
                        System.out.println("Como irá pagar ?");
                        System.out.println("Escola uma opcao:");
                        System.out.println("1 - Dinheiro");
                        System.out.println("2 - Debito");
                        
                        pagamento = teclado.nextInt();
                        
                        
                        if(pagamento == 1){
                            System.out.println("Locação paga, opção Dinheiro!");
                            System.out.println("Obrigado e volte sempre!");
                            return;
                        }else{
                            System.out.println("Locação Cancelada");
                            menu.menuInicial();
                        }
                    break;

                    case 2:
                        carro.setModelo("Fiat Mobi");
                                carro.setPrecoAluguel(55.0);
                                System.out.println("Carro modelo: " + carro.getModelo() + "Diaria: R$ "+ carro.getPrecoAluguel());
                                System.out.println("Quantos dias o carro foi locado ?");

                                dias = teclado.nextInt();

                                System.out.println("O valor da locação, ficou no total de R$: "+ carro.getCalculaTotal(dias) + ", por "+ dias + "  dias com o carro");
                                System.out.println("Como irá pagar ?");
                                System.out.println("Escola uma opcao:");
                                System.out.println("1 - Dinheiro");
                                System.out.println("2 - Debito");

                                pagamento = teclado.nextInt();


                                if(pagamento == 1){
                                    System.out.println("Locação paga, opção Dinheiro!");
                                    System.out.println("Obrigado e volte sempre!");
                                    return;
                                }else{
                                    System.out.println("Locação Cancelada");
                                    menu.menuInicial();
                                }
                    break;

                    case 3:
                       carro.setModelo("Hyundai HB20");
                                carro.setPrecoAluguel(70.0);
                                System.out.println("Carro modelo: " + carro.getModelo() + "Diaria: R$ "+ carro.getPrecoAluguel());
                                System.out.println("Quantos dias o carro foi locado ?");

                                dias = teclado.nextInt();

                                System.out.println("O valor da locação, ficou no total de R$: "+ carro.getCalculaTotal(dias) + ", por "+ dias + "  dias com o carro");
                                System.out.println("Como irá pagar ?");
                                System.out.println("Escola uma opcao:");
                                System.out.println("1 - Dinheiro");
                                System.out.println("2 - Debito");

                                pagamento = teclado.nextInt();


                                if(pagamento == 1){
                                    System.out.println("Locação paga, opção Dinheiro!");
                                    System.out.println("Obrigado e volte sempre!");
                                    return;
                                }else{
                                    System.out.println("Locação paga, opção Debito!");
                                    System.out.println("Obrigado e volte sempre!");
                                }
                    break;

                    case 4:
                        carro.setModelo("Volkswagen Gol ");
                                carro.setPrecoAluguel(80.0);
                                System.out.println("Carro modelo: " + carro.getModelo() + "Diaria: R$ "+ carro.getPrecoAluguel());
                                System.out.println("Quantos dias o carro foi locado ?");

                                dias = teclado.nextInt();

                                System.out.println("O valor da locação, ficou no total de R$: "+ carro.getCalculaTotal(dias) + ", por "+ dias + "  dias com o carro");
                                System.out.println("Como irá pagar ?");
                                System.out.println("Escola uma opcao:");
                                System.out.println("1 - Dinheiro");
                                System.out.println("2 - Debito");

                                pagamento = teclado.nextInt();


                                if(pagamento == 1){
                                    System.out.println("Locação paga, opção Dinheiro!");
                                    System.out.println("Obrigado e volte sempre!");
                                    return;
                                }else{
                                    System.out.println("Locação Cancelada");
                                    menu.menuInicial();
                                }
                    break;

                    default:
                        System.out.println("Opção Invalida!");
                    break;
                }
            break;
            
            case 2:
                menu.menuInicial();
            break;
            
            default:
                System.out.println("Opção Invalida!");
                devolucaoLocacao();
            break;
        }
    }
}

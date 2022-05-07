
package locadoraveiculos;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Menu {
    public void menuInicial() throws IOException, ParseException{
        Scanner teclado = new Scanner(System.in);
        Locacao locacao = new Locacao();
        Cliente cliente = new Cliente();
        System.out.println("*.* LOCADORA DE VEICULOS *.*");
        System.out.println("Qual seu nome ?");
        cliente.setNome(teclado.nextLine());
        
        System.out.println("Agora precisamos de sua data de nascimento!");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdf.parse(teclado.nextLine());
        System.out.println();
        
        if(cliente.getIdade(dataNascimento) <= 17){
            System.out.println("Desculpe, Menores de idade não podem efetuar uma alocação!");
            menuSair();
            return ;
        }
        
        System.out.format("%s, Como posso ajudar ? (escolha uma das opções)\n",cliente.getNome());
        
        System.out.println("1 - Alugar ");
        System.out.println("2 - Devolver");
        System.out.println("3 - Sair");
        
        
        int opcao = teclado.nextInt();
             
        
        switch(opcao){
            case 1:
                menuCarros();
            break;
            
            case 2:
                locacao.devolucaoLocacao();
            break;
            
            case 3:
                menuSair();
            break;
            
            default:
                System.out.println("Opção Invalida!");
                opcao = 1;
            break;
        }
    }
    
    
    public void menuCarros() throws IOException, ParseException{
        Scanner teclado = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("\n..* CARROS DISPONIVEIS ..*\n");
        System.out.println("Escola uma opcao:");
        System.out.println("1 - Renault Kwid");
        System.out.println("2 - Fiat Mobi");
        System.out.println("3 - Hyundai HB20");
        System.out.println("4 - Volkswagen Gol");
        
        int opcao = teclado.nextInt();
        
        switch(opcao){
            case 1:
                carro.setModelo("Renault Kwid");
                carro.setPrecoAluguel(50.0);
                System.out.println("\n Carro modelo: \n" + carro.getModelo() + "\n Diaria: R$ "+ carro.getPrecoAluguel());
                System.out.println("Efetuar locação ? (1 - Sim)");
                System.out.println("Efetuar locação ? (2 - Não)");
                Integer confirmar =teclado.nextInt();
                if(confirmar == 1){
                    System.out.println("Locação concluida!");
                    return;
                }else{
                    System.out.println("Locação cancelada");
                    menuInicial();
                }
            break;
            
            case 2:
                carro.setModelo("Fiat Mobi");
                carro.setPrecoAluguel(55.0);
                System.out.println("\n Carro modelo: \n" + carro.getModelo() + "\n Diaria: R$ "+ carro.getPrecoAluguel());
                System.out.println("Efetuar locação ? (1 - Sim)");
                System.out.println("Efetuar locação ? (2 - Não)");
                confirmar =teclado.nextInt();
                if(confirmar == 1){
                    System.out.println("\nLocação concluida!");
                    return;
                }else{
                    System.out.println("\nLocação Cancelada");
                    menuInicial();
                }
            break;
            
            case 3:
                carro.setModelo("Hyundai HB20");
                carro.setPrecoAluguel(70.0);
                System.out.println("\nCarro modelo: \n" + carro.getModelo() + "\n Diaria: R$  "+ carro.getPrecoAluguel());
                System.out.println("\nEfetuar locação ? (1 - Sim)");
                System.out.println("Efetuar locação ? (2 - Não)");
                confirmar =teclado.nextInt();
                if(confirmar == 1){
                    System.out.println("Locação concluida!");
                    return;
                }else{
                    System.out.println("Locação Cancelada");
                    menuInicial();
                }
            break;
            
            case 4:
                carro.setModelo("Volkswagen GolRenault Kwid");
                carro.setPrecoAluguel(80.0);
                System.out.println("\n Carro modelo: \n" + carro.getModelo() + "\n Diaria: R$  "+ carro.getPrecoAluguel());
                System.out.println("\nEfetuar locação ? (1 - Sim)");
                System.out.println("Efetuar locação ? (2 - Não)");
                confirmar =teclado.nextInt();
                if(confirmar == 1){
                    System.out.println("Locação concluida!");
                    return;
                }else{
                    System.out.println("Locação Cancelada");
                    menuInicial();
                }
            break;
            
            default:
                System.out.println("Opção Invalida!");
            break;
             
        }
    }
    
    public void menuSair() throws IOException{ 
        System.out.println("Obrigada por sua preferencia, ate breve!");
    }
}

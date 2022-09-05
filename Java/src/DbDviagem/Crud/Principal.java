package DbDviagem.Crud;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Cliente cliente = new Cliente(01 , 123456789, "Danz", "email179@email.com");

        Cliente cliente2 = new Cliente(02 , 222555449 , "Godiel" , "email180@email.com");

        Cliente cliente3 = new Cliente(02 , 111555669 , "Mega" , "email181@email.com");

        LocalDateTime data = LocalDateTime.of(2023, 06, 12, 14,00);

        Passagem passagem = new Passagem(01 , "Rio de Janeiro", 1000, data, LocalDateTime.now(), 01);

        Passagem passagem2 = new Passagem(02 , "Paris", 5000, data, LocalDateTime.now(), 02);

        Passagem passagem3 = new Passagem(03 , "Japão", 10000, data, LocalDateTime.now(), 03);

        System.out.println("O cliente cadastrado no CPF de número: " + cliente.getCPF() + ", fez uma compra usando o E-mail: "+cliente.getEmail()+", para "+ passagem.getDestino()+" no acento "+ passagem.getLugar() + ". \nData da viagem: "+passagem.getData()+ "\nO valor da passagem: "+passagem.getValor()+"\nData e hora da compra da passagem: "+passagem.getDataDeCompra());
    }
	
}


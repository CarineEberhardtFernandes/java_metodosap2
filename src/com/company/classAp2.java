package com.company;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class classAp2 {
    Scanner tc = new Scanner(System.in);

    public String lerString( String ler) {
        System.out.println(ler);
        tc.next();
        System.out.println("Digite outra string");
        return tc.next();
    }

    public float lerFloat(String ler) {
        System.out.println("Digite um numero float: ");
        tc.nextFloat();
        System.out.println(ler);
        return tc.nextFloat();
    }

    public double lerDouble(String ler) {
        System.out.println("Digite um double:");
        tc.nextDouble();
        System.out.println(ler);
        return tc.nextDouble();
    }

    public int lerInt( String ler) {
                System.out.println("Digite um numero inteiro: ");
                tc.nextInt();
                System.out.println(ler);
                return tc.nextInt();
    }

    public char lerChar(String ler) {
        System.out.println("Digite um caracter");
        tc.next().charAt(0);
        System.out.println(ler);
        return tc.next().charAt(0);
    }

    public char lerChar(char digChar){
    System.out.println(digChar);
    return (digChar);
    }


    public boolean validarEmail(String email) {
        System.out.println("digite seu email");
        email = tc.next();
        boolean valido = false;
        boolean testar = true;
        do {
            if (email != null && email.length() > 0) {
                String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
                Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(email);
                if (matcher.matches()) {
                    valido = true;
                    testar = true;
                    System.out.println("email valido");
                }else{
                    testar = false;
                    System.out.println("email invalido, digite novamente");
                    email = tc.next();
                }
            }
        }while (testar == false);
            return valido;

    }
    public boolean validartelefone(String telefone) {
        System.out.println("digite o telefone no formato (DDD-xxxxxxxxx)");
        telefone = tc.next();
        boolean valido = false;
        boolean testar = true;
        do {
            if (telefone!= null && telefone.length() > 0) {
                String expression = "\\d{2}\\-\\d{9}";
                Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(telefone);
                if (matcher.matches()) {
                    valido = true;
                    testar = true;
                    System.out.println("telefone valido");
                }else{
                    testar = false;
                    System.out.println("telefone invalido, digite novamente");
                    telefone= tc.next();
                }
            }
        }while (testar == false);
        return valido;

    }

    public boolean validarData(String data) {
        System.out.println("Digite uma data: ");
        data = tc.next();
        boolean valido = false;
        boolean testar = true;
        do {
            if (data != null && data.length() > 0) {
                String expression = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
                Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(data);
                if (matcher.matches()) {
                    valido = true;
                    testar = true;
                    System.out.println("Data valida");
                } else {
                    testar = false;
                    System.out.println("Data invalida, digite novamente");
                    data = tc.next();
                }
            }
        } while (testar == false);
        return valido;
    }
    public String inverterData(){
        System.out.println("Digite a data : ");
        String data= tc.next();
        String dia = data.substring(0,3);
        String mes = data.substring(3,6);
        String ano = data.substring(6,10);
        System.out.println("Data formatada: "+mes+dia+ano);
        return data;
    }
     public String testarDado(String dado) {
        System.out.println("Digite algo : ");
         dado= tc.next();
         if( dado.matches("[0-9]*")) {
             System.out.println("É numerico");
         }else{
             System.out.println("Nao é numerico");
         }
         return dado;
    }


}

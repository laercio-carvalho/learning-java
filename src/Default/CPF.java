package Default;
import java.util.Scanner;
public class CPF {
    public static void main(String[] args) {
        int Um, Dois, Tres, Quatro, Cinco, Seis, Sete, Oito, Nove, Dez, Onze, PrimeiroDigitoVerificador,SegundoDigitoVerificador;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero do CPF. Um Numero de cada vez seguido por ENTER a cada numero.");
        Um = entrada.nextInt(); Dois = entrada.nextInt(); Tres = entrada.nextInt();
        Quatro = entrada.nextInt(); Cinco = entrada.nextInt(); Seis = entrada.nextInt();
        Sete = entrada.nextInt(); Oito = entrada.nextInt(); Nove = entrada.nextInt();
        System.out.println("Digite o Digito verificador(O que fica após o '-':");
        Dez = entrada.nextInt(); Onze = entrada.nextInt();

        //Calculo do primeiro digito verificador.
        PrimeiroDigitoVerificador = ((Nove*2)+(Oito*3)+(Sete*4)+(Seis*5)+(Cinco*6)+(Quatro*7)+(Tres*8)+(Dois*9)+(Um*10))%11;
        if (PrimeiroDigitoVerificador >= 2){
            PrimeiroDigitoVerificador = 11 - PrimeiroDigitoVerificador;
        }else{
            PrimeiroDigitoVerificador = 0;
        }
        //Calculo do segundo digito verificador.
        SegundoDigitoVerificador = ((PrimeiroDigitoVerificador*2)+(Nove*3)+(Oito*4)+(Sete*5)+(Seis*6)+(Cinco*7)+(Quatro*8)+(Tres*9)+(Dois*10)+(Um*11))%11;
        if (SegundoDigitoVerificador >= 2){
            SegundoDigitoVerificador = 11 - SegundoDigitoVerificador;
        }else{
            SegundoDigitoVerificador = 0;
        }

        //Validação e Impressão do Resultado.
        if(Dez == PrimeiroDigitoVerificador && Onze == SegundoDigitoVerificador){
            System.out.println("O CPF: "+Um+""+Dois+""+Tres+"."+Quatro+""+Cinco+""+Seis+"."+Sete+""+Oito+""+Nove+"-"+PrimeiroDigitoVerificador+""+SegundoDigitoVerificador+" É VÁLIDO!");
        }else {
            System.out.println("CPF INVÁLIDO");
        }
    }
}

package com.hotmail.stinger.luis;

public class DesafioLançado {

    public class CalculadoraDePartidasRankeadas {

        public static void main(String[] args) {
            // Definindo o número de vitórias e derrotas do jogador
            int vitorias = 75; // Exemplo de vitórias
            int derrotas = 25; // Exemplo de derrotas

            // Calculando o saldo de vitórias
            int saldoVitorias = calcularSaldo(vitorias, derrotas);

            // Determinando o nível do jogador com base no número de vitórias
            String nivel = determinarNivel(vitorias);

            // Exibindo a mensagem final
            System.out.println("O Herói tem de saldo de " + saldoVitorias + " e está no nível de " + nivel);
        }

        // Função para calcular o saldo de vitórias
        public static int calcularSaldo(int vitorias, int derrotas) {
            return vitorias - derrotas;
        }

        // Função para determinar o nível do jogador com base no número de vitórias
        public static String determinarNivel(int vitorias) {

            if (vitorias < 10) {
                return "ferro";
            } else if (vitorias >= 11 && vitorias <= 20) {
                return "bronze";
            } else if (vitorias >= 21 && vitorias <= 50) {
                return "prata";
            } else if (vitorias >= 51 && vitorias <= 80) {
                return "´ouro";
            } else if (vitorias >= 81 && vitorias <= 90) {
                return "diamante";
            } else if (vitorias >= 91 && vitorias <= 100) {
                return "´lendário";
            } else if (vitorias >= 101) {
                return "´imortal";
            }
            return null;
        }
    }
}

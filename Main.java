public class Main {
    public static void main(String[] args) {
        Marca marcaToyota = new Toyota();
        Marca marcaHonda = new Honda();

        Veiculo carroToyota = new Carro(marcaToyota);
        carroToyota.exibirDetalhes();

        Veiculo motoHonda = new Moto(marcaHonda);
        motoHonda.exibirDetalhes();
    }
}
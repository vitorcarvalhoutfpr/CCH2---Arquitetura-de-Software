class Carro extends Veiculo {
    public Carro(Marca marca) {
        super(marca);
    }

    public void exibirDetalhes() {
        System.out.println("Carro fabricado pela " + marca.getNomeMarca());
    }
}
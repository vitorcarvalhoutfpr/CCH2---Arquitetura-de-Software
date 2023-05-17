class Moto extends Veiculo {
    public Moto(Marca marca) {
        super(marca);
    }

    public void exibirDetalhes() {
        System.out.println("Moto fabricada pela " + marca.getNomeMarca());
    }
}
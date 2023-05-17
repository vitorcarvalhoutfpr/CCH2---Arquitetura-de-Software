abstract class Veiculo {
    protected Marca marca;

    public Veiculo(Marca marca) {
        this.marca = marca;
    }

    public abstract void exibirDetalhes();
}
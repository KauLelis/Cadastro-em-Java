import java.util.Arrays;

class CadastroPessoas {
    private Pessoa[] pessoas;
    private int contador;

    public CadastroPessoas(int tamanho) {
        pessoas = new Pessoa[tamanho];
        contador = 0;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if (contador < pessoas.length) {
            pessoas[contador] = pessoa;
            contador++;
        }
    }

    public Pessoa getPessoaMaisVelha() {
        if (contador == 0) return null;
        Pessoa maisVelha = pessoas[0];
        for (int i = 1; i < contador; i++) {
            if (pessoas[i].getIdade() > maisVelha.getIdade()) {
                maisVelha = pessoas[i];
            }
        }
        return maisVelha;
    }

    public Pessoa getPessoaMaisNova() {
        if (contador == 0) return null;
        Pessoa maisNova = pessoas[0];
        for (int i = 1; i < contador; i++) {
            if (pessoas[i].getIdade() < maisNova.getIdade()) {
                maisNova = pessoas[i];                
            }
        }
        return maisNova;
    }

    public void ordenarPorIdade() {
        Arrays.sort(pessoas, 0, contador, (p1, p2) -> p1.getIdade() - p2.getIdade()); 
    }

    public void listarPessoas() {
        for (int i = 0; i < contador; i++) {
            System.out.println(pessoas[i]);
        }
    }
}
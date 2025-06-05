import java.io.*;
import java.util.ArrayList;

public class AlunoArquivo {

    // Salva a lista de alunos em um arquivo CSV
    public static void salvarAlunos(ArrayList<Aluno> alunos, String caminhoArquivo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));
        for (Aluno aluno : alunos) {
            writer.write(aluno.getNome() + "," +
                         aluno.getDataNascimento() + "," +
                         aluno.getPosicao() + "," +
                         aluno.getTelefone() + "," +
                         aluno.getCpf() + "," +
                         aluno.getEmail());
            writer.newLine();
        }
        writer.close();
    }

    // Carrega a lista de alunos de um arquivo CSV
    public static ArrayList<Aluno> carregarAlunos(String caminhoArquivo) throws IOException {
        ArrayList<Aluno> alunos = new ArrayList<>();
        File file = new File(caminhoArquivo);
        if (!file.exists()) return alunos;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] partes = linha.split(",", -1);
            if (partes.length == 6) {
                alunos.add(new Aluno(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5]));
            }
        }
        reader.close();
        return alunos;
    }
}
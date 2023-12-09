import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Professor {
    private String nome; //nome do professor
    private String titulacaoMaxima; //titulação máxima do professor 
    private int cargaHoraria; //carga horária do professor

    //construtor da classe Professor
    public Professor(String nome, String titulacaoMaxima, int cargaHoraria) {
        this.nome = nome;
        this.titulacaoMaxima = titulacaoMaxima;
        this.cargaHoraria = cargaHoraria;
    }

    //recebe os dos dados do professor
    public String getNome() {
        return nome;
    }

    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}

class Disciplina {
    private String nome; //nome da diciplina
    private int cargaHoraria; //carga horária da disciplina
    private Professor professor; //professor da diciplina

    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    //recebe os dados da diciplina
    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }
}

public class SistemaEducacional {
    private static Map<String, Professor> professores = new HashMap<>();
    private static List<Disciplina> disciplinas = new ArrayList<>();

    public static void main(String[] args) {
        //cria um professor
        int opcao;
        do {
            //Exibe nemu e recebe opção
            String[] opcoes = {"Cadastrar disciplina e professor", "Mostrar professor de uma disciplina", "Mostrar professores por titulação", "Sair"};
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            //Executa ação selecionada
            switch (opcao) {
                case 0:
                    cadastrarDisciplinaEProfessor();
                    break;
                case 1:
                    mostrarProfessorDeDisciplina();
                    break;
                case 2:
                    mostrarProfessoresPorTitulacao();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);
    }

    //Cadastra disciplina e professor
    private static void cadastrarDisciplinaEProfessor() {
        String nomeProfessor = JOptionPane.showInputDialog("Nome do professor:");
        String titulacaoMaxima = JOptionPane.showInputDialog("Titulação máxima do professor:");
        int cargaHorariaProfessor = Integer.parseInt(JOptionPane.showInputDialog("Carga horária do professor:"));

        Professor professor = new Professor(nomeProfessor, titulacaoMaxima, cargaHorariaProfessor);
        professores.put(nomeProfessor, professor);

        String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina:");
        int cargaHorariaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Carga horária da disciplina:"));

        Disciplina disciplina = new Disciplina(nomeDisciplina, cargaHorariaDisciplina, professor);
        disciplinas.add(disciplina);

        JOptionPane.showMessageDialog(null, "Disciplina e professor cadastrados com sucesso.");
    }

    //Mostra professor de disciplina
    private static void mostrarProfessorDeDisciplina() {
        String nomeDisciplina = JOptionPane.showInputDialog("Entre com o nome da disciplina:");

        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
                JOptionPane.showMessageDialog(null, "Professor da disciplina " + nomeDisciplina + ": " + disciplina.getProfessor().getNome());
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Disciplina não encontrada.");
    }

    //Mostra professores por titulação
    private static void mostrarProfessoresPorTitulacao() {
        String titulacao = JOptionPane.showInputDialog("Entre com a titulação:");

        StringBuilder professoresTitulacao = new StringBuilder();
        for (Professor professor : professores.values()) {
            if (professor.getTitulacaoMaxima().equalsIgnoreCase(titulacao)) {
                professoresTitulacao.append(professor.getNome()).append("\n");
            }
        }

        if (professoresTitulacao.length() > 0) {
            JOptionPane.showMessageDialog(null, "Professores com titulação " + titulacao + ":\n" + professoresTitulacao.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum professor encontrado com a titulação " + titulacao + ".");
        }
    }
}

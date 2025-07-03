public

    public Aluno(String nome, String dataNascimento, String cpf, Curso curso) {
        idAluno = contadorIdAluno++;
        nomeAluno = nome;
        dataNascimentoAluno = dataNascimento;
        cpfAluno = cpf;
        cursoAluno = curso;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getDataNascimentoAluno() {
        return dataNascimentoAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public Curso getCursoAluno() {
        return cursoAluno;
    }
}


package br.unipar.trabalhobimestral.petshop;

import br.unipar.trabalhobimestral.petshop.Animal.*;
import br.unipar.trabalhobimestral.petshop.Consulta.*;
import br.unipar.trabalhobimestral.petshop.Pagamento.*;
import br.unipar.trabalhobimestral.petshop.Pessoa.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class Main {
    
    private static int id = 0;
    
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        telefone.setId(1);
        telefone.setDescricao("Padrão");
        telefone.setNumTelefone("(45) 9 9999-9999");
        
        Vacina raiva = new Vacina(1, "A3D8H", "Anti-rabica", "09824328", 3, 15, 50);
        Vacina cinomose = new Vacina(2, "D2R9W", "Cinomose", "12390834", 1, 0, 70);
        Vacina giardia = new Vacina(3, "HO89J", "Giardia", "20394810", 2, 105, 30);
        
        Exame raioX = new Exame(1, "Raio-X", 100);
        Exame hemograma = new Exame(2, "Hemograma", 70);
        Exame ultrasson = new Exame(3, "Ultrasson", 90);
        
        Medicamento paracetamol = new Medicamento(1, "ASD912", "Paracetamol", "12987343", 15);
        Medicamento dipirona = new Medicamento(2, "HDE92H", "Dipirona", "102983741", 20);
        Medicamento alekthos = new Medicamento(3, "JASLD", "Alekthos", "19827342", 40);
        
        Bandeira visa = new Bandeira("VISA");
        
        CartaoCredito credito = new CartaoCredito(2, "212974928374", "PADRAO", "12/28", "000", visa, 1, "Pagamento padrão");
        
        Veterinario veterinario = new Veterinario();
        veterinario.setId(0);
        veterinario.setCpf("12083981201");
        veterinario.setEmail("vet@gmai.com");
        veterinario.setEndereco(criarLocalidade());
        veterinario.setNome("Epaminondas");
        veterinario.setTelefone(telefone);
        veterinario.setCrmv("102123");
        
        ArrayList<String> especialidades = new ArrayList();
        especialidades.add("Animais");
        
        veterinario.setEspecialidade(especialidades);
        
        ArrayList<Animal> animaisAnderson = new ArrayList();
        animaisAnderson.add(new Animal(++id, "Júlio", TipoAnimalENUM.REPTIL, PorteENUM.PEQUENO));
        
        Proprietario anderson = new Proprietario();
        anderson.setCpf("12345678912");
        anderson.setId(1);
        anderson.setNome("Anderson");
        anderson.setEmail("anderson@gmail.com");
        anderson.setEndereco(criarLocalidade());
        anderson.setTelefone(telefone);
        anderson.setAnimal(animaisAnderson);
        
        ArrayList<Animal> animaisPaulinho = new ArrayList();
        animaisPaulinho.add(new Animal(++id, "Guana", TipoAnimalENUM.MAMIFERO, PorteENUM.MEDIO));
        
        Proprietario paulinho = new Proprietario();
        paulinho.setCpf("12345678934");
        paulinho.setId(2);
        paulinho.setNome("Paulinho");
        paulinho.setEmail("paulinho@gmail.com");
        paulinho.setEndereco(criarLocalidade());
        paulinho.setTelefone(telefone);
        paulinho.setAnimal(animaisPaulinho);
        
        ArrayList<Animal> animaisJulian = new ArrayList();
        animaisJulian.add(new Animal(++id, "Tião Hermes Siqueira", TipoAnimalENUM.MAMIFERO, PorteENUM.EXTRAGRANDE));
        
        Proprietario julian = new Proprietario();
        julian.setCpf("12345678956");
        julian.setId(3);
        julian.setNome("Julian");
        julian.setEmail("julian@gmail.com");
        julian.setEndereco(criarLocalidade());
        julian.setTelefone(telefone);
        julian.setAnimal(animaisJulian);
        
        Atendimento primeiroAtendimento = new Atendimento();
        primeiroAtendimento.setId(1);
        primeiroAtendimento.setProprietario(paulinho);
        primeiroAtendimento.setAnimal(paulinho.getAnimal().get(0));
        primeiroAtendimento.setPossuiExame(true);
        primeiroAtendimento.setPossuiVacinacao(true);
        primeiroAtendimento.setPossuiBanho(true);
        primeiroAtendimento.setPossuiTosa(true);
        primeiroAtendimento.setConsultaExame(new ConsultaExame(raioX, dipirona, "Tomar de 12h/12h", 1, new Date(), veterinario, 50.0));
        
    }
    
    public static Endereco criarLocalidade(){
        Pais pais = new Pais();
        pais.setId(1);
        pais.setNmPais("Brasil");
        pais.setSigla("BR");
        
        Estado estado = new Estado();
        estado.setId(1);
        estado.setNmEstado("Paraná");
        estado.setPais(pais);
        estado.setSigla("PR");
        
        Cidade cidade = new Cidade();
        cidade.setCodIbge(1);
        cidade.setEstado(estado);
        cidade.setNmCidade("Toledo");
        
        Endereco endereco = new Endereco();
        endereco.setId(1);
        endereco.setLogradouro("Rua Padrão");
        endereco.setCep("85.903-000");
        endereco.setBairro("Tocantins");
        endereco.setComplemento("Apto 1");
        endereco.setNumero(10);
        endereco.setCidade(cidade);
        
        return endereco;
    }
    
}


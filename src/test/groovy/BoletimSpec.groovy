import spock.lang.Specification

class BoletimSpec extends Specification {

    def "calcula a média das três notas"() {
        expect:
        new Boletim().calcularMedia([8.0, 7.0, 9.0]) == 8.0
    }

    def "classifica aluno entre a média de recuperação e a de aprovação"() {
        expect:
        new Boletim().situacao(6.0, 7.0, 5.0) == "Recuperação"
    }
}

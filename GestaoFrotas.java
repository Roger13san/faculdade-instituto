import java.util.Comparator;
import java.util.List;

public class GestaoFrotas {

    public List<Motorista> listarMotoristasHabilitadosOrdenados() {
        List<Motorista> motoristas = getMotoristasDaEmpresa();

        return motoristas.stream()
                .filter(Motorista::isCnhAtiva)
                .sorted(Comparator.comparingInt(Motorista::getAnosEmpresa))
                .toList();
    }

    private List<Motorista> getMotoristasDaEmpresa() {
        return List.of();
    }
}
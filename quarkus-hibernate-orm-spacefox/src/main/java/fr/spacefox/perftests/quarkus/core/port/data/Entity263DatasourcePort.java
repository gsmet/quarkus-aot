package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service263.model.Model263;
import java.util.Optional;

public interface Entity263DatasourcePort {
    Optional<Model263> find(Long id);
}

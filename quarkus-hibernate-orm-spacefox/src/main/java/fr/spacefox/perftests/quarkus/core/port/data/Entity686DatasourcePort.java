package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service686.model.Model686;
import java.util.Optional;

public interface Entity686DatasourcePort {
    Optional<Model686> find(Long id);
}

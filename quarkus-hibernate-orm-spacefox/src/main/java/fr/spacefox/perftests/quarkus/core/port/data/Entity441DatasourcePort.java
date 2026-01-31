package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service441.model.Model441;
import java.util.Optional;

public interface Entity441DatasourcePort {
    Optional<Model441> find(Long id);
}

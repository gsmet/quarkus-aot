package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service216.model.Model216;
import java.util.Optional;

public interface Entity216DatasourcePort {
    Optional<Model216> find(Long id);
}

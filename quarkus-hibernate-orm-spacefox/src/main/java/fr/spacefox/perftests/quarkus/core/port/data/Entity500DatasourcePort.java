package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service500.model.Model500;
import java.util.Optional;

public interface Entity500DatasourcePort {
    Optional<Model500> find(Long id);
}

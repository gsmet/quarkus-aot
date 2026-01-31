package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service67.model.Model67;
import java.util.Optional;

public interface Entity67DatasourcePort {
    Optional<Model67> find(Long id);
}

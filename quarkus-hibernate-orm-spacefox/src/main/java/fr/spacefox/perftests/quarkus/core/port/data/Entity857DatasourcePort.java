package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service857.model.Model857;
import java.util.Optional;

public interface Entity857DatasourcePort {
    Optional<Model857> find(Long id);
}

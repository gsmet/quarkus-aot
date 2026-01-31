package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service651.model.Model651;
import java.util.Optional;

public interface Entity651DatasourcePort {
    Optional<Model651> find(Long id);
}

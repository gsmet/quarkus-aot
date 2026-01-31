package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service892.model.Model892;
import java.util.Optional;

public interface Entity892DatasourcePort {
    Optional<Model892> find(Long id);
}

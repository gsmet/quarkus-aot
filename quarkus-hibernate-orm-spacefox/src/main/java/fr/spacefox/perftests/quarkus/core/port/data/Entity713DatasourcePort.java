package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service713.model.Model713;
import java.util.Optional;

public interface Entity713DatasourcePort {
    Optional<Model713> find(Long id);
}

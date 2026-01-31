package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service575.model.Model575;
import java.util.Optional;

public interface Entity575DatasourcePort {
    Optional<Model575> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service873.model.Model873;
import java.util.Optional;

public interface Entity873DatasourcePort {
    Optional<Model873> find(Long id);
}

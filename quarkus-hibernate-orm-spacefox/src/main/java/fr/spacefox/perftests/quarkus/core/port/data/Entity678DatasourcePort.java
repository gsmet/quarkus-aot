package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service678.model.Model678;
import java.util.Optional;

public interface Entity678DatasourcePort {
    Optional<Model678> find(Long id);
}

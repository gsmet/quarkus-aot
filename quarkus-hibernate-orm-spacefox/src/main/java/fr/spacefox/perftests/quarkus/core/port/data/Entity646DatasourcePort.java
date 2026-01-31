package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service646.model.Model646;
import java.util.Optional;

public interface Entity646DatasourcePort {
    Optional<Model646> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service310.model.Model310;
import java.util.Optional;

public interface Entity310DatasourcePort {
    Optional<Model310> find(Long id);
}

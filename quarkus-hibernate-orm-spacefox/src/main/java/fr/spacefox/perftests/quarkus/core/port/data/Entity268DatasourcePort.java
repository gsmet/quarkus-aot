package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service268.model.Model268;
import java.util.Optional;

public interface Entity268DatasourcePort {
    Optional<Model268> find(Long id);
}

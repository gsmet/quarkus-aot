package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service604.model.Model604;
import java.util.Optional;

public interface Entity604DatasourcePort {
    Optional<Model604> find(Long id);
}

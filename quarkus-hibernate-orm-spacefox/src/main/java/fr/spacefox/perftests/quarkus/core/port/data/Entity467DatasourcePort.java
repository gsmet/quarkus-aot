package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service467.model.Model467;
import java.util.Optional;

public interface Entity467DatasourcePort {
    Optional<Model467> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service386.model.Model386;
import java.util.Optional;

public interface Entity386DatasourcePort {
    Optional<Model386> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service630.model.Model630;
import java.util.Optional;

public interface Entity630DatasourcePort {
    Optional<Model630> find(Long id);
}

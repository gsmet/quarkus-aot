package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service399.model.Model399;
import java.util.Optional;

public interface Entity399DatasourcePort {
    Optional<Model399> find(Long id);
}

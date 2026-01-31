package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service234.model.Model234;
import java.util.Optional;

public interface Entity234DatasourcePort {
    Optional<Model234> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service476.model.Model476;
import java.util.Optional;

public interface Entity476DatasourcePort {
    Optional<Model476> find(Long id);
}

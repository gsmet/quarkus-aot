package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service803.model.Model803;
import java.util.Optional;

public interface Entity803DatasourcePort {
    Optional<Model803> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service24.model.Model24;
import java.util.Optional;

public interface Entity24DatasourcePort {
    Optional<Model24> find(Long id);
}

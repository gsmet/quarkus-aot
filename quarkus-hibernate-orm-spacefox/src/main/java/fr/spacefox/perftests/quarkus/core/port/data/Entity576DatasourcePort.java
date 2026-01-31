package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service576.model.Model576;
import java.util.Optional;

public interface Entity576DatasourcePort {
    Optional<Model576> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service350.model.Model350;
import java.util.Optional;

public interface Entity350DatasourcePort {
    Optional<Model350> find(Long id);
}

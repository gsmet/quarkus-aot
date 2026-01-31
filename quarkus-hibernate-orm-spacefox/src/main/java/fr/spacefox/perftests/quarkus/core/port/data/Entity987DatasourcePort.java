package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service987.model.Model987;
import java.util.Optional;

public interface Entity987DatasourcePort {
    Optional<Model987> find(Long id);
}

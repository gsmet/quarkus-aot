package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service622.model.Model622;
import java.util.Optional;

public interface Entity622DatasourcePort {
    Optional<Model622> find(Long id);
}

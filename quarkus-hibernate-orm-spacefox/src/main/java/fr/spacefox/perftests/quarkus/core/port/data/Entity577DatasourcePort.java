package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service577.model.Model577;
import java.util.Optional;

public interface Entity577DatasourcePort {
    Optional<Model577> find(Long id);
}

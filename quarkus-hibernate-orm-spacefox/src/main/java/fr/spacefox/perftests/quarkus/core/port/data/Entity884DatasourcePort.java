package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service884.model.Model884;
import java.util.Optional;

public interface Entity884DatasourcePort {
    Optional<Model884> find(Long id);
}

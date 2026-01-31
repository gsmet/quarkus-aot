package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service837.model.Model837;
import java.util.Optional;

public interface Entity837DatasourcePort {
    Optional<Model837> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service906.model.Model906;
import java.util.Optional;

public interface Entity906DatasourcePort {
    Optional<Model906> find(Long id);
}

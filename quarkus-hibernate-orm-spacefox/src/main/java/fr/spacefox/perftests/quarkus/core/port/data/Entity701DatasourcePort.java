package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service701.model.Model701;
import java.util.Optional;

public interface Entity701DatasourcePort {
    Optional<Model701> find(Long id);
}

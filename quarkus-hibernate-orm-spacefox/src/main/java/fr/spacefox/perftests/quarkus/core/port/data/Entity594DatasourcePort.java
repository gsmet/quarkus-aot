package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service594.model.Model594;
import java.util.Optional;

public interface Entity594DatasourcePort {
    Optional<Model594> find(Long id);
}

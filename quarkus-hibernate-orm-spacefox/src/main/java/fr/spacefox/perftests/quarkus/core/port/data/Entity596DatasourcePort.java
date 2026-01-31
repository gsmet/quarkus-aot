package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service596.model.Model596;
import java.util.Optional;

public interface Entity596DatasourcePort {
    Optional<Model596> find(Long id);
}

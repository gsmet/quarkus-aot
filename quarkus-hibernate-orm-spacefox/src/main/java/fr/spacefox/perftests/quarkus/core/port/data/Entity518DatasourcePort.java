package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service518.model.Model518;
import java.util.Optional;

public interface Entity518DatasourcePort {
    Optional<Model518> find(Long id);
}

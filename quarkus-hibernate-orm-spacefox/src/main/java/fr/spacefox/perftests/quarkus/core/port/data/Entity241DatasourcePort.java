package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service241.model.Model241;
import java.util.Optional;

public interface Entity241DatasourcePort {
    Optional<Model241> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service570.model.Model570;
import java.util.Optional;

public interface Entity570DatasourcePort {
    Optional<Model570> find(Long id);
}

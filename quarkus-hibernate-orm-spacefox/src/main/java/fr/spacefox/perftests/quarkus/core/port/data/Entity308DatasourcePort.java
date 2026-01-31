package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service308.model.Model308;
import java.util.Optional;

public interface Entity308DatasourcePort {
    Optional<Model308> find(Long id);
}

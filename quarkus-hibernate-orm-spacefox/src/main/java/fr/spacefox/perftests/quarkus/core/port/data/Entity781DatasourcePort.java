package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service781.model.Model781;
import java.util.Optional;

public interface Entity781DatasourcePort {
    Optional<Model781> find(Long id);
}

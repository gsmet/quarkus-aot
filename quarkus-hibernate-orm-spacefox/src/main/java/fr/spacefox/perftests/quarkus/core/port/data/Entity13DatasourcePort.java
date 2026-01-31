package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service13.model.Model13;
import java.util.Optional;

public interface Entity13DatasourcePort {
    Optional<Model13> find(Long id);
}

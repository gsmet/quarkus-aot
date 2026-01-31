package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service237.model.Model237;
import java.util.Optional;

public interface Entity237DatasourcePort {
    Optional<Model237> find(Long id);
}

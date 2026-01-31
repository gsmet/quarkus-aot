package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service644.model.Model644;
import java.util.Optional;

public interface Entity644DatasourcePort {
    Optional<Model644> find(Long id);
}

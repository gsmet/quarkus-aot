package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service481.model.Model481;
import java.util.Optional;

public interface Entity481DatasourcePort {
    Optional<Model481> find(Long id);
}

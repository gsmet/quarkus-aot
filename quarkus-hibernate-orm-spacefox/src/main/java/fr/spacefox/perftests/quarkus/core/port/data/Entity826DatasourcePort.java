package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service826.model.Model826;
import java.util.Optional;

public interface Entity826DatasourcePort {
    Optional<Model826> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service652.model.Model652;
import java.util.Optional;

public interface Entity652DatasourcePort {
    Optional<Model652> find(Long id);
}

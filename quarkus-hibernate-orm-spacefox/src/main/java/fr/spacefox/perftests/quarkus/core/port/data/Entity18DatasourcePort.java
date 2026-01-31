package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service18.model.Model18;
import java.util.Optional;

public interface Entity18DatasourcePort {
    Optional<Model18> find(Long id);
}

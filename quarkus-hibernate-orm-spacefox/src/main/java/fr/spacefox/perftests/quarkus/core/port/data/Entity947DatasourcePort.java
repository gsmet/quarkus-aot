package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service947.model.Model947;
import java.util.Optional;

public interface Entity947DatasourcePort {
    Optional<Model947> find(Long id);
}

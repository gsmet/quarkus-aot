package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service586.model.Model586;
import java.util.Optional;

public interface Entity586DatasourcePort {
    Optional<Model586> find(Long id);
}

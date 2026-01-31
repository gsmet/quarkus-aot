package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service656.model.Model656;
import java.util.Optional;

public interface Entity656DatasourcePort {
    Optional<Model656> find(Long id);
}

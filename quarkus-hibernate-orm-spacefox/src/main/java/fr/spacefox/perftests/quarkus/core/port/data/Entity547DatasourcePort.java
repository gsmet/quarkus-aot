package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service547.model.Model547;
import java.util.Optional;

public interface Entity547DatasourcePort {
    Optional<Model547> find(Long id);
}

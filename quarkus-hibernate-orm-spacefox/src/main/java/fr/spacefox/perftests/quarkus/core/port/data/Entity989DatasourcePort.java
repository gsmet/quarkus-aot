package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service989.model.Model989;
import java.util.Optional;

public interface Entity989DatasourcePort {
    Optional<Model989> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service780.model.Model780;
import java.util.Optional;

public interface Entity780DatasourcePort {
    Optional<Model780> find(Long id);
}

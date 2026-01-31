package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service609.model.Model609;
import java.util.Optional;

public interface Entity609DatasourcePort {
    Optional<Model609> find(Long id);
}

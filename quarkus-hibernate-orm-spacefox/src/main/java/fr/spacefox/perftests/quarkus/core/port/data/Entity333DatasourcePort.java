package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service333.model.Model333;
import java.util.Optional;

public interface Entity333DatasourcePort {
    Optional<Model333> find(Long id);
}

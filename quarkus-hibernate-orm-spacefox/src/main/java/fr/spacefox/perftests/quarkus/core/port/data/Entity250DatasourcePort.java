package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service250.model.Model250;
import java.util.Optional;

public interface Entity250DatasourcePort {
    Optional<Model250> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service213.model.Model213;
import java.util.Optional;

public interface Entity213DatasourcePort {
    Optional<Model213> find(Long id);
}

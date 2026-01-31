package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service685.model.Model685;
import java.util.Optional;

public interface Entity685DatasourcePort {
    Optional<Model685> find(Long id);
}

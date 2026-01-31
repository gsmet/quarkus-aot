package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service181.model.Model181;
import java.util.Optional;

public interface Entity181DatasourcePort {
    Optional<Model181> find(Long id);
}

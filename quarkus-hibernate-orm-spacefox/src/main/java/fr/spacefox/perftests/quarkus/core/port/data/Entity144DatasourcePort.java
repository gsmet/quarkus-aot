package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service144.model.Model144;
import java.util.Optional;

public interface Entity144DatasourcePort {
    Optional<Model144> find(Long id);
}

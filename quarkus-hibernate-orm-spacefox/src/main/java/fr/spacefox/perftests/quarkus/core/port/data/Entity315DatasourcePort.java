package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service315.model.Model315;
import java.util.Optional;

public interface Entity315DatasourcePort {
    Optional<Model315> find(Long id);
}

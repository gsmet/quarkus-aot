package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service202.model.Model202;
import java.util.Optional;

public interface Entity202DatasourcePort {
    Optional<Model202> find(Long id);
}

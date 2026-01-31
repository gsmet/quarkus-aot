package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service507.model.Model507;
import java.util.Optional;

public interface Entity507DatasourcePort {
    Optional<Model507> find(Long id);
}

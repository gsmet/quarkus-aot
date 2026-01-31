package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service276.model.Model276;
import java.util.Optional;

public interface Entity276DatasourcePort {
    Optional<Model276> find(Long id);
}

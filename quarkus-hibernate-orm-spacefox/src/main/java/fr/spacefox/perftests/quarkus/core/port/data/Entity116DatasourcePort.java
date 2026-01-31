package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service116.model.Model116;
import java.util.Optional;

public interface Entity116DatasourcePort {
    Optional<Model116> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service836.model.Model836;
import java.util.Optional;

public interface Entity836DatasourcePort {
    Optional<Model836> find(Long id);
}

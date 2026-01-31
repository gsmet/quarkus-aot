package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service865.model.Model865;
import java.util.Optional;

public interface Entity865DatasourcePort {
    Optional<Model865> find(Long id);
}

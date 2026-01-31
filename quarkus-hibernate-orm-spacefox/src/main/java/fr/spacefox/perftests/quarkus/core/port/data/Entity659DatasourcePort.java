package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service659.model.Model659;
import java.util.Optional;

public interface Entity659DatasourcePort {
    Optional<Model659> find(Long id);
}

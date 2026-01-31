package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service852.model.Model852;
import java.util.Optional;

public interface Entity852DatasourcePort {
    Optional<Model852> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service917.model.Model917;
import java.util.Optional;

public interface Entity917DatasourcePort {
    Optional<Model917> find(Long id);
}

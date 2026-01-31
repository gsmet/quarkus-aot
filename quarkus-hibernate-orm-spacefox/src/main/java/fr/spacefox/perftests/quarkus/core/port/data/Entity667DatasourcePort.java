package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service667.model.Model667;
import java.util.Optional;

public interface Entity667DatasourcePort {
    Optional<Model667> find(Long id);
}

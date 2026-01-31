package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service339.model.Model339;
import java.util.Optional;

public interface Entity339DatasourcePort {
    Optional<Model339> find(Long id);
}

package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service178.model.Model178;
import java.util.Optional;

public interface Entity178DatasourcePort {
    Optional<Model178> find(Long id);
}

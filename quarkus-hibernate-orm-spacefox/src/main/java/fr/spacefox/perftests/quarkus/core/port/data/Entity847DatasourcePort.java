package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service847.model.Model847;
import java.util.Optional;

public interface Entity847DatasourcePort {
    Optional<Model847> find(Long id);
}

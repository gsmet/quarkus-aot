package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service168.model.Model168;
import java.util.Optional;

public interface Entity168DatasourcePort {
    Optional<Model168> find(Long id);
}

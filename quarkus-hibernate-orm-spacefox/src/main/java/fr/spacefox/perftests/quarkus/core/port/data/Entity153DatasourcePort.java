package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service153.model.Model153;
import java.util.Optional;

public interface Entity153DatasourcePort {
    Optional<Model153> find(Long id);
}
